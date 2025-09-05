package sorts;

public class BubbleSort {
    private int[] array;
    private int nElement;

    public BubbleSort(int maxSize){
        this.array = new int[maxSize];
        this.nElement = 0;
    }

    public void insert(int value){
        this.array[nElement] = value;
        this.nElement += 1;
    }

    public void display(){
        for(int i = 0; i < nElement; i++){
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort(){
        int innerPointer, outterPointer;

        for(outterPointer = nElement - 1; outterPointer > 1; outterPointer--){
            for(innerPointer = 0; innerPointer < outterPointer; innerPointer++){
                if(this.array[innerPointer] > this.array[innerPointer + 1]){
                    swap(innerPointer, innerPointer + 1);
                }
            }
        }
    }

    public void swap(int indexOne, int indexTwo){
        int temp = this.array[indexOne];
        this.array[indexOne] = this.array[indexTwo];
        this.array[indexTwo] = temp;
    }




}

//
//public void bubbleSort(){
//    int out, in;
//
//    for(out = nElement - 1; out > 1; out--){
//        for(in = 0; in < out; in++){
//            if(this.array[in] > this.array[in + 1]){
//                swap(in, in + 1);
//            }
//        }
//    }
//}
//
//public void swap(int indexOne, int indexTwo){
//    int temp = this.array[indexOne];
//    this.array[indexOne] = this.array[indexTwo];
//    this.array[indexTwo] = temp;
//}