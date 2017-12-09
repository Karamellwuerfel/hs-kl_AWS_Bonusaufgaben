package aufgabe_3;

public class Helper {

	static int iter = 0;
	
	
	public static double folge(double a, double x0) {
		
		//final long timeStart = System.currentTimeMillis();
		
		int counter = 100000;
		double x_n_plus_eins = 0;
		
		while(counter >= 0) {
			
				iter++;
				double xn = x0;
				x_n_plus_eins = a * xn *(1 - xn);
				
				x0 = x_n_plus_eins;
				
				
				counter--;
			}
		
		//final long timeEnd = System.currentTimeMillis(); 
        //System.out.println("Konvergenz ermittelt in: " + (timeEnd - timeStart) + " Millisekunden.\n###### ###### ######"); 
		
		return x_n_plus_eins;
	
	
	}
	
	public static void table_head() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("| Startwert x0 |    a    |          lim (n -> unendlich)[xn]           |");
		System.out.println("|----------------------------------------------------------------------|");
		
	}
	
	public static void table_row() {
		System.out.println("|----------------------------------------------------------------------|");
	}
	
	public static void table_end() {
		System.out.println("------------------------------------------------------------------------");
	}
}
