package org.example;

public class Article {
    private String content;
    private String author;

    public Article(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getContent() { return content; }
    public String getAuthor() { return author; }
}
