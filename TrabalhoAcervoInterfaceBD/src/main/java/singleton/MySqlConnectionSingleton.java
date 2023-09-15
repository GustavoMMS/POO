/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public class MySqlConnectionSingleton {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost";
    private static final String PORT = "3306";
    private static final String USER = "sys_cadastro";
    private static final String PASS = "sys_cadastro";
    private static final String DATABASE = "acervo";
    private static final String TIMEZONE = "useTimezone=true&serverTImezone=UTC";
    
    private Connection conn;
    private static MySqlConnectionSingleton instance;

    public MySqlConnectionSingleton() {
        
        String connect = URL + ":" + PORT + "/" + DATABASE + "?" + TIMEZONE;
        
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(connect, USER, PASS);
            System.out.println("Conexão realizada com sucesso!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possível realizar a conexão com o banco de dados!");
        } catch (SQLException ex) {
            System.out.println("Não foi possível realizar a conexão com o banco de dados!");
        }
        
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public static MySqlConnectionSingleton getInstance() throws SQLException{
        
        if(instance == null)
            instance = new MySqlConnectionSingleton();
        else if(instance.getConnection().isClosed())
            instance = new MySqlConnectionSingleton();
        
        return instance;
        
    }
}
