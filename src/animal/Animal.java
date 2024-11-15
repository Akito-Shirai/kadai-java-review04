package animal;

public class Animal {
    // フィールド
    private String name;
    private int age;

    // コンストラクタ
    public Animal() {}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }

    // getter and setter
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

}
