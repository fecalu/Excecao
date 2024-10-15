package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reserva;

public class app {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		DateTimeFormatter fomata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.println("Numero de quarto: ");
			int numeroQuarto = sc.nextInt();
			System.out.println("Data de Check-in (dd/MM/yyyy): ");
			LocalDate checkin = LocalDate.parse(sc.next(), fomata);
			System.out.println("Data de Check-out (dd/MM/yyyy): ");
			LocalDate checkout = LocalDate.parse(sc.next(), fomata);
			
			Reserva reserva01 = new Reserva.ReservaBuilde()
					.setNumeroQuartos(numeroQuarto)
					.setCheckIn(checkin)
					.setCheckOut(checkout)
					.builde();
			
			System.out.println("Reserva: " + reserva01);
			
			System.out.println();
			
			System.out.println("Entre com a data de atualização: ");
			System.out.println("Data de Check-in (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.next(), fomata);
			System.out.println("Data de Check-out (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.next(), fomata);
			
			
			reserva01.atualizaData(checkout, checkin);
			System.out.println("Reserva: " + reserva01);
		}
		catch (IllegalArgumentException e){
			System.out.println("Data invalida!" + e.getMessage());
		}
		
		
		
		
		sc.close();

	}

}
