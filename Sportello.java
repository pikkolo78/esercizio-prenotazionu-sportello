import java.util.ArrayList;

public class Sportello
{
 ArrayList<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();

   public int prenota(String nomeUtentePrenotato,int numeroPrenotazione)
   {
   	Prenotazione prenot = new Prenotazione(nomeUtentePrenotato,numeroPrenotazione);
 	  prenotazioni.add(prenot);
 	  return numeroPrenotazione;
   }
   public Prenotazione estrai() 
   {
 	    if (prenotazioni.size() == 0) 
 	    {
 		    System.out.println("Nessuna prenotazione allo sportello");
 	    }
 	      return prenotazioni.get(0);
        //prenotazioni.remove(0);
   }  
   public void rinuncia(int numeroRinuncia)
   {
     int contatPrenotazioni=0;
     for (Prenotazione prenota :prenotazioni )
     {
        if (prenota.getNumeroPrenotazione() != numeroRinuncia) 
           {
             contatPrenotazioni++;
           }
           else 
           {
             prenotazioni.remove(prenota);
           }
      }
      
      if (contatPrenotazioni ==prenotazioni.size()) 
      {
        System.out.println("Nessuna prenotazione trovata");
      }


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