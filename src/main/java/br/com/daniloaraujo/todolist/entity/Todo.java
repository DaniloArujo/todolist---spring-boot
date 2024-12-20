package br.com.daniloaraujo.todolist.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Boolean realizado;
    private Integer priorizade;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Boolean getRealizado() {
        return realizado;
    }
    public void setRealizado(Boolean realizado) {
        this.realizado = realizado;
    }
    public Integer getPriorizade() {
        return priorizade;
    }
    public void setPriorizade(Integer priorizade) {
        this.priorizade = priorizade;
    }

    
}
