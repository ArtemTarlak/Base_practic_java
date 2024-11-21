import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> coffeeMachine = new HashMap<>();
        ArrayList<Recip> drinksArray = new ArrayList<>();
        coffeeMachine.put("waterlevel", 0);
        coffeeMachine.put("coffeelevel", 0);
        coffeeMachine.put("milklevel", 0);

        System.out.println("Введите колличество напитков");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите один из напитков: ESPRESSO , CAPPUCCINO , LATTE : ");
            String input = sc.next().trim().toUpperCase();
            Recip recip;
            try {
                recip = Recip.valueOf(input);
                drinksArray.add(recip);
                coffeeMachine.put("waterlevel", coffeeMachine.get("waterlevel") + recip.getWater());
                coffeeMachine.put("coffeelevel", coffeeMachine.get("coffeelevel") + recip.getCoffee());
                coffeeMachine.put("milklevel", coffeeMachine.get("milklevel") + recip.getMilk());
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный напиток. Попробуйте еще раз.");
            }
        }

        System.out.println("\nСписок напитков: " + drinksArray);
        System.out.println("Затрачено ресурсов: " + coffeeMachine);
    }
}



