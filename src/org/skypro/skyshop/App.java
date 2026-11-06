package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product bread = new Product("Bread", 50);
        Product milk = new Product("Milk", 90);
        Product cheese = new Product("Cheees", 300);
        Product apple = new Product("Apples", 120);
        Product tea = new Product("Tea", 200);
        Product coffee = new Product("Coffee", 450);

        ProductBasket basket = new ProductBasket();

        System.out.println("Add product");
        basket.addProduct(bread);
        basket.addProduct(milk);
        basket.addProduct(cheese);
        basket.addProduct(apple);
        basket.addProduct(tea);

        System.out.println("Add product overflow");
        basket.addProduct(coffee);

        System.out.println("Print basket");
        basket.printBasket();

        System.out.println("Cost of basket");
        System.out.println(basket.getGeneralCost());

        System.out.println("Search product in basket");
        System.out.println(basket.containsProduct("Молоко"));

        System.out.println("Search product, that is not in basket");
        System.out.println(basket.containsProduct("Coffee"));

        System.out.println("Clean basket");
        basket.clearBasket();

        System.out.println("Print empty basket");
        basket.printBasket();

        System.out.println("Cost of empty basket");
        System.out.println(basket.getGeneralCost());

        System.out.println("Search product in empty basket");
        System.out.println(basket.containsProduct("Bread"));
    }
}