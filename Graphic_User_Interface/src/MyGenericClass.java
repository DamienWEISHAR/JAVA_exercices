
public class MyGenericClass <T> {

	//variable = T is for <Thing>
	T x;
	
	//Constructor
	MyGenericClass(T x){
		this.x=x;
	}
	
	public T getValue() {
		return x;
	}
}

// ArrayList <String> myList = new ArrayList<>();

/*
		public class MyGenericClass <Thing1, Thing2> {
		
			//variable = T is for <Thing>
			Thing1 x;
			Thing2 y;
			
			//Constructor
			MyGenericClass(Thing1 x, Thing2 y){
				this.x=x;
				this.y=y;
			}
			
			public Thing2 getValue() {
				return y;
			}
		}
		
		
		//Same principle as HashMap
		HashMap<Integer, String> users = new HashMap<>();
*/
	
	
//If you use 2 parameters, you need 2 parameters in the objects you create

//className <dataType1, dataType2> name = new className<>(1,2);





