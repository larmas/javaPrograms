
public class TestArrayGenerator{
	static public void main(String[] args){
		ArrayGenerator a = new ArrayGenerator(10);
		a.generateNewArray();
		System.out.println(a.toString());
		Sorting.mergeSort(a.getArray(),0,10);
	}
}
