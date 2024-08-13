package exercicio1;

public class Aluno extends Pessoa {

    public Aluno(String nome, String email) {
        this.setNome(nome);
        this.setEmail(email);
    }

    @Override
    public void logar() {
        System.out.println("Professor Logado");
    }

}
