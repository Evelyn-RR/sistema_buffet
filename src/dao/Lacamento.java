/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
@Table(name = "lacamento")
@NamedQueries({
    @NamedQuery(name = "Lacamento.findAll", query = "SELECT l FROM Lacamento l"),
    @NamedQuery(name = "Lacamento.findByIdLancamento", query = "SELECT l FROM Lacamento l WHERE l.idLancamento = :idLancamento"),
    @NamedQuery(name = "Lacamento.findByIdOrcamento", query = "SELECT l FROM Lacamento l WHERE l.idOrcamento = :idOrcamento"),
    @NamedQuery(name = "Lacamento.findByParcela", query = "SELECT l FROM Lacamento l WHERE l.parcela = :parcela"),
    @NamedQuery(name = "Lacamento.findByAbertura", query = "SELECT l FROM Lacamento l WHERE l.abertura = :abertura"),
    @NamedQuery(name = "Lacamento.findByVencimento", query = "SELECT l FROM Lacamento l WHERE l.vencimento = :vencimento"),
    @NamedQuery(name = "Lacamento.findByTipoLancamento", query = "SELECT l FROM Lacamento l WHERE l.tipoLancamento = :tipoLancamento"),
    @NamedQuery(name = "Lacamento.findByStatusLancamento", query = "SELECT l FROM Lacamento l WHERE l.statusLancamento = :statusLancamento")})
public class Lacamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_lancamento")
    private Integer idLancamento;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orcamento")
    private Integer idOrcamento;
    @Column(name = "parcela")
    private Integer parcela;
    @Column(name = "abertura")
    private String abertura;
    @Column(name = "vencimento")
    private String vencimento;
    @Column(name = "tipo_lancamento")
    private String tipoLancamento;
    @Column(name = "status_lancamento")
    private String statusLancamento;

    public Lacamento() {
    }

    public Lacamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Integer getIdLancamento() {
        return idLancamento;
    }

    public void setIdLancamento(Integer idLancamento) {
        this.idLancamento = idLancamento;
    }

    public Integer getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Integer getParcela() {
        return parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getTipoLancamento() {
        return tipoLancamento;
    }

    public void setTipoLancamento(String tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }

    public String getStatusLancamento() {
        return statusLancamento;
    }

    public void setStatusLancamento(String statusLancamento) {
        this.statusLancamento = statusLancamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrcamento != null ? idOrcamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lacamento)) {
            return false;
        }
        Lacamento other = (Lacamento) object;
        if ((this.idOrcamento == null && other.idOrcamento != null) || (this.idOrcamento != null && !this.idOrcamento.equals(other.idOrcamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Lacamento[ idOrcamento=" + idOrcamento + " ]";
    }
    
}
