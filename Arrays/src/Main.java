//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. int[] size 10 ka banana

        int[] arr = new int[10];

        // 2. Values store karna

        arr[0] = 10;

        arr[1] = 20;

        arr[2] = 30;

        arr[3] = 40;

        arr[4] = 50;

        arr[5] = 60;

        arr[6] = 70;

        arr[7] = 80;

        arr[8] = 90;

        arr[9] = 100;

        // 3. Loop se saare elements print karna

        System.out.println("Array Elements:");

        for (int i = 0; i < arr.length; i++) {

            System.out.println("arr[" + i + "] = " + arr[i]);

        }

        // 4. First, middle aur last element print karna

        System.out.println("\nFirst Element  : " + arr[0]);

        System.out.println("Middle Element : " + arr[arr.length / 2]);

        System.out.println("Last Element   : " + arr[arr.length - 1]);

    }
}