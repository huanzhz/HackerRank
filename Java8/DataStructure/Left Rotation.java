
References:
https://www.youtube.com/watch?v=7zEkLFE_D4Y

// a = the array [1,2,3,4,5] 
// d = the amount of rotation
static int[] rotLeft(int[] a, int d){
	
	// get the size of the array
	int size = a.length;
	// define an array for the final output
	// rotated_arr[0,0,0,0,0]
	int[] rotated_arr = new int[size];
	
	int i = 0;
	int rotate_index = d;
	
	// rotate_index = 4 | size = 5 | i = 0
	while(rotate_index < size){
		rotated_arr[i] = a[rotate_index];
		i++;
		rotate_index++;
	}
	// rotated_arr[5,0,0,0,0]
	
	rotate_index = 0;
	// rotate_index = 0 | d = 4 | i = 1
	while(rotate_index < d){
		rotated_arr[i] = a[rotate_index];
		i++;
		rotate_index++;
	}
	// rotated_arr[5,1,0,0,0]
	// rotated_arr[5,1,2,0,0]
	// rotated_arr[5,1,2,3,0]
	// rotated_arr[5,1,2,3,4]
	
	// print out the value
	for( int j : rotated_arr ){
        System.out.print( j + " ");
    }
}

// call inside the solution function
rotLeft(a,d);