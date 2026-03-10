package Aplication;

import entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        LocalDate data = LocalDate.now();

        System.out.print("Room number: ");
        int room = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkIn.after(checkOut)) {
            System.out.print("Erro in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(checkIn, checkOut, room);
            System.out.print("Resevation: " + reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) {
                /*Se erro for diferente de null, essa mensagem será exibida*/
                System.out.println("Error inreservation: " + error);
            } else {
                System.out.print("Reservation updated: " + reservation);
            }
        }

        sc.close();
    }
}
