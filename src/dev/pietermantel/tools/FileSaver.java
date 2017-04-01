package dev.pietermantel.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
	public static String computerName;
	public static String path;
	private static String everything;
	private static BufferedReader br;
	
	public static void createDir() {
		computerName = System.getProperty("user.name");
		System.out.println(computerName);
		boolean Success = new File("C:/Users/"+computerName+"/AppData/Roaming/Video Wallpaper").mkdirs();
		path = "C:\\Users\\"+computerName+"\\AppData\\Roaming\\Video Wallpaper";
		System.out.println("Made Folders: "+Success);
	}
	
	public static void writeFile(String path, String content) {
		File file = new File(path);
		FileWriter fw;
		try {
			fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
public static String readFile(String path) {
		
		try {
			try {
				br = new BufferedReader(new FileReader(path));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		    StringBuilder sb = new StringBuilder();
			try {
				String line;
				line = br.readLine();
				while (line != null) {
			        sb.append(line);
			        sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
			    everything = sb.toString();
			    everything = everything.substring(0, everything.length() - 1);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} finally {
		    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return everything;
	}
	
}
