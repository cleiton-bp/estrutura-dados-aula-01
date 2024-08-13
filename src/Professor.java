public class Professor extends Pessoa {

    public Professor(String nome, String email) {
        this.setNome(nome);
        this.setEmail(email);
    }


    @Override
    public void logar() {
        System.out.println("Professor Logado");
    }
}
