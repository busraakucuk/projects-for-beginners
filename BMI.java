import java.util.Scanner;
public class BMI{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        System.out.println("Hello, what is your name");
        String name = input.nextLine();

        System.out.println("Hello " + name + ", can you type your weight?");
        double weight = input.nextDouble();

        System.out.println("please enter your height");
        double height = input.nextDouble();

        double BMI = weight/(height*height);
        
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI >=18.5 && BMI<25)
            System.out.println("Normal");
        else if (BMI >=25 && BMI<30)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
        }
    }
}
