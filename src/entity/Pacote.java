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
@Table(name = "pacote")
@NamedQueries({
    @NamedQuery(name = "Pacote.findAll", query = "SELECT p FROM Pacote p"),
    @NamedQuery(name = "Pacote.findByIdEvento", query = "SELECT p FROM Pacote p WHERE p.idEvento = :idEvento"),
    @NamedQuery(name = "Pacote.findByIdGambiarra", query = "SELECT p FROM Pacote p WHERE p.ip like :ip"),
    @NamedQuery(name = "Pacote.findByNomeProduto", query = "SELECT p FROM Pacote p WHERE p.nomeProduto = :nomeProduto"),
    @NamedQuery(name = "Pacote.findByQtdProduto", query = "SELECT p FROM Pacote p WHERE p.qtdProduto = :qtdProduto"),
    @NamedQuery(name = "Pacote.findByNomeFuncionario", query = "SELECT p FROM Pacote p WHERE p.nomeFuncionario = :nomeFuncionario"),
    @NamedQuery(name = "Pacote.findByFuncaoFuncionario", query = "SELECT p FROM Pacote p WHERE p.funcaoFuncionario = :funcaoFuncionario")})
public class Pacote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_evento")
    private Integer idEvento;
    @Column(name = "ip")
    private Integer ip;
    @Column(name = "nome_produto")
    private String nomeProduto;
    @Column(name = "qtd_produto")
    private Integer qtdProduto;
    @Column(name = "nome_funcionario")
    private String nomeFuncionario;
    @Column(name = "funcao_funcionario")
    private String funcaoFuncionario;
    @JoinColumn(name = "orcamento_idp", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Orcamento orcamentoIdp;

    public Pacote() {
    }

    public Pacote(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public Integer getIdGambiarra() {
        return ip;
    }

    public void setIdGambiarra(Integer ip) {
        this.ip = ip;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(Integer qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;
    }

    public Orcamento getOrcamentoIdp() {
        return orcamentoIdp;
    }

    public void setOrcamentoIdp(Orcamento orcamentoIdp) {
        this.orcamentoIdp = orcamentoIdp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacote)) {
            return false;
        }
        Pacote other = (Pacote) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Pacote[ idEvento=" + idEvento + " ]";
    }
    
}
