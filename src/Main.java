//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------- pessoa -------------------------");

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Cleiton Pessoa");
        pessoa1.setEmail("cleiton-pessoa@gmail.com");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getEmail());

        pessoa1.logar();

        System.out.println("---------------------- professor -------------------------");

        Professor professor1 = new Professor("Cleiton Professor", "cleiton-professor@gmail.com");

        System.out.println(professor1.getNome());
        System.out.println(professor1.getEmail());

        System.out.println("o professor e: " + professor1.getNome());

        professor1.logar();

        System.out.println("------------------------ aluno ------------------------");

        Aluno aluno1 = new Aluno("Cleiton Aluno", "cleiton-aluno@gmail.com");


        System.out.println("------------------------ Turma ------------------------");

        Turma estruturaDados = new Turma("Estrutura de dados",
                                                    professor1,
                                        4
        );

        System.out.println("nome da turma -> " + estruturaDados.getNomeTurma());

        Aluno aluno2 = new Aluno("Aluno 2", "aluno-2");
        Aluno aluno3 = new Aluno("Aluno 3", "aluno-3");
        Aluno aluno4 = new Aluno("Aluno 4", "aluno-4");

        estruturaDados.inserirAluno(aluno1);
        estruturaDados.inserirAluno(aluno2);
        estruturaDados.inserirAluno(aluno3);
        estruturaDados.inserirAluno(aluno4);

        estruturaDados.listarAlunos();
    }
}