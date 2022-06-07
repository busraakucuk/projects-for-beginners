import java.util.Scanner;

public class Prime {
    static boolean isPrime(int a){
        
        for (int i=2;i<a;i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check whether it is prime or not");
        int a = input.nextInt();
        if (isPrime(a))
            System.out.println(a + " is prime");
        else 
            System.out.println(a + " is not prime");
    }
}
