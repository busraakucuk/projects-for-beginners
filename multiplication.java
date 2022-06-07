public class multiplication {
    public static void main(String[] args) {
        System.out.println("----------- Multiplication Table -----------");
            System.out.print("    ");
            for (int k=1;k<11;k++)
                System.out.printf("%4d",k);
            
            System.out.println("\n--------------------------------------------");
            for (int i=1;i<10;i++){
                System.out.print(i + " | ");
                for (int j=1;j<11;j++){
                System.out.printf("%4d",i*j);}
                System.out.print("\n");
            }
    }
}
