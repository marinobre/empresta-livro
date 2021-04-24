package dominio;

public class Usuario {
    private Long codigoUsuario;
    private String nome;
    private String datanascimento;
    private String endereco;

    public Long getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Long codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Usuario(Long codigoUsuario, String nome, String datanascimento, String endereco) {
        this.codigoUsuario = codigoUsuario;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimir (){
        System.out.println("Código: " + this.getCodigoUsuario());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Data de Nascimento: " + this.getDatanascimento());
    }
}

