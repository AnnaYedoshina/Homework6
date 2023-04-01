public class RAM {

    String name;
    int capacity;


    public RAM(){
        this.name = "memory1";
        this.capacity = 100;


    }

    public RAM(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "\tНазвание\t " + name + "\tОбъем\t" + capacity;
    }



}

