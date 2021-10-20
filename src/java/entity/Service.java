/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-05    1.0        DucNT           First Version<br>
 */
package entity;

/**
 *
 * This class represents the Service table in database
 *
 * @author DucNT
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
    /**
     * Constructor
    */
    public Service() {
    }
    /**
     * Constructor
     *
     * @param service_id
     * @param img
     * @param title
     * @param description
     * @param price
     * @param category_id
     */
    public Service(int service_id, String img, String title, String description, double price, int category_id) {
        this.service_id = service_id;
        this.img = img;
        this.title = title.toUpperCase();
        this.description = description;
        this.price = price;
        this.category_id = category_id;
    }
    /**
     * Get value service id attribute of <code>Service </code> class. <br>
     *
     * @return id it is an int
     */
    public int getService_id() {
        return service_id;
    }
    /**
     * Set value to id attribute of <code>Service </code> class
     *
     * @param service_id
     */
    public void setService_id(int service_id) {
        this.service_id = service_id;
    }
    /**
     * Get value img attribute of <code>Service </code> class. <br>
     *
     * @return id it is an int
     */
    public String getImg() {
        return img;
    }
    /**
     * Set value to img attribute of <code>Service </code> class
     *
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }
    /**
     * Get value title attribute of <code>Service </code> class. <br>
     *
     * @return id it is an int
     */
    public String getTitle() {
        return title.toUpperCase();
    }
    /**
     * Set value to title attribute of <code>Service </code> class
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title.toUpperCase();
    }
    /**
     * Get value description attribute of <code>Service </code> class. <br>
     *
     * @return id it is an int
     */
    public String getDescription() {
        return description;
    }
    /**
     * Set value to description attribute of <code>Service </code> class
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Get value price attribute of <code>Service </code> class. <br>
     *
     * @return id it is an int
     */
    public double getPrice() {
        return price;
    }
    /**
     * Set value to price attribute of <code>Service </code> class
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * Get value category id attribute of <code>Service </code> class. <br>
     *
     * @return id it is an int
     */
    public int getCategory_id() {
        return category_id;
    }
    /**
     * Set value category to id attribute of <code>Service </code> class
     *
     * @param category_id
     */
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
    
    
}
