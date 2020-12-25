package java_work;

import java.util.Scanner;

public class bin2Dec {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a bin number:");
		String bin = input.nextLine();
		
		System.out.println("The decimal value for bin number "
				+ bin + " is " + binToDecimal(bin.toUpperCase()));

	}
	
	public static int binToDecimal(String bin) {
		int decimalValue = 0;
		for (int i = 0;i < bin.length(); i++) {
			try {
				char binChar = bin.charAt(i);
				decimalValue = decimalValue * 2 + binCharToDecimal(binChar);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		return decimalValue;
	}
	
	public static int binCharToDecimal(char ch) throws Exception {
		if(ch >= '0' && ch <= '1')
			return ch - '0';
		else
			throw new NumberFormatException();
	}
}

class BinaryFormatException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public BinaryFormatException(String str) {
		setMsg(str);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}