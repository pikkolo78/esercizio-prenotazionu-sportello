import java.util.ArrayList;//importiamo la classe per creare un array list


public class Sportello
{
 ArrayList<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();//creaiamo un arraylist di prenotazioni che si andra ad incrementar ogni volta che ne creiamo una
 int progresso=1;//variabile per incrementare il numero dellq prenotazione che parte da 1 in quanto il primo numero  della prenot. è 1

   public int prenota(String nomeUtentePrenotato)//metodo per creare la prima prenotazione con una stringa passata in input
   {
   	Prenotazione prenot = new Prenotazione(nomeUtentePrenotato,progresso);//alla chiamata del metodo sull oggetto sportello creato nel main viene creato all interno un oggetto prenot al quale passiamo il nome utente e il progresso
    //progresso++;
 	  prenotazioni.add(prenot);//oggeto prenotazione che andra a prendere posizione nell array list
 	  return progresso++;//variabile in ritorno incrementata per il prox numero della prenotazione
   }
   public Prenotazione estrai() throws Exception
   {//metodo per estrarre la prox prenotazione con creazione eccezione
      Prenotazione prenotazioneRimossa=null;// puntatore nuovo a null in quanto ancora vuota
 	    if (prenotazioni.size() == 0) //se la lunghezza di array prenot eè uguale a 0
 	    {
 		    throw new Exception("Nessuna prenotazione allo sportello");//scatta l eccezione in quanto non esiste nessuna prenot
 	    }
      else
      {
       prenotazioneRimossa =prenotazioni.get(0);//altrimenti il puntatore il puntatore che prima era a null va a ed essere l oggeto nell posizione 0 dell array in quanto la prima prenotazione da chiamare si trova sempre nella posiz 0 dell aray
       prenotazioni.remove(0);//poi la rimuove dall array in quanto chiamata
      }
       return prenotazioneRimossa;

 	 }
   public void rinuncia(int numeroRinuncia) throws Exception
   {
     // metodo per la rinuncia di persone di persone che annullano con eccezione
     Prenotazione rimuovi=null;//creazione puntastore a nulla quindi vuoto e senza un oggetto presente
     for (Prenotazione prenota :prenotazioni )//foreach per uscire a giro gli oggetti prenot dall array
     {
        if (prenota.getNumeroPrenotazione() == numeroRinuncia) //per ogni ogg prenot ne prendiamo il numero e vediamo se è uguale a numero rinuncia passato alla chiamata del metofo
           {
             rimuovi=prenota;//appena trovato il puntatore che prima era a null viene riempito dal ogg trovato nel for che ha il numero uguale a numero rinuncia
           }
      }
      if(rimuovi!=null){ //se il puntatore è pieno quindi ha trovato il numero della rinuncia e quindi esiste nell array un pre4notazione con quel numero
        prenotazioni.remove(rimuovi);//rimuovi dalla array il puntaatore e quindi la prenotazione che rinunciua
      }
      else
      {

        throw new Exception("Nessuna prenotazione allo sportello");//altrimenti scatta l eccezione in quanto nessuna prenotazione ha il numero che si vuole rinunciare
      }


   }
   public int tempoAttesa(int numeroPrenotazione) throws Exception
   {//metodo per sapere il numero di prenotazione che sta davanti ad una prenotaz

    int contatPrenotazioni=0;// creaiamo un contatore
    for ( Prenotazione prenota: prenotazioni) //foreach per uscire a giro gli oggetti dall array
    {
      if (prenota.getNumeroPrenotazione() != numeroPrenotazione) //se  il numero della prenot è diverso  numero prenot passato nel metodo in input
      {
        contatPrenotazioni++;//aumenta la variabile di 1,in quanto "getnumeroprenot"cerca in numero uguale alla prenotazione di cui si vuole il numero di attesa,controlla la prima la seconda fino a quando trova quella uguale a se
        //ogni volta che la trova diversa contatPrenotazioni si aumenta vale a dire che ci sta una persona avanti,piu trova il numero diverso piu aumenta e piu persone stanno avanti
      }
      else
      {
        break;//altrimenti ferma il ciclo una volta trovata quella del numero uguale a quell che in input diamo al metodo
      }
    }
    if (contatPrenotazioni == prenotazioni.size()) //se conta prenotazione è uguale all lunghezza dell array quindi nessuna prenotazione uguale vuol dire che il numero in input lo diamo sbagliato per la prenotazione,se abbiamo tre prenotazioni
    //e diamo in input numero 4 di prenotazione ovviamente non la trovaa e scatta l eccezione
    {
      throw new Exception("Nessuna prenotazione allo sportello");
    }
     return contatPrenotazioni;




   }

    public String toString()//metodo per stampare oggetto sportello creato nel main dove tramite il for each va astampare tutte le prenotazioni dello sportello
   { String info="";//crea stringa
 	   for (Prenotazione prenota :prenotazioni )
 	   {
 		  info=info+prenota+'\n'+"************"+'\n';//la riempie stampando gli oggetti dall array stampabili tramite il metodo to string,le '\n' servono per andare a capo

 	   }
     return info;
   }



}
