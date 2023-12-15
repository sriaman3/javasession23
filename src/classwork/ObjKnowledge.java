package classwork;

public class ObjKnowledge {
	
	int age;
	String name;
	

	public static void main(String[] args) {
		
		ObjKnowledge ob = new ObjKnowledge();
		
		System.out.println(ob.name = "Aman" );
		
		
		
		ObjKnowledge ob1 = new ObjKnowledge();
		
		System.out.println(ob1.name = "Arpit" );
		
		//No reference
		new ObjKnowledge().age=10;
		
		//Obj null
		ObjKnowledge ob2 = new ObjKnowledge();
		//ob2 = null;
		
		ob2.age=10;
		
		//packageName.className with memoryaddress (classwork.ObjKnowledge@71dac704)
		System.out.println(new ObjKnowledge());
		
	}

}
