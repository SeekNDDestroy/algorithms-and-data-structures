package arrays;

public class HighArray {
    private int[] array;
    private int nElement;

    public HighArray(int maxSize){
        this.array = new int[maxSize];
        nElement = 0;
    }

    public int findElement(int value){
        for(int i = 0; i < nElement; i++){
            if(array[i] == value){
                System.out.println("element found at index " + i);
                return i;
            }
        }
        System.out.println("element not found");
        return -1;
    }

    public void insert(int value){
        array[nElement] = value;
        nElement += 1;
    }

    public boolean delete(int value){
        int index = findElement(value);
        if(index != -1){
            for(int i = index; i < nElement - 1; i++){
                array[i] = array[i + 1];
            }
            nElement -= 1;
            return true;
        }
        return false;
    }

    public void display(){
        for(int i = 0; i < nElement; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }




}
