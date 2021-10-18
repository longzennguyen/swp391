/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author longzennguyen
 */
public class Blogs {

    private int post_id;
    private String title;
    private int category_id;
    private String image;
    private String description;
    private String updated_at;
    private String created_at;
    private int created_by;
    private int status_id;

    public Blogs() {
    }

    public Blogs(int post_id, String title, int category_id, String image, String description, String updated_at, String created_at, int created_by, int status_id) {
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

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    @Override
    public String toString() {
        return "Blogs{" + "post_id=" + post_id + ", title=" + title + ", category_id=" + category_id + ", image=" + image + ", description=" + description + ", updated_at=" + updated_at + ", created_at=" + created_at + ", created_by=" + created_by + ", status_id=" + status_id + '}';
    }
    

}
