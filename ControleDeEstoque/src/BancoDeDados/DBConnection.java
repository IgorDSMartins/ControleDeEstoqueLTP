/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Cadastro.Fornecedor;
import Cadastro.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author juanfelipevillalba
 */
public class DBConnection {
    
     public Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:db/estoque.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            //System.out.println("A conexão com o banco de dados ocorreu com sucesso!");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        
        return conn;
    }
    
    public void criarTabelas (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS produto (";
                sql += "	codigo integer PRIMARY KEY NOT NULL,";
                sql += "	nome text NOT NULL,";
                sql += "	fornecedor text NOT NULL,";
                sql += "	preco integer NOT NULL,";
                sql += "	quantidade integer NOT NULL";
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            // cria uma tabela
            stmt.execute(sql);
            System.out.println("Tabela Produto Ok");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        String sql2 = "CREATE TABLE IF NOT EXISTS fornecedor (";
                sql2 += "	cnpj integer PRIMARY KEY NOT NULL,";
                sql2 += "	nome text NOT NULL";
                sql2 += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            // cria uma tabela
            stmt.execute(sql2);
            System.out.println("Tabela Fornecedor Ok");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        String sql3 = "CREATE TABLE IF NOT EXISTS venda (";
                sql3 += "	cod integer PRIMARY KEY NOT NULL,";
                sql3 += "	produto text NOT NULL,";
                sql3 += "	fornecedor text NOT NULL,";
                sql3 += "	quantidade integer NOT NULL,";
                sql3 += "	valorTotal integer NOT NULL";
                sql3 += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            // cria uma tabela
            stmt.execute(sql3);
            System.out.println("Tabela Venda Ok");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
        
}

/*
    Metodos Para ter como Base
    
    public void insereDados (Connection conn, int id, String nome) {
        String sql = "INSERT INTO pessoa VALUES(?,?)";
 
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql); 
                
                pstmt.setInt(1, id);
                pstmt.setString(2, nome);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void selecionaDados (Connection conn) {
        
        String sql = "SELECT id, nome "
                     + "FROM pessoa;";
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
            
            // loop no resultado
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("nome"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
*/