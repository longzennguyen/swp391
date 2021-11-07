/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-27    1.0        LongNVSE04068          First Version<br>
 */
package entity;

/**				
 * class have properties of Posts object in database	
 *				
 * @author longnv				
 */
public class Blogs {

    /**
     * post id
     */
    private int post_id;
    /**
     * title
     */
    private String title;
    /**
     * category_id
     */
    private int category_id;
    /**
     * image
     */
    private String image;
    /**
     * description
     */
    private String description;
    /**
     * date update user information
     */
    private String updated_at;
    /**
     * date create user
     */
    private String created_at;
    /**
     * created by
     */
    private int created_by;
    /**
     * status id
     */
    private int status_id;
    
    /**
     * detail
     */
    private String detail;
    /**
     * Constructor
     */
    public Blogs() {
    }

    /**
     * Constructor
     *
     * @param post_id
     * @param title
     * @param category_id
     * @param image
     * @param description
     * @param updated_at
     * @param created_at
     * @param created_by
     * @param status_id
     */
    public Blogs(int post_id, String title, int category_id, String image, String description, String updated_at, String created_at, int created_by,
            int status_id) {
        this.post_id = post_id;
        this.title = title;
        this.category_id = category_id;
        this.image = image;
        this.description = description;
        this.updated_at = updated_at;
        this.created_at = created_at;
        this.created_by = created_by;
        this.status_id = status_id;
    }

    /**
     * Get value service id attribute of Blog class. <br>
     *
     * @return id it is an int
     */
    public int getPost_id() {
        return post_id;
    }

    /**
     * Set value post to id attribute of Blog class
     *
     * @param post_id
     */
    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    /**
     * Get value title attribute of Blog class. <br>
     *
     * @return title is string
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set value title attribute of Blog class
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get value category id attribute of Blog class. <br>
     *
     * @return id it is an int
     */
    public int getCategory_id() {
        return category_id;
    }

    /**
     * Set value category to id attribute of Blog class
     *
     * @param category_id
     */
    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    /**
     * Get value image attribute of Blog class. <br>
     *
     * @return image is string
     */
    public String getImage() {
        return image;
    }

    /**
     * Set value image attribute of Blog class
     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Get value description attribute of Blog class. <br>
     *
     * @return description is string
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set value description attribute of Blog class
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get value updated_at attribute of Blog class. <br>
     *
     * @return updated_at is date convert to String
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * Set value updated_at attribute of Blog class
     *
     * @param updated_at
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * Get value created_at attribute of Blog class. <br>
     *
     * @return created_at is a date convert to string
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * Set value created_at attribute of Blog class
     *
     * @param created_at
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * Get value created_by attribute of Blog class. <br>
     *
     * @return created_by it is an int
     */
    public int getCreated_by() {
        return created_by;
    }

    /**
     * Set value created_by attribute of Blog class
     *
     * @param created_by
     */
    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    /**
     * Get value status id attribute of Blog class. <br>
     *
     * @return status_id it is an int
     */
    public int getStatus_id() {
        return status_id;
    }

    /**
     * Set value status_id attribute of Blog class
     *
     * @param status_id
     */
    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    

    /**
     * override toString() function to print object
     */
    @Override
    public String toString() {
        return "Blogs{" + "post_id=" + post_id + ", title=" + title + ", category_id=" + category_id + ", image=" + image + ", description=" + description + ", updated_at=" + updated_at + ", created_at=" + created_at + ", created_by=" + created_by + ", status_id=" + status_id + '}';
    }

}
