package aufgabe_2;

public class Main {

	static double b = 2 * Math.sqrt(3);
	static double a = 3;
	
	public Main() {
		
	}

	public static void main(String[] args) {

		Pi();

	}
	
	public static void Pi(){
		
		while( a != b){
			
	      b = 2 * b * a /( b + a);
	      a = Math.sqrt( b * a);
	      
	    }
		
		System.out.println(a);
	}

}
