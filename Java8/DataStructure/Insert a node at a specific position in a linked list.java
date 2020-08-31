
References:
https://www.youtube.com/watch?v=s5jaw0x1jdw


/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
	// [a]->[b]->[c] current link list
	//
	// [d]
	SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
	// [a]
	SinglyLinkedListNode current_node = head;
	
	int index=0;
	// [a]->[b]->[c]
	// if insert into position [c] which is 2
	// then it loop from [a]
	// find the node infront of the insert node position
	while(index < position-1){
		current_node = current_node.next;
		index++;
	}
	// current_node : [b]
	// [a]->[b]->[c] current link list
	
	// [d]->[c]
	new_node.next = current_node.next;
	// [b]->[d]
	current_node.next = new_node;
	// [a]->[b]->[d]->[c] current link list
	
	return head;

}