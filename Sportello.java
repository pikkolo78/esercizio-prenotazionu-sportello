import java.util.ArrayList;

public class Sportello
{
 ArrayList<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();

   public int prenota(String nomeUtentePrenotato,int numeroPrenotazione)
   {
   	String nome=nomeUtentePrenotato;
   	int numero=numeroPrenotazione;
   	Prenotazione prenot = new Prenotazione(nome,numero);
 	prenotazioni.add(prenot);
 	/*int posizione=prenotazioni.indexOf(prenot);
 	return posizione;*/
 	return numero;
   }
   public Prenotazione proxPrenotazione() 
   {
 	  if (prenotazioni.size() == 0) 
 	  {
 		System.out.println("Nessuna prenotazione allo sportello");
 	  }
 	  
 	  return prenotazioni.get(0);
    }  
 	 
    public void stampaInfoPrenotazioni()
    {
 	  for (Prenotazione prenota :prenotazioni ) 
 	  {
 		prenota.infoPrenotazione();
 		System.out.println("****************");
 	  }
    } 
   


} 