import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++){
            int sum = 0;
            for (int j = 0; j < matrix.length; j++){
                sum += matrix[j][i];
            }
            System.out.print(sum + " ");
        }

    }
}
