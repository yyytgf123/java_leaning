package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println(data1.name + data1.count);

        Data3 data2 = new Data3("B");
        System.out.println(data2.name + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println(data3.name + data1.count);

        Data3 data4 = new Data3("D");
        int a = data4.count;

        data4.count = 20;
        System.out.println(a + " " + Data3.count);
        System.out.println(data4.count);

    }
}
