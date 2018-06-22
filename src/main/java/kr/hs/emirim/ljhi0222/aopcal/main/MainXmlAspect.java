package kr.hs.emirim.ljhi0222.aopcal.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.ljhi0222.aopcal.cal.Calculator;


public class MainXmlAspect {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:aopAspect.xml");

		Calculator impCal = ctx.getBean("impCal", Calculator.class);
		long fiveFact = impCal.factorial(5);
		System.out.println("impCal.factorial(5) = " + fiveFact);
		
		Calculator recCal = ctx.getBean("recCal",Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = "+fiveFact2 );
		
	}
}