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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name = "lancamento")
@NamedQueries({
    @NamedQuery(name = "Lancamento.findAll", query = "SELECT l FROM Lancamento l"),
    @NamedQuery(name = "Lancamento.findByIdLancamento", query = "SELECT l FROM Lancamento l WHERE l.idLancamento = :idLancamento"),
    @NamedQuery(name = "Lancamento.findByOrcamentoId", query = "SELECT l FROM Lancamento l WHERE l.orcamentoId = :orcamentoId"),
    @NamedQuery(name = "Lancamento.findByParcela", query = "SELECT l FROM Lancamento l WHERE l.parcela = :parcela"),
    @NamedQuery(name = "Lancamento.findByAbertura", query = "SELECT l FROM Lancamento l WHERE l.abertura = :abertura"),
    @NamedQuery(name = "Lancamento.findByVencimento", query = "SELECT l FROM Lancamento l WHERE l.vencimento = :vencimento"),
    @NamedQuery(name = "Lancamento.findByTipoLancamento", query = "SELECT l FROM Lancamento l WHERE l.tipoLancamento = :tipoLancamento"),
    @NamedQuery(name = "Lancamento.findByStatusLancamento", query = "SELECT l FROM Lancamento l WHERE l.statusLancamento = :statusLancamento")})
public class Lancamento implements Serializable {

    @JoinColumn(name = "orcamento_id")
    @ManyToOne
    private Orcamento orcamentoId;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_entrada")
    private Double valorEntrada;
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lancamento")
    private Integer idLancamento;
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

    public Lancamento() {
    }

    public Lancamento(Integer idLancamento) {
        this.idLancamento = idLancamento;
    }

    public Integer getIdLancamento() {
        return idLancamento;
    }

    public void setIdLancamento(Integer idLancamento) {
        this.idLancamento = idLancamento;
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
        hash += (idLancamento != null ? idLancamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lancamento)) {
            return false;
        }
        Lancamento other = (Lancamento) object;
        if ((this.idLancamento == null && other.idLancamento != null) || (this.idLancamento != null && !this.idLancamento.equals(other.idLancamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "agenda.java.edu.avans.library.businesslogic.Lancamento[ idLancamento=" + idLancamento + " ]";
    }

    public Double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Orcamento getOrcamentoId() {
        return orcamentoId;
    }

    public void setOrcamentoId(Orcamento orcamentoId) {
        this.orcamentoId = orcamentoId;
    }
    
}
