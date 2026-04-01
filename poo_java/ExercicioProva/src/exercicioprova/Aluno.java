/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioprova;

/**
 *
 * @author katia
 */
public abstract class Aluno {
    
    private String nome;
    private int faltas;

    public Aluno() {
    }

    public Aluno(String nome, int faltas) {
        this.nome = nome;
        this.faltas = faltas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public void resgistrarFaltas(int faltas) {
        faltas = this.faltas++;
    }
    public double frequencia(){

        return((double)faltas/60)*100;
    }
    public abstract boolean aprovado();
    public void historico(){
        System.out.println("Nome: " + nome + "\n" +
                            "Faltas: " + faltas);
    }
}
    
