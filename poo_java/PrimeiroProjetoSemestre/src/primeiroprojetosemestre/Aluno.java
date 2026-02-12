/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiroprojetosemestre;

/**
 *
 * @author katia
 */
public class Aluno {
    private String nome, ra;
    private int faltas;
    private double media;
    
    public void setNome(String nome){
        if(!nome.isEmpty()) this.nome = nome; //se string nao for vazia
    }
    public void setRa(String ra) {
        if(!ra.isEmpty()) this.ra = ra;
    }
    public void setFaltas(int faltas) {
        if(this.faltas >= 0) this.faltas = faltas;
    }
    public void setMedia(double media){
        if (media > 0 && media <= 10) this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public int getFaltas() {
        return faltas;
    }

    public double getMedia() {
        return media;
    }
    
    public String resultado () {
        if (media >= 6 && faltas <= 20)
            return "Aprovado";
        else
            return "Reprovado";
    }
    
    public void print(){
        System.out.println(
        "Nome: " + "\t" + nome +"\n" +
                "RA: " + "\t" + ra + "\n" +
                "Faltas: " + faltas + "\n" +
                "Media: " + "\t" + media + "\n" +
                "Resultado: " +  resultado() );
    }
}
