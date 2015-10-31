import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONparser {

	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		
		try {
			
			Object obj = parser.parse(new FileReader("D:\\Dependency Resolving\\dependencies.json"));
			
			JSONObject jsonObject = (JSONObject) obj;
			
			// loop array to get dependencies
			JSONArray list = (JSONArray) jsonObject.get("dependencies");
			Iterator<String> iterator = list.iterator();
			
			while (iterator.hasNext()) {
				System.out.println("Installing: " + iterator.next());
					}
				
		} // closing try block
		catch (FileNotFoundException e) {
			e.printStackTrace();
			} 
		catch (IOException e) {
			e.printStackTrace();
			} 
		catch (ParseException e) {
			e.printStackTrace();
			}
		
		System.out.println("");
		
		try {
		
		Object obj2 = parser.parse(new FileReader("D:\\Dependency Resolving\\all_packages.json"));
		
		JSONObject jsonObject2 = (JSONObject) obj2;
		
		
		// loop array to get a dependency
		JSONArray list2 = (JSONArray) jsonObject2.get("backbone");
		Iterator<String> iterator2 = list2.iterator();
		
		File f = new File("D:\\Dependency Resolving\\installed_modules\\backbone.txt");
		if(f.exists() && !f.isDirectory()) { 
			
			System.out.println("Backbone has already been installed.");
		}
		else {
				while (iterator2.hasNext()) {
					System.out.println("In order to install backbone, you need: " + iterator2.next());
					break;
				} 
			}
		FileWriter file2 = new FileWriter("D:\\Dependency Resolving\\installed_modules\\backbone.txt");
		file2.close();
		
		
		JSONArray list3 = (JSONArray) jsonObject2.get("jQuery");
		Iterator<String> iterator3 = list3.iterator();
		
		File f3 = new File("D:\\Dependency Resolving\\installed_modules\\jQuery.txt");
		if(f3.exists() || f3.isDirectory()) {
			System.out.println("jQuery has already been installed.");
		}
		else {
			FileWriter file3 = new FileWriter("D:\\Dependency Resolving\\installed_modules\\jQuery.txt");
			file3.close();
			
			while (iterator3.hasNext()) {
					System.out.println("In order to install jQuery, you need: " + iterator3.next());
				} 
			} 	
		
		
		JSONArray list4 = (JSONArray) jsonObject2.get("queryJ");
		Iterator<String> iterator4 = list4.iterator();
		
		File f4 = new File("D:\\Dependency Resolving\\installed_modules\\queryJ.txt");
		if(f4.exists() || f4.isDirectory()) {
			System.out.println("queryJ has already been installed.");
		}
		else {
			FileWriter file4 = new FileWriter("D:\\Dependency Resolving\\installed_modules\\queryJ.txt");
			file4.close();
			
			while (iterator4.hasNext()) {
					System.out.println("In order to install queryJ, you need: " + iterator4.next());
				} 
			} 
		
		
		JSONArray list5 = (JSONArray) jsonObject2.get("underscore");
		Iterator<String> iterator5 = list5.iterator();
		
		File f5 = new File("D:\\Dependency Resolving\\installed_modules\\underscore.txt");
		if(f5.exists() || f5.isDirectory()) {
			System.out.println("underscore has already been installed.");
		}
		else {
			FileWriter file5 = new FileWriter("D:\\Dependency Resolving\\installed_modules\\underscore.txt");
			file5.close();
			
			while (iterator5.hasNext()) {
					System.out.println("In order to install underscore, you need: " + iterator5.next());
				} 
			} 
		
		
		JSONArray list6 = (JSONArray) jsonObject2.get("lodash");
		Iterator<String> iterator6 = list6.iterator();
		
		File f6 = new File("D:\\Dependency Resolving\\installed_modules\\lodash.txt");
		if(f6.exists() || f6.isDirectory()) {
			System.out.println("lodash has already been installed.");
		}
		else {
			FileWriter file6 = new FileWriter("D:\\Dependency Resolving\\installed_modules\\lodash.txt");
			file6.close();
			
			while (iterator6.hasNext()) {
					System.out.println("In order to install lodash, you need: " + iterator6.next());
				} 
			 } // closing else
		
		} // closing try block
		
		catch (FileNotFoundException e) {
				e.printStackTrace();
				} 
			catch (IOException e) {
				e.printStackTrace();
				} 
			catch (ParseException e) {
				e.printStackTrace();
				}
		
	} 
}
