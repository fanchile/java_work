package java_work;

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a hex number:");
		String hex = input.nextLine();
		
		System.out.println("The decimal value for hex number "
				+ hex + " is " + hexToDecimal(hex.toUpperCase()));

	}
	
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for (int i = 0;i < hex.length(); i++) {
			try {
				char hexChar = hex.charAt(i);
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) throws Exception {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if(ch >= '0' && ch <= '9')
			return ch - '0';
		else
			throw new HexFormatException("not_hex_format");
	}
}

class HexFormatException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public HexFormatException(String str) {
		setMsg(str);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
