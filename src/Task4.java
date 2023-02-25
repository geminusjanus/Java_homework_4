import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    Scanner sc = new Scanner(System.in);
    public void pushElementByIndex(){
        List<String> arr = new ArrayList<>(10000);
        try {
            for (var i = 0; i < 25000; i++)
                arr.add(null);
            for (int i = 0; i <= arr.size() - 1; i++) {

                String[] pr = sc.nextLine().split("~");
                String word = pr[0];
                int num = Integer.parseInt(pr[1]);
                if (word.equals("print")) {
                    arr.remove("print");
                    System.out.println(arr.get(num));
                }
                if (word.equals("fa")) {
                    arr.remove("fa");
                    System.out.println(arr.toString());
                    System.out.println(arr.size() - 1);
                }
                arr.add(num, word);
            }


        } catch (IndexOutOfBoundsException ex){
            throw new IndexOutOfBoundsException("Ты хочешь поставить строку на ");

        }
    }
}