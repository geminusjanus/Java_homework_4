import java.util.*;



public class Task3 {
    static Random random = new Random();

    public  void removeAllEvens(){
        ArrayList<Integer> inst = new ArrayList<Integer>(20);

        for (int i = 0; i < 20; i++) {
            inst.add(random.nextInt(100));
        }
        System.out.println(inst.toString());
        Integer num = inst.iterator().next();
        for (int i = 0; i < 20; i++) {
            if(num % 2 == 0){
                inst.remove(num);
            }
        }

        System.out.println(inst.toString());

    }

    public  void findMinimalInArray(){
        ArrayList<Integer> inst = new ArrayList<Integer>(20);

        for (int i = 0; i < 20; i++) {
            inst.add(random.nextInt(100));
        }
        System.out.println(inst.toString());
        int minVal = inst.get(0);
        int maxVal = inst.get(0);
        int sum = 0;
        for (Integer i : inst){
            if(i < minVal) minVal = i;
            else if(maxVal < i) maxVal = i;
            sum += i;

        }
        inst.sort(Comparator.naturalOrder());
        System.out.println(inst.toString());

        System.out.println();
        System.out.printf("minimal value = %d, maximal value = %d\nсреднее арифметическое = %d", minVal, maxVal, sum / inst.size());

    }

}