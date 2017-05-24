/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por abrir conexão com banco de dados
 * @author Gustavo
 */
public class ConnectionFactory {
    private Connection conn;
    private static final String URL = "jdbc:postgresql://localhost";
    private static final String PORT = "5432";
    private static final String DATA_BASE = "biblioteca";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
    private static ConnectionFactory connectionFactory;

    private ConnectionFactory() throws SQLException {
        conn = DriverManager.getConnection(URL+":"+PORT+"/"+DATA_BASE, USER, PASSWORD);
    }
    
    /**
     * Metodo que volta uma unica instancia desta Classe (Singleton)
     * @return
     * @throws SQLException 
     */
    public static ConnectionFactory getInstance() throws SQLException{
        if(connectionFactory == null){
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }
    
    public Connection getConn(){
        return conn;
    }
}
