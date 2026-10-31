package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] basket;
    private int count;
    public ProductBasket(){
        basket = new Product[5];
        count = 0;
    }
    public void addProduct(Product product){
        if (count < basket.length) {
            basket[count] = product;
            count++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }
    public int getGeneralCost(){
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += basket[i].getCost();
        }
        return sum;
    }
    public void printBasket(){
        if (count == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(basket[i]);
        }
        System.out.println("Итого: " + getGeneralCost());
    }
    public boolean containsProduct(String name){
        for (int i = 0; i < count; i++) {
            if (basket[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public void clearBasket(){
        for (int i = 0; i < basket.length; i++) {
            basket[i] = null;
        }
        count = 0;
    }
}