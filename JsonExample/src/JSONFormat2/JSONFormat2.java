package JSONFormat2;



import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONFormat2 {

	public static void main(String[] args) throws JSONException {
		JSONObject obj = new JSONObject();


		JSONObject obj1 = new JSONObject();
		obj1.put("ref_no", "1234567");
		obj1.put("time_stamp", "2016-06-24T14:26:59.125");
		obj1.put("Confirmed", "true");


		JSONObject obj2 = new JSONObject();
		obj2.put("reservation", obj1);
		JSONObject obj3 = new JSONObject();
		obj3.put("date", "07/04/2016");
		obj3.put("time", "09:30");
		obj3.put("from", "New York");
		obj3.put("to", "Chicago");
		obj3.put("seat", "57B");

		obj2.put("train", obj3);
		JSONObject obj4 = new JSONObject();
		obj4.put("name", "John Smith");

		obj2.put("passenger",obj4);
		obj2.put("price", "1234.25");

		JSONArray array4 = new JSONArray();
		array4.put("Lunch & diner incl");
		array4.put("\"Have a nice day!\"");
		obj2.put("comments", array4);

		obj.put("Rail Booking", obj2);

		System.out.println(obj.toString());



		Iterator key = obj2.keys();
		while (key.hasNext()) {
			String k = key.next().toString();
			if(k.equals("comments")) {

				for(int i=0;i<obj2.getJSONArray("comments").length();i++) {

					System.out.println ("coments :"+ obj2.getJSONArray("comments").get(i));
				}

			}

			else if(k.equals("reservation")) {


				Iterator key1 = obj1.keys();
				while (key1.hasNext()) {
					String p = key1.next().toString();
					System.out.println(p+":" + obj1.getString(p));

				}

			}

			else if(k.equals("train")) {


				Iterator key2 = obj3.keys();
				while (key2.hasNext()) {
					String p = key2.next().toString();
					System.out.println(p+":" +obj3.getString(p));

				}



			}
			else if(k.equals("passenger")) {


				Iterator key3 = obj4.keys();
				while (key3.hasNext()) {
					String p = key3.next().toString();
					System.out.println(p+":" +obj4.getString(p));


				}



			}

			else 
				System.out.println(k+":"+obj2.getString(k));

		}

		System.out.println("Fani Kar");
	}



}




