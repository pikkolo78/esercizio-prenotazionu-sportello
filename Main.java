import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
     Scanner input =new Scanner(System.in); //creaiamo metodo scannere per acquisire da tastiera
	   Sportello sportello1 =new Sportello();//creaiamo oggetto sportello

       //creaimo menu per utente
            String risposta;//tramite il do while ,nel do facciamo stampare sempre il menu
        do
        {
          System.out.println("Menu Sportello: ");
          System.out.println("1. Inserisci prenotazione ");
          System.out.println("2. Prossima prenotazione");
          System.out.println("3. Rinuncia prenotazione");
          System.out.println("4. Tempo attesa");
          System.out.println("5. Stampa prenotazioni");
          System.out.println("6. esci");

          System.out.println("");//e poi lo gestiamo tramite  lo switch
          risposta=input.nextLine();//si associa alla variabile in stringa la scelta del menu
          switch(risposta)//per ogni risposta uncaso e un metodo da fare con le relative eccezioni....e le risposte acquisite da tastiera tramite i metodo next.int() o next.line()
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

                               int numero= Integer.parseInt(input.nextLine()) ;
                               System.out.println("Il tempo di attesa della prenotazione "+ numero + " e' "+sportello1.tempoAttesa(numero));break;


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
        while(!risposta.equals("6"));//appena si digita il 6 la condizione del while viene a finire  e si esce se si vuole dal programma





     }




}
