package Week_5;

class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class AddLinkedList {
	
	public static Node addLinkedList(Node head1, Node head2) {
		Node head3 = new Node(0);
		Node curr = head3;
		int carry = 0;
		
		while(head1 != null || head2 != null || carry != 0) {
			int x = (head1!=null) ? head1.data : 0;
			int y = (head2!=null) ? head2.data : 0;
			
			int sum = x + y + carry;
			carry = sum/10;
			
			curr.next = new Node(sum%10);
			curr = curr.next;
			
			if(head1!=null) head1 = head1.next;
			if(head2!=null) head2 = head2.next;
			
			
		}
		return head3.next;
		
	}
	public static void printList(Node node) {
        while (node.next != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
            
        }
        System.out.print(node.data);
        
        System.out.println();
    }
	public static void main(String[] args) {
		AddLinkedList adder = new AddLinkedList();
		
		Node head1 = new Node(1);
		head1.next = new Node(4);
		head1.next.next = new Node(3);
		
		Node head2 = new Node(5);
		head2.next = new Node(6);
		head2.next.next = new Node(4);
		
		Node result = adder.addLinkedList(head1, head2);
		printList(result);
	}

}
