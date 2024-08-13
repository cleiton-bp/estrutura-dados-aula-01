package exercicio1;

public class Turma {

    private String nomeTurma;
    private Professor professor;
    private Aluno[] alunos;
    private int posicaoAtual = 0;

    public Turma(String nomeTurma, Professor professor, int numeroVagas) {
        this.nomeTurma = nomeTurma;
        this.professor = professor;
        this.alunos = new Aluno[numeroVagas];
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public void inserirAluno(Aluno aluno){
        alunos[posicaoAtual] = aluno;
        posicaoAtual ++;
    }

    public void listarAlunos(){
        for(int i = 0; i < posicaoAtual; i++){
            System.out.println("alono " + (i + 1) + ": " + alunos[i]);
        }
    }
}
