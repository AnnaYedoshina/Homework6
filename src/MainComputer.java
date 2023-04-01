public class MainComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer(200,100);
        RAM ram = new RAM("memory",4);
        HDD hdd = new HDD("memory1",5,"внешний");
        Computer computer2 = new Computer(500, 100, ram, hdd);

        computer1.info();
       computer2.info2();
    }

}
