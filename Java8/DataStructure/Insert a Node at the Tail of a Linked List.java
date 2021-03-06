
References:
https://www.youtube.com/watch?v=Ktqa7d7ZK9A

static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
	
	// create a SPACE/ADDRESS/MEMORY for the linklist node
	SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
	if(head == null){
		head = new_node;
		return head;
	}
	
	// get the link list
	// [a]->[b]->[c]
	// currently at [a]
	SinglyLinkedListNode current_node = head;
	// travel through the link list to the last node
	// after the while loop it will reach [c]
	while(current_node.next != null){
		current_node = current_node.next;
	}
	
	// current location : [c]
	// put the node [d] at tail where it is currently pointing to null : [c]->null 
	// [c]->[d]
	current_node.next = new_node;
	// the full linklist : [a]->[b]->[c]->[d]
	return head;

}
	
	