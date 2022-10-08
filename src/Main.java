public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish ("shark", "ocean", 25 );


        System.out.println(fish.getName());
        System.out.println(fish.getWherelive());
        System.out.println(fish.getLivestory());

        Cat cat = new Cat ("tommy", 23, true);


        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.isDomestic());

        Dog dog = new Dog ("Fred", 5, true);

        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.isDomestic());
    }
}