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
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
    @NamedQuery(name = "Orcamento.findById", query = "SELECT o FROM Orcamento o ORDER BY o.id DESC"),
    @NamedQuery(name = "Orcamento.findByTipo", query = "SELECT o FROM Orcamento o WHERE o.tipo = :tipo"),
    @NamedQuery(name = "Orcamento.findByConvidados", query = "SELECT o FROM Orcamento o WHERE o.convidados = :convidados"),
    @NamedQuery(name = "Orcamento.findByDataHorario", query = "SELECT o FROM Orcamento o WHERE o.dataHorario = :dataHorario"),
    @NamedQuery(name = "Orcamento.findByLocalEvento", query = "SELECT o FROM Orcamento o WHERE o.localEvento = :localEvento"),
    @NamedQuery(name = "Orcamento.findByEndereco", query = "SELECT o FROM Orcamento o WHERE o.endereco = :endereco"),
    @NamedQuery(name = "Orcamento.findOrcamento", query = "SELECT o.tipo, o.duracao FROM Orcamento o WHERE o.descricao = :descricao"),
    @NamedQuery(name = "Orcamento.findByDuracao", query = "SELECT o FROM Orcamento o WHERE o.duracao = :duracao")})
public class Orcamento implements Serializable {
    @Column(name = "convidados")
    private Integer convidados;
    
    @OneToMany(mappedBy = "orcamentoId")
    private List<Lancamento> lancamentoCollection;
    
    @OneToMany(mappedBy = "orcamentoIdp")
    private List<Pacote> pacoteCollection;
    
    @Column(name = "valor_servico")
    private Double valorServico;
    @Column(name = "valor_equipe")
    private Double valorEquipe;
    @Column(name = "valor_final")
    private Double valorFinal;
    @Column(name = "deconto")
    private Double deconto;
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
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
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    

    public Orcamento() {
    }

    public Orcamento(Integer idOrcamento) {
        this.id = idOrcamento;
    }

    public Orcamento(Integer idOrcamento, String tipo, int convidados) {
        this.id = idOrcamento;
        this.tipo = tipo;
        this.convidados = convidados;
    }

    public Cliente getIdCliente() {
        return cliente;
    }

    public Collection<Pacote> getPacoteCollection() {
        return pacoteCollection;
    }

    public Double getValorEquipe() {
        return valorEquipe;
    }

    public void setValorEquipe(Double valorEquipe) {
        this.valorEquipe = valorEquipe;
    }

    public void setPacoteCollection(List<Pacote> pacoteCollection) {
        this.pacoteCollection = pacoteCollection;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Double getDeconto() {
        return deconto;
    }

    public void setDeconto(Double deconto) {
        this.deconto = deconto;
    }

    public void setIdCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getIdOrcamento() {
        return id;
    }

    public void setIdOrcamento(Integer id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orcamento)) {
            return false;
        }
        Orcamento other = (Orcamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id + "";
    }

    public Integer getConvidados() {
        return convidados;
    }

    public void setConvidados(Integer convidados) {
        this.convidados = convidados;
    }

    public List<Lancamento> getLancamentoCollection() {
        return lancamentoCollection;
    }

    public void setLancamentoCollection(List<Lancamento> lancamentoCollection) {
        this.lancamentoCollection = lancamentoCollection;
    }

}
