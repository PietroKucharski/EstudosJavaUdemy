package application;

import entities.Contract;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa48 {
    public static void main(String[] args) {
        /* Exercício de fixação
        Uma empresa deseja automatizar o processamento de seus contratos. O processamento deum contrato consiste em gerar
        as parcelas a serem pagas para aquele contrato, com base nonúmero de meses desejado. A empresa utiliza um serviço
        de pagamento online para realizar o pagamento das parcelas.Os serviços de pagamento online tipicamente cobram um
        juro mensal, bem como uma taxapor pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que
        aplicajuros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%. Fazer um programa para ler os dados
        de um contrato (número do contrato, data do contrato,e valor total do contrato). Em seguida, o programa deve ler
        o número de meses paraparcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
        sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela doismeses após o contrato
        e assim por diante. Mostrar os dados das parcelas na tela.
        Class Contract -> number:Integer; date:LocalDate; totalValue:Double;
        Class Installment -> dueDate:LocalDate; amount:Double;
        Class ContractService -> processContract(contract:Contract, months:Integer):void;
        Class PaypalService implements OnlinePaymentService -> paymentFee(amount:Double):Double; interest(amount:Double, months:Integer)
        Interface OnlinePaymentService -> paymentFee(amount:Double):Double; interest(amount:Double, months:Integer)
        * */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.print("Numero: ");
        int contractNumber = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Valor do contrato: ");
        double contractValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.print("Entre com o numero de parcelas: ");
        int installments = sc.nextInt();

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, installments);
    }
}
