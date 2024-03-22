// Inheritance from Zoo
//override

class Animal {

    public int ID;
    public String Name;
    public int Age;


    public void giveWater(){
        System.out.println("Water was given");
    }
    public void getVaccinated() {
        System.out.println("the vaccine has been given");
    }

    public void giveFood() {
        System.out.println("Food was given ");
    }


}

class Horse extends Animal {

    public double legLength;
    public int speed;

    public void educate() {
        System.out.println("was educated");
    }

    @Override
    public void giveFood() {
        System.out.println("Oat was given");
    }
}
class Dog extends Animal {

    public void takeForWalk() {
        System.out.println("Walked together");
    }
    public void educate() {
        System.out.println("was educated");
    }

    @Override
    public void getVaccinated() {
        super.getVaccinated();
        System.out.println("the vaccine has been given");
    }

    @Override
    public void giveFood() {
        System.out.println("Meat was given");
    }
}
class Sheep extends Animal {

    public String color;


    @Override
    public void giveFood() {
        System.out.println("weed was given");
    }
}

public class Inheritance {
    public static void main(String[] args) {

         Dog dog = new Dog();
         Sheep sheep = new Sheep();
         Horse horse = new Horse();

        dog.getVaccinated();
        horse.getVaccinated();

        sheep.giveFood();
        horse.giveFood();


    }
}
