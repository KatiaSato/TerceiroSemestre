/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

import java.util.Date;

/**
 *
 * @author katia
 */
public class CarroProprio extends Carro{
    private double valorCompra;
    private String dataCompra;
    public CarroProprio(){}
    /**
     *
     * @param placa
     * @param anoFabricacao
     * @param modelo
     * @param valorCompra
     * @param dataCompra
     */
    public CarroProprio(int placa,int anoFabricacao,String modelo, String vendedor, double valorCompra, String dataCompra) {
        super(placa, anoFabricacao, modelo, vendedor);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Override
    public boolean oferta(double valorCompra) {
        return valorCompra >= this.valorCompra*1.1;
    }
    @Override
    public void imprimeDados(){

        super.imprimeDados();
        System.out.println("Valor da compra: " + this.valorCompra + "Data da compra: " + this.dataCompra);
    }
}
