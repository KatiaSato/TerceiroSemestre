/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author katia
 */
public class CarroConsignado extends Carro{
    private String nomeProprietario;
    private double valorDesejado;

    
    public CarroConsignado(){
        super();
    }

    public CarroConsignado(int placa, int anoFabricacao, String model, String vendedor, String nomeProprietario, double valorDesejado) {
        super(placa, anoFabricacao, model, vendedor);
        this.nomeProprietario = nomeProprietario;
        this.valorDesejado = valorDesejado;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getValorDesejado() {
        return valorDesejado;
    }

    public void setValorDesejado(double valorDesejado) {
        this.valorDesejado = valorDesejado;
    }


    @Override
    public boolean oferta(double valor){
        return valor >= this.valorDesejado*1.05;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Nome: " + this.nomeProprietario);
    }
}
