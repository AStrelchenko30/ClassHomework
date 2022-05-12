package ru.skypro.homeworkClass;

public class Book {
    public String bookName;
    private final String authorName;
    private int publisherYear;

    public Book(String bookName,String authorName, int publisherYear) {
        this.authorName = authorName;
        this.publisherYear = publisherYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setNewYEar(int Year) {
        this.publisherYear = Year;
    }
}

