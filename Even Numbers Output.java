import java.util.Scanner;
public class Even_Num_Printing{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int StartVal, EndVal;
        int Num;
        System.out.println("Enter starting number: ");

        while (input.hasNextInt() == false){
            System.out.println("Enter a INTEGER number: ");
            input.next();
        }
        StartVal = input.nextInt();

        System.out.println("Enter ending number: ");

        while (input.hasNextInt() == false){
            System.out.println("Enter a INTEGER number: ");
            input.next();
        }
        EndVal = input.nextInt();

        Num = StartVal;
        
        if (Num % 2 == 0){
            while (Num <= EndVal){
                System.out.println(Num);
                Num = Num + 2;
            }
        }

        else{
            Num = Num + 1;
            while (Num <= EndVal){
                System.out.println(Num);
                Num = Num + 2;
            }
        }
        input.close();
    }
}
