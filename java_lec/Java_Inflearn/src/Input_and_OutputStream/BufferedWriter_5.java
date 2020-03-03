package Input_and_OutputStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_5 {
	
	public static void main(String[] args) {
		
		String fileName = "C:\\java\\pjt\\helloWriter.txt";
		
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String str = "Hello Java World~~\n";
			str += "Hello C World~~\n";
			str += "Hello C++ World~~\n";

			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);

			System.out.println("end");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (bw != null) bw.close();
				if (fw != null) fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}

}
