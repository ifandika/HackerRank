/**
 * Ketentuan
 * - Diberikan nilai n untuk jumlah line
 * - Diberikan nilai dan simpan pada ArrayList
 * - Diberikan nilai untuk kordinat get data pada ArrayList
 * - Jika data pada kordinat tidak ada maka output "Error"
 * 
 * 
 * Contoh
 * - Input
 * 		5 					-> Jumlah data line
 * 		5 41 77 74 22 44 	(1)
 * 		1 1 				(2)
 * 		4 37 34 36 52		(3)
 * 		0 					(4)
 * 		3 20 22 33 			(5)
 * 		
 * 		5 
 * 		1 3
 * 		3 4
 * 		3 1
 * 		4 3
 * 		5 5
 */
import java.util.*;

public class ArrayListProblem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<List<Integer>> lines = new ArrayList<List<Integer>>();

		int linesTotal = scan.nextInt();
		for(int i = 0; i < linesTotal; i++) {
			ArrayList<Integer> temp = new ArrayList<>();
			int line = scan.nextInt();
			for (int j = 0; j < line; j++) {
				temp.add(scan.nextInt());
			}
			lines.add(temp);
		}

		linesTotal = scan.nextInt();
		for(int i = 0; i < linesTotal; i++) {
			int xLine = scan.nextInt();
			int yPosition = scan.nextInt();
			if(yPosition > lines.get(xLine - 1).size()) {
				System.out.println("ERROR!");
			}
			else {
				System.out.println(lines.get(xLine - 1).get(yPosition -1));
			}
		}
		scan.close();
	}
}