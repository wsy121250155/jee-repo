package fileConnector;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileTest {
	public static void main(String[] args){
		System.out.println(get());
	}
	public static String get() {
		String path =RootPath.get()+"/stu_info.txt";
		String content = "";
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(path));
			String line;
			while ((line = reader.readLine()) != null) {
				content += line;
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		content = content.replaceAll("\"", "\\\\\"");
		content = content.replaceAll("\'", "\\\\\"");
		return content;
	}

}
