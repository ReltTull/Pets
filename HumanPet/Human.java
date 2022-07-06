package HumanPet;

/**
 * Человек. Может звать питомца. Если питомец кошка - зов "кис-кис", собака - свист.
 */
public class Human {
    String name;
    String voiceState; // зовёт ли кого-нибудь.

    public Human(String name, String voiceState) {
        this.name = name;
        this.voiceState = voiceState;
    }
    void displayInfo(){
        System.out.println(name + ", " + voiceState);
    }

    Pet pet = new Pet("name", "cat", "silent", 0);
    public void callAPet(Pet pet) {
        switch (pet.type) { // как сделать, чтобы на данном методе реагировали все питомцы выбранного типа без ручного ввода реакции?
            case ("cat"):
                pet.voice = "Meow";
                voiceState = "ks ks ks";
                if (pet.distance - 2 > 0) {
                    pet.distance -= 2;
                } else {
                    pet.distance = 0;
                }
                break;
            case ("dog"):
                pet.voice = "barking";
                voiceState = "whistling";

                if (pet.distance - 2 > 0) {
                    pet.distance -= 3;
                } else {
                    pet.distance = 0;
                }
                break;
            default:
                break;
        }
    }

}