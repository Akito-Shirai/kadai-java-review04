package animal;

public class Human extends Animal implements Thinkable {

    // メンバ変数
    private String hobby;

    // コンストラクタ
    public Human() {}
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    // メソッド
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

    // getter、setter
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


}
