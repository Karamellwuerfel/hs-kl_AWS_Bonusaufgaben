package aufgabe_2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Pi();

	}
	
	public static void Pi(){
		
		double a_k = 2 * Math.sqrt(3);
		double b_k = 3;
		
		while(a_k < b_k) {
			
			b_k = 2 / (Math.pow(b_k, -1) + (Math.pow(a_k, -1)));
			a_k = Math.sqrt((a_k)*b_k);
			
		}
		

		
	}

}
