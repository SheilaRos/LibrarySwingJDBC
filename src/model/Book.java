package model;
public class Book {
    private int isbn;
    private String title;
    private int npages;
    private String genre;
    private Author author;
    public Book() {}
    public Book(int isbn, String title, int npages, String genre, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.npages = npages;
        this.genre = genre;
        this.author = author;
    }

    public int getIsbn() {   return isbn;}
    public void setIsbn(int isbn) {    this.isbn = isbn; }
    public String getTitle() {    return title;}
    public void setTitle(String title) {    this.title = title;}
    public int getNpages() {     return npages; }
    public void setNpages(int npages) {   this.npages = npages;}
    public String getGenre() {   return genre;}
    public void setGenre(String genre) {  this.genre = genre;}
    public Author getAuthor() {   return author; }
    public void setAuthor(Author author) {  this.author = author;}  

    @Override
    public String toString() {
        return title + " - " + author.getName()+" "+author.getSurname();
    }
    
}
