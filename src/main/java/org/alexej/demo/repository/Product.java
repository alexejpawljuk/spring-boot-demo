package org.alexej.demo.repository;

public class Product {
    private String title;
    private double price;
    private String avatarPath;
    private String description;

    public Product() {}

    public Product(String title, double price, String avatarPath, String description) {
        this.title = title;
        this.price = price;
        this.avatarPath = avatarPath;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
