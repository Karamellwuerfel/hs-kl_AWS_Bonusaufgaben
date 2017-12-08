package aufgabe_3;

public class Main {

	static int counter = 114;
	static int iter = 0;
	public static void main(String[] args) {
		//final long timeStart = System.currentTimeMillis();
		//folge(1.3, 0.01);
		//folge(1.3, 0.1);
		System.out.println(folge(1.3, 0.01));
		//final long timeEnd = System.currentTimeMillis(); 
		
        //System.out.println("Konvergenz ermittelt in: " + (timeEnd - timeStart) + " Millisekunden.\n\n###### ###### ######"); 


	}
	
//	public static void folge(double a, double x0) {
//		
//		if(counter >= 0) {
//			
//			double xn = x0;
//			double x_n_plus_eins = a * xn *(1 - xn);
//			
//			//System.out.println("lim(n -> unendlich) [xn]: " + x_n_plus_eins);
//			counter--;
//			iter++;
//			
//			if(x_n_plus_eins == x0) {
//				System.out.println("Die Folge konvergiert gegen " + x_n_plus_eins);
//				System.out.println("Konvergenz ermittelt nach " + iter + "Iterationen\n" );
//			}else {
//				folge(a, x_n_plus_eins);
//			}
//		}
//		
//	}
	
	
	public static double folge(double a, double x0) {
		
		double hold = 0;
		
		if(counter >= 0) {
			
			double xn = x0;
			double x_n_plus_eins = a * xn *(1 - xn);
			
			counter--;
			
			if(x_n_plus_eins == x0) {
				//WIESO KANN ICH HIER KEIN RETURN MACHEN??
				//Wenn ich hier eine variable zuweise zB "hold = x_n_plus_1"
				//dann bleibt "hold" trotzdem 0........
			}else {
				folge(a, x_n_plus_eins);
			}
		}
		return hold;
		
	}

}
