/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.lpiii.datamodel;

import com.towel.el.annotation.Resolvable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Esta classe representa os objetos de Livro
 *
 * @author Gustavo
 */
@Entity
public class Livro {

    @Resolvable(colName = "ID")
    @Id
    private Integer id;
    @Resolvable(colName = "Titulo")
    private String titulo;
    @Resolvable(colName = "Autor")
    private String autor;
    @Resolvable(colName = "Ano")
    private Integer ano;
    @Resolvable(colName = "Editora")
    private String editora;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

}
