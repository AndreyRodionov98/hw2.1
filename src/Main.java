public class Main {
    public static void main(String[] args) {
        //Задание 6
        System.out.println("Задание6");

        var BoxersWeight1 = 78.2;
        var BoxersWeight2 = 82.7;
        var totalWeight = BoxersWeight1 + BoxersWeight2;
        System.out.println("Общий вес" + totalWeight + "кг");
        var differenceInWeight = BoxersWeight2 - BoxersWeight1;
        System.out.println("Разница в весе " + differenceInWeight + "кг");

        //Задание 7
        System.out.println("Задание 7");
        var DifferenceWeight = BoxersWeight2 % BoxersWeight1;
        System.out.println("Разница в весе через остаток от деления " + DifferenceWeight + "кг");

        //Задание 8
        System.out.println("Задание 8");
        var totalWork = 640;
        var worker1 = 8;
        var totalEmployees = totalWork / worker1;
        System.out.println("Всего работников в компании– " + totalEmployees + " человек");
        var TotalEmployees = totalEmployees + 94;
        var jobsForOne = totalWork * worker1;
        System.out.println("Если в компании работает " + TotalEmployees + " человека, то всего " +jobsForOne + " часа работы может быть поделено между сотрудниками");




    }
}