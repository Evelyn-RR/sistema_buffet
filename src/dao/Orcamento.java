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
@Table(name = "orcamento")
@NamedQueries({
    @NamedQuery(name = "Orcamento.findAll", query = "SELECT o FROM Orcamento o"),
    @NamedQuery(name = "Orcamento.findByIdOrcamento", query = "SELECT o FROM Orcamento o WHERE o.idOrcamento = :idOrcamento"),
    @NamedQuery(name = "Orcamento.findByTipo", query = "SELECT o FROM Orcamento o WHERE o.tipo = :tipo"),
    @NamedQuery(name = "Orcamento.findByConvidados", query = "SELECT o FROM Orcamento o WHERE o.convidados = :convidados"),
    @NamedQuery(name = "Orcamento.findByDataEvento", query = "SELECT o FROM Orcamento o WHERE o.dataEvento = :dataEvento"),
    @NamedQuery(name = "Orcamento.findByHorarioEvento", query = "SELECT o FROM Orcamento o WHERE o.horarioEvento = :horarioEvento"),
    @NamedQuery(name = "Orcamento.findByEndereco", query = "SELECT o FROM Orcamento o WHERE o.endereco = :endereco"),
    @NamedQuery(name = "Orcamento.findByDescricao", query = "SELECT o FROM Orcamento o WHERE o.descricao = :descricao"),
    @NamedQuery(name = "Orcamento.findByDuracao", query = "SELECT o FROM Orcamento o WHERE o.duracao = :duracao"),
    @NamedQuery(name = "Orcamento.findByValorServico", query = "SELECT o FROM Orcamento o WHERE o.valorServico = :valorServico"),
    @NamedQuery(name = "Orcamento.findByValorEntrada", query = "SELECT o FROM Orcamento o WHERE o.valorEntrada = :valorEntrada"),
    @NamedQuery(name = "Orcamento.findByValorFinal", query = "SELECT o FROM Orcamento o WHERE o.valorFinal = :valorFinal"),
    @NamedQuery(name = "Orcamento.findByDeconto", query = "SELECT o FROM Orcamento o WHERE o.deconto = :deconto")})
public class Orcamento implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Column(name = "data_evento")
    private String dataEvento;
    @Column(name = "horario_evento")
    private String horarioEvento;
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

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getHorarioEvento() {
        return horarioEvento;
    }

    public void setHorarioEvento(String horarioEvento) {
        this.horarioEvento = horarioEvento;
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
        return "dao.Orcamento[ idOrcamento=" + idOrcamento + " ]";
    }
    
}
