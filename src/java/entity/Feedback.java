/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-10-26    1.0        longzennguyen    First Version<br>
 */
package entity;

/**
 *
 * @author longzennguyen
 */
public class Feedback {

    /**
     * feedback's id
     */
    private int feedback_id;
    /**
     * created
     */
    private String created;
    /**
     * updated
     */
    private String updated;
    /**
     * reservation id ( fk key)
     */
    private int reservation_id;
    /**
     * feedback 's content
     */
    private String content;
    /**
     * rate star
     */
    private int starno;

    /**
     * created by
     */
    private String created_by;

    /**
     * get feedback's created by
     *
     * @return
     */
    public String getCreated_by() {
        return created_by;
    }

    /**
     * set created by
     *
     * @param created_by
     */
    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    /**
     * get feedback id attribute of feedback class <br>
     *
     * @return id is int
     */
    public int getFeedback_id() {
        return feedback_id;
    }

    /**
     * set id to feedback
     *
     * @param feedback_id
     */
    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
    }

    /**
     * created
     *
     * @return
     */
    public String getCreated() {
        return created;
    }

    /**
     * set created
     *
     * @param created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * get updated
     *
     * @return
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * set updated
     *
     * @param updated
     */
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * get reservation id
     *
     * @return
     */
    public int getReservation_id() {
        return reservation_id;
    }

    /**
     * set reservation id
     *
     * @param reservation_id
     */
    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    /**
     * get feedback's content
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set content
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get star no
     *
     * @return
     */
    public int getStarno() {
        return starno;
    }

    /**
     * set start no
     *
     * @param startno
     */
    public void setStarno(int startno) {
        this.starno = startno;
    }

}