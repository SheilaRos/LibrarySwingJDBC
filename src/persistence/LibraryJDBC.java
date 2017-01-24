package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    
}
