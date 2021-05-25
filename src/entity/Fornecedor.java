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
@Table(name = "fornecedor")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByIdFornecdor", query = "SELECT f FROM Fornecedor f WHERE f.idFornecdor = :idFornecdor"),
    @NamedQuery(name = "Fornecedor.findByNomeFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.nomeFornecedor = :nomeFornecedor"),
    @NamedQuery(name = "Fornecedor.findByEmailFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.emailFornecedor = :emailFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCelularFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.celularFornecedor = :celularFornecedor")})
public class Fornecedor implements Serializable {

    @Column(name = "cpf_fornecedor")
    private String cpfFornecedor;
    @Column(name = "cep_fornecedor")
    private String cepFornecedor;
    @Column(name = "celular_fornecedor")
    private String celularFornecedor;

    @Column(name = "produto_fornecido")
    private String produtoFornecido;
    @Column(name = "valor_do_produto")
    private String valorDoProduto;
    @Column(name = "cidade_fornecedor")
    private String cidadeFornecedor;
    @Column(name = "estado_fornecedor")
    private String estadoFornecedor;
    @Column(name = "endereco_fornecedor")
    private String enderecoFornecedor;
    @Column(name = "observacao_fornecedor")
    private String observacaoFornecedor;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fornecdor")
    private Integer idFornecdor;
    @Basic(optional = false)
    @Column(name = "nome_fornecedor")
    private String nomeFornecedor;
    @Basic(optional = false)
    @Column(name = "email_fornecedor")
    private String emailFornecedor;

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
        return "agenda.java.edu.avans.library.businesslogic.Fornecedor[ idFornecdor=" + idFornecdor + " ]";
    }

    public String getProdutoFornecido() {
        return produtoFornecido;
    }

    public void setProdutoFornecido(String produtoFornecido) {
        this.produtoFornecido = produtoFornecido;
    }

    public String getValorDoProduto() {
        return valorDoProduto;
    }

    public void setValorDoProduto(String valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        this.cidadeFornecedor = cidadeFornecedor;
    }

    public String getEstadoFornecedor() {
        return estadoFornecedor;
    }

    public void setEstadoFornecedor(String estadoFornecedor) {
        this.estadoFornecedor = estadoFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getObservacaoFornecedor() {
        return observacaoFornecedor;
    }

    public void setObservacaoFornecedor(String observacaoFornecedor) {
        this.observacaoFornecedor = observacaoFornecedor;
    }

    public String getCpfFornecedor() {
        return cpfFornecedor;
    }

    public void setCpfFornecedor(String cpfFornecedor) {
        this.cpfFornecedor = cpfFornecedor;
    }

    public String getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(String cepFornecedor) {
        this.cepFornecedor = cepFornecedor;
    }

    public String getCelFornecedor() {
        return celularFornecedor;
    }

    public void setCelFornecedor(String celFornecedor) {
        this.celularFornecedor = celFornecedor;
    }
    
}
