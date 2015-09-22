package vecka4;

public class RationalTest {

	public static void main(String[] args) {
		Rational r1 = new Rational();
		Rational r2 = new Rational();
		Rational r3 = new Rational();
		Rational r4 = new Rational();
		Rational r5 = new Rational();
		
		r1.setTälj(6);
		r1.setNämn(2);
		
		r2.setTälj(4);
		r2.setNämn(6);
		r1.add(r2);
		System.out.println( r1.getTälj()+ " " +r1.getNämn());
		r3.setTälj(6);
		r3.setNämn(7);
		
		r2.multi(r3);
		System.out.println( r2.getTälj()+ " " +r2.getNämn());
		
		r4.setTälj(5);
		r4.setNämn(15);
	
		r5.setTälj(8);
		r5.setNämn(12);
		r4.rationalRational();
		r5.rationalRational();
		
		System.out.println(r4.getNämn() +" " +r4.getTälj());
		System.out.println(r5.getNämn() +" " +r5.getTälj());
	}

}
