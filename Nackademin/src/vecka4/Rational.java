package vecka4;

public class Rational {
	private int t�lj =0;
	private int N�mn=0;
	


	public Rational()
	{
		int t�lj;
		int n�mn;	
		//int rat;
	}
	
	public void multi(Rational r)
	{
		this.setT�lj((this.getT�lj())*(r.getT�lj()));
		this.setN�mn(this.getN�mn()*r.getN�mn());
		
	}
	public void add(Rational r)
	{
		this.setT�lj(this.getT�lj()*r.getN�mn()+this.getN�mn()*r.getT�lj());
		this.setN�mn(this.getN�mn()*r.getN�mn());
		
	}
	
			

	public int getT�lj() {
		return t�lj;
	}


	public void setT�lj(int t�lj) {
		this.t�lj = t�lj;
	}


	public int getN�mn() {
		return N�mn;
	}

	public void setN�mn(int n�mn) {
		N�mn = n�mn;
	}

	public void rationalRational()
	{
		int temp = 0;
		int smallest;
		if (this.getT�lj()<this.getN�mn())
		{
			smallest = this.getT�lj();
		}
		else 
			smallest = this.getN�mn();
		
		for (int i = smallest; i  >=2; i--) {
			
			if (this.getT�lj()%i==0 && this.getN�mn()%i==0)
			{
				temp=i;
				break;
			}
			
		}
		this.setT�lj(getT�lj()/temp);
		this.setN�mn(getN�mn()/temp);
		
	}

	
}
