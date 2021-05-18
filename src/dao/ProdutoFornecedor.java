/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name = "produto_fornecedor")
@NamedQueries({
    @NamedQuery(name = "ProdutoFornecedor.findAll", query = "SELECT p FROM ProdutoFornecedor p"),
    @NamedQuery(name = "ProdutoFornecedor.findByPfProdutoId", query = "SELECT p FROM ProdutoFornecedor p WHERE p.produtoFornecedorPK.pfProdutoId = :pfProdutoId"),
    @NamedQuery(name = "ProdutoFornecedor.findByPfFornecedorId", query = "SELECT p FROM ProdutoFornecedor p WHERE p.produtoFornecedorPK.pfFornecedorId = :pfFornecedorId")})
public class ProdutoFornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdutoFornecedorPK produtoFornecedorPK;

    public ProdutoFornecedor() {
    }

    public ProdutoFornecedor(ProdutoFornecedorPK produtoFornecedorPK) {
        this.produtoFornecedorPK = produtoFornecedorPK;
    }

    public ProdutoFornecedor(int pfProdutoId, int pfFornecedorId) {
        this.produtoFornecedorPK = new ProdutoFornecedorPK(pfProdutoId, pfFornecedorId);
    }

    public ProdutoFornecedorPK getProdutoFornecedorPK() {
        return produtoFornecedorPK;
    }

    public void setProdutoFornecedorPK(ProdutoFornecedorPK produtoFornecedorPK) {
        this.produtoFornecedorPK = produtoFornecedorPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produtoFornecedorPK != null ? produtoFornecedorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutoFornecedor)) {
            return false;
        }
        ProdutoFornecedor other = (ProdutoFornecedor) object;
        if ((this.produtoFornecedorPK == null && other.produtoFornecedorPK != null) || (this.produtoFornecedorPK != null && !this.produtoFornecedorPK.equals(other.produtoFornecedorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.ProdutoFornecedor[ produtoFornecedorPK=" + produtoFornecedorPK + " ]";
    }
    
}
