package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        Product bread = new SimpleProduct("Bread", 50);
        Product milk = new SimpleProduct("Milk", 90);
        Product cheese = new DiscountedProduct("Cheese", 300, 20);
        Product tea = new FixPriceProduct("Tea");
        Product apple = new DiscountedProduct("Apples", 120, 50);
        Product coffee = new FixPriceProduct("Coffee");

        ProductBasket basket = new ProductBasket();

        System.out.println("Add product");
        basket.addProduct(bread);
        basket.addProduct(milk);
        basket.addProduct(cheese);
        basket.addProduct(tea);
        basket.addProduct(apple);

        System.out.println("Add product overflow");
        basket.addProduct(coffee);

        System.out.println("Print basket");
        basket.printBasket();

        System.out.println("Cost of basket");
        System.out.println(basket.getGeneralCost());

        System.out.println("Search product in basket");
        System.out.println(basket.containsProduct("Milk"));

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