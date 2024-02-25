import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int x,y,i,total=1;

        System.out.print("Please enter a number = ");
        x=input.nextInt();

        System.out.print("Please enter exponential number = ");
        y=input.nextInt();

        for(i=1;i<=y;i++ ){
            total=total*x;
            System.out.println(total);
        }



    }
}