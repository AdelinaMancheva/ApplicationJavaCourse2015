import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class All_packagesJSON {

	public static void main(String[] args) {
		
			JSONObject obj = new JSONObject();
			
			JSONArray list = new JSONArray();
			list.add("jQuery");
			list.add("underscore");
			obj.put("backbone", list);
						
			JSONArray list1 = new JSONArray();
			list1.add("queryJ");
			obj.put("jQuery", list1);

			JSONArray list2 = new JSONArray();
			list2.add("lodash");
			obj.put("underscore", list2);
			
			JSONArray list3 = new JSONArray();
			obj.put("queryJ", list3);
			
			JSONArray list4 = new JSONArray();
			obj.put("lodash", list4);
			
			try {
				FileWriter file = new FileWriter("D:\\Dependency Resolving\\all_packages.json");
				file.write(obj.toJSONString());
				file.flush();
				file.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.print(obj);
	}

}
