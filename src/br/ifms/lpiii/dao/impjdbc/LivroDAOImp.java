/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.dao.impjdbc;

import br.ifms.lpiii.dao.interfaces.LivroDAO;
import br.ifms.lpiii.datamodel.Livro;
import br.ifms.lpiii.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class LivroDAOImp implements LivroDAO{
    private ConnectionFactory connFac;

    public LivroDAOImp() throws SQLException {
        connFac = ConnectionFactory.getInstance();
    }

    @Override
    public Livro buscarLivroPorTitulo(String titulo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Livro persistir(Livro t) throws SQLException {
        Connection conn = connFac.getConn();
        String query = ""
                + "INSERT "
                + "INTO livro (titulo,autor,ano,editora)"
                + "VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, t.getTitulo());
        ps.setString(2, t.getAutor());
        ps.setInt(3, t.getAno());
        ps.setString(4, t.getEditora());
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys(); // Pegar retorno de chave criado pelo banco
        
        while(rs.next()){
            t.setId(rs.getInt("id"));
        }
        return t;
    }

    @Override
    public void remover(Livro t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Livro t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Livro> listarTodos() throws SQLException {
        Connection conn = connFac.getConn();
        String query = "SELECT * FROM LIVRO";
        PreparedStatement ps = conn.prepareStatement(query);

        ResultSet rs = ps.executeQuery();
        List<Livro> livros = new ArrayList<Livro>();
        Livro livro;
        while(rs.next()){
            livro = new Livro();
            livro.setAutor(rs.getString("autor"));
            livro.setAno(rs.getInt("ano"));
            livro.setEditora(rs.getString("editora"));
            livro.setTitulo(rs.getString("titulo"));
            livro.setId(rs.getInt("id"));
            livros.add(livro);
        }
        return livros; 
    }

    @Override
    public Livro buscarPorId(Integer id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
