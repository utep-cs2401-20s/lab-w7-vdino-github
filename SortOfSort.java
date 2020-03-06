public class SortOfSort{

    public SortOfSort(){

    }
    public void SortOfSort(int [] a) {
        int begin = 0;  //Begin of the array, should increase it's value (index) until it matches end
        int end = a.length - 1; //End of the array, should decrease it's value (index) until it matches begin
        int count = 1; //It is used to know when to change sides
        boolean rightSide = true; //We start at the right side due to the first large value being on
//                                  It's false once it changes to the left
        int temp;   //Temporary value to store previous values

        while(begin <= end){    //If begin and end match after sorting it means the while ends
            if(count % 3 == 0){
                if(rightSide){
                    rightSide = false;
                }
                else{
                    rightSide = true;
                }
                count = 1;  //Count resets to be used again on the other side

            }

            if(rightSide){
                temp = a[end];
                int tmpR = findLargeMethod(a, begin, end); //tmpR stores the value returned in findLargeMethod
                a[end] = a[tmpR];
                a[tmpR] = temp;
                end--;
                count++;

            }
            else{
                temp = a[begin];
                int tmpL = findLargeMethod(a, begin, end);  //tmpL stores the value returned in findLargeMethod
                a[begin] = a[tmpL];
                a[tmpL] = temp;
                begin++;
                count++;
            }

        }
    }

    public int findLargeMethod(int [] array, int b, int e) {
        int large = b;  //large will begin at the start of the array
        for(int i = (b + 1); i < (e + 1); i++) {    //i is b+1 because it will be compared to large which is b
//                                                    and will end at e+1 because the array will have nothing else
//                                                    to be compared to
            if(array[large] < array[i]){
                large = i;  //It's an index because it will know where to store the largest value
            }
        }
        return large;
    }
}



/*
Han's algorithm,
a deterministic algorithm for sorting keys from a domain of finite size,
taking O(n log log n) time and O(n) space
 */