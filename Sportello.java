import java.util.ArrayList;

  
public class Sportello
{
 ArrayList<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();
 int progresso=1;

   public int prenota(String nomeUtentePrenotato)
   {
   	Prenotazione prenot = new Prenotazione(nomeUtentePrenotato,progresso);
    //progresso++;
 	  prenotazioni.add(prenot);
 	  return progresso++; 
   }
   public Prenotazione estrai() throws Exception
   {
      Prenotazione prenotazioneRimossa=null;
 	    if (prenotazioni.size() == 0) 
 	    {
 		    throw new Exception("Nessuna prenotazione allo sportello");
 	    }
      else 
      {
       prenotazioneRimossa =prenotazioni.get(0);
       prenotazioni.remove(0);
      }
       return prenotazioneRimossa;

 	 }  
   public void rinuncia(int numeroRinuncia) throws Exception
   {
     //int contatPrenotazioni=0;
     Prenotazione rimuovi=null;
     for (Prenotazione prenota :prenotazioni )
     {
        if (prenota.getNumeroPrenotazione() == numeroRinuncia) 
           {
             rimuovi=prenota;
           }
      }
      if(rimuovi!=null){ //puntatore pieno
        prenotazioni.remove(rimuovi);
      }
      else
      {
        //System.out.println(contatPrenotazioni);
        throw new Exception("Nessuna prenotazione allo sportello");
      }


   }
   public int tempoAttesa(int numeroPrenotazione) throws Exception
   {
    
    int contatPrenotazioni=0;
    for ( Prenotazione prenota: prenotazioni) 
    {
      if (prenota.getNumeroPrenotazione() != numeroPrenotazione) 
      {
        contatPrenotazioni++;
      }
      else 
      {
        break;
      }
    }
    if (contatPrenotazioni == prenotazioni.size()) 
    {
      throw new Exception("Nessuna prenotazione allo sportello");
    }
     return contatPrenotazioni;




   }
 	 
    public String toString()
   { String info="";
 	   for (Prenotazione prenota :prenotazioni ) 
 	   {
 		  info=info+prenota+'\n'+"************"+'\n';
 		  
 	   }
     return info;
   } 
   


} 