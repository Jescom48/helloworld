public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println();

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println();

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println();

        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        System.out.println();

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        System.out.println();

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var allSumWeightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println("Общая масса боксеров = " + allSumWeightBoxers);
        var massDifferenceBoxers = weightBoxer2 / weightBoxer1;
        System.out.println("Разница между массами бойцов = " + massDifferenceBoxers);

        System.out.println();

        var divisionWeight = weightBoxer2 % weightBoxer1;
        System.out.println("Остаток от деления = " + divisionWeight);

        System.out.println();

        var time = 640;
        var worker = time / 8;
        System.out.println("Всего работников в компании - " + worker + " человек");
        worker = worker + 94;
        time = worker * 8;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + time + " часов работы может быть поделено между сотрудниками.");



        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4L;
        float e = 5f;
        double f = 6.0;

        System.out.println("Значение переменной a с типом Int равно " + a);
        System.out.println("Значение переменной b с типом Byte равно " + b);
        System.out.println("Значение переменной c с типом Short равно " + c);
        System.out.println("Значение переменной d с типом Long равно " + d);
        System.out.println("Значение переменной e с типом Float равно " + e);
        System.out.println("Значение переменной f с типом Double равно " + f);

        System.out.println();

        float one = 27.12f;
        long two = 987678965549L;
        double three = 2.786;
        short four = 569;
        short five = -159;
        int six = 27897;
        byte seven = 67;

        System.out.println();

        byte studentsLudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        short sheetPapers = 480;
        int calculation = sheetPapers / (studentsLudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna);

        System.out.println("На каждого ученика расчитано " + calculation + " листов бумаги");

        System.out.println();

        byte productiveMachine = 16;
        int productiveMachineInMinutes = productiveMachine / 2;
        short timeOneDayInMinutes = 24 * 60;
        int timeTheeDayInMinutes = timeOneDayInMinutes * 3;
        int timeOneMonthInMinutes = timeOneDayInMinutes * 30;
        int productiveIn20Minutes = productiveMachineInMinutes * 20;
        int productiveInDay = productiveMachineInMinutes * timeOneDayInMinutes;
        int productiveInThreeDay = productiveMachineInMinutes * timeTheeDayInMinutes;
        int productiveInOneMonth = productiveMachineInMinutes * timeOneMonthInMinutes;

        System.out.println("За 20 минут машина произвела " + productiveIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + productiveInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productiveInThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + productiveInOneMonth + " штук бутылок");

        System.out.println();

        byte paint = 120;
        byte paintWhite = 2;
        byte paintBrown = 4;
        int repairClass = paintWhite + paintBrown;
        int allRepairClass = paint / repairClass;
        int allPaintWhite = allRepairClass * paintWhite;
        int allPaintBrown = allRepairClass * paintBrown;

        System.out.println("В школе, где " + allRepairClass + " классов, нужно " + allPaintWhite + " банок белой краски и " + allPaintBrown + " банок коричневой краски");

        System.out.println();

        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte egg = 4;
        int allProductGram = (bananas * 80) + (milk / 100 * 105) + (iceCream * 100) + (egg * 70);
        float allProductsKg = allProductGram / 1000f;

        System.out.println("Вес спортзавтрака " + allProductGram + " грамм или " + allProductsKg + " кг");

        System.out.println();

        byte resetKg = 7;
        double resetIn250GramInDay = resetKg / 0.25;
        float resetIn500GramInDay = resetKg / 0.5f;
        double averageDays = (resetIn250GramInDay + resetIn500GramInDay) / 2;

        System.out.println("Если худеть по 250 грамм, потребуется " + resetIn250GramInDay + " дней");
        System.out.println("Если худеть по 500 грамм, потребуется " + resetIn500GramInDay + " дней");
        System.out.println("В среднем потребуется " + averageDays + " дней");

        System.out.println();

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double increaseSalaryMasha = salaryMasha * 1.1;
        float increaseSalaryDenis = salaryDenis * 1.1f;
        double increaseSalaryKristina = salaryKristina * 1.1;
        double differenceSalaryMasha = increaseSalaryMasha * 12 - salaryMasha * 12;
        double differenceSalaryDenis = increaseSalaryDenis * 12 - salaryDenis * 12;
        double differenceSalaryKristina = increaseSalaryKristina * 12 - salaryKristina * 12;

        System.out.println("Маша теперь получает " + increaseSalaryMasha + " рублей. Годовой доход вырос на " + differenceSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + increaseSalaryDenis + " рублей. Годовой доход вырос на " + differenceSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + increaseSalaryKristina + " рублей. Годовой доход вырос на " + differenceSalaryKristina + " рублей.");
    }
}