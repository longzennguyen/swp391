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
public class Slider {
    private int slider_id;
    private String detail;

    public Slider() {
    }

    public Slider(int slider_id, String detail) {
        this.slider_id = slider_id;
        this.detail = detail;
    }

    public int getSlider_id() {
        return slider_id;
    }

    public void setSlider_id(int slider_id) {
        this.slider_id = slider_id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    
}
