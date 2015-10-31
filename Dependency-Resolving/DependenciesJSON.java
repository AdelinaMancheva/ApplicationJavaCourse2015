import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DependenciesJSON {

	public static void main(String[] args) {
		
			JSONObject obj = new JSONObject();
			
			obj.put("projectName", "Test0000");
			
			JSONArray list = new JSONArray();
			list.add("backbone");
			obj.put("dependencies", list);
			
			try {
				FileWriter file = new FileWriter("D:\\Dependency Resolving\\dependencies.json");
				file.write(obj.toJSONString());
				file.flush();
				file.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.print(obj);

	}

}

