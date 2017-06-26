package tw.aaa.myproject.FlowControl;

public class TestSwitch {

	public static void main(String[] args) {
		byte level = 25;
		
		switch(level){
		 case 25:
			  System.out.println("Machine Gun.");
			  //break;
		  case 10:
			  System.out.println("pistal");
			  //break;
		  case 5:
			  System.out.println("stick");
			  //break;
		
		  case 1:
			  System.out.println("hand");
			  //break;
	      default:
	    	  System.out.println("cure herb.");
	    	  break;				  
		}
		
		System.out.println("fight.");
	}

}
