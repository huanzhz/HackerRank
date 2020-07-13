
References:
https://www.youtube.com/watch?v=oJgqydHZ_dM


public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
	
	// create list of list of integers
	// seqlist [A,B,C]
	// [A]
	// [B]
	// [C]
	// ...
	List<List<Integer>> seqList = new ArrayList<>();
	
	// initialize with empty List
	// sequence [a,b,c]
	// [A][a] [A][b] [A][c] ...
	// [B][a] [B][b] [B][c] ...
	// [C][a] [C][b] [C][c] ...
	for(int i = 0; i < n; i++){
		seqList.add(new ArrayList<Integer>());
	}
	
	//return correct results
	List<Integer> correctQueries = new ArrayList<>();
	
	//create lastAnswer variable
	int lastAnswer = 0;
	
	for(List<Integer> q : queries){
		// 1 0 5
		// query Type | x | y
		// x XOR lastAnaswer mod n
		// q.get(1) = x
		int index = (q.get(1) ^ lastAnswer) % n;
		
		// q.get(2) = y
		int y = q.get(2);
		
		// q.get(0) = query Type
		switch(q.get(0)){
			case 1:
				seqList.get(index).add(y);
				break;
			case 2:
				int size = seqList.get(index).size();
				lastAnswer = seqList.get(index).get(y % size);
				correctQueries.add(lastAnswer);
				break;
		}
	}
	return correctQueries;

}






