public class Main {
	
	public static void main(String args[]){
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(0);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(2);
		//creo el arbol con n1 como raiz
		BinTree newTree = new BinTree();
		newTree.setRoot(n1);                    
		//seteo los hijos de la raiz(n1)
		n1.setElemLeft(n2);
		n1.setElemRight(n3);
		//seteo el hijo de n3
		n3.setElemLeft(n4);
		//Muestro el arbol en los distintos ordenes
		newTree.printPreOrder();
		System.out.println();
		newTree.printPostOrder();
		System.out.println();
		newTree.printInOrder();
		System.out.println();
		//prueba de vacio y vaciar
		System.out.println(newTree.isEmpty());
		//newTree.makeEmpty();
		//System.out.println(newTree.isEmpty());
		//prueba de search
		System.out.println(newTree.searchBinTree(3));
	}
}