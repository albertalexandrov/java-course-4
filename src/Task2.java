import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random randomizer = new Random();
        String kamen = "камень";
        String nozhnicy = "ножницы";
        String bumaga = "бумага";
        String[] choices = {kamen, nozhnicy, bumaga};
        String vasya_choice = choices[randomizer.nextInt(choices.length)];
        System.out.format("Выбор Васи: `%s`\n", vasya_choice);
        String petya_choice = choices[randomizer.nextInt(choices.length)];
        System.out.format("Выбор Пети: `%s`\n", petya_choice);
        if (vasya_choice.equals(petya_choice)) {
            System.out.println("Ничья");
        } else if ((vasya_choice.equals(kamen) && petya_choice.equals(nozhnicy)) || (vasya_choice.equals(nozhnicy) && petya_choice.equals(bumaga)) || (vasya_choice.equals(bumaga) && petya_choice.equals(kamen))) {
            System.out.println("Победил Вася");
        } else {
            System.out.println("Победил Петя");
        }
    }
}
