package org.example;


public class Product implements Comparable<Product>{
    private Integer cost; 
    private String title; 

    public Product(Integer cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                ", title='" + title + '\'' +
                '}';
    }

   
    @Override
    public int compareTo(Product o) {
        if (this.cost == o.getCost()){
            return 0;
        } else if (this.cost < o.getCost()) {
            return -1;
        }else {
            return 1;
        }
    }
}