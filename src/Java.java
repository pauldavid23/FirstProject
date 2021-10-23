import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
        Scanner theInput = new Scanner(System.in);

        System.out.println("Enter number: ");
        int firstInput = theInput.nextInt();
        
        System.out.println("Enter length: ");
        int lengthInput = theInput.nextInt();

        Test a = new Test();
        a.myClass(firstInput,lengthInput);

    }
    public static class Test {
        int[] myClass(int num, int len) {
            int temp = 0;
            int array[] = new int[len];

            for(int i = 1; i <= array.length; i++) {
                array[temp] += num * i;
                temp++;
            }
            System.out.println(Arrays.toString(array));
            return array;
        }

    }
}
