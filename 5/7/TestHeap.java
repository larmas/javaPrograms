public class TestHeap {
	public static void main(String args[]){
		Heap n1 = new Heap();

		n1.insertHeap(2);
		n1.insertHeap(23);
		n1.insertHeap(11);
		n1.insertHeap(24);
		n1.insertHeap(35);
		n1.insertHeap(34);
		n1.insertHeap(56);
		n1.insertHeap(76);
		System.out.println(n1.toString());

		n1.deleteMax();
		System.out.println(n1.toString());
	}//end of method test
}//end of class test