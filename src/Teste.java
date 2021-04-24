import dominio.Emprestimo;
import dominio.Livro;
import dominio.Usuario;

import java.sql.DatabaseMetaData;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario(1L, "Mari", "18/07", "rua melo peixoto");
 //      usuario.imprimir();

        Livro livro = new Livro("o galo maluco", "sonia junqueira");
        livro.setAutor("baby");
//        livro.imprimeLivro();


        System.out.println("\nDigite o nome do livro: ");
        String nomeLivro = scanner.nextLine();

        System.out.println("\nDigite o autor do livro: ");
        String autorLivro = scanner.nextLine();

        Livro novoLivro = new Livro(nomeLivro, autorLivro);
        //novoLivro.imprimeLivro();

        LocalDateTime dataEmprestimo = LocalDateTime.now();
        LocalDateTime dataDevolucao = dataEmprestimo.plusDays(7);

        Emprestimo emprestimo= new Emprestimo(1, usuario, novoLivro, dataEmprestimo.toString(), dataDevolucao.toString());
        emprestimo.imprimeDadosEmprestimo();


    }


}
