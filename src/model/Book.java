package model;
public class Book {
    private int isbn;
    private String title;
    private int npages;
    private String genre;
    private Author aurhor;
    public Book(int isbn, String title, int npages, String genre, Author aurhor) {
        this.isbn = isbn;
        this.title = title;
        this.npages = npages;
        this.genre = genre;
        this.aurhor = aurhor;
    }

    public int getIsbn() {   return isbn;}
    public void setIsbn(int isbn) {    this.isbn = isbn; }
    public String getTitle() {    return title;}
    public void setTitle(String title) {    this.title = title;}
    public int getNpages() {     return npages; }
    public void setNpages(int npages) {   this.npages = npages;}
    public String getGenre() {   return genre;}
    public void setGenre(String genre) {  this.genre = genre;}
    public Author getAurhor() {   return aurhor; }
    public void setAurhor(Author aurhor) {  this.aurhor = aurhor;}  
}
