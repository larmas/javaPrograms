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
	public void setRoot(TreeNode node){
		root = node;              
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
	//metodo search, busca un elemento en el arbol
	public TreeNode searchTree(Comparable item){
		TreeNode aux = new TreeNode();
		aux = root;
		if (item.compareTo(aux.getElem())==0){
			return aux; 
		}else{
			if (item.compareTo(aux.getElem()) > 0){
				aux = aux.getNodeRight();
				return aux.searchTree(item);
			}else{
				aux = aux.getNodeLeft();
				return aux.searchTree(item);
			}
		}
	}
}