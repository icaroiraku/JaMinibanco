package la.foton.treinamento.minibanco.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HoraData {
	
	private int horaHHMMSS = 211015;
	
	
	

	

	public int getHoraHHMMSS() {
		return horaHHMMSS;
	}

	public void setHoraHHMMSS(int horaHHMMSS) {
		this.horaHHMMSS = horaHHMMSS;
	}
	
	
	
	
	
	
	public LocalDateTime getData(){
		
		 return LocalDateUtils.converteHorarioParaLocalDateTime(horaHHMMSS);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		int horaHHMMSS2 = 210000;
		int hora = horaHHMMSS2 / 10000;
		int minuto = (horaHHMMSS2 % 10000) / 100;
		int segundo = horaHHMMSS2 % 100;
		LocalDateTime horaConvertida = LocalDate.now().atTime(hora, minuto, segundo);
		
		System.out.println("Hora convertida: " + horaConvertida);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		
		System.out.println("Data:" + dtf.format(horaConvertida));
	
	
	}
		}
