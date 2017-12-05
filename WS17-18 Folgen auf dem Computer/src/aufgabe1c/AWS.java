package aufgabe1c;

public class AWS {

	static int counter = 0;
	static double a_n_plus_1, b_n_plus_1;
	
	public AWS() {
		// TODO Auto-generated constructor stub
	}
	
	public static void AGM(double a0, double b0, int folgeglieder){

		if(counter < folgeglieder){
			
			a_n_plus_1 = (a0 + b0) / 2;
			b_n_plus_1 = Math.sqrt(a0 * b0);
			
			if(counter == 0){
				System.out.println("a"+ counter + ": " + a0 + "\nb" + counter + ": " + b0 + "\n\n ######## \n");
			}else{
				System.out.println("a"+ counter + ": " + a_n_plus_1 + "\nb" + counter + ": " + b_n_plus_1 + "\n\n ######## \n");
			}
			
			if(String.valueOf(a_n_plus_1).equals(String.valueOf(b_n_plus_1))){
				System.out.println("\nA und B konvergieren gegen " + a_n_plus_1 + ". Die Rekursion wurde nach " + counter + " Durchläufen abgebrochen.");
				counter = folgeglieder;
			}else{
				counter++;
			}
			
			AGM(a_n_plus_1, b_n_plus_1, folgeglieder);
			
		}
		
	}

}
