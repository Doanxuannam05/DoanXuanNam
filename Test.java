public class Test {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("doan xuan nam");
        ll.addFirst("CTDL va Giai thuat Java");
        ll.addFirst("TITV");
        //ll.traverse();

        ll.addLast("tran thuy duong ngu");
        // ll.traverse();

        ll.insertAfter("TITV", ".vn");
        ll.traverse();
        System.out.println("--------------");
        System.out.println(ll.remove(".VN"));
        System.out.println(ll.remove(".vn"));
        System.out.println("--------------");
        ll.traverse();

        System.out.println("--------------");
        System.out.println("Check empty "+ll.isEmpty());
        System.out.println("Size: "+ll.size());
    }
}
