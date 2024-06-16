import java.util.Scanner;

public class ComparisonStrings {
    public static void main(String[] args) {

        String string1, string2;

        System.out.println("Введите первую строку:");
        Scanner input1 = new Scanner(System.in);
        string1 = input1.next();

        System.out.println("Введите вторую строку:");
        Scanner input2 = new Scanner(System.in);
        string2 = input2.next();

        if (string1.equals(string2)){
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
