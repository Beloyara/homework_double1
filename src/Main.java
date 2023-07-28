// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var dog1 = dog + 4;
        System.out.println(dog1);
        cat = cat + 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);
        dog1 -= 3.5;
        System.out.println(dog1);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);
        //создаю новую ветку
var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        var difference1 = boxer2 - boxer1;
        System.out.println("Разница в весе " + difference1 + " кг");
        var difference2 = boxer2 % boxer1;
        System.out.println("Разница в весе " + difference2 + " кг");

        var totalTimeOfEmployeers = 640;
        var oneEmployeer = 8;
        var numberOfEmployeers = totalTimeOfEmployeers / oneEmployeer;
        System.out.println("Всего работников в компании " + numberOfEmployeers + " человек");
        numberOfEmployeers += 94;
        System.out.println(numberOfEmployeers);
        var newTotalTimeOfEmployeers = numberOfEmployeers * oneEmployeer;
        System.out.println("Если в компании работает " + numberOfEmployeers + " человек, то всего " + newTotalTimeOfEmployeers + " часов работы может быть поделено между сотрудниками");
    }
}