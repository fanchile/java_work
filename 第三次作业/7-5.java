//��ӡ��ͬ����
package third;
import java.util.Scanner;
public class 7-5 {
	public static int[] eliminateDuplicates(int[] numbers){
		int count=0;
		int[] f = new int[numbers.length];
		
		for(int i=0;i<numbers.length;i++){
			int j;
			for(j=0;j<count;j++){
				if(numbers[i]==f[j]){
					break;
				}	
			}
			if(j==count){
				f[count]=numbers[i];
				count++;
			}
		}
		
		int[] result = new int[count];
		for(int i=0;i<count;i++){
			result[i]=f[i];
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		System.out.print("Enter ten numbers: ");
		for(int i=0;i<10;i++){
			numbers[i]=input.nextInt();
		}
 
		System.out.print("The distinct numbers are: ");
		int[] result=eliminateDuplicates(numbers);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}
}
