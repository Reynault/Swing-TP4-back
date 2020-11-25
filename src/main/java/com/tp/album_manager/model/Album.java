package com.tp.album_manager.model;

import javax.persistence.*;

@Entity
@Table(name = "ALBUM")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String editor;
    private float price;
    private int nbEx;

//    @ElementCollection
//    private List<String> authors;

    public Album( String title, String editor, float price, int nbEx) {
        this.title = title;
        this.editor = editor;
//        this.authors = authors;
        this.price = price;
        this.nbEx = nbEx;
    }

    protected Album() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

//    public List<String> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(List<String> authors) {
//        this.authors = authors;
//    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNbEx() {
        return nbEx;
    }

    public void setNbEx(int nbEx) {
        this.nbEx = nbEx;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", editor='" + editor + '\'' +
                ", price=" + price +
                ", nbEx=" + nbEx +
//                ", authors=" + authors +
                '}';
    }
}
