public class Main {
    public static void main(String[] args) {

        System.out.println("hi");
        arraysAndLists a = new arraysAndLists();
        a.thingsArrayList2.add("cup");
        arraysAndLists.printArrayValue(0, a.thingsArray);
        System.out.println(a.thingsArrayList2.get(0));
        System.out.println(a.thingsArray.length);
        System.out.println(a.thingsArrayList2.size());
        System.out.println("break");
        System.out.println(a.thingsArrayList2.get(4));
        System.out.println();
        a.thingsArray[0] = "toothpick";
        a.thingsArrayList2.set(0, "toothpick");

        arraysAndLists.streamArrayList(a.thingsArrayList2);

        GenericPractice generic = new GenericPractice(50);
        generic.print();
    }
}
