package EnomDemo;

public class TicketMain {
 public static void main(String[] args) {
	 Ticket t1=Ticket.paltenium;
	 System.out.println(t1);
	 System.out.println(t1.rate);
	 
	 Ticket t2[]=Ticket.values();
	 for(Ticket t3:t2) {
		 System.out.println(t3);
		 System.out.println(t3.rate);
	 }
	 }
}
