package vecka3;

public class StaticTest {

	static int a1 = 3;
	static int a2;
	int a3 = 5;

	// static block K�r f�re main, ladda exempelvis vissa filer innan eller
	// annat som beh�ver startas f�re programmet
	static {
		System.out.println("static block executed");
		a2 = a1 * 4;
		print();

	}

	public static void main(String[] args) {
		System.out.println(" 1 ");
		print();

	}

	// Staticmetod, kan anropas med klassnamn.metodnamn() var som helst. B�r
	// enbart skapas om den inte behandlar ett objekt, typ exe,pel 'r math
	// klassen, som bara har static metoder
	static void print() {
		System.out.println(a2);
	}

}
