/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.dao.interfaces;

import br.ifms.lpiii.datamodel.Livro;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public interface LivroDAO extends GenericDAO<Livro>{
    public Livro buscarLivroPorTitulo(String titulo) throws SQLException;
   
}
