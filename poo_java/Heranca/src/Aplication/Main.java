package Aplication;

public class Main {
    public static void main(String[] args) {

        /*Aluno aluno = new Aluno();
        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();
        professor.setNome("Professor");
        professor.setCpf("12345");
        professor.setDisciplina("POO");

        aluno.setNome("Katia");
        aluno.setCpf("123");
        aluno.setRa("45879");

        pessoa.print();
        aluno.printAluno();
        professor.printProfessor();*/

        Aluno aluno = new Aluno("Katia", "123456", "40401");
        System.out.println("Aluno");
        aluno.print();
        System.out.println();

        Professor professor = new Professor("Katia", "198745", "POO");
        System.out.println("Professor");
        professor.print();
    }
}
