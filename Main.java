import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
     Scanner input =new Scanner(System.in);
	   Sportello sportello1 =new Sportello();

       /*sportello1.prenota("Gianni Rossi");
	     sportello1.prenota("Antonio Dacc");
	     sportello1.prenota("Maurizio Dimauro");
	     sportello1.prenota("Agata Frisca");
	     sportello1.prenota("Francesco Viscuso");
	     sportello1.prenota("Gabriele Ardizzone");
	     System.out.println(sportello1);
	     try
	       {
	         sportello1.rinuncia(3);
	         sportello1.rinuncia(5);
	         System.out.println(sportello1);
	         System.out.println(sportello1.tempoAttesa(6));
	         System.out.println(sportello1.tempoAttesa(2));
         }
            catch(Exception ex)
            {
              System.out.println(ex);
            }*/
            String risposta;
        do
        {
          System.out.println("Menu Sportello: ");
          System.out.println("1. Inserisci prenotazione ");
          System.out.println("2. Prossima prenotazione");
          System.out.println("3. Rinuncia prenotazione");
          System.out.println("4. Tempo attesa");
          System.out.println("5. Stampa prenotazioni");
          System.out.println("6. esci");

          System.out.println("");
          risposta=input.nextLine();
          switch(risposta)
          {
               case "1":  System.out.println("Digita nome e cognome");
                          sportello1.prenota(input.nextLine());break;
               case "2": try
                            {
                              sportello1.estrai();break;
                            }
                            catch(Exception ex)
                            {
                              System.out.println(ex);
                            }
               case "3": try
                            {
                             System.out.println("Digita il numero della prenotazione da annullare");
                             sportello1.rinuncia(input.nextInt());break;
                            }
                               catch(Exception ex)
                               {
                                 System.out.println(ex);
                               }
               case "4": try
                            {
                               System.out.println("Digita il numero della prenotazione");
                               System.out.println(sportello1.tempoAttesa(input.nextInt()));break;


                            }
                            catch(Exception ex)
                            {
                              System.out.println(ex);
                            }

               case "5": System.out.println(sportello1);break;
               case "6":break;
               default : System.out.println("selezione errata");break;
          }
        }
        while(!risposta.equals("6"));





     }




}
