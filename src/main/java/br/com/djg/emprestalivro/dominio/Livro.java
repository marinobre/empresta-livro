package br.com.djg.emprestalivro.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "livro")
public class Livro extends Object {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long codigo;
    private String nome;
    private String autor;

    public Livro(){
    }

    public Livro(String nomeParametro, String autorParametro, Long codigoParametro) {
        this.codigo = codigoParametro;
        this.nome = nomeParametro;
        this.autor = autorParametro;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", nome=" + nome +
                ", autor=" + autor +
                "}";
    }
}
