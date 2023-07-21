
public class fibbProblem {

	public int fibbRec(int number) {
		if (number <= 1) {
			return number;
		}
		return fibbRec(number-1) + fibbRec(number-2);
	}

	public int fibbIter(int number) {
		if(number <=1) {
			return number;
		}
		
		int fibb = 1;
		int priorFibb = 1;
		
		for(int i = 2; i < number; i++) {
			int temp = fibb;
			fibb+= priorFibb;
			priorFibb = temp;
		}
		return fibb;
		
	}





public static void main(String args[]) {
	System.out.println("Recursive Fibs");
	fibbProblem fibbonaci = new fibbProblem();
	long startTime = System.nanoTime();
	fibbonaci.fibbRec(1);
	long finishTime = System.nanoTime();
	long fibbRec1 = finishTime - startTime;
	System.out.println("1: " + fibbRec1);
	startTime = System.nanoTime();
	fibbonaci.fibbRec(5);
	finishTime = System.nanoTime();
	long fibbRec5 = finishTime - startTime;
	System.out.println("5: " + fibbRec5);
	startTime = System.nanoTime();
	fibbonaci.fibbRec(10);
	finishTime = System.nanoTime();
	long fibbRec10 = finishTime - startTime;
	System.out.println("10: " + fibbRec10);
	startTime = System.nanoTime();
	fibbonaci.fibbRec(15);
	finishTime = System.nanoTime();
	long fibbRec15 = finishTime - startTime;
	System.out.println("15: " + fibbRec15);
	startTime = System.nanoTime();
	fibbonaci.fibbRec(20);
	finishTime = System.nanoTime();
	long fibbRec20 = finishTime - startTime;
	System.out.println("20: " + fibbRec20);
	startTime = System.nanoTime();
	fibbonaci.fibbRec(25);
	finishTime = System.nanoTime();
	long fibbRec25 = finishTime - startTime;
	System.out.println("25: " + fibbRec25);
	startTime = System.nanoTime();
	fibbonaci.fibbRec(30);
	finishTime = System.nanoTime();
	long fibbRec30 = finishTime - startTime;
	System.out.println("30: " + fibbRec30);
	
	System.out.println("\nIterative Fibs");
	startTime = System.nanoTime();
	fibbonaci.fibbIter(1);
	finishTime = System.nanoTime();
	long fibbIter1 = finishTime - startTime;
	System.out.println("1: " + fibbIter1);
	startTime = System.nanoTime();
	fibbonaci.fibbIter(5);
	finishTime = System.nanoTime();
	long fibbIter5 = finishTime - startTime;
	System.out.println("5: " + fibbIter5);
	startTime = System.nanoTime();
	fibbonaci.fibbIter(10);
	finishTime = System.nanoTime();
	long fibbIter10 = finishTime - startTime;
	System.out.println("10: " + fibbIter10);
	startTime = System.nanoTime();
	fibbonaci.fibbIter(15);
	finishTime = System.nanoTime();
	long fibbIter15 = finishTime - startTime;
	System.out.println("15: " + fibbIter15);
	startTime = System.nanoTime();
	fibbonaci.fibbIter(20);
	finishTime = System.nanoTime();
	long fibbIter20 = finishTime - startTime;
	System.out.println("20: " + fibbIter20);
	startTime = System.nanoTime();
	fibbonaci.fibbIter(25);
	finishTime = System.nanoTime();
	long fibbIter25 = finishTime - startTime;
	System.out.println("25: " + fibbIter25);
	startTime = System.nanoTime();
	fibbonaci.fibbIter(30);
	finishTime = System.nanoTime();
	long fibbIter30 = finishTime - startTime;
	System.out.println("30: " + fibbIter30);
	

}
}
