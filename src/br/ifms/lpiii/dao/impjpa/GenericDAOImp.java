/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.dao.impjpa;

import br.ifms.lpiii.dao.interfaces.GenericDAO;
import br.ifms.lpiii.util.FabricaDeGerenciadorDeEntidade;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Gustavo
 */
public class GenericDAOImp<T> implements GenericDAO<T> {

    private FabricaDeGerenciadorDeEntidade fge = FabricaDeGerenciadorDeEntidade.getInstance();
    private EntityManager em = fge.getEntityManager();

    @Override
    public T persistir(T t) throws SQLException {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        return t;
    }

    @Override
    public void remover(T t) throws SQLException {
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    }

    @Override
    public void alterar(T t) throws SQLException {
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
    }

    @Override
    public List<T> listarTodos() throws SQLException {
        return em.createQuery("SELECT t FROM T").getResultList();
    }

    @Override
    public T buscarPorId(Integer id) throws SQLException {
        return null;
    }

}
