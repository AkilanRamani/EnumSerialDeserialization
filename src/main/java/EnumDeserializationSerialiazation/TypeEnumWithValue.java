package EnumDeserializationSerialiazation;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeEnumWithValue {

	 TYPE1(1, "Type A"), TYPE2(2, "Type 2");
	
	

    private String name;
    @SuppressWarnings("unused")
	private int i;

    TypeEnumWithValue(int id, String string) {
		this.name = string; //Type A
		this.i = id; //1
		
	}

	// standard constructors
    //@JsonValue indicates a single method the library will use to serialize the entire instance.
    @JsonValue
    public String getName() {
        return name;
    }
}

