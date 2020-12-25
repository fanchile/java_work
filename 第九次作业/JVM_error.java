package java_work;

import java.util.ArrayList;

public class JVM_error {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();  
           
    	try {
    		for (int i = 0; i < 10000000; i++) {  
                String temp = String.valueOf("1111111111111111111111111111"+i).intern();  
                list.add(temp);  
            }
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
    }
}
