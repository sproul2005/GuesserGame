import java.util.Scanner;
class Guesser{
  int Guessernum;
  public int takeNumberGuesser(){
    System.out.println("Guesser guess a number");
    Scanner Scan=new Scanner(System.in);
    Guessernum=Scan.nextInt();
    return Guessernum;
   }
}
class Player{
    int playernum;
    public int takeNumberPlayer(){
        System.out.println("Player guess a Number");
        Scanner Scan=new Scanner(System.in);
        playernum=Scan.nextInt();
        return playernum;
    }
 
}
class Umpire{
     int numfromGuesser;
     int numfromPlayer1;
     int numfromPlayer2;
     int numfromPlayer3;

     void CollectfromGuesser(){
        Guesser g=new Guesser();
        numfromGuesser=g.takeNumberGuesser();
      }
     void CollectfromPlayer(){
        Player P1=new Player();
        numfromPlayer1=P1.takeNumberPlayer();

        Player P2=new Player();
        numfromPlayer2=P2.takeNumberPlayer();

        Player P3=new Player();
        numfromPlayer3=P3.takeNumberPlayer();
     }
     void compare(){
        if(numfromPlayer1==numfromGuesser){
            if(numfromPlayer2==numfromGuesser && numfromPlayer3==numfromGuesser){
                System.out.println("All players won the game");
            }
          else if(numfromPlayer2==numfromGuesser){
            System.out.println("Onl player1 and player2 won the game");
          }
          else if(numfromPlayer3==numfromGuesser){
            System.out.println("Only player1 and  player3 won the game");
          }
          else{
            System.out.println("only player1 won the game");
          }
        }
        else if(numfromPlayer2==numfromGuesser){
            if(numfromPlayer3==numfromGuesser){
                System.out.println("only player2 and player3 won the game");
            }
            else{
                System.out.println("Only player2 won the match");
            }
        }
        else if(numfromPlayer3==numfromGuesser){
            System.out.println("Only player 3 won the game");
        }
        else{
            System.out.println("No player won the game");
        }
     }
}

public class Guessergame{
    public static void main(String[] args) {
        
        Umpire u=new Umpire();
        u.CollectfromGuesser();
        u.CollectfromPlayer();
        u.compare();
    }
}