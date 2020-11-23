package la.foton.treinamento.minibanco.util;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateUtils {

		public static LocalDateTime converteHorarioParaLocalDateTime(Integer horaHHMMSS) {




				
				int hora = horaHHMMSS / 10000;
				int minuto = (horaHHMMSS % 10000) / 100;
				int segundo = horaHHMMSS % 100;

				
					
				
					return LocalDate.now().atTime(hora, minuto, segundo);



		}
	}
