public class Prenotazione//classe prenotazione dove creiamo una prenotazione
{
   private String nomeUtentePrenotato;//creiamo attributi di una prenotazione
   private int numeroPrenotazione;
   public Prenotazione(String nomeUtentePrenotato,int numeroPrenotazione)//creazione costruttore dell oggetto prenotazione con i suoi attributi
   {
     this.nomeUtentePrenotato=nomeUtentePrenotato;
     this.numeroPrenotazione=numeroPrenotazione;
   }
   public String getNomeUtentePrenotato()//creaiamo i relativi metodi get e set per avere il ritorno degli attributi della classe
   {
     return nomeUtentePrenotato;
   }
   public int getNumeroPrenotazione()
   {
   	return numeroPrenotazione;
   }
   public String toString()//metodo per stampare direttamente l oggetto prenotazione
   {
   	String oggetto="Nome utente prenotato: "+ getNomeUtentePrenotato()+","+"Numero prenotazione: "+getNumeroPrenotazione();
   	return oggetto;
   }



}
