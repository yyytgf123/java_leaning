public class section13 {

    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1", 17, 80);

        Student student2 = new Student();
        initStudent(student2, "학생2",18,90);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade=grade;
    }

    static void printStudent(Student student1) {
        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age +
                            " 성적 : " + student1.grade);
    }
}
