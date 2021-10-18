package datastructure;

import databases.ConnectDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class UseMap {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        /*
		* Demonstrate how to use Map that includes storing and retrieving elements.
		* Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		* Use For Each loop and while loop with Iterator to retrieve data.
		*
	    * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		*/


        //implementation here


        //connect to database
		ConnectDB ct = new ConnectDB();
		Map<String, String> personalInfo = new HashMap<>();
		personalInfo.put("first name:", "Tony");
		personalInfo.put("last name:", "Stark");
		personalInfo.put("cellphone:", "3472342356");
		personalInfo.put("emil address:", "TonyStark@gmail.com");

		System.out.println(personalInfo.get("cellphone"));
		for (Map.Entry entry : personalInfo.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

			List<String> citiesOfEurope = new ArrayList<>();
			citiesOfEurope.add("Barcelona");
			citiesOfEurope.add("Rome");
			citiesOfEurope.add("Berlin");
			List<String> citiesOfAustralia = new ArrayList<>();
			citiesOfAustralia.add("Sydney");
			citiesOfAustralia.add("New Castle");
			citiesOfAustralia.add("Brisbane");
			List<String> citiesOfAsia = new ArrayList<>();
			citiesOfAsia.add("Tokyo");
			citiesOfAsia.add("Hong Kong");
			citiesOfAsia.add("Bangkok");

			Map<String, List<String>> map = new HashMap<>();
			map.put("Europe", citiesOfEurope);
			map.put("Australia", citiesOfAustralia);
			map.put("Asia", citiesOfAsia);

			System.out.println(map.get("Europe"));
			for (Map.Entry ent : map.entrySet()) {
				System.out.println(ent.getKey() + " " + ent.getValue());
			}

		}
	}
}





