package org.login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Samplejava {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Samplelower\\src\\test\\resources\\Readdata.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
	
	    JSONObject jsonObject = (JSONObject)parse;
	    
	    System.out.println(jsonObject.get("name"));
	    System.out.println(jsonObject.get("age"));
	    System.out.println(jsonObject.get("status"));
	    System.out.println(jsonObject.get("address"));
	    System.out.println(jsonObject.get("courses"));
	    
	    System.out.println("work done");
	    System.out.println("bug fixed");
	    
	    
	    
	    
	}
}
