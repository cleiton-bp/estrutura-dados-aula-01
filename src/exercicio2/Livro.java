package exercicio2;

public class Livro {
    private String Titulo;
    private String Autor;
    private int NumeroPaginas;
    private boolean Disponibilidade;

    public Livro(String titulo, String autor, int numeroPaginas) {
        Titulo = titulo;
        Autor = autor;
        NumeroPaginas = numeroPaginas;
        Disponibilidade = true;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + Titulo + " Autor: " + Autor + " Numero de Paginas: " + NumeroPaginas);
    }

    public void reservar(String nomeLivro){
        if (Disponibilidade){
            System.out.println("livro " + nomeLivro + " reservado com sucesso");
            Disponibilidade = false;
        } else {
            System.out.println("livro: " + nomeLivro + " não está disponivel!");
        }
    }

    public void devolver(String nomeLivro){
        if (!Disponibilidade){
            Disponibilidade = true;
            System.out.println("livro " + nomeLivro + " devolvido com sucesso");
        }
    }

    public void isDisponivel(){
        if (Disponibilidade){
            System.out.println("livro está disponivel");
        } else {
            System.out.println("livro não esta disponivel");
        }
    }
}
