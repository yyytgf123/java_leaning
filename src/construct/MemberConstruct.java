package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 name = " + name + " 나이 : " + age  + " 성적 : " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
