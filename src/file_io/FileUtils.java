package file_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	public static void writeFile(String pathFile, String line) {
		try {
			FileWriter fileWriter = new FileWriter(pathFile, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.close();
			System.out.println("Write success !!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<String> readFile(String pathFile) {
		List<String> listLine = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader(pathFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = null;
			
			while ((line = bufferedReader.readLine()) != null) {
				listLine.add(line);
			}
			bufferedReader.close();
			System.out.println("Read success !!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listLine;
	}
	
}
