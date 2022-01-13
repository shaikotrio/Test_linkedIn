package code;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


/**
 * @author Shaikot
 *
 */
public class CreateString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		int x  = 230;
		String path = "C:\\Users\\Shaikot\\eclipse-workspace\\Test_linkedIn\\new.txt";
		
		uniqueStrings(x,path);
		
//		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
//		
//		long actualMemUsed=afterUsedMem-beforeUsedMem;
//		System.out.println(actualMemUsed);
	

	}
	
	public static void uniqueStrings(int x, String path) throws IOException {
        byte[] bt = new byte[100];
        Arrays.fill(bt, (byte) 'a');

        byte[] crlf = new byte[] {'\r', '\n'};

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        for (int i = 0; i < x; i++) {
            fileOutputStream.write(bt);
            fileOutputStream.write(crlf);
            fileOutputStream.flush();

            for (int j = 0; j < 100; j++) {
            	
                if (bt[j] <= 'z') {
                	bt[j]++;
                } else {
                	bt[j] = 'a';
                }
            }
        }

        fileOutputStream.close();
    }

}

