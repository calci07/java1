package javaprac.assignment;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;


// polymorphism po gamit ko hehw

class info {
    public void show() {
        System.out.println("==============================================");
        System.out.println("            Book your tickets now!            ");
        System.out.println("==============================================");
        System.out.println("\n");
    }
}

class customer extends info {
    public void show() {
        System.out.println("==============================================");
        Scanner input = new Scanner(System.in);
        System.out.print("Kindly enter your name: ");
        String name = input.next();
        name = name.trim();
        String nameCapital = name.substring(0,1). toUpperCase() + name.substring(1);
        System.out.print("Salutation (Ms./Mr./Mrs): ");
        String salutation = input.next();
        salutation = salutation.trim();
        String salutationCapital = salutation.substring(0,1). toUpperCase() + salutation.substring(1);
        System.out.println("Hey there, " + salutationCapital + " " + nameCapital + "!");
        System.out.println("==============================================");
        System.out.println("\n");
    }
}

class movies extends info {
    public void show() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("==============================================");
            System.out.println("      What movie would you like to watch?     ");
            System.out.println("==============================================");
            System.out.println("\n");

            System.out.println("==========================================================");
            System.out.println("[1] Avatar");
            System.out.println("Ticket Price: ₱400");
            System.out.println("Year: 2009");
            System.out.println("Director: James Cameron");
            System.out.println("Writer: James Cameron");
            System.out.println("Awards: 91 wins and 131 nominations in total (Won 3 Oscars)");
            System.out.println("Lifetime Gross: $2,923,706,026");
            System.out.println("==========================================================");
            System.out.println("\n");


            System.out.println("==========================================================");
            System.out.println("[2] Avengers: Endgame");
            System.out.println("Ticket Price: ₱350");
            System.out.println("Year: 2019");
            System.out.println("Directors: Anthony Russo ◌ Joe Russo");
            System.out.println("Writers: Christopher Markus ◌ Stephen McFeely ◌ Stan Lee");
            System.out.println("Awards: 70 wins and 133 nominations in total (Nominated for 1 oscar)");
            System.out.println("Lifetime Gross: $2,799,439,100");
            System.out.println("==========================================================");
            System.out.println("\n");


            System.out.println("==========================================================");
            System.out.println("[3] Avatar: The Way of Water");
            System.out.println("Ticket Price: ₱350");
            System.out.println("Year: 2022");
            System.out.println("Director: James Cameron");
            System.out.println("Writers: James Cameron ◌ Rick Jaffa ○ Amanda Silver");
            System.out.println("Awards: 75 wins and 150 nominations in total (Won 1 oscar)");
            System.out.println("Lifetime Gross: $2,320,250,281");
            System.out.println("==========================================================");
            System.out.println("\n");


            System.out.println("==========================================================");
            System.out.println("[4] Titanic");
            System.out.println("Ticket Price: ₱300");
            System.out.println("Year: 1990");
            System.out.println("Director: James Cameron");
            System.out.println("Writer: James Cameron");
            System.out.println("Awards: 126 wins and 83 nominations in total (Won 11 oscar)");
            System.out.println("Lifetime Gross: $2,264,750,694");
            System.out.println("==========================================================");
            System.out.println("\n");


            System.out.println("==========================================================");
            System.out.println("[5] Star Wars: Episode VII - The Force Awakens");
            System.out.println("Ticket Price: ₱250");
            System.out.println("Year: 2015");
            System.out.println("Director: J.J. Abrams");
            System.out.println("Writers: Lawrence Kasdan ◌ J.J. Abrams ◌ Michael Arndt");
            System.out.println("Awards: 64 wins and 140 nominations in total (Nominated for 5 Oscars)");
            System.out.println("Lifetime Gross: $2,071,310,218");
            System.out.println("==========================================================");
            System.out.println("\n");



            System.out.println("Your chosen movie (1-5): ");
            int choice = input.nextInt();
            
