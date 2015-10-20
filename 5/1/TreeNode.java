public class TreeNode{

	private Object element; // elemento del nodo
	private TreeNode left; // hijo izquierdo
	private TreeNode right; // hijo derecho

	// constructor de la clase
	public TreeNode(){
		element = null;
		left = null;
		right = null;
	}
	//contructor de la clase
	public TreeNode(Object item){
		element = item;
		left = null;
		right = null;
	}
	//devuelve el elemento del nodo
	public Object getElem (){
		return this.element;
	}
	//devuelve el elemento del hijo izquierdo
	public Object getElemLeft (){
		return this.left.element;
	}
	//devuelve el elemento del hijo derecho
	public Object getElemRight (){
		return this.right.element;
	}
	//setea el elemento del nodo
	public void setElem(Object item){
		this.element = item;
	} 
	//setea el elemento del hijo izquierdo
	public void setElemLeft(Object item){
		this.left.element = item;
	}
	//setea el elemento del hijo derecho
	public void setElemRight(Object item){
		this.right.element = item;
	}
	//devuelve el hijo izquierdo
	public TreeNode getNodeLeft(){
		return left;
	}
	//devuelve el hijo derecho
	public TreeNode getNodeRight(){
		return right;
	}
	//imprime un arbol en orden preOrder
	public void printPreOrderTreeNode(){
		// se imprime la raiz
		System.out.println(element);
		// se recorre el hi
		if (left != null){
			left.printPreOrderTreeNode();
		}
		// se recorre el hd
		if (right != null){
			right.printPreOrderTreeNode();
		}
	}
	//imprime un arbol en orden inOrder
	public void printInOrderTreeNode(){
		// se recorre el hi
		if (left != null){
			left.printInOrderTreeNode();
		}
		// se imprime la raíz
		System.out.println(element);
		// se imprime el hd
		if (right != null){
			right.printInOrderTreeNode();
		}
	}
	//imprime un arbol en orden postOrder
	public void printPostOrderTreeNode(){
		// se recorre hi
		if (left != null){
			left.printPostOrderTreeNode();
		}
		// se recorre hd
		if (right != null){
			right.printPostOrderTreeNode();
		}
		// se imprime la raiz
		System.out.println(element);
	}
}