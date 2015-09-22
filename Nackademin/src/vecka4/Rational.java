package vecka4;

public class Rational {
	private int tälj =0;
	private int Nämn=0;
	


	public Rational()
	{
		int tälj;
		int nämn;	
		//int rat;
	}
	
	public void multi(Rational r)
	{
		this.setTälj((this.getTälj())*(r.getTälj()));
		this.setNämn(this.getNämn()*r.getNämn());
		
	}
	public void add(Rational r)
	{
		this.setTälj(this.getTälj()*r.getNämn()+this.getNämn()*r.getTälj());
		this.setNämn(this.getNämn()*r.getNämn());
		
	}
	
			

	public int getTälj() {
		return tälj;
	}


	public void setTälj(int tälj) {
		this.tälj = tälj;
	}


	public int getNämn() {
		return Nämn;
	}

	public void setNämn(int nämn) {
		Nämn = nämn;
	}

	public void rationalRational()
	{
		int temp = 0;
		int smallest;
		if (this.getTälj()<this.getNämn())
		{
			smallest = this.getTälj();
		}
		else 
			smallest = this.getNämn();
		
		for (int i = smallest; i  >=2; i--) {
			
			if (this.getTälj()%i==0 && this.getNämn()%i==0)
			{
				temp=i;
				break;
			}
			
		}
		this.setTälj(getTälj()/temp);
		this.setNämn(getNämn()/temp);
		
	}

	
}
