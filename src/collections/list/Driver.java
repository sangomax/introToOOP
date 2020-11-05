package collections.list;


import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);

        System.out.println(ll);

        ll.remove(3);

        System.out.println(ll);

        ll.remove(new Integer(7));

        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);


        System.out.println(ll.getHead());
        System.out.println(ll.getTail());


        MyLinkedList<Integer> ll2 = new MyLinkedList<>();

        ll2.addFirst(1);
        ll2.addLast(1);
        ll2.addLast(2);
        ll2.addLast(3);
        ll2.addLast(1);
        ll2.addLast(5);
        ll2.addLast(1);
        ll2.addLast(2);

        System.out.println(ll2.lastIndexOf(1));

        MyLinkedList<Integer> ll3 = new MyLinkedList<>();
        ll3.addFirst(getRandomNumber(50));
        for (int i = 0; i < 20; i++) {
            ll3.addLast(getRandomNumber(50));
        }

        System.out.println(ll3);
        long tempoInicial = System.currentTimeMillis();
        ll3.reverse();
        System.out.println("o metodo reverse executou em " + (System.currentTimeMillis() - tempoInicial));

        System.out.println(ll3);

        tempoInicial = System.currentTimeMillis();
        ll3.reverse2();
        System.out.println("o metodo reverse2 executou em " + (System.currentTimeMillis() - tempoInicial));

        System.out.println(ll3);

    }

    public static Integer getRandomNumber(int maxNum) {
        Random random = new Random();
        Integer num = random.nextInt(maxNum);
        return num > 0 ? num : getRandomNumber(maxNum);
    }

}