package dominio;

public class Livro {
    private static int count;
    private int codigo;
    private String nome;
    private String autor;

    public Livro(String nome, String autor) {
        this.codigo = count++;
        this.nome = nome;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public void imprimeLivro() {
        System.out.println("Código do Livro: " + this.getCodigo());
        System.out.println("Nome do Livro: " + this.getNome());
        System.out.println("Autor do Livro: " + this.getAutor());

    }
}
