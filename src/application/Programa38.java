package application;

import entities.Reservation;
import exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Programa38 {
    public static void main(String[] args) {
        /* Exercicio de exceções personalizadas - solução muito ruim
        Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída)
        e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída,
        atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar dados
        inválidos para a reserva, conforme as seguintes regras:
            - Alterações de reserva só podem ocorrer para datas futuras
            - A data de saída deve ser maior que a data de entrada
        Class Reservation -> roomNumber:Integer; checkIn:LocalDate; checkOut:LocalDate; duration():Integer;
                             updateDates(checkIn:LocalDate, checkOut:LocalDate):void
        */
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), dtf);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), dtf);

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), dtf);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), dtf);

            reservation.updateDates(checkIn, checkOut);

            System.out.println("Reservation: " + reservation);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error ");
        }
    }
}
