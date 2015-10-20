public class Racional{
	private long num;
	private long den;

	public Racional(){
		num = 0;
		den = 1;
	}//end of constructor Racional

	public Racional(long x, long y){
		num = x;
		den = y;
	}//end of constructor Racional(x,y)

	public long getNum(){
		return num;
	}//end of method getNum

	public long getDen(){
		return den;
	}// end of method getDen

	/*public long mcd(long x, long y){
		if (y<x){ //en x queda el menos de los dos
			long aux = x;
			x = y;
			y = aux;
		}//end if
		long divisor = 1;
		while (div <= x){
			if ((x mod divisor==0) && (y mod divisor==0)){
				divisor++;
			}
		}
		return divisor;
	}//end of method*/

	public Racional suma(Racional x){
		Racional result = new Racional();
		result.num = this.num*x.getDen() + this.den*x.getNum();
		result.den = this.den*x.getDen();

		return result;
	}

	public Racional producto(Racional x){
		Racional result = new Racional();
		result.num = this.num*x.getNum();
		result.den = this.den*x.getDen();

		return result;
	}// end of method producto

	public Racional division(Racional x){
		Racional result = new Racional();

		result.num = this.num*x.getDen();
		result.den = this.den*x.getNum();

		return result;
	}//end of method division

	public Boolean equals(Racional x){
		return ((this.num/this.den)==(x.getNum()/x.getDen()));
	}//end of method equals

	public String toString(){
		return this.num + "/" + this.den;
	}
}//end of class Racional