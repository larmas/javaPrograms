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
		this.left = (TreeNode)item;
	}
	//setea el elemento del hijo derecho
	public void setElemRight(Object item){
		this.right = (TreeNode)item;
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
		System.out.print(element);
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
		System.out.print(element);
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
		System.out.print(element);
	}
	//metodo searchTree, busca un elemento en el arbol
	public TreeNode searchTree(Comparable item){
		TreeNode aux = new TreeNode();
		aux = this;
		//si el elemento es igual a la raiz
		if (item.compareTo(aux.element)==0){
			return aux; 
		}else{
			//si el elemento es mayor que el nodo busco en la rama derecha
			if (aux.right!= null && item.compareTo(aux.element) > 0){
				aux = aux.right;
				return aux.searchTree(item);
			}else{ 
				//si el elemento es menor que el nodo busco en la rama izquierda
				if (aux.left != null && item.compareTo(aux.element) < 0){
					aux = aux.left;
					return aux.searchTree(item);	
				}
			}
		}	
		return null;
	}//end of method
	//metodo insertTree, inserta un elemento en el arbol, si es que este no existe ya
	public void insertTree(Comparable item){
		TreeNode aux = new TreeNode();
		aux = this;
		//recorro el arbol hasta el final chekeando que el elemento no este
		if(item!=aux.element){
			if (aux.right!= null && item.compareTo(aux.element) > 0){
				aux = aux.right;
				aux.searchTree(item);
			}else{
				if (aux.left != null && item.compareTo(aux.element) < 0){
					aux = aux.left;
					aux.searchTree(item);
				}
			}
		}//end of if
		if (aux.element!=item){
			if (item.compareTo(aux.element)>0){
				TreeNode newNode = new TreeNode(item);
				aux.setElemRight(newNode);
			}
			if (item.compareTo(aux.element)<0){
				TreeNode newNode = new TreeNode(item);
				aux.setElemLeft(newNode);
			}
		}//end of first if
	}//end of method
}