package Aplication;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre com os dados do contrato: ");
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), formatter);
        System.out.println("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(numero, date, totalValue);
        System.out.println("Entre com o numero de parcelas: ");
        int numeroParcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, numeroParcelas);
        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }
        sc.close();
    }
}
