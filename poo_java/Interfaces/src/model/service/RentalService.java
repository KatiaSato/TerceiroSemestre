package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }
    public void processInvoice(CarRental carRental) {
        //Duration.between() encontra a duracao entre dois instantes
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60; //calculo da fracao da diferença em minutos

        double basicPayment;
        if(hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours); //Math.ceil(hours) arrendonda pra cima o tempo em minutos
        }else{
            basicPayment = pricePerDay * Math.ceil(hours/24); //arredonda pra cima o tempo em minutos e converte as horas em dias
        }
        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
