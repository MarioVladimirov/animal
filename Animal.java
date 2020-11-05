package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected String produceSound() {
        return "";
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        sb.append(getName()).append(" ").append(getAge()).append(" ").append(this.gender).append(System.lineSeparator());
        sb.append(this.produceSound());
        return sb.toString();

    }


}
