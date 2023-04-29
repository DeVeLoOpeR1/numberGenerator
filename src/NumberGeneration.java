import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NumberGeneration {

    public void numberGenerator()
    {
        Set<String> validNumber = new HashSet<>();
        Set<String> sP = new HashSet<>();
        Set<String> dP = new HashSet<>();
        Set<String> tP = new HashSet<>();
        String[] numbers = generateThreeDigitNumber();
        for (String number : numbers) {
            validNumber.add(orderData(number));
        }
        System.out.println("All Valid Number Are And There Size ....." + validNumber.size());
        System.out.println(validNumber.toString());

        for(String number : validNumber){
            int freq = frequencyCheck(number);
            if(freq == 2)
            {
                dP.add(number);
            } else if (freq ==3) {
                tP.add(number);
            }
            else {
                sP.add(number);
            }
        }
        System.out.println(" Size of the single paan "+sP.size());
        System.out.println(sP.toString());

        System.out.println(" Size of the Double paan "+dP.size());
        System.out.println(dP.toString());

        System.out.println(" Size of the Triple paan "+tP.size());
        System.out.println(tP.toString());
    }
    public  int frequencyCheck(String number) {
        int maxFreq = 0;
        HashMap<Character, Integer> frequencyTable = new HashMap<>();
        char[] digits = number.toCharArray();
        for (char digit : digits) {
            if (frequencyTable.containsKey(digit)) {
                frequencyTable.put(digit, frequencyTable.get(digit) + 1);
                if (maxFreq < frequencyTable.get(digit)) {
                    maxFreq = frequencyTable.get(digit);
                }
            } else {
                frequencyTable.put(digit, 1);
            }
        }
        return maxFreq;
    }

    public  String[] generateThreeDigitNumber() {
        String[] numbers = new String[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = String.format("%03d", i);
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    public  String orderData(String number) {
        String sortedNumber = sortDigits(number);
        return sortedNumber;
    }

    public  String sortDigits(String number) {
        char[] digits = number.toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }

}