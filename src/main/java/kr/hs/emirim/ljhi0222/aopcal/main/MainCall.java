package kr.hs.emirim.ljhi0222.aopcal.main;

import kr.hs.emirim.ljhi0222.aopcal.cal.Calculator;
import kr.hs.emirim.ljhi0222.aopcal.cal.ImpeCalculator;
import kr.hs.emirim.ljhi0222.aopcal.cal.RecCalculator;

public class MainCall {

	public static void main(String[] args) {
		int num = 1000;
		
		long start1 = System.currentTimeMillis();
		
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(100);
		
		long end1 = System.currentTimeMillis();		
		System.out.printf("IMP factory(%d) : 실행시간 = %d", num, (end1 - start1));

		System.out.println("IMP 100 : " + f1);
		
		
		System.out.println("--------------------------------------------");
		
		
		long start2 = System.currentTimeMillis();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(100);
		
		long end2 = System.currentTimeMillis();		
		System.out.printf("IMP factory(%d) : 실행시간 = %d", num, (end2 - start2));
		
		System.out.println("Rec 100 : " + f2);


	}

}
