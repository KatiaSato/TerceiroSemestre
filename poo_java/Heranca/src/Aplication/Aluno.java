package Aplication;

public class Aluno extends Pessoa {
    private String ra;

    public Aluno(String nome, String cpf, String ra) {
        super(nome, cpf);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public void print() {
        /* Sobreposicao
           super chama a classe ancestral. Sem o super, o metodo fica chamando ele mesmo*/
        super.print();
        System.out.println("RA: " + ra);
    }
}
