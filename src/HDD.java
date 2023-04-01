public class HDD  {

    String name;
    int capacity;

    String type;

    public HDD() {
        this.name = "memory2";
        this.capacity = 5;
        this.type = "внешний";

    }

    public HDD(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "\tНазвание\t " + name + "\tОбъем\t " + capacity + "\tТип\t " + type;
    }




}

