
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();



    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        boolean ageNorm = age>=18;
        if(ageNorm){
            System.out.println("Если возраст человека равен "+age+" ,то он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен "+age+" ,то он не достиг совершеннолетия, нужно немного" +
                    " подождать");
        }


    }
    public static void task2() {
        System.out.println("Задача 2");
    int temp = 6;
    boolean todayWarm = temp>5;
    if (todayWarm){
        System.out.println("На улице " + temp +" градусов, можно идти без шапки");
    }else{
        System.out.println("На улице " + temp +" градусов, нужно надеть шапку");
    }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed=50;
        boolean speedNorm=speed<60;
        if(speedNorm){
            System.out.println("Если скорость,"+speed+" то можно ездить спокойно");
        }else{
            System.out.println("Если скорость,"+speed+" то придется заплатить штраф");
        }

    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 33;
        boolean kindergarten = age>=2 && age<=6;
        if(kindergarten){
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в детский сад");
        }
        boolean school = age>=7 && age <=18;
        if(school){
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в школу");
        }
        boolean university = age>=18 && age<=24;
        if(university){
            System.out.println("Если возраст человека равен "+age+" , то его место в университете");
        }else{
            System.out.println("Если возраст человека равен "+age+" , то ему пора ходить на работу");
        }


    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 12;
        boolean mustNot = age <=5;
        if(mustNot){
            System.out.println("Если возраст ребенка равен "+age+" то ему нельзя кататься");
        }
        boolean withAdult = age>5 && age<14;
        if (withAdult){
            System.out.println("Если возраст ребенка равен "+age+" то ему можно кататься на " +
                    "аттракционе в сопровождении взрослого");
        }else {
            System.out.println("Если возраст ребенка равен "+age+" то ему можно кататься на " +
                    "аттракционе без сопровождения взрослого");
        }


    }
    public static void task6() {
        System.out.println("Задача 6");
        int totalSeats = 102;
        int seatPlace = 60;
        int people =70;
        boolean noPlace = people>totalSeats;
        boolean thereIsSeatPlace = people<seatPlace;
        if(noPlace){
            System.out.println("Вагон полностью забит");
        }
        if(thereIsSeatPlace){
            System.out.println("Есть сидячие места");
        }
        else {
            System.out.println("Остались только стоячие места");
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one=34;
        int two = 50;
        int three = 10;
        if (one>two && one>three){
            System.out.println(one);
        }
        if(two>one&& two> three){
            System.out.println(two);
        }else{
            System.out.println(three);
        }

    }
}