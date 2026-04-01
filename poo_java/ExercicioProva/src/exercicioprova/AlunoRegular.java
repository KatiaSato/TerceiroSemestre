/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioprova;

/**
 *
 * @author katia
 */
public class AlunoRegular extends Aluno {
    private String ra;
    private double nota1;
    private double nota2;
    private int faltaAbonada;

    public AlunoRegular() {
        super();
    }

    public AlunoRegular(String ra, double nota1, double nota2, int faltaAbonada, String nome, int faltas) {
        super(nome, faltas);
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.faltaAbonada = faltaAbonada;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }
    
    public void registraNotas(double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double media(){
        return (nota1 + nota2) / 2;
    }
    
    public void abonarFaltas(int quantidade) {
         if(quantidade <=5){
             quantidade = faltaAbonada;
         }
    }

    @Override
    public boolean aprovado() {
        if(media()>=6 && super.frequencia()>=75)
            return true;
        else
            return false;
    }
    @Override
    public void historico(){
        super.historico();
        System.out.println( "Ra: " + ra + "\n"+
                            "Media: " + media() + "\n" + 
                            "Aprovado: " + (aprovado()?"Sim":"Nao") + "\n");
    }
    
}
