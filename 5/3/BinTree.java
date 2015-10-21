public class BinTree implements BinaryTreeBasic{
	// raiz del arbol
	private TreeNode root;
	
	//constructor arbol binario
	public BinTree(){
		root = null;
	}
	//devuelve el elemento en la raiz
	public Object getRoot(){
		return root.getElem();
	}
	//setea la raiz del arbol
	public void setRoot(Object node){
		root = (TreeNode)node;              
	}
	//devuelve true si el arbol esta vacio
	public boolean isEmpty(){
		return root == null;
	}
	//vacia el arbol
	public void makeEmpty(){
		root = null;
	}
	//imprime el arbol con recorrido preorder
	public void printPreOrder(){
		if (root!=null){
			root.printPreOrderTreeNode();
		}
	}
	//imprime el arbol con recorrido postorder
	public void printPostOrder(){
		if (root!=null){
			root.printPostOrderTreeNode();
		}
	}
	//imprime el arbol con recorrido inorder
	public void printInOrder(){
		if (root!=null){
			root.printInOrderTreeNode();
		}
	}
}