public class class1 {
    public static void main(String[] args) {
        Student studnet1 = new Student();
        studnet1.name = "학생1";
        studnet1.age = 15;
        studnet1.grade = 80;

        Student studnet2 = new Student();
        studnet2.name = "학생2";
        studnet2.age = 17;
        studnet2.grade = 90;

        Student[] students = {studnet1, studnet2};

//        for(int i = 0 ; i < students.length; i ++) {
//            Student s = students[i];
//            System.out.println("이름 : " + s.name + "나이 : " + s.age +
//                    "성적 : " + s.grade);
//
//        }

        for(Student s : students) {
            System.out.println("이름 : " + s.name + "나이 : " + s.age +
                    "성적 : " + s.grade);
        }
    }
}