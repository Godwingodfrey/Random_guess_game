public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

//        make a target number that the player have to guess
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9");


        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            System.out.println("Each players will have to choose a number");

            p1.guess();
            p2.guess();
            p3.guess();

            System.out.println("Player 1 guessed " + p1.number);
            System.out.println("Player 2 guessed " + p2.number);
            System.out.println("Player 3 guessed " + p3.number);

            if (p1.number == targetNumber){
                System.out.println("We have a winner");
                System.out.println("Player 1 got it right");
                break;
            } else if (p2.number == targetNumber) {
                System.out.println("We have a winner");
                System.out.println("Player 2 got it right");
                break;
            }else if (p3.number == targetNumber) {
                System.out.println("We have a winner");
                System.out.println("Player 3 got it right");
                break;
            }

            else {
                System.out.println("No player got it right, So we try again");
            }
        }
    }

}
