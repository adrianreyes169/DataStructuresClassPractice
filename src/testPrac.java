import java.util.Scanner;

public class testPrac {
    public static void main(String[] args) {
        // Scanner reader = new Scanner(System.in);
        // int numInput = 0;
        // boolean valid = false;

        // while(!valid){
        //     try{
        //         System.out.print("Enter a positive number: ");
        //         String input = reader.nextLine();
        //         numInput = Integer.parseInt(input);

        //         if(numInput <= 0){
        //             System.out.println("Invalid number.Try again.");
        //         }else{
        //             valid = true;
        //         }
        //     }catch(Exception e){
        //         System.out.println(e.getMessage());
        //     }
        // }
        // System.out.println("You entered: " + numInput);
        // reader.close();

        Rectangle r1 = new Rectangle(10, 15);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getLength());
    }
}
