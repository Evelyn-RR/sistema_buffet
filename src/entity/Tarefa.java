/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name = "tarefa")
@NamedQueries({
    @NamedQuery(name = "Tarefa.findAll", query = "SELECT t FROM Tarefa t"),
    @NamedQuery(name = "Tarefa.findByIdTarefa", query = "SELECT t FROM Tarefa t WHERE t.idTarefa = :idTarefa"),
    @NamedQuery(name = "Tarefa.findByDescricaoTarefa", query = "SELECT t FROM Tarefa t WHERE t.descricaoTarefa = :descricaoTarefa"),
    @NamedQuery(name = "Tarefa.findByDataTarefa", query = "SELECT t FROM Tarefa t WHERE t.dataTarefa = :dataTarefa")})
public class Tarefa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tarefa")
    private Integer idTarefa;
    @Column(name = "descricao_tarefa")
    private String descricaoTarefa;
    @Column(name = "data_tarefa")
    private String dataTarefa;

    public Tarefa() {
    }

    public Tarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public Integer getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(String dataTarefa) {
        this.dataTarefa = dataTarefa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarefa != null ? idTarefa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.idTarefa == null && other.idTarefa != null) || (this.idTarefa != null && !this.idTarefa.equals(other.idTarefa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "agenda.java.edu.avans.library.businesslogic.Tarefa[ idTarefa=" + idTarefa + " ]";
    }
    
}
