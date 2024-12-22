package construct;

public class MemberConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct memberConstruct = new MemberConstruct("학생1" ,  17);
        MemberConstruct memberConstruct2 = new MemberConstruct("학생1" ,  16, 80);

        MemberConstruct[] memberConstructs = {memberConstruct, memberConstruct2};

        for(int i = 0; i < memberConstructs.length; i++) {
            System.out.println("이름 : " + memberConstructs[i].name + " 나이 : " + memberConstructs[i].age +
                    " 성적 : " + memberConstructs[i].grade);
        }
    }
}

