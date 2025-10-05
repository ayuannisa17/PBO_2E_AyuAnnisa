package tugas3;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        
        encap.setAge(15);
        System.out.println("Tes Age 15 : " + encap.getAge()); 

        encap.setAge(25);
        System.out.println("Tes Age 25 : " + encap.getAge()); 

        encap.setAge(35);
        System.out.println("Tes Age 35 : " + encap.getAge());
    }
}
