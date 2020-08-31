
References:
https://www.youtube.com/watch?v=cv_VtHgx6YM

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
	// if head is empty or position at 0 which is the first node to be deleted 
	if(head == null) return head;
	if(position == 0) return head.next;
	
	// 20->6->2->19->7->4->15->9
	// position 3, which is 19
	int counter = 0;
	SinglyLinkedListNode current_node = head;
	// find the node infront of the deleting node position
	while(counter < position-1) {
		current_node = current_node.next;
		counter++;
	}
	
	// [2]
	// set the node point to the next next node
	// [2]->[7]
	current_node.next = current_node.next.next;
	// 20->6->2->7->4->15->9
	return head;

}



