/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Gustavo
 */
@Embeddable
public class ProdutoFornecedorPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "pf_produto_id")
    private int pfProdutoId;
    @Basic(optional = false)
    @Column(name = "pf_fornecedor_id")
    private int pfFornecedorId;

    public ProdutoFornecedorPK() {
    }

    public ProdutoFornecedorPK(int pfProdutoId, int pfFornecedorId) {
        this.pfProdutoId = pfProdutoId;
        this.pfFornecedorId = pfFornecedorId;
    }

    public int getPfProdutoId() {
        return pfProdutoId;
    }

    public void setPfProdutoId(int pfProdutoId) {
        this.pfProdutoId = pfProdutoId;
    }

    public int getPfFornecedorId() {
        return pfFornecedorId;
    }

    public void setPfFornecedorId(int pfFornecedorId) {
        this.pfFornecedorId = pfFornecedorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pfProdutoId;
        hash += (int) pfFornecedorId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutoFornecedorPK)) {
            return false;
        }
        ProdutoFornecedorPK other = (ProdutoFornecedorPK) object;
        if (this.pfProdutoId != other.pfProdutoId) {
            return false;
        }
        if (this.pfFornecedorId != other.pfFornecedorId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.ProdutoFornecedorPK[ pfProdutoId=" + pfProdutoId + ", pfFornecedorId=" + pfFornecedorId + " ]";
    }
    
}
