
References:
https://www.youtube.com/watch?v=BZdnvTBO4vI

// ['aba','baba','aba','xzxb']
// ['aba','xzxb','ab']
static int[] matchingStrings(String[] strings, String[] queries) {
	// Create a map of {Key | Value}
	Map<String, Integer> map = new HashMap<>();
	int result[] = new int[queries.length];
	
	//========================================================
	// Key | Value
	// aba |   1
	
	// Key  | Value
	// aba  |   1
	// baba |   1
	
	// Key  | Value
	// aba  |   2
	// baba |   1
	
	// Key  | Value
	// aba  |   2
	// baba |   1
	// xzxb |   1
	for(int i = 0; i < strings.length; i++){
		String inputString = strings[i];
		if(map.containsKey(inputString)){
			map.put(inputString, map.get(inputString) + 1);
		}else{
			map.put(inputString, 1);
		}
	}
	//========================================================
	
	// Key  | Value
	// aba  |   2
	// baba |   1
	// xzxb |   1
	// Lookup if there is such key and return its value back
	for(int i = 0; i < queries.length; i++){
		String queryString = queries[i];
		if(map.containsKey(queryString)){
			result[i] = map.get(queryString);
		}
	}
	
	return result;

	// O(N+Q)
	// O(n)
}











