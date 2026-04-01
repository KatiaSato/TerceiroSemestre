/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioprova;

/**
 *
 * @author katia
 */
public class AlunoAssistente extends Aluno{
    private String rg;
    private boolean resumoFinal;
  

    public AlunoAssistente() {
        super();
    }  
    
    public AlunoAssistente(String rg, boolean resumoFinal, String nome, int faltas) {
        super(nome, faltas);
        this.rg = rg;
        this.resumoFinal = resumoFinal;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void receberResumo(){
        if(resumoFinal == true){
            System.out.println("Entregou o exame");
        }else{
            System.out.println("Nao entregou o exame");
        }
    }

    @Override
    public boolean aprovado() {
        if(resumoFinal == true && super.frequencia()>= 75)
            return true;
        else
            return false;
    }
    @Override
    public void historico(){
        super.historico();
        System.out.println("RG: " + rg + "\n" +
                           "Aprovado: " + (aprovado()?"Sim":"Nao") + "\n"
                            );
    }

}
