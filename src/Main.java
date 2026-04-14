public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " +dog);
        System.out.println("cat = " +cat);
        System.out.println("paper = " +paper);

        System.out.println();

        dog = dog+4;
        cat = cat+4;
        paper = paper+4;

        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        System.out.println();

        dog = dog-3.5;
        cat = cat-1.6;
        paper = paper-7639;

        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);

        System.out.println();

        var friend = 19;
        System.out.println("friend = "+friend);
        friend = friend+2;
        System.out.println("friend = "+friend);
        friend = friend/7;
        System.out.println("friend = "+friend);

        System.out.println();

        var frog = 35.0;
        System.out.println("frog = "+frog);
        frog = frog*10;
        System.out.println("frog = "+frog);
        frog = frog/3.5;
        System.out.println("frog = "+frog);
        frog = frog+4;
        System.out.println("frog = "+frog);

        System.out.println();

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println("Общая масса боксеров = "+(weightBoxer1+weightBoxer2));
        System.out.println("Разница между массами бойцов = "+(weightBoxer2/weightBoxer1));

        System.out.println();

        var divisionWeight = weightBoxer2%weightBoxer1;
        System.out.println("Остаток от деления = "+divisionWeight);

        System.out.println();

        var time = 640;
        var worker = time/8;
        System.out.println("Всего работников в компании - "+worker+" человек");
        worker = worker+94;
        time = worker*8;
        System.out.println("Если в компании работает "+worker+" человек, то всего "+time+" часов работы может быть поделено между сотрудниками.");





    }
}