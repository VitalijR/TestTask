import java.util.Scanner;

public class ActionsWithNumbers {
    public static void main(String[] args) {

        int a, b;
        double divide;

        System.out.println("Enter the integer number a:");
        Scanner input1;
        while (!(input1 = new Scanner(System.in)).hasNextInt()){
            System.out.println("You entered the wrong data!");
            System.out.println("Enter the integer number a:");
        }
        a = input1.nextInt();

        System.out.println("Enter the integer number b:");
        Scanner input2;
        while (!(input2 = new Scanner(System.in)).hasNextInt()){
            System.out.println("You entered the wrong data!");
            System.out.println("Enter the integer number b:");
        }
        b = input2.nextInt();

        System.out.println("a = "+a+"; b = "+b);

        if (a == b){
            System.out.println("a = b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        System.out.println(a+" + "+b+" = "+(a + b));
        System.out.println(a+" - "+b+" = "+(a - b));
        System.out.println(a+" * "+b+" = "+(a * b));

        if(b == 0){
            System.out.println("You can't divide by zero!");
        } else {
            divide = (double) a / (double) b;
            System.out.println(a+" / "+b+" = "+divide);
        }
    }
}
