package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService; //dependencia

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months; //calcula parcela. Valor do contrato divido por parcelas
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i); //vencimento = data original + mes. plusMonths() adiciona meses

            //calula valor e taxa de cada um dos meses
            //1% juros simples mensal + 2% taxa de pagamento
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            //.getInstallments() acessar a lista
            //.add adicionar objeto
            //.add(new Installment(dueDate, quota)) instancia

            contract.getInstallments().add(new Installment(dueDate, quota));

        }
    }
}
