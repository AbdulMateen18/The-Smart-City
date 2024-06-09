// This is a comment from android github

public class BinarySearchTree{
	class Node {
		private String data;
		private Node leftNode;
		private Node rightNode;
		
		public Node(String n){
			this.data = n;
		}
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data =  data;
		}
		public Node getLeftNode() {
			return leftNode;
		}
		public void setLeftNode(Node leftNode) {
			this.leftNode = leftNode;
		}
		public Node getRightNode() {
			return rightNode;
		}
		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
		}
	}// end of Node Class

	private Node root;
	

	public BinarySearchTree() {
		this.root = null;
	}
	
	
	public void insert(String data) {
		if(search(data) == null) // only add new node if it does not exist already
			root = insert(root, data);
	}
	private Node insert(Node localRoot, String data){
		
		if(localRoot == null){
			localRoot = new Node(data);
			return localRoot;
		}
		
		else if(data.compareTo(localRoot.getData()) < 0){
			localRoot.setLeftNode(insert(localRoot.getLeftNode(), data));
		}
		
		else{
			localRoot.setRightNode(insert(localRoot.getRightNode(), data));		
		}
		return localRoot;
	}

	
	public Node search(String key) {
		// TODO Auto-generated method stub
		return search(root, key);
	}
	
	private Node search(Node localRoot, String key) {
		
		
		 if (localRoot == null || localRoot.getData().compareTo(key) == 0)
			 return localRoot; 
	    if (localRoot.getData().compareTo(key) > 0) 
	        return search(localRoot.getLeftNode(), key); 	  
	    return search(localRoot.getRightNode(), key); 
	}

	
	public void delete(String key) {
		root = delete(root, key);
	}
	
	 private Node delete(Node localRoot, String key){ 
        if (localRoot == null)
        	return localRoot;   
        if (key.compareTo(localRoot.getData()) < 0) 
        	localRoot.setLeftNode(delete(localRoot.getLeftNode(), key)); 
        else if (key.compareTo(localRoot.getData()) > 0) 
        	localRoot.setRightNode(delete(localRoot.getRightNode(), key));   
        else
        { 
            if (localRoot.getLeftNode() == null) 
                return localRoot.getRightNode(); 
            else if (localRoot.getRightNode() == null) 
                return localRoot.getLeftNode(); 
            localRoot.setData(findMin(localRoot.getRightNode()).getData());   
            localRoot.setRightNode(delete(localRoot.getRightNode(), localRoot.getData())); 
        } 
        return localRoot; 
    } 
	 
	 public String findMin() {
		 return findMin(root).getData();
	 }
	 
	 private Node findMin(Node localRoot){ 
		 if(localRoot.getLeftNode() == null)
			 return localRoot;
		 else
			 return findMin(localRoot.getLeftNode());
    } 

	 
	 public String findMax() {
		 return findMax(root).getData();
	 }
	 
	 private Node findMax(Node localRoot) {
		 if(localRoot.getRightNode() == null)
			 return localRoot;
		 else
			 return findMax(localRoot.getRightNode());
	 }
	
	public void preOrder() {
		// TODO Auto-generated method stub
		preOrder(root);
	}
	
	private void preOrder(Node localRoot){
		
		if(localRoot != null){
			System.out.println("-->"+ localRoot.getData() + " ");
			
			preOrder(localRoot.getLeftNode());
			
			preOrder(localRoot.getRightNode());
			
		}
	}

	
	public void postOrder() {
		// TODO Auto-generated method stub
		postOrder(root);
	}
	
	private void postOrder(Node localRoot){
		
		if(localRoot != null){
			
			postOrder(localRoot.getLeftNode());
			
			postOrder(localRoot.getRightNode());
			
			System.out.println("-->"+localRoot.getData() + " ");
			
		}
		
	}

	
	public void inOrder() {
		// TODO Auto-generated method stub
		inOrder(root);
	}
	
	private void inOrder(Node localRoot){
		
		if(localRoot != null){
			inOrder(localRoot.getLeftNode());
			System.out.print("-->"+localRoot.getData() + " ");
			inOrder(localRoot.getRightNode());
		}
	}
	
	public void inOrder2() {
		// TODO Auto-generated method stub
		inOrder2(root);
	}
	
	private void inOrder2(Node localRoot){
		
		if(localRoot != null){
			inOrder2(localRoot.getRightNode());
			System.out.print("-->"+localRoot.getData() + " ");
			inOrder2(localRoot.getLeftNode());
		}
	}

}
