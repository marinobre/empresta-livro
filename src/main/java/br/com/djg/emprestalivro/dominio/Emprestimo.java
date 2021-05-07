package br.com.djg.emprestalivro.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity(name = "emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long codigo;

    @ManyToOne
    @JoinColumn(name="usuario_id", nullable=false)
    //@JsonProperty("usuarioId")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="livro_id", nullable=false)
    //@JsonProperty("livroId")
    private Livro livro;

    @Column(name = "data_emprestimo")
    private String dataEmprestimo;

    @Column(name = "data_devolucao")
    private String dataDevolucao;

    public Emprestimo() {
        super();
    }

    public Emprestimo(long codigo, Usuario usuario, Livro livro, String dataEmprestimo, String dataDevolucao) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "usuario=" + usuario +
                "livro=" + livro +
                "dataEmprestimo=" + dataEmprestimo +
                "dataDevolucao=" + dataDevolucao + "}";
    }
}
