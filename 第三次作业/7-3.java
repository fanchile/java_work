//�������ֳ��ִ���
package third;
public class 7-3 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Emter the integers between 1 and 100:");
		
		
		int[] flags = new int[103];
		int number = input.nextInt();
		int i = 1;
		while(number != 0) {
			if(number >= 1 && number <= 100) {
				flags[number] += 1;
				}
			number = input.nextInt();
		}
		for(int j = 0;j<102;j++) {
			if(flags[j] > 0) {
				System.out.println(j + " occurs " + flags[j] + " times");
			}
		}
	}
}
