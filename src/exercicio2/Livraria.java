package exercicio2;

public class Livraria {
    public Livro[] livros;


    public void inserirLivro(Livro livro) {
        livros = new Livro[livros.length + 1];
    }

    public void listarLivros(){
        for (int i = 0; i < livros.length; i++) {
            System.out.println("livro " + i + ": " + livros[i]);
        }
    }

    public void listarDisponiveis(){
        for (int i = 0; i < livros.length; i++) {

//            if (livros[i].Disponibilidade == true) {
//                System.out.println("livro " + i + ": " + livros[i]);
//            }
        }
    }
}
