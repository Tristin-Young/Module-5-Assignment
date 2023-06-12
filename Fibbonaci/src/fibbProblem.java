
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
	
	fibbProblem fibbonaci = new fibbProblem();
	long startTime = System.nanoTime();
	fibbonaci.fibbRec(10);
	long finishTime = System.nanoTime();
	long fibbRec10 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbRec(50);
	finishTime = System.nanoTime();
	long fibbRec50 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbRec(100);
	finishTime = System.nanoTime();
	long fibbRec100 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbRec(500);
	finishTime = System.nanoTime();
	long fibbRec500 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbRec(1000);
	finishTime = System.nanoTime();
	long fibbRec1000 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbRec(5000);
	finishTime = System.nanoTime();
	long fibbRec5000 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbRec(10000);
	finishTime = System.nanoTime();
	long fibbRec10000 = finishTime - startTime;
	
	
	startTime = System.nanoTime();
	fibbonaci.fibbIter(10);
	finishTime = System.nanoTime();
	long fibbIter10 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbIter(50);
	finishTime = System.nanoTime();
	long fibbIter50 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbIter(100);
	finishTime = System.nanoTime();
	long fibbIter100 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbIter(500);
	finishTime = System.nanoTime();
	long fibbIter500 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbIter(1000);
	finishTime = System.nanoTime();
	long fibbIter1000 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbIter(5000);
	finishTime = System.nanoTime();
	long fibbIter5000 = finishTime - startTime;
	
	startTime = System.nanoTime();
	fibbonaci.fibbIter(10000);
	finishTime = System.nanoTime();
	long fibbIter10000 = finishTime - startTime;
	
	System.out.println(fibbRec10);
	System.out.println(fibbRec50);
	System.out.println(fibbRec100);
	System.out.println(fibbRec500);
	System.out.println(fibbRec1000);
	System.out.println(fibbRec5000);
	System.out.println(fibbRec10000);
	System.out.println(fibbIter10);
	System.out.println(fibbIter50);
	System.out.println(fibbIter100);
	System.out.println(fibbIter500);
	System.out.println(fibbIter1000);
	System.out.println(fibbIter5000);
	System.out.println(fibbIter10000);
	
	
}
}
