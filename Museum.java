

public class Museum{
	
private int idOfMuseum;
private String nameOfMuseum;
private String timing;
private String director;
private Items items;
private MyArrayList<Items> items_array;
private int total_tickets;
private int available_tickets;



public Museum(int idOfMusem,String nameOfMuseum, String timing, String director) {
	super();
	this.idOfMuseum=idOfMusem;
	this.nameOfMuseum = nameOfMuseum;
	this.timing = timing;
	this.director = director;
	this.items_array=new MyArrayList<>();
	total_tickets=available_tickets=10;

}


public void add(Items item) {
	items_array.add(item);
}
public void printAll() {
		items_array.print();	
}

@Override
public String toString() {
	return 
			"Museum Name: "+nameOfMuseum+"\n"+
			"Museum Director: " +director+"\n"+
			"Opening Hours: "+timing+"\n"
			;
}
public void bookTicket(int num_of_tickets) {
	int check =0;
	if(num_of_tickets==0) {
		System.out.println("No tickets have been booked");
		check =1;
	}
	
	else if (num_of_tickets>total_tickets) {
		System.out.println("Only "+total_tickets+" tickets are available.Please try again later");
		check =1;
	}
	else if((available_tickets-num_of_tickets)>=0) {
		available_tickets-=num_of_tickets;
		System.out.println( num_of_tickets+" have been booked. "+available_tickets+" tickets are remaining");
		check =1;
	}
	else if(check==0){
		System.out.println("Invalid Entry Please try again "+available_tickets+" tickets are remaining");
	}
}


}
