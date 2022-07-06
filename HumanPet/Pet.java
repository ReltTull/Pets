package HumanPet;
// сделать классы наслдники cat, dog, абстрактный метод реакции друг на друга в зависимости от дистанции к человеку.
public class Pet {
    String name;
    String type; // вид питомца
    String voice; // издаёт ли звуки
    int distance; // местонахождение от человека.

    public Pet(String name, String type, String voice, int distance) {
        this.name = name;
        this.type = type;
        this.voice = voice;
        this.distance = distance;
    }

    void showInfo() {
        System.out.println(name + " (" + type + "), " + voice + ", distance: " + distance);
    }


}
