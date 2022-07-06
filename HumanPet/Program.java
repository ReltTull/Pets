package HumanPet;

public class Program {
    public static void main(String[] args) {
        Human drozdowski = new Human("Nicolay Drozdowski", "silent");
        drozdowski.displayInfo();
        Pet boris = new Pet("Boris", "cat", "silent", 5);
        boris.showInfo();
        Pet sharik = new Pet("Sharik", "dog", "silent", 20);
        sharik.showInfo();

        System.out.println();

        drozdowski.callAPet(boris);
        drozdowski.displayInfo();
        boris.showInfo();

        System.out.println();

        drozdowski.callAPet(sharik);
        drozdowski.displayInfo();
        sharik.showInfo();

    }
}
