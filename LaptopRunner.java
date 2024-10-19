import java.util.Scanner;

public class LaptopRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your laptop model");
        String laptop_model = input.nextLine();
        System.out.println("Please enter core of your laptop");
        int core = input.nextInt();

        Laptop laptop = new Laptop(laptop_model, core); 

        laptop.display();
    }
}