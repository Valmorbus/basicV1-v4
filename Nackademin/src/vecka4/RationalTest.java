package vecka4;

public class RationalTest {

	public static void main(String[] args) {
		Rational r1 = new Rational();
		Rational r2 = new Rational();
		Rational r3 = new Rational();
		Rational r4 = new Rational();
		Rational r5 = new Rational();
		
		r1.setT�lj(6);
		r1.setN�mn(2);
		
		r2.setT�lj(4);
		r2.setN�mn(6);
		r1.add(r2);
		System.out.println( r1.getT�lj()+ " " +r1.getN�mn());
		r3.setT�lj(6);
		r3.setN�mn(7);
		
		r2.multi(r3);
		System.out.println( r2.getT�lj()+ " " +r2.getN�mn());
		
		r4.setT�lj(5);
		r4.setN�mn(15);
	
		r5.setT�lj(8);
		r5.setN�mn(12);
		r4.rationalRational();
		r5.rationalRational();
		
		System.out.println(r4.getN�mn() +" " +r4.getT�lj());
		System.out.println(r5.getN�mn() +" " +r5.getT�lj());
	}

}
