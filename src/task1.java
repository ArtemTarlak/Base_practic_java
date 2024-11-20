import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        System.out.println(repeatString(input,n));

//        StringBuilder result = new StringBuilder(input);
//        for (int i = 0; i < n - 1; i++) {
//            result.append(input);
//        }
//
//        System.out.println(result.toString());
    }
    public static String repeatString(String str, int count){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(str);
        }
        return result.toString();
    }
}