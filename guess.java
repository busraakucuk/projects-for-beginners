import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        int a = (int)(Math.random()*101);
                try (Scanner input = new Scanner(System.in)) {
                    System.out.println("Guess the number between 0-100: ");
                    int b = -1;
                    while (b!=a){
                        b = input.nextInt();
                        if (b==a){
                            System.out.println("Your guess is True");
                        }
                        else if (b<a)
                            System.out.println("higher");
                        else
                            System.out.println("lower");
                    }
                }
    }
}
