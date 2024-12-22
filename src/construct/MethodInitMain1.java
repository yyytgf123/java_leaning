package construct;

import java.lang.reflect.Member;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 16, 80);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 18, 90);

        MemberInit[] memberInits = {member1, member2};

        for(int i = 0; i < memberInits.length; i++) {
            System.out.println("이름 : " + memberInits[i].name + " 나이 : " + memberInits[i].age +
                                " 성적 : " + memberInits[i].grade);
        }
    }
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
