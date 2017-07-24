public class Main
{
   public static void main(String[] args) 
   {
	Sportello sportello1 =new Sportello();
	sportello1.prenota("Gianni Rossi",1);
	sportello1.prenota("Antonio Dacc",2);
	sportello1.prenota("Maurizio Dimauro",3);
	sportello1.prenota("Agata Frisca",4);
	sportello1.prenota("Francesco Viscuso",5);
	sportello1.prenota("Gabriele Ardizzone",6);



	//sportello1.stampaInfoPrenotazioni();
	sportello1.rinuncia(7);

	/*Prenotazione prenotazione2= new Prenotazione("Mario Rossi",2);
	sportello1.prenotazione(prenotazione2);
	Prenotazione prenotazione3= new Prenotazione("Maria Anfuso",3);
    sportello1.prenotazione(prenotazione3);*/
    

	
	
   }
   


}