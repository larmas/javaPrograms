public class Main {
	
	public static void main(String args[]){
		TreeNode n1 = new TreeNode(0);
		TreeNode n2 = new TreeNode(1);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(3);
		//creo el arbol con n1 como raiz
		BinTree newTree = new BinTree();
		newTree.setRoot(n1);                    //nullpointer
		//seteo los hijos de la raiz(n1)
		n1.setElemLeft(n2);
		n1.setElemRight(n3);
		//seteo el hijo de n3
		n3.setElemLeft(n4);
		//Muestro el arbol en los distintos ordenes
		newTree.printPreOrder();
		newTree.printPostOrder();
		newTree.printInOrder();
	}
}