import java.util.Scanner;

public class TempleofHanoi {

	public static void towerOfHanoi(int numOfDisks, char from_rod, char to_rod, char helper_rod, char helper_rod1) {
		if(numOfDisks == 0) {
			return;
		}
		towerOfHanoi(numOfDisks - 1, from_rod, helper_rod, helper_rod1, to_rod);
		System.out.println("Move disk " + numOfDisks + "from rod " + from_rod + "helper rod 1 " + helper_rod + "helper rod 2 " + helper_rod1 + "to rod" + to_rod);
		towerOfHanoi(numOfDisks -1, from_rod, helper_rod, helper_rod1, to_rod);
	}
	
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		int numOfDisks;
		System.out.print("How many disks do you want? ");
		numOfDisks = myInput.nextInt();
		
		towerOfHanoi(numOfDisks, 'A', 'B', 'C', 'D');
	}
	

}
