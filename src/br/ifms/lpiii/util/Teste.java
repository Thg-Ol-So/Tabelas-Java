/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.util;

import br.ifms.lpiii.dao.impjdbc.ClienteDAOImp;
import br.ifms.lpiii.dao.impjdbc.LivroDAOImp;
import br.ifms.lpiii.dao.interfaces.GenericDAO;
import br.ifms.lpiii.dao.interfaces.LivroDAO;
import br.ifms.lpiii.datamodel.Livro;
import java.lang.reflect.Field;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public class Teste {

    public static void main(String[] args) throws SQLException {
        LivroDAO dao = new LivroDAOImp();
        
        Livro livro = new Livro();
        livro.setTitulo("Java Como Programar");
        livro.setAutor("Deitel");
        livro.setEditora("Pearson");
        livro.setAno(2016);
        
        dao.persistir(livro);
        
        System.out.println("ID do livro é "+livro.getId());
    }
}
