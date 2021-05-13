package es.caib.prova;

import java.util.ArrayList;
import java.util.List;

public class ConvocatoriaService {
	public static List<Convocatoria> getAllConvocatories() {
		
		List<Convocatoria> convocatories = new ArrayList<>();
		
		convocatories.add(Convocatoria.crearConvocatoria("C397 - LLOC DE FEINA DEL 7 AL 10 DE MAIG DE 2021", "07/05/2021", "07/05/2021 12:32", "10/05/2021 12:00"));
		convocatories.add(Convocatoria.crearConvocatoria("C395 - LLOC DE FEINA DEL 30 D'ABRIL AL 03 DE MAIG DE 2021", "30/04/2021", "30/04/2021 12:25", "04/05/2021 09:00"));
		convocatories.add(Convocatoria.crearConvocatoria("C393 - LLOC DE FEINA DEL 23 AL 26 D'ABRIL DE 2021", "23/04/2021", "23/04/2021 13:11", "26/04/2021 12:00"));
		return convocatories;
	}
}
