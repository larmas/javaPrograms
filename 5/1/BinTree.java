public class BinTree implements BinaryTreeBasic{
	// raiz del arbol
	private TreeNode root;
	
	//constructor arbol binario
	public BinTree(){
		root = null;
	}

	public Object getRoot(){
		return root.getElem();
	}

	public void setRoot(Object node){
		root.setElem(node);              //nullpointer
	}

	public boolean isEmpty(){
		return root == null;
	}

	public void makeEmpty(){
		root = null;
	}

	public void printPreOrder(){
		if (root!=null){
			root.printPreOrderTreeNode();
		}
	}

	public void printPostOrder(){
		if (root!=null){
			root.printPostOrderTreeNode();
		}
	}

	public void printInOrder(){
		if (root!=null){
			root.printInOrderTreeNode();
		}
	}
}