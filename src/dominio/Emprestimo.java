package dominio;

public class Emprestimo {
    private int codigo;
    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(int codigo, Usuario usuario, Livro livro, String dataEmprestimo, String dataDevolucao) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

    public void imprimeDadosEmprestimo() {
        System.out.println("Usuario: " + this.getUsuario().getNome());
        System.out.println("Nome do Livro: " + this.getLivro().getNome());
        System.out.println("Data Emprestimo: " + this.getDataEmprestimo());
        System.out.println("Data Devolução: " + this.getDataDevolucao());
    }
}
