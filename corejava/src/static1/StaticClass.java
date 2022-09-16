package static1;

public class StaticClass {
	private static int instancevar = 0;
	
	
	protected static int  getCount() {
		return instancevar;
	}
	
	private static void addInstance() {
		instancevar++;
	}
	StaticClass()
	{
	 StaticClass.addInstance();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting with :-"+StaticClass.getCount()+"instances");
		for(int i=0; i<500; ++i) {
			new StaticClass();
		}	System.out.println("Created"+StaticClass.getCount()+"instances");
	}


}
