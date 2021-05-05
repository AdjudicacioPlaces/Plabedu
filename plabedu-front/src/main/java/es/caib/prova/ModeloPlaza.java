package es.caib.prova;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe ModeloPlaza s'encarregarà d'agafar la informació de la base de dades.
 * @author e41621391q
 *
 */
public class ModeloPlaza {
	
	/**
	 * Ens proporciona una llista amb les Plazas.
	 * @return List<Plazas>.
	 */
	public static List<Plazas> getPlazas() {
		//AQUI ANIRÀ LA CONSULTA A LA BBDD
		List<Plazas> list = new ArrayList<>();
		list.add(Plazas.createAdjudgedPlace("02-01-2021", "Temporal", "Parcial", false, "03-01-2021", "15-01-2021",
				"Baixa", "Mallorca", "Palma", "Riera Bosch, Barbara", "F", "IES Ses Estacions"));
		list.add(Plazas.createAdjudgedPlace("08-01-2021", "Fixo", "Completa", false, "10-01-2021", "20-01-2021",
				"Maternitat", "Menorca", "Ciutadella", "Afanador Garcia, Marc", "M", "CEIP Pilar Juncosa"));
		list.add(Plazas.createAdjudgedPlace("12-01-2021", "Temporal", "Completa", true, "20-01-2021", "01-02-2021",
				"Maternitat", "Eivissa", "Sant Antoni Abad", "Gallardo Beltran, Maria Antònia", "F",
				"IES Sant Josep Obrer"));
		list.add(Plazas.createAdjudgedPlace("01-02-2021", "Fixo", "Completa", false, "05-02-2021", "15-02-2021",
				"Baixa", "Formentera", "Es Pujols", "Ginés Rodriguez, Juan Antonio", "M",
				"CEIP Sant Joan de Sa Talaia"));
		return list;
	}
}
