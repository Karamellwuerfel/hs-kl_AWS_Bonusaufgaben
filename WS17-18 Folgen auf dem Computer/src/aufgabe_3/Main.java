package aufgabe_3;

public class Main {

	
	public static void main(String[] args) {
		
		Helper.table_head();
		System.out.println("|     0.01     |   1.3   |             " + Helper.folge(1.3, 0.01) + "             |");
		System.out.println("|     0.1      |   1.3   |             " + Helper.folge(1.3, 0.1) + "             |");
		System.out.println("|     0.2      |   1.3   |             " + Helper.folge(1.3, 0.2) + "             |");
		Helper.table_row();
		System.out.println("|     0.01     |   2.8   |             " + Helper.folge(2.8, 0.01) + "              |");
		System.out.println("|     0.1      |   2.8   |             " + Helper.folge(2.8, 0.1) + "              |");
		System.out.println("|     0.2      |   2.8   |             " + Helper.folge(2.8, 0.2) + "              |");
		Helper.table_row();
		System.out.println("|     0.01     |   3.2   |             " + Helper.folge(3.2, 0.01) + "              |");
		System.out.println("|     0.1      |   3.2   |             " + Helper.folge(3.2, 0.1) + "              |");
		System.out.println("|     0.2      |   3.2   |             " + Helper.folge(3.2, 0.2) + "              |");
		Helper.table_row();
		System.out.println("|     0.01     |   3.45  |             " + Helper.folge(3.45, 0.01) + "              |");
		System.out.println("|     0.1      |   3.45  |             " + Helper.folge(3.45, 0.1) + "              |");
		System.out.println("|     0.2      |   3.45  |             " + Helper.folge(3.45, 0.2) + "             |");
		Helper.table_row();
		System.out.println("|     0.01     |   3.7   |             " + Helper.folge(3.7, 0.01) + "             |");
		System.out.println("|     0.1      |   3.7   |             " + Helper.folge(3.7, 0.1) + "               |");
		System.out.println("|     0.2      |   3.7   |             " + Helper.folge(3.7, 0.2) + "              |");		
		Helper.table_row();
		System.out.println("|     0.01     |  3.835  |             " + Helper.folge(3.835, 0.01) + "               |");
		System.out.println("|     0.1      |  3.835  |             " + Helper.folge(3.835, 0.1) + "             |");
		System.out.println("|     0.2      |  3.835  |             " + Helper.folge(3.835, 0.2) + "             |");
		Helper.table_end();

	}

}
