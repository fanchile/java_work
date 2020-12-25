//�����������
package third;
import  java.util.Scanner;
import java.util.Arrays;
public class 7-19 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int num;
	    System.out.print("please input number");
	    num = scanner.nextInt();
	    int[] numArray = new int[num];
	    for (int i = 0; i < num; i++) {
	        numArray[i] = scanner.nextInt();
	    }
	    if (isSorted(numArray)) {
	        System.out.print("this array is sorted");
	    } else {
	        System.out.print("this array is not sorted");
	    }
	}
	 
	private static boolean isSorted(int[] numArray) {
	    int[] tmpArray = new int[numArray.length];
	    System.arraycopy(numArray, 0, tmpArray, 0, numArray.length);
	    Arrays.sort(tmpArray);
	    return Arrays.equals(tmpArray, numArray);
	}
}
