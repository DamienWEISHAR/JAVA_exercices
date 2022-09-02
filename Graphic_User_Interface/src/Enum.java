

//version 1 facile:

/*
public enum Enum {
	MERCURE,VENUS,TERRE, MARS, JUPITER, SATURNE, URANIS, NETPTUNE, PLUTON;
}
*/

//version, 2, more complex:
public enum Enum{
	MERCURE(1),
	VENUS(2),
	TERRE(3), 
	MARS(4), 
	JUPITER(5), 
	SATURNE(6), 
	URANUS(7), 
	NETPTUNE(8), 
	PLUTON(9);
	
	int nb;
	
	//Constructor
	
	Enum(int nb){
		this.nb = nb;
	}
}

