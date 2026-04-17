package org.example;

public class Article {
    private int id;
    private String content;
    private String author;

    public Article(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public int getId() { return id; }
    public String getContent() { return content; }
    public String getAuthor() { return author; }
}
