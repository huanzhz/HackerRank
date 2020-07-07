
// ReverseArray
static int[] reverseArray(int[] a) {
    for(int i = 0, j = a.length-1; i < a.length; i++, j--){
        if(i < j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        }
    }
    return a;

}