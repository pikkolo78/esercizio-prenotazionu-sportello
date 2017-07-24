public class Prenotazione
{
   private String nomeUtentePrenotato;
   private int numeroPrenotazione;
   public Prenotazione(String nomeUtentePrenotato,int numeroPrenotazione)
   {
     this.nomeUtentePrenotato=nomeUtentePrenotato;
     this.numeroPrenotazione=numeroPrenotazione;
   }
   public String getNomeUtentePrenotato()
   {
     return nomeUtentePrenotato;
   }
   public int getNumeroPrenotazione()
   {
   	return numeroPrenotazione;
   }
   /*public String toString()
   {
   	String oggetto=("Nome utente prenotato: "+ getNomeUtentePrenotato()+","+"Numero prenotazione: "+getNumeroPrenotazione());
   	return oggetto;
   }*/
   public void infoPrenotazione()
   {
    System.out.println("Nome utente prenotato: "+ getNomeUtentePrenotato()+","+"Numero prenotazione: "+getNumeroPrenotazione());
   }



}