package EnumDeserializationSerialiazation;

public class City {
	
    
	public EnumDeserializationSerialiazation.distance getDistance() {
		return distance;
	}

	public void setDistance(EnumDeserializationSerialiazation.distance distance) {
		this.distance = distance;
	}

	EnumDeserializationSerialiazation.distance distance;  //Enum as a Type variable 

	@Override
	public String toString() {
		return "City [distance=" + distance + "]";
	}
      
    // getter/ setters  
    }  

// this.distance = 0.0254 // distance enum type will be initialized with the 0.0254
