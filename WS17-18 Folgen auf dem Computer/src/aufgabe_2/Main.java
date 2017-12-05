package aufgabe_2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Pi();

	}
	
	public static void Pi(){
		
		double a = 2 * Math.sqrt(3);
		double b = 3;
		
		while(a != b){
			
			a = 2 * a * b / (a + b);
			b = Math.sqrt(a * b);
			
		}
		
		System.out.println(a);
		
	}

}
