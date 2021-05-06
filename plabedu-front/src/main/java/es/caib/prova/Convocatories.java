package es.caib.prova;


public class Convocatories{
	    /* ESTRUCTURA JSON CONVOCATORIES
	   	 *  {
	   	 *  "convocatoria": [
	   	 *  			{
	   	 *  				"dataPublicada": "27/04/2021",
	   	 *  				"dataInici": "27/04/2021",
	   	 *  				"dataFi": "29/04/2021",
	   	 *  				"dataResultat": "29/04/2021",
	   	 *  			}
	   	 *  		]
	   	 *  }
	     * */
		   private int id;
		   private String dataPublicada;
		   private String dataInici;
		   private String dataFi;
		   private String dataResultat;
		   
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDataPublicada() {
			return dataPublicada;
		}
		public void setDataPublicada(String dataPublicada) {
			this.dataPublicada = dataPublicada;
		}
		public String getDataInici() {
			return dataInici;
		}
		public void setDataInici(String dataInici) {
			this.dataInici = dataInici;
		}
		public String getDataFi() {
			return dataFi;
		}
		public void setDataFi(String dataFi) {
			this.dataFi = dataFi;
		}
		public String getDataResultat() {
			return dataResultat;
		}
		public void setDataResultat(String dataResultat) {
			this.dataResultat = dataResultat;
		}
		public Convocatories() {}
		
		public static Convocatories crearConvocatoria(String dataPublicada, String dataInici, String dataFi, String dataResultat) {
			Convocatories convocatoria = new Convocatories();
			convocatoria.id += 1;
			convocatoria.dataPublicada = dataPublicada;
			convocatoria.dataInici = dataInici;
			convocatoria.dataFi = dataFi;
			convocatoria.dataResultat = dataResultat;
			return convocatoria;
		}
		
		@Override
		public String toString() {
			return "Convocatories [id=" + id + ", dataPublicada=" + dataPublicada + ", dataInici=" + dataInici
					+ ", dataFi=" + dataFi + ", dataResultat=" + dataResultat + "]";
		}
		
		
		
		
		  
}
