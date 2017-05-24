/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

/**
 * Classe genérica T = Qualquer classe
 *
 * @author Gustavo
 */
public interface GenericDAO<T> {

    public T persistir(T t) throws SQLException;

    public void remover(T t) throws SQLException;

    public void alterar(T t) throws SQLException;
    
    public List<T> listarTodos() throws SQLException;
    
    public T buscarPorId(Integer id) throws SQLException;    
}
