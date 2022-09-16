package Exception;

import java.io.IOException;

//Case1: You handle the exception :-
//java throws clause which describes that checked exceptions can be propagated by throws keyword.

public class chekedExcpetionPropagationEx {

	void m() throws IOException {  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n() throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
		  chekedExcpetionPropagationEx obj=new chekedExcpetionPropagationEx();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
}