            switch (choice) {



                    case 1:
                    System.out.println("\n");
                    System.out.println("=======================================================================================");
                   System.out.println("Great choice! Avatar is a visually stunning masterpiece directed by James Cameron.");
                   System.out.println("=======================================================================================");
                   System.out.println("\n");
                   System.out.print("Enter quantity of tickets: ");
                  int tickets = input.nextInt();
                  System.out.println("Your total bill is: " + tickets * 400);
                  System.out.println("=======================================================================================");
                  System.out.println("\n");
           
                    break;




                    case 2:
                    System.out.println("=======================================================================================");
                   System.out.println("Fantastic choice! Avengers: Endgame, directed by the Russo brothers, is a cinematic masterpiece that brilliantly concludes the Marvel saga with epic action and emotional resonance.");
                   System.out.println("=======================================================================================");
                   System.out.println("\n");
                   System.out.print("Enter quantity of tickets: ");
                  int tickets2 = input.nextInt();
                  System.out.println("Your total bill is: " + tickets2 * 350);
                  System.out.println("=======================================================================================");
                  System.out.println("\n");
                    break;


                    
                    case 3:
                    System.out.println("=======================================================================================");
                    System.out.println("Exciting news! 'Avatar: The Way of Water,' directed by James Cameron, continues the captivating journey of Pandora with stunning visuals and new adventures.");
                    System.out.println("=======================================================================================");
                    System.out.println("\n");
                    System.out.print("Enter quantity of tickets: ");
                   int tickets3 = input.nextInt();
                   System.out.println("Your total bill is: " + tickets3 * 300);
                   System.out.println("=======================================================================================");
                   System.out.println("\n");
                    break;




                    case 4:
                    System.out.println("=======================================================================================");
                    System.out.println("Iconic selection! 'Titanic,' directed by James Cameron, remains a timeless masterpiece, blending romance and tragedy against the backdrop of one of history's most infamous disasters.");
                    System.out.println("=======================================================================================");
                    System.out.println("\n");
                    System.out.print("Enter quantity of tickets: ");
                   int tickets4 = input.nextInt();
                   System.out.println("Your total bill is: " + tickets4 * 250);
                   System.out.println("=======================================================================================");
                   System.out.println("\n");
                    break;




                    case 5:
                    System.out.println("=======================================================================================");
                    System.out.println("Exciting pick! 'Star Wars: Episode VII - The Force Awakens,' directed by J.J. Abrams, rejuvenates the saga with action-packed sequences and beloved characters.");
                    System.out.println("=======================================================================================");
                    System.out.println("\n");
                    System.out.print("Enter quantity of tickets: ");
                   int tickets5 = input.nextInt();
                   System.out.println("Your total bill is: " + tickets5 * 200);
                   System.out.println("=======================================================================================");
                   System.out.println("\n");
                    break;

                default:
                    System.out.println("Please choose between 1 - 5!");
                    continue;


            }

            break;
        }
    }
}



class payment extends info{

    public void show(){
        Scanner input = new Scanner(System.in);
        System.out.println("=======================================================================================");
        System.out.println("                            Select your payment method                                 ");                
        System.out.println("=======================================================================================");
        System.out.println("\n");
        System.out.println("[1] Gcash");
        System.out.println("[2] Over the counter");
        int payment1 = input.nextInt();
        if(payment1 == 1){
          System.out.print("Kindly enter your mobile number: +63 ");
          String mobilenum1 = input.next();
          System.out.print("Input your 4 digit mpin: ");
          int mpin = input.nextInt();
          System.out.println("=======================================================================================");
          System.out.println("Payment Successful!");
          System.out.println("=======================================================================================");
          System.out.println("\n");
        }
        else if(payment1 == 2){
            System.out.println("Kindly pay over the counter.");
            System.out.println("\n");

        }
    }

}


class time extends info{
public void show(){
    Scanner input = new Scanner(System.in);
    LocalDateTime currentTime = LocalDateTime.now();
    System.out.println("=======================================================================================");
    System.out.println("                               Choose a movie schedule                                 ");
    System.out.println("=======================================================================================");
    System.out.println("\n");
    System.out.println("[1] 8am-10am");
    System.out.println("[2] 12pm-2pm");
    System.out.println("[3] 3pm-5pm");
    System.out.println("[4] 6pm-8pm");
    int timeOfScreening = input.nextInt();
    switch(timeOfScreening){

        case 1: 
        System.out.println("=======================================================================================");
        System.out.println("Schedule chosen: 8am-10am" + "Ticket bought at: " + currentTime);
        System.out.println("=======================================================================================");
        System.out.println('\n');
        break;

        case 2: 
        System.out.println("=======================================================================================");
        System.out.println("Schedule chosen: 12pm-2pm" + "Ticket bought at: " + currentTime);
        System.out.println("=======================================================================================");
        System.out.println('\n');
        break;


        case 3:
        System.out.println("=======================================================================================");
        System.out.println("Schedule chosen: 3pm-5pm" + "Ticket bought at: " + currentTime);
        System.out.println("=======================================================================================");
        System.out.println("\n");
        
        break;


        case 4: 
        System.out.println("=======================================================================================");
        System.out.println("Schedule chosen: 6pm-8pm" + "Ticket bought at: " + currentTime);
        System.out.println("=======================================================================================");
        System.out.println("\n");
        break;
    }
}

}


class seatNum extends info{
    public void show(){
        Scanner input = new Scanner(System.in);
        Random seat = new Random();
        
        System.out.println("=======================================================================================");
        int randomNumber = seat.nextInt(200) + 1;
      
       
       
        System.out.println("Your seat number is: " + randomNumber);
        System.out.println("=======================================================================================");
        System.out.println("\n");
    }
}



public class MovieTicket {
    public static void main(String[] args) {
        info information = new info();
        information.show();

        customer user = new customer();
        user.show();

        movies films = new movies();
        films.show();

        payment bayad = new payment();
        bayad.show();

        seatNum seat = new  seatNum();
        seat.show();

        time timeOfScreening = new time();
        timeOfScreening.show();

   

     






    }
}
