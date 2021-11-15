/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-21    1.0        DucNT           First Version<br>
 */
package entity;

/**
 *
 * This class represents the <code>Slider</code> table in database
 *
 * @author DucNT
 */
public class Slider {
    /**
     * Slider's id
     */
    private int slider_id;
    /**
     * Slider's detail
     */
    private String detail;
    /**
     * Constructor
     */
    public Slider() {
    }
    /**
     * Constructor
     * @param slider_id
     * @param detail
     */
    public Slider(int slider_id, String detail) {
        this.slider_id = slider_id;
        this.detail = detail;
    }
    
    /**
     * Get value slider id attribute of <Code>Slider</Code> class. <br>
     *
     * @return id it is an int
     */
    public int getSlider_id() {
        return slider_id;
    }
    /**
     * Set value slider id attribute of <Code>Slider</Code> class. <br>
     *
     * @param slider_id
     */
    public void setSlider_id(int slider_id) {
        this.slider_id = slider_id;
    }
    /**
     * Get value slider detail attribute of <Code>Slider</Code> class. <br>
     *
     * @return id it is an int
     */
    public String getDetail() {
        return detail;
    }
    /**
     * Set value slider detail attribute of <Code>Slider</Code> class. <br>
     *
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    
}
