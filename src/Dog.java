public class Dog {
    private String name;
    private int age;
    private boolean domestic;
    public Dog(){}
    public Dog (String a, int b, boolean c){
        this.name = a;
        this.age = b;
        this.domestic = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }
}
