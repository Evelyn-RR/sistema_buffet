/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @NamedQuery(name = "Orcamento.findByIdProduto", query = "SELECT o FROM Orcamento o WHERE o.idProduto = :idProduto"),
    @NamedQuery(name = "Orcamento.findByIdFuncionario", query = "SELECT o FROM Orcamento o WHERE o.idFuncionario = :idFuncionario"),
    @NamedQuery(name = "Orcamento.findByIdLancamento", query = "SELECT o FROM Orcamento o WHERE o.idLancamento = :idLancamento"),
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
    @Column(name = "id_produto")
    private Integer idProduto;
    @Column(name = "id_funcionario")
    private Integer idFuncionario;
    @Column(name = "id_lancamento")
    private Integer idLancamento;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_servico")
    private Double valorServico;
    @Column(name = "valor_entrada")
    private Double valorEntrada;
    @Column(name = "valor_final")
    private Double valorFinal;
    @Column(name = "deconto")
    private Double deconto;

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

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
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

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public Double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Double valorEntrada) {
        this.valorEntrada = valorEntrada;
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
