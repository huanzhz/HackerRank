
References:
https://www.youtube.com/watch?v=HpaDZa0ru9Q

static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
	SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
	if(llist == null) return new_node;	//if the new node is the first node
	
	// puck the list behind the new_node list
	new_node.next = llist;
	return new_node;
}


