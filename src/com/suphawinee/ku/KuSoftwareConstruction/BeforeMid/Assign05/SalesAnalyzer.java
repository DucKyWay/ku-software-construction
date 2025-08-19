package com.suphawinee.ku.KuSoftwareConstruction.BeforeMid.Assign05;
// package ku.cs.swcon

import java.util.ArrayList;
import java.util.HashMap;

public class SalesAnalyzer {
    private ArrayList<Product> today;

    public SalesAnalyzer() {
        today = new ArrayList<Product>();
    }

    public void addProduct(String name, String category) {
        today.add(new Product(name, category));
    }

    public void printCategorySummary() {
        HashMap<String, Integer> amount = new HashMap<String, Integer>();
        for(Product p: today) {
            amount.put(p.category, amount.getOrDefault(p.category, 0) + 1);
        }
        amount.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    private class Product {
        private String name;
        private String category;

        public Product(String name, String category) {
            this.name = name;
            this.category = category;
        }
    }

    public static void main(String[] args) {
        SalesAnalyzer analyzer = new SalesAnalyzer(); 
        analyzer.addProduct("Laptop", "Electronics"); 
        analyzer.addProduct("Smartphone", "Electronics"); 
        analyzer.addProduct("Notebook", "Stationery"); 
        analyzer.printCategorySummary();
    }
}