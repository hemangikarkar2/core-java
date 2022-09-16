package finalmethod;


	class honda {
		void run() {
			System.out.println("running");
			
		}
	}
class finalMethod extends honda {
		// void run() {
//	System.out.println("running safely");
	//}
		public static void main(String args[]) {
			//finalMethod f = new finalMethod();
			//f.run();
			new finalMethod().run();
		}

		
	}
	