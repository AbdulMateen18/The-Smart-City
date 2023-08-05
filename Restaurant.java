

public class Restaurant {
	
	private class Node{
		private int tableNumber;
		private String customerName;
		private Node next;
		
		public Node(int tableNumber,String customerName) {
			this.tableNumber = tableNumber;
			this.customerName = customerName;
			next = null;
		}//constructor
		
		
	}//Node class
	
	private Node head;
	private String name;
	private int numOfTables;
	private int availableTables;
	
	public Restaurant(String name,int numOfTables) {
		this.name = name;
		this.numOfTables = numOfTables;
		this.availableTables = numOfTables;
		head = null; 
	}

	public String getName() {
		return this.name;
	}
	
	public int getNumOfTables() {
		return numOfTables;
	}
	
	public void bookTable(int tableNumber,String customerName) {
		
		//check if the table is already booked
		
		Node current = head;
		while(current!=null) {
			if(current.tableNumber==tableNumber) {
				System.out.println("Sorry....!\nTable "+tableNumber+" is already booked"
									+ "\nYou can book another table.");
				return;
			}
			current = current.next;
		}//while
		
		//check if no tables available
		
		if(availableTables==0) {
			System.out.println("Sorry, there are no availabe tables at "+name+".");
			return;
		}
		
		//if table is not booked
		
		Node newNode = new Node(tableNumber,customerName);
		if(head==null) {
			head=newNode;
		}
		else {
			current = head;
			while(current.next!=null) {
				current = current.next;
			}//while
			current.next = newNode;
		}//if-else
		availableTables--;
		System.out.println("Table "+tableNumber+" at "+name+" booked by "+customerName+".");
		
	}//bookTable()
	
	public void cancelTable(int tableNumber) {
		//check if no table is booked.
		
		if(head==null) {
			System.out.println("Table "+tableNumber+" is not booked.");
			return;
		}
		
		//check if first node is to be removed.
		else if(head.tableNumber==tableNumber) {
			System.out.println("Table "+tableNumber+" at "+name+" cancelled.");
			head = head.next; 
			availableTables++;
		}else {
			Node current = head;
			while(current.next!=null && current.next.tableNumber!=tableNumber) {
				current = current.next;
			}//while
			if(current.next!=null) {
				current.next=current.next.next;
				System.out.println("Table "+tableNumber+" at "+name+" cancelled.");
				availableTables++;
			}
		}//if-else-if
		
	}//cancelTable()
	
	
	
//	public static void main(String[] args) {
//		Restaurant r1  = new Restaurant("Sheikh Burgers",5);
//		Restaurant r2 = new Restaurant("Pizza Hut",3);
//		
//		r1.bookTable(1, "Mateen");
//		r1.bookTable(2, "Azeem");
//		
//		r1.bookTable(6, "abc");
//		r1.bookTable(3, "Mateen");
//		r1.bookTable(4, "Azeem");
//		
//		r1.bookTable(7, "abc");
//		
//		r2.bookTable(-1, null);
//		
//		r1.cancelTable(2);
//	
//	}
	
	
}
