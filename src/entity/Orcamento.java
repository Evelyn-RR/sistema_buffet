/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Funcionario;
import entity.Produto;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name = "orcamento")
@NamedQueries({
    @NamedQuery(name = "Orcamento.findAll", query = "SELECT o FROM Orcamento o"),
    @NamedQuery(name = "Orcamento.findByIdCliente", query = "SELECT o FROM Orcamento o WHERE o.idCliente = :idCliente"),
    @NamedQuery(name = "Orcamento.findByIdOrcamento", query = "SELECT o FROM Orcamento o WHERE o.idOrcamento = :idOrcamento"),
    @NamedQuery(name = "Orcamento.findByTipo", query = "SELECT o FROM Orcamento o WHERE o.tipo = :tipo"),
    @NamedQuery(name = "Orcamento.findByConvidados", query = "SELECT o FROM Orcamento o WHERE o.convidados = :convidados"),
    @NamedQuery(name = "Orcamento.findByDataHorario", query = "SELECT o FROM Orcamento o WHERE o.dataHorario = :dataHorario"),
    @NamedQuery(name = "Orcamento.findByLocalEvento", query = "SELECT o FROM Orcamento o WHERE o.localEvento = :localEvento"),
    @NamedQuery(name = "Orcamento.findByEndereco", query = "SELECT o FROM Orcamento o WHERE o.endereco = :endereco"),
    @NamedQuery(name = "Orcamento.findByDescricao", query = "SELECT o FROM Orcamento o WHERE o.descricao = :descricao"),
    @NamedQuery(name = "Orcamento.findByDuracao", query = "SELECT o FROM Orcamento o WHERE o.duracao = :duracao"),
    @NamedQuery(name = "Orcamento.findByValorServico", query = "SELECT o FROM Orcamento o WHERE o.valorServico = :valorServico"),
    @NamedQuery(name = "Orcamento.findByValorEntrada", query = "SELECT o FROM Orcamento o WHERE o.valorEntrada = :valorEntrada"),
    @NamedQuery(name = "Orcamento.findByValorFinal", query = "SELECT o FROM Orcamento o WHERE o.valorFinal = :valorFinal"),
    @NamedQuery(name = "Orcamento.findByDeconto", query = "SELECT o FROM Orcamento o WHERE o.deconto = :deconto")})
public class Orcamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orcamento")
    private Integer idOrcamento;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "convidados")
    private int convidados;
    @Column(name = "data_horario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHorario;
    @Column(name = "local_evento")
    private String localEvento;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "duracao")
    private Integer duracao;
    @Column(name = "valor_servico")
    private Long valorServico;
    @Column(name = "valor_entrada")
    private Long valorEntrada;
    @Column(name = "valor_final")
    private Long valorFinal;
    @Column(name = "deconto")
    private Long deconto;
    @OneToMany(mappedBy = "orcamento")
    private Collection<Produto> produtoCollection;
    @OneToMany(mappedBy = "fkEquipeOrcamento")
    private Collection<Funcionario> funcionarioCollection;


    
    public Orcamento() {
    }

    public Orcamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public Orcamento(Integer idOrcamento, String tipo, int convidados) {
        this.idOrcamento = idOrcamento;
        this.tipo = tipo;
        this.convidados = convidados;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Integer idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getConvidados() {
        return convidados;
    }

    public void setConvidados(int convidados) {
        this.convidados = convidados;
    }

    public Date getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(Date dataHorario) {
        this.dataHorario = dataHorario;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Long getValorServico() {
        return valorServico;
    }

    public void setValorServico(Long valorServico) {
        this.valorServico = valorServico;
    }

    public Long getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Long valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Long getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Long valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Long getDeconto() {
        return deconto;
    }

    public void setDeconto(Long deconto) {
        this.deconto = deconto;
    }

    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    public Collection<Funcionario> getFuncionarioCollection() {
        return funcionarioCollection;
    }

    public void setFuncionarioCollection(Collection<Funcionario> funcionarioCollection) {
        this.funcionarioCollection = funcionarioCollection;
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
        if (!(object instanceof Orcamento)) {
            return false;
        }
        Orcamento other = (Orcamento) object;
        if ((this.idOrcamento == null && other.idOrcamento != null) || (this.idOrcamento != null && !this.idOrcamento.equals(other.idOrcamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "agenda.java.edu.avans.library.businesslogic.Orcamento[ idOrcamento=" + idOrcamento + " ]";
    }
    
}
