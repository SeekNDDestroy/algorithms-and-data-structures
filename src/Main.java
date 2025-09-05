import arrays.OrderedArray.OrderedArrayBinarySearch;
import sorts.BubbleSort;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort(10);

        bubbleSort.insert(10);
        bubbleSort.insert(12);
        bubbleSort.insert(0);
        bubbleSort.insert(-12);
        bubbleSort.insert(4);

        bubbleSort.display();

        bubbleSort.bubbleSort();

        bubbleSort.display();

    }



}
