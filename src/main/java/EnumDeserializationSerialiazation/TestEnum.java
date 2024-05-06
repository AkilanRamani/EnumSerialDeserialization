package EnumDeserializationSerialiazation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestEnum {

	public static void main(String[] args) throws JsonProcessingException   {
		TypeEnumWithValue test =	TypeEnumWithValue.TYPE2;
		 String enumAsString = new ObjectMapper()
			      .writeValueAsString(test);// an Enum object value.
   System.out.println(enumAsString);
			    

	}

}
