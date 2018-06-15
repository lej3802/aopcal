package kr.hs.emirim.ljhi0222.aopcal.cal;

public class RecCalculator implements Calculator{
	long start = System.currentTimeMillis();
	
	@Override
	public long factorial(long num) {
		
		try {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
		}finally {
			long end = System.currentTimeMillis();
			
			System.out.printf("Rec factory(%d) : 실행시간 = %d", num, (end - start));
		}
	}
}
