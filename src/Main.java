
public class Main {
    public static void main(String[] args) {

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println();

        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println();

        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        System.out.println();

        int agePerson = 9;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад");
        }
        if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу");
        }
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в университет");
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу");
        }

        System.out.println();

        int ageChildren = 14;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChildren >= 5 && ageChildren <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChildren > 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println();

        int ticket = 101;
        if (ticket >= 1 && ticket <= 102) {
            if (ticket >= 1 && ticket <= 60) {
                System.out.println("У Вас билет №" + ticket + " Вы поедите сидя");
            } else {
                System.out.println("У Вас билет №" + ticket + " Вы поедите стоя");
            }
        } else {
            System.out.println("В вагоне нет мест, он полностью забит");
        }

        System.out.println();

        int one = 1;
        int two = 50;
        int three = 3;
        if (one > two && one > three || two > one && two > three) {
            if (one > two) {
                System.out.println("Число " + one + " больше числа " + two + " и больше числа " + three);
            } else {
                System.out.println("Число " + two + " больше числа " + one + " и больше числ а" + three);
            }
        } else {
            System.out.println("Число " + three + " больше числа " + one + " и больше числа " + two);
        }
    }
}