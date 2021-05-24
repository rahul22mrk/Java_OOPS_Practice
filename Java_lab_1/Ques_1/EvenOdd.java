
class EvenOdd{
	private int num;
	private boolean evenOdd;
	public void setNumber(int num) {
		this.num=num;
		
	}
	public int getNumber()
	{
		return num;
	}
	public boolean getEvenOddN()
	{
		return evenOdd;
	}
	public void checkEvenOdd()
	{
		if(num%2==0)
		{
			this.evenOdd=true;
		}
		else {
			this.evenOdd=false;
		}
	}
}
