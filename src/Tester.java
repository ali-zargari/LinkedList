public class Tester{
    public static void main(String [] args){
        SortedLinkedList sl = new SortedLinkedList();

        sl.insert(1);
        sl.insert(3);
        sl.insert(2);
        sl.insert(3);



        System.out.println(sl.getHeadData());
        System.out.println(sl.getTailData());
        System.out.println(sl.getAscending());
        System.out.println(sl.getDescending());

        System.out.println(sl.isSorted());



    }
}