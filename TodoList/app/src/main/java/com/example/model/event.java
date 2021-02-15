package com.example.model;

public class event {
    private int uniqueId;
    private boolean isCompleted;
    private String title;
    private String description;
    private boolean followUp;

    //Awaiting Location object
    //private Location location;


    //Constructor
    public event(int uniqueId, boolean isCompleted, String title, String description, boolean followUp) {
        this.uniqueId = uniqueId;
        this.isCompleted = isCompleted;
        this.title = title;
        this.description = description;
        this.followUp = followUp;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFollowUp() {
        return followUp;
    }
}
