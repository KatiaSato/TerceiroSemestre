package Aplication;

public class Professor extends Pessoa{
    private String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    @Override
    public void print()
    {
        super.print();
        System.out.println("Disciplina: " + disciplina);
    }
}
