package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoTextFile {

	public static void main(String[] args) throws IOException 
	{
		String rootFolder = System.getProperty("user.dir");
		File f = new  File(rootFolder + "/ecoders_testing_notes.txt");
		
		FileWriter fw = new FileWriter(f, true);
		
		fw.write("\npackage star_patterns;\r\n"
				+ "\r\n"
				+ "public class Pattern2 {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		int num =1;\r\n"
				+ "			for(int i = 1; i<=5 ; i++)\r\n"
				+ "			{\r\n"
				+ "				for(int j= 1; j<=5; j++)\r\n"
				+ "				{\r\n"
				+ "					\r\n"
				+ "					\r\n"
				+ "						System.out.print(num);\r\n"
				+ "					\r\n"
				+ "									\r\n"
				+ "				}\r\n"
				+ "				System.out.println();\r\n"
				+ "				num = num+1;\r\n"
				+ "			}\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "	}");
		
		fw.close();
	}
}