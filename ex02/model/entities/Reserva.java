package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
	
	private Integer numeroQuartos;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	private static DateTimeFormatter  sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Reserva(ReservaBuilde builder) {
		this.numeroQuartos = builder.numeroQuartos;
		this.checkIn = builder.checkIn;
		this.checkOut = builder.checkOut;
	}

	public static long calcularDuracaoEmDias(LocalDate dataInicio, LocalDate dataFim) {
        Duration duracao = Duration.between(dataFim.atStartOfDay(),dataInicio.atStartOfDay());
        return duracao.toDays();
    }
	
	
	public void atualizaData(LocalDate checkout , LocalDate checkin) {
		if (checkin.isBefore(this.checkIn) || checkout.isBefore(this.checkOut)) {
			throw new IllegalArgumentException("Para atualizar, precisa ser datas futuras!");
		}
		this.checkIn = checkin;
		this.checkOut = checkout;
	}
	
	@Override
	public String toString() {
		return "Quarto"
				+ numeroQuartos
				+", checkin: "
				+ sdf.format(checkIn)
				+", checkout: "
				+ sdf.format(checkOut)
				+ ", duração "
				+ calcularDuracaoEmDias(checkOut, checkIn)
				+" dias";
	}
	
	
	public static class ReservaBuilde{
		private Integer numeroQuartos;
		private LocalDate checkIn;
		private LocalDate checkOut;
		
		

		public ReservaBuilde setNumeroQuartos(Integer numeroQuartos) {
			this.numeroQuartos = numeroQuartos;
			return this;
		}

		public ReservaBuilde setCheckIn(LocalDate checkIn) {
			this.checkIn = checkIn;
			return this;
		}

		public ReservaBuilde setCheckOut(LocalDate checkOut) {
			this.checkOut = checkOut;
			return this;
		}
		
		
		public Reserva builde() {
			return new Reserva(this);
		}
		
		
	}
	
}
