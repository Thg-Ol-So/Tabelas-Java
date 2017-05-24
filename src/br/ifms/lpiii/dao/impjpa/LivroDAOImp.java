/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.dao.impjpa;

import br.ifms.lpiii.dao.interfaces.LivroDAO;
import br.ifms.lpiii.datamodel.Livro;
import br.ifms.lpiii.util.FabricaDeGerenciadorDeEntidade;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Gustavo
 */
public class LivroDAOImp extends GenericDAOImp<Livro> implements LivroDAO {

    private FabricaDeGerenciadorDeEntidade fge = FabricaDeGerenciadorDeEntidade.getInstance();
    private EntityManager em = fge.getEntityManager();

    
    @Override
    public List<Livro> listarTodos() throws SQLException {
        return em.createQuery("SELECT l FROM Livro l").getResultList();
    }
    
    @Override
    public Livro buscarLivroPorTitulo(String titulo) throws SQLException {
        Query query = em.createQuery("SELECT l FROM Livro l WHERE l.titulo LIKE :t");
        query.setParameter("t", titulo);
        return (Livro) query.getSingleResult();
    }

}
