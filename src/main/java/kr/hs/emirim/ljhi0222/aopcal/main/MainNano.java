package kr.hs.emirim.ljhi0222.aopcal.main;

import kr.hs.emirim.ljhi0222.aopcal.cal.Calculator;
import kr.hs.emirim.ljhi0222.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.ljhi0222.aopcal.cal.RecCalculator;

public class MainNano {

	public static void main(String[] args) {
		int num = 10;
		
		long start1 = System.nanoTime();
		
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(100);
		
		long end1 = System.nanoTime();		
		System.out.printf("IMP factory(%d) : 실행시간 = %d", num, (end1 - start1));
		
		
		System.out.println("\n--------------------------------------------");
		
		
		long start2 = System.nanoTime();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(100);
		
		long end2 = System.nanoTime();		
		System.out.printf("REC factory(%d) : 실행시간 = %d", num, (end2 - start2));

	}

}
