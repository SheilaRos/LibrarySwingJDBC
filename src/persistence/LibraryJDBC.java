package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Author;
import model.Book;
import model.User;

public class LibraryJDBC {
    private Connection connection;
    private void conectar() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/library";
        String usr = "root";
        String pass = "";
        connection = DriverManager.getConnection(url, usr, pass);
    }
    private void desconectar() throws SQLException{
        if(connection != null){
            connection.close();
        }
    }
    public boolean validar(String user, String pass) throws SQLException{
        boolean validar = false;
        conectar();
        String query = "select * from user where username='" +user+"' and password='"+pass+"';";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
           validar = true;
        } else {
            validar = false;
        }
        rs.close();
        st.close();
        desconectar();
        return validar;
    }
    public void insertBook(Book b) throws SQLException{
        conectar();
        String insert = "insert into book values (?, ?, ?, ?, ?);";
        PreparedStatement ps = connection.prepareStatement(insert);
        ps.setInt(1, b.getIsbn());
        ps.setString(2, b.getTitle());
        ps.setInt(3, b.getNpages());
        ps.setString(4, b.getGenre());
        ps.setString(5, b.getAuthor().getName());
        ps.executeUpdate();
        ps.close();
        desconectar();
    }
    public void insertAuthor(Author a) throws SQLException{
        conectar();
        String insert = "insert into book values (?, ?, ?, ?);";
        PreparedStatement ps = connection.prepareStatement(insert);
        int id = maxIdAuthor() + 1;
        ps.setInt(1, id);
        ps.setString(2, a.getName());
        ps.setString(3, a.getSurname());
        ps.setString(4, a.getCountry());
        ps.executeUpdate();
        ps.close();
        desconectar();
    }
    private int maxIdAuthor() throws SQLException{
        conectar();
        String query = "select max(idauthor) as 'maximo' from author;";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        int max = rs.getInt("maximo");
        st.close();
        rs.close();
        desconectar();
        return max;
    }
    public void deleteBook(int isbn) throws SQLException{
        conectar();
        String delete = "delete from book where isbn="+isbn+";";
        Statement st = connection.createStatement();
        st.executeUpdate(delete);
        st.close();
        desconectar();
    }
    public void deleteAuthor(int id) throws SQLException{
        conectar();
        String delete = "delete from author where idauthor="+id+";";
        Statement st = connection.createStatement();
        st.executeUpdate(delete);
        st.close();
        desconectar();
    }
    public void updateBook(Book b) throws SQLException{
        conectar();
        String update = "update book set isbn=?, title=?, npages=?, genre=?, author=? where isbn = '" + b.getIsbn()+"';";
        PreparedStatement ps = connection.prepareStatement(update);
        ps.setInt(1, b.getIsbn());
        ps.setString(2, b.getTitle());
        ps.setInt(3, b.getNpages());
        ps.setString(4, b.getGenre());
        ps.setString(5, b.getAuthor().getName());
        ps.executeUpdate();
        ps.close();
        desconectar();
    }
    public void updateAuthor(Author a) throws SQLException{
        conectar();
        String update = "update author set idauthor=?, name=?, surname=?, country=? where idauthor = '" + a.getIdauthor()+"';";
        PreparedStatement ps = connection.prepareStatement(update);
        ps.setInt(1, a.getIdauthor());
        ps.setString(2, a.getName());
        ps.setString(3, a.getSurname());
        ps.setString(4, a.getCountry());
        ps.executeUpdate();
        ps.close();
        desconectar();
    }
    public List<Book> consultas(String author, String genre) throws SQLException{
        List<Book> busqueda = new ArrayList<>();
       conectar();
       String query;
       if(!author.equals("") && !genre.equals("")){
           query = "select * from book where author='"+author+"' and genre='"+genre+"';";
       }else if(!author.equals("")){
           query = "select * from book where author='"+author+"';";
       }else if(!genre.equals("")){
           query = "select * from book where genre='"+genre+"';";
       }else{
           query = "select * from book;";
       }
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(query);
       while(rs.next()){
            Book b = new Book();
            Author a = new Author();
            b.setIsbn(rs.getInt("isbn"));
            b.setTitle(rs.getString("title"));
            b.setNpages(rs.getInt("npages"));
            b.setGenre(rs.getString("genre"));
            a.setName(rs.getString("author"));
            b.setAuthor(a);
            busqueda.add(b);
        }
       st.close();
       rs.close();
       desconectar();
       return busqueda;
    }
    public boolean comprobarISBN(int isbn) throws SQLException{
        boolean existe;
        conectar();
        String query = "select * from book where isbn='" +isbn+"';";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
           existe = true;
        } else {
            existe = false;
        }
        rs.close();
        st.close();
        desconectar();
        return existe;
    }
    public boolean comprobarUsuario(String usu) throws SQLException{
        boolean existe;
        conectar();
        String query = "select * from user where username='" +usu+"';";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
           existe = true;
        } else {
            existe = false;
        }
        rs.close();
        st.close();
        desconectar();
        return existe;
    }
    public void insertUsu(User u) throws SQLException{
        conectar();
        String insert = "insert into user values (?, ?);";
        PreparedStatement ps = connection.prepareStatement(insert);
        ps.setString(1, u.getUsername());
        ps.setString(2, u.getPassword());
        ps.executeUpdate();
        ps.close();
        desconectar();
    }
    public List<Book> allBooks() throws SQLException{
        List<Book> books = new ArrayList<>();
       conectar();
       String query = "select * from book;";
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(query);
       while(rs.next()){
            Book b = new Book();
            Author a = new Author();
            b.setIsbn(rs.getInt("isbn"));
            b.setTitle(rs.getString("title"));
            b.setNpages(rs.getInt("npages"));
            b.setGenre(rs.getString("genre"));
            a.setName(rs.getString("author"));
            b.setAuthor(a);
            books.add(b);
        }
       st.close();
       rs.close();
       desconectar();
       return books;
    }
    public List<Author> allAuthors() throws SQLException{
       List<Author> authors = new ArrayList<>();
       conectar();
       String query = "select * from author;";
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(query);
       while(rs.next()){
            Author a = new Author();
            a.setIdauthor(rs.getInt("idauthor"));
            a.setName(rs.getString("name"));
            a.setSurname(rs.getString("surname"));
            a.setCountry(rs.getString("country"));
            authors.add(a);
        }
       st.close();
       rs.close();
       desconectar();
       return authors;
    }
    public boolean comprobarAutor(String name, String surname) throws SQLException{
        boolean existe = false;
        conectar();
        String query = "select * from author where name='" +name+"' and surname='"+surname+"';";
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        if (rs.next()) {
           existe = true;
        } else {
            existe = false;
        }
        rs.close();
        st.close();
        desconectar();
        return existe;
    }
}
