package org.skypro.skyshop.article;

public class Article implements Searchable {
    private String name;
    private String text;
    public Article(String name, String text){
        this.name = name;
        this.text = text;
    }
    public String getName(){return this.name;}
    public String getText(){return this.text;}
    @Override
    public String toString(){ return "Название статьи " + getName() + "\n" + "Текст статьи " + getText();}

    public String searchTerm(){
        return toString();
    }
    public String getContentType(){
        return "ARTICLE";
    }
}
