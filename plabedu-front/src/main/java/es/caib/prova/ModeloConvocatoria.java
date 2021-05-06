package es.caib.prova;

import java.util.ArrayList;
import java.util.List;

public class ModeloConvocatoria {

	public static List<Convocatories> getConvocatories() {
		//CONSULTES BBDD
		List<Convocatories> llistaConvocatories = new ArrayList<>();
		llistaConvocatories.add(Convocatories.crearConvocatoria("27/04/2021", "27/04/2021", "29/04/2021", "29/04/2021"));
		llistaConvocatories.add(Convocatories.crearConvocatoria("22/04/2021", "22/04/2021", "26/04/2021", "26/04/2021" ));
		llistaConvocatories.add(Convocatories.crearConvocatoria("20/04/2021", "20/04/2021", "22/04/2021", "22/04/2021"));
		llistaConvocatories.add(Convocatories.crearConvocatoria("13/04/2021", "13/04/2021", "15/04/2021", "15/04/2021"));
		return llistaConvocatories;
	}
}
