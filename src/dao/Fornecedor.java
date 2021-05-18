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
@Table(name = "fornecedor")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByIdFornecdor", query = "SELECT f FROM Fornecedor f WHERE f.idFornecdor = :idFornecdor"),
    @NamedQuery(name = "Fornecedor.findByNomeFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.nomeFornecedor = :nomeFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCnpj", query = "SELECT f FROM Fornecedor f WHERE f.cnpj = :cnpj"),
    @NamedQuery(name = "Fornecedor.findByEmailFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.emailFornecedor = :emailFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCelularFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.celularFornecedor = :celularFornecedor")})
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fornecdor")
    private Integer idFornecdor;
    @Basic(optional = false)
    @Column(name = "nome_fornecedor")
    private String nomeFornecedor;
    @Column(name = "cnpj")
    private String cnpj;
    @Basic(optional = false)
    @Column(name = "email_fornecedor")
    private String emailFornecedor;
    @Basic(optional = false)
    @Column(name = "celular_fornecedor")
    private String celularFornecedor;

    public Fornecedor() {
    }

    public Fornecedor(Integer idFornecdor) {
        this.idFornecdor = idFornecdor;
    }

    public Fornecedor(Integer idFornecdor, String nomeFornecedor, String emailFornecedor, String celularFornecedor) {
        this.idFornecdor = idFornecdor;
        this.nomeFornecedor = nomeFornecedor;
        this.emailFornecedor = emailFornecedor;
        this.celularFornecedor = celularFornecedor;
    }

    public Integer getIdFornecdor() {
        return idFornecdor;
    }

    public void setIdFornecdor(Integer idFornecdor) {
        this.idFornecdor = idFornecdor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public String getCelularFornecedor() {
        return celularFornecedor;
    }

    public void setCelularFornecedor(String celularFornecedor) {
        this.celularFornecedor = celularFornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFornecdor != null ? idFornecdor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idFornecdor == null && other.idFornecdor != null) || (this.idFornecdor != null && !this.idFornecdor.equals(other.idFornecdor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Fornecedor[ idFornecdor=" + idFornecdor + " ]";
    }
    
}
