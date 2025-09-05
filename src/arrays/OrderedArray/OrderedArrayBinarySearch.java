package arrays.OrderedArray;


// insert(), delete(),  find() -> binary search


public class OrderedArrayBinarySearch {
    private int[] array;
    private int nElement;

    public OrderedArrayBinarySearch(int maxSize){
        this.array = new int[maxSize];
        this.nElement = 0;
    }


    public void insert(int value){

        if(nElement == 0){
            this.array[nElement] = value;
            nElement += 1;
            return;
        }

        int low = 0;
        int high = nElement - 1;


        while(low <= high){

            int mid = (low + high) / 2;

            if(array[mid] > value){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        for(int i = nElement; i > low; i--){
            array[i] = array[i - 1];
        }
        this.array[low] = value;
        nElement += 1;
    }

    public void display(){
        for(int i = 0; i < nElement; i++){
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }

    public int find(int value){
        int low = 0;
        int high = nElement - 1;
        int mid = 0;

        while(low <= high){

            mid = (low + high) / 2;

            if(this.array[mid] > value){
                high = mid - 1;
            }
            else if(this.array[mid] < value){
                low = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

    public void delete(int value) {

        if (nElement == 0) {
            return;
        }

        int low = 0;
        int high = nElement - 1;
        int mid = 0;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;

            if (this.array[mid] > value) {
                high = mid - 1;
            } else if (this.array[mid] < value) {
                low = mid + 1;
            } else {
                found = true;
                break;
            }
        }


        if (found) {


            for (int i = mid; i < nElement - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            nElement -= 1;
            found = false;
        }
    }

}

