/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ROG STRIX
 */
public class Service {
    /**
     * Service id
     */
    private int service_id;
    /**
     * Service thumbnail
     */
    private String img;
    /**
     * Service title
     */
    private String title;
    /**
     * Service description
     */
    private String description;
    /**
     * Service price
     */
    private double price;
    /**
     * Service category_id
     */
    private int category_id;

    public Service() {
    }

    public Service(int service_id, String img, String title, String description, double price, int category_id) {
        this.service_id = service_id;
        this.img = img;
        this.title = title.toUpperCase();
        this.description = description;
        this.price = price;
        this.category_id = category_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public void setTitle(String title) {
        this.title = title.toUpperCase();
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

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    
    
}
