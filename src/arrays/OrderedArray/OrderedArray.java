package arrays.OrderedArray;

public class OrderedArray {
    private int[] array;
    private int nElements;

    public OrderedArray(int maxSize){
        this.array = new int[maxSize];
        this.nElements = 0;
    }

    public int size(){
        return nElements;
    }

    public int find(int searchKey){
        int lowerBound = 0;
        int upperBound = size() - 1;
        int middleIndex = 0;

        while(lowerBound <= upperBound){
            middleIndex = (lowerBound + upperBound) / 2;

            if(this.array[middleIndex] == searchKey){
                return middleIndex;
            }
            else if(searchKey < array[middleIndex]){
                upperBound = middleIndex - 1;
            }
            else if(searchKey > this.array[middleIndex]){
                lowerBound = middleIndex + 1;
            }
        }
        return -1;
    }

    public void insert(int value){
        int i = 0, j = 0;

        for(i = 0; i < size(); i++){
            if(array[i] > value){
                break;
            }
        }

        for(j = size(); j > i; j--){
            array[j] = array[j - 1];
        }
        array[i] = value;
        nElements += 1;
    }

    public void display(){
        for(int i = 0; i < size(); i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean delete(int value){
        int valueToDelete = find(value);

        if(valueToDelete != -1){
            for(int i = valueToDelete; i < size() - 1; i++){
                array[i] = array[i + 1];
            }
            nElements -= 1;
            return true;
        }
        return false;
    }


}
