package com.sample;

import java.util.Date;

public class A {
    
    private String id;
    private Date date;
    
    public A (String id, Date date) {
        this.id = id;
        this.date = date;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[" + this.hashCode() + " : id = " + id + ", date = " + date + "]";
    }
    
}
