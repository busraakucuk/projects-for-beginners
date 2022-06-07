import java.util.Scanner;
public class lottery {
    public static void main(String[] args) {
        int x = (int)(Math.random()*9000)+1000;
        try (Scanner stdin = new Scanner(System.in)) {
            System.out.println("enter the lucky number (4 digits)");
            int entered= stdin.nextInt();
            int ent1= entered%10,
                ent2= (entered/10)%10,
                ent3= (entered/100)%10,
                ent4= (entered/1000),
                x1= x%10,
                x2= (x/10)%10,
                x3= (x/100)%10,
                x4= (x/1000),
                award=0;
            if (ent1==x1 || ent2==x2 || ent3 == x3 || ent3 == x3){
                if (ent1==x1)
                award+=250;
                if (ent2==x2)
                award+=250;
                if (ent3 == x3)
                award+=250;
                if (ent4==x4)
                award+=250;
            System.out.println("YOU WON " + award + "DOLLARS");
            }
            else 
            System.out.println("you lost :(");

            System.out.println("The number was "+ x);
        }
    }
}
