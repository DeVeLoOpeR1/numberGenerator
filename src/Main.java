import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Character,Character> numberPair = new HashMap<Character,Character>();
        numberPair.put('1','6');
        numberPair.put('2','7');
        numberPair.put('3','8');
        numberPair.put('4','9');
        numberPair.put('5','0');
        numberPair.put('6','1');
        numberPair.put('7','2');
        numberPair.put('8','3');
        numberPair.put('9','4');
        numberPair.put('0','5');

        System.out.println("Please Enter Jodi Digit ");
        String jodiInput = sc.next();

        char[] digit = jodiInput.toCharArray();
        char[] jodi = new char[2];
        for(int i=0;i<digit.length;i++){
            jodi[i] = numberPair.get(digit[i]);
        }
        System.out.println("Jodi values ");
        for(char value : jodi){
            System.out.println(value);
        }
        Set<String> result = new TreeSet<String>();
        result.add(""+digit[0]+digit[1]);
        result.add(""+digit[1]+digit[0]);
        result.add(""+jodi[0]+jodi[1]);
        result.add(""+jodi[1]+jodi[0]);
        result.add(""+digit[0]+jodi[1]);
        result.add(""+jodi[1]+digit[0]);
        result.add(""+digit[1]+jodi[0]);
        result.add(""+jodi[0]+digit[1]);

        System.out.println("Final jodi output...  "+result.toString());


    }
}