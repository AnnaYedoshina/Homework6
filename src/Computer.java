public class Computer {

    int price;
    int model;
    RAM ram;
    HDD hdd;

    public Computer() {
    }

    public Computer(int price, int model) {
        this.price = price;
        this.model = model;

    }
    void info(){
        System.out.println("Price: " + this.price + "\nModel: " + this.model);
    }

    public void setValues(int price, int model, RAM ram,  HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Computer(int price, int model, RAM ram, HDD hdd) {
        setValues(price, model, ram, hdd);

    }
    void info2() {
        System.out.println("Price: " + this.price + "\nModel: " + this.model + "\nRAM " + this.ram + "\nHDD" + this.hdd);


    }


}




