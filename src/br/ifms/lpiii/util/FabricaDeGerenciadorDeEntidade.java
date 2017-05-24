/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.omg.CORBA.PERSIST_STORE;

/**
 *
 * @author Gustavo
 */
public class FabricaDeGerenciadorDeEntidade {
    private static FabricaDeGerenciadorDeEntidade fge;
    private EntityManagerFactory emf;

    private FabricaDeGerenciadorDeEntidade() {
        emf = Persistence.createEntityManagerFactory("SistemaBibliotecaPU");
    }
    
    public static FabricaDeGerenciadorDeEntidade getInstance(){
        if(fge == null){
            fge = new FabricaDeGerenciadorDeEntidade();
        }
        return fge;
    }
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
