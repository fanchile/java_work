import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class copyfile1 {

	public static void main(String[] args) {
		String srcfile = "D:/1.txt";
		String destfile = "F:/1.txt";
		
	    InputStream in = null;
	    OutputStream out = null;
	    
	    try {
	        in = new FileInputStream(new File(srcfile));
	        out = new FileOutputStream(new File(destfile));

	        byte[] buffer = new byte[1024];
	        int len;

	        while ((len = in.read(buffer)) > 0) {
	            out.write(buffer, 0, len);
	        }
	    } catch (Exception e) {
	    	System.out.println("error occur");
	    } 
	    
	}
	
}
