package kr.hs.emirim.ljhi0222.aopcal.cal;

public class ImpeCalculator implements Calculator{
	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		
		long result = 1;
		for (long i = 1; i <= num; i++) {
			result *= i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.printf("IMP factory(%d) : 실행시간 = %d", num, (end - start));
		
		return result;
	}
}
