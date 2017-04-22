package com.melodymoselle.artibus.entities;

public class Artwork {
    private int id;
    private String title;
    private User artist;

    public Artwork(String title, User artist) {
        this.title = title;
        this.artist = artist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getArtist() {
        return artist;
    }

    public void setArtist(User artist) {
        this.artist = artist;
    }
}
