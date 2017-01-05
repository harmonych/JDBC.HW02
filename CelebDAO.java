package hw02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import hw02.utils.SystemConstant;

public class CelebDAO {
	String dbURL = SystemConstant.URL;
	
	public CelebDAO(){
	}

	public CelebDAO(String dbURL) {
	}
	
	public void createTable(){
		String dropStr = readSQLFile("DropCeleb.sql");
		String createStr = readSQLFile("CreateCeleb.sql");
		
		
		
	}

	private String readSQLFile(String filename) {
		try(
			FileInputStream fis = new FileInputStream(filename);
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");	
			BufferedReader br = new BufferedReader(isr);
		){
			String line = "";
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null){
				sb.append(line);
			}
			return sb.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
