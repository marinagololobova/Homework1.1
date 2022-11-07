public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание 4:");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 4;
        System.out.println(friend);

        System.out.println("Задание 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6:");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var weightOfBoxers = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов = " + weightOfBoxers + " кг.");
        var difference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов = " + difference + " кг.");

        System.out.println("Задание 7:");
        var difference1 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница между весами бойцов = " + difference1 + " кг.");

        System.out.println("Задание 8:");
        var sumHours = 640;
        var hours = 8;
        var workers = sumHours / hours;
        System.out.println("Всего работников в компании – " + workers + " человек.");
        var workers1 = workers + 94;
        var sumHours1 = workers1 * hours;
        System.out.println("Если в компании работает " + workers1 + " человек, то всего " + sumHours1 + " часов работы может быть поделено между сотрудниками.");

    }
}