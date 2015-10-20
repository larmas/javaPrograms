public class TreeNode{

	private Object element; // elemento del nodo
	private TreeNode left; // hijo izquierdo
	private TreeNode right; // hijo derecho

	// constructor del NodoArbol por defecto
	public TreeNode(){
		element = null;
		left = null;
		right = null;
	}

	public TreeNode(Object item){
		element = item;
		left = null;
		right = null;
	}

	public Object getElem (){
		return this.element;
	}

	public Object getElemLeft (){
		return this.left.element;
	}

	public Object getElemRight (){
		return this.right.element;
	}

	public void setElem(Object item){
		this.element = item;
	} 

	public void setElemLeft(Object item){
		this.left.element = item;
	}

	public void setElemRight(Object item){
		this.right.element = item;
	}

	public TreeNode getNodeLeft(){
		return left;
	}

	public TreeNode getNodeRight(){
		return right;
	}

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