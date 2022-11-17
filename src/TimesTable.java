import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What times table would you like? : ");

        int timesTable = reader.nextInt();
        //int i;
        System.out.println("Here is the " + timesTable + " times table:");

        for(int i = 1; i < 13; i++){
            System.out.println(i + " * " + timesTable + " = " + i*timesTable);
        }

    }
}
