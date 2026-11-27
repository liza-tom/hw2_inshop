package org.skypro.skyshop.article;


public class SearchEngine {
    Searchable[] items;

    public SearchEngine(int size){
          this.items = new Searchable[size];
    }
    public Searchable[] search(String string) {
        int found = 0;
        Searchable[] res = new Searchable[5];
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                continue;
            }
            if (found > 5) {
                break;
            }
            if (items[i].searchTerm().contains(string)) {
                res[found] = items[i];
                found++;
            }
        }
        return res;
    }

    public void add(Searchable item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }
}
