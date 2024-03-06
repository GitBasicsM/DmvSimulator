    package Assignment6;

    import java.util.Random;

    public class DmvSimulator {
        public static void main(String[] args) {
            System.out.println("Welcome to the DMV!");

            Random rand = new Random();
            int userNumber = rand.nextInt(200) + 1;
            System.out.println("Your number is " + userNumber + ". Please wait until your number is called.");

            for (int i = userNumber + 1; i <= 100; i++) {
                System.out.println("Now calling number: " + i);
            }
            for (int i = 1; i < userNumber; i++) {
                System.out.println("Now calling number: " + i);
            }

            System.out.println("Now calling number: " + userNumber);

            int chance = rand.nextInt(100) + 1;
            if (chance <= 99){
             System.out.println("Stupid you do not have the paperwork get out of here!");
            } 
        else{
            System.out.println("Congratulations, you have all of the required paperwork and you are all set.");
    }
           
        }
    }
