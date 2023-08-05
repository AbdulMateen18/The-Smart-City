

public class Accounts {
	
	public class Node{
		private String userName;
		private String password;
		private Node next;
		
		public Node(String userName,String password) {
			this.userName=userName;
			this.password=password;
			this.next=null;
		}
		
	}

	private Node head;
	
	
	public Accounts() {
		this.head=null;
	}// end of constructor
	
	public void addAccount(String name, String pass) {
			Node newNode = new Node(name,pass);
			if(head==null) {
				head = newNode;
			}
			else {
				Node curr = head;
				while(curr.next!=null) {
					curr = curr.next;
				}
				curr.next = newNode;
			}
		
		System.out.println("Congragulations "+name+", You Have Successfully"
				+ " Created A New Account, Sign In With Your "
				+ " New Account To Continue");
	}// end of addAccount LinkedLsit
	
	public boolean checkAccount(String name, String pass) {
		Node curr = head;
		while(curr!=null) {
			if(curr.userName.equals(name) && curr.password.equals(pass)) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
}// end of class
