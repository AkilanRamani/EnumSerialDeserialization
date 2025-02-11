package EnumDeserializationSerialiazation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializeEnumExample2 {
	
	 public static void main(String args[]) throws JsonMappingException, JsonProcessingException {  
	        // jsons string to deserialize  
	        String jsonString = "{\"distance\":\"0.0254\"}";  
	        
	        // create an instance of the ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	        //  deserialize jsonString by using readValue() method of ObjectMapper class  
	        City obj = mapper.readValue(jsonString, City.class);  
	     //Enum can be passed as class Type in an argument of readValue Method.   
	       
	        // print distance of the City  
	        System.out.println("Distance of the City: "+ obj.getDistance());  
	    }  

}
