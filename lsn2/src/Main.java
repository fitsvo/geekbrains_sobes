import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList aaa = new ArrayList(List.of(new Integer[]{1, 2, 3, 4}));
        System.out.println((int) aaa.get(2));
        System.out.println(aaa.size());
        System.out.println(aaa.contains(2));
        System.out.println(aaa.indexOf(5));
        LinkedList a = new LinkedList(List.of(new Integer[]{1, 2, 3, 4}));
        System.out.println((int) a.get(3));
        System.out.println(a.size());
        System.out.println(a.contains(2));
        System.out.println(a.indexOf(1));
    }

}
