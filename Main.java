public class Main
{
   public static void main(String[] args) 
   {
	Sportello sportello1 =new Sportello();
	
	

	sportello1.prenota("Gianni Rossi");
	sportello1.prenota("Antonio Dacc");
	sportello1.prenota("Maurizio Dimauro");
	sportello1.prenota("Agata Frisca");
	sportello1.prenota("Francesco Viscuso");
	sportello1.prenota("Gabriele Ardizzone");
	System.out.println(sportello1);
	try
	{
	  sportello1.rinuncia(3);
	  sportello1.rinuncia(8);
	  System.out.println(sportello1);
	  System.out.println(sportello1.tempoAttesa(6));
	  System.out.println(sportello1.tempoAttesa(7));
    } 
    catch(Exception ex)
    {
       System.out.println(ex);
    }
    







	//sportello1.stampaInfoPrenotazioni();
	//sportello1.rinuncia(7);

	/*Prenotazione prenotazione2= new Prenotazione("Mario Rossi",2);
	sportello1.prenotazione(prenotazione2);
	Prenotazione prenotazione3= new Prenotazione("Maria Anfuso",3);
    sportello1.prenotazione(prenotazione3);*/
    

	
	
   }
   


}