package model;

public class LibraryBook {


    private String indexNumber;
    private String classificationNumber;
    private String bookName;
    private String author;
    private String publisher;
    private String price;
    private String collectionPlace;

    public LibraryBook() {

    }

    public LibraryBook(String indexNumber, String classificationNumber, String bookName, String author, String publisher, String price, String collectionPlace) {
        this.indexNumber = indexNumber;
        this.classificationNumber = classificationNumber;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.collectionPlace = collectionPlace;
    }


    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getClassificationNumber() {
        return classificationNumber;
    }

    public void setClassificationNumber(String classificationNumber) {
        this.classificationNumber = classificationNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCollectionPlace() {
        return collectionPlace;
    }

    public void setCollectionPlace(String collectionPlace) {
        this.collectionPlace = collectionPlace;
    }
}
