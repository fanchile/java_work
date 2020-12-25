package siventh;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class matrix {
	public static void main(String[] args) {
	    ArrayList<Integer> list1 = new ArrayList<>(); 
	    ArrayList<Integer> list2 = new ArrayList<>();  
	    Scanner input = new Scanner(System.in);
	    System.out.println("input the maritx");
	    int num = input.nextInt();
	    Integer row = 0;   
	    Integer column = 0;
	    Integer row_Max = 0;  
	    Integer column_Max = 0; 
	    int[][] array = new int[num][num];
	    Random rand = new Random();
	 
	    
	    for(int i = 0;i < array.length;i++) {
	        for(int j = 0;j < array[0].length;j++) {
	            int randInt = rand.nextInt(2); 
	            array[i][j] = randInt;
	            System.out.print(array[i][j] + " ");
	            if(randInt == 1) row++; 
	        }
	        if(row > row_Max) row_Max = row;  

	        row = 0;
	        System.out.println();
	    }
	 
	    for(int i = 0;i < array.length;i++) {
	        for(int j = 0;j < array[0].length;j++) {
	            if(array[j][i] == 1) column++; 
	        }
	        if(column > column_Max) column_Max = column; 
	        column = 0;
	    }
	 
	    for(int i = 0;i < array.length;i++) {
	        for(int j = 0;j < array[0].length;j++) {
	            if(array[i][j] == 1) row++;
	            if(array[j][i] == 1) column++;
	        }
	        if(row == row_Max) list1.add(i);
	        if(column == column_Max) list2.add(i);
	        row = 0;
	        column = 0;
	    }
	 
	    System.out.println("the row with most 1:");
	    for(Integer a:list1)
	        System.out.print(a + " ");
	    System.out.println('\n'+"the line with most 1:");
	    for(Integer b:list2)
	        System.out.print(b + " ");
	}
}
