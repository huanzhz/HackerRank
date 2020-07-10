
References:
https://www.youtube.com/watch?v=0lajFzeFEFo


// Complete the hourglassSum function below.
static int hourglassSum(int[][] arr) {
	
	int row = arr.length;
	int columns = arr[0].length;
	
	//Constraints 
	// -9 <= arr[i][j] <= 9 
	//	0 <= i,j <= 5
	// Integer.MIN_VALUE -> Some crazy negative number
	// maximum hourglass in one row for 9 by 9 is 7.
	int max_hourglass_sum = -63;	
	
	// [i]  [j] | [i]  [j+1] | [i]  [j+2]
	//		  	| [i+1][j+1] | 
	// [i+2][j] | [i+2][j+1] | [i+2][j+2]
	
	// minus -2 because the last 2 row and column cannot form an hourglass
	for(int i=0; i<row-2; i++){
		for(int j=0; j<columns-2; j++){
			int current_hourglass_sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
			max_hourglass_sum = Math.max(max_hourglass_sum, current_hourglass_sum);
		}
	}
	
	return max_hourglass_sum;

}
