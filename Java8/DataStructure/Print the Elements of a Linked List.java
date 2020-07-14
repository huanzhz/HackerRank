
References:
https://www.youtube.com/watch?v=RauwaPabNzE

// SinglyLinkedListNode get the node input from the function call
static void printLinkedList(SinglyLinkedListNode head) {

	// if the linklist is empty, return
	if(head == null) return;
	
	// loop through the list
	// [ a -> b -> c ]
	// [ ^           ]
	while (head != null){
		System.out.println(head.data);
		// move to next node
		head = head.next;
	}
	return;
}

// create a linklist
SinglyLinkedList llist = new SinglyLinkedList();
llistItem = scanner.nextInt();	// input from user
llist.insertNode(llistItem);
printLinkedList(llist.head);   // the function on top