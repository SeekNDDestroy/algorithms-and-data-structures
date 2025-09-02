package arrays.classDataArray;

public class ClassDataArray {
    private Person[] personArray;
    private int nElements;

    public ClassDataArray(int maxSize){
        this.personArray = new Person[maxSize];
        this.nElements = 0;
    }

    public Person findByFirstName(String firstName){
        for(int i = 0; i < nElements; i++){
            if(personArray[i].getFirstName().equals(firstName)){
                return personArray[i];
            }
        }
        return null;
    }

    public Person findByLastName(String lastName){
        for(int i = 0; i < nElements; i++){
            if(personArray[i].getLastName().equals(lastName)){
                return personArray[i];
            }
        }
        return null;
    }

    public void insert(String firstName, String lastName, int age){
        personArray[nElements] = new Person(firstName, lastName, age);
        nElements += 1;
    }

    public boolean deleteByFirstName(String firstName){
        int i = 0;
        for(i = 0; i < nElements; i++) {
            if (personArray[i].getFirstName().equals(firstName)) {
                break;
            }
        }

        if(i == nElements){
            return false;
        }

        for(int j = i; j < nElements - 1; j++){
            personArray[j] = personArray[j + 1];
        }
        nElements -= 1;
        return true;
    }

    public void display(){
        for(int i = 0; i < nElements; i++){
            System.out.print(personArray[i] + " | ");
        }
        System.out.println();
    }

    public int size(){
        return nElements;
    }







}
