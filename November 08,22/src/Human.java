public class Human {
    private String name;
    private int age;

    private String gender;
    private float height;
    private float weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void walking(){
        System.out.println(name + " is walking");
    }
    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " +height);
        System.out.println("Weight: " +weight);
    }
    public void talking(){
        System.out.println(name + " is speaking");
    }
    public void reading(){
        System.out.println(name + " is reading");
    }
}
