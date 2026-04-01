/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author katia
 */
public class Comercial extends Imovel {
    private double metragem;

    public Comercial() {
    }

    public Comercial(double metragem, String endereco, String nomeProprietario, String corretor, int cep, double valorMinimo, boolean dispAluguel) {
        super(endereco, nomeProprietario, corretor, cep, valorMinimo, dispAluguel);
        this.metragem = metragem;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de imovel Comercial \n" + 
                            "Metragem: "+ metragem);
    }
    
}
