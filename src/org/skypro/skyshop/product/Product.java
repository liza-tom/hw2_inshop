package org.skypro.skyshop.product;

import org.skypro.skyshop.article.Searchable;

public abstract class Product implements Searchable {
    private final String name;
    public Product(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public abstract int getPrice();
    public abstract boolean isSpecial();
    public String searchTerm(){
        return getName();
    }
    public String getContentType(){
        return "PRODUCT";
    }
}