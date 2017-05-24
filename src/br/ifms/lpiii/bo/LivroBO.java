/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.bo;

import br.ifms.lpiii.dao.impjpa.LivroDAOImp;
import br.ifms.lpiii.dao.interfaces.GenericDAO;
import br.ifms.lpiii.dao.interfaces.LivroDAO;
import br.ifms.lpiii.datamodel.Livro;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class LivroBO {
    private LivroDAO dao;

    public LivroBO() throws SQLException {
        dao = new LivroDAOImp();
    }
    
    public void inserir(Livro livro) throws SQLException{
        dao.persistir(livro);
    }   
    
    public List<Livro> listarTodosOsLivros()throws SQLException{
        return dao.listarTodos();
    }
}
