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
		list.add(Plazas.createAdjudgedPlace("02-01-2021", "Eventual", "Parcial", "03-01-2021", "15-01-2021",
				"IT", "Mallorca", "Palma", "Riera Bosch, Barbara", "IES Ses Estacions"));
		list.add(Plazas.createAdjudgedPlace("08-01-2021", "Lloc vacant", "Completa", "10-01-2021", "20-01-2021",
				"Paternitat", "Eivissa", "Santa Eulària Des Riu", "Afanador Garcia, Marc", "IES Xarc"));
		list.add(Plazas.createAdjudgedPlace("12-01-2021", "Substitució", "Completa", "20-01-2021", "01-02-2021",
				"Excedència", "Menorca", "Alaior", "Gallardo Beltran, Maria Antònia",
				"IES Josep Miquel Guàrdia"));
		list.add(Plazas.createAdjudgedPlace("01-02-2021", "Eventual", "Completa", "05-02-2021", "15-02-2021",
				"IT", "Formentera", "Sant Francesc Xavier", "Ginés Rodriguez, Juan Antonio",
				"IES Marc Ferrer"));
		return list;
	}
}
