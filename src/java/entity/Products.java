/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Products {
    private int product_id;
    private String name;
    private String description;
    private double price;
    private String brand;
    private double size;
    private int stock_quantity;
    private int category_id;
    private String image_url;

    public Products() {
    }

    public Products(int product_id, String name, String description, double price, String brand, double size, int stock_quantity, int category_id, String image_url) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.size = size;
        this.stock_quantity = stock_quantity;
        this.category_id = category_id;
        this.image_url = image_url;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Produtcs{" + "product_id=" + product_id + ", name=" + name + ", description=" + description + ", price=" + price + ", brand=" + brand + ", size=" + size + ", stock_quantity=" + stock_quantity + ", category_id=" + category_id + ", image_url=" + image_url + '}';
    }
    
    
    
}

