/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trendyol.models;

import com.trendyol.models.data.Campaigns;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author mesat
 */
public class ShoppingCart {

    private class CartProduct extends Product {

        private int id;
        private int quantity;

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
        }

        public CartProduct(long barcode, String title, double price, Category category) {
            super(barcode, title, price, category);
            setQuantity(quantity);
        }

        public CartProduct(Product product, int quantity) {

            super(product.getBarcode(), product.getTitle(), product.getPrice(), product.getCategory());
            setQuantity(quantity);
        }

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return the quantity
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * @param quantity the quantity to set
         */
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

    }

    private int id;
    private List<CartProduct> products;
    private Coupon coupon;
    private int quantity;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the product
     */
    public List<CartProduct> getProducts() {
        return products;
    }

    /**
     * @param product the product to set
     */
    public void addProduct(Product product, int quantity) {

        try {
            CartProduct prod = this.getProducts().stream().filter(p -> p.equals(product)).findFirst().get();
            prod.setQuantity(prod.getQuantity() + quantity);

        } catch (NoSuchElementException e) {
            this.products.add(new CartProduct(product, quantity));
        }

    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return getProducts().stream().flatMapToInt(m -> IntStream.of(m.getQuantity())).sum();
    }

    /**
     * NumberOfProducts is the number of different products in the cart. It is
     * not the quantity of products.
     *
     * @return
     */
    public int getNumberOfProducts() {
        return getProducts().size();
    }

    /**
     * NumberOfDeliveries is calculated by the number of distinct categories in
     * the cart.
     *
     * @return
     */
    public int getNumberOfDeliveries() {

        return getCategories().size();
    }
    /**
     * Group by category
     *
     * @return
     */
    public Map<Category, List<CartProduct>> getCategories() {

        return getProducts().stream().collect(Collectors.groupingBy(CartProduct::getCategory));
    }

    /**
     * @param quantity the quantity to set
     */
    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void applyDiscounts(Coupon coupon) {
        

    }

    public void applyCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public void getTotalAmountAfterDiscounts() {

    }

    public void getCouponDiscount() {

    }

    public void getCampaignDiscount() {
        for (CartProduct cartProduct : getProducts()){
            Campaigns.getInstance().getCampaign(cartProduct);
        }

    }

    public void getDeliveryCost() {

    }

    public void print() {

    }

}
