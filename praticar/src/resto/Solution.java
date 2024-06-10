package resto;

public class Solution {
    public static int century(int number) {
        // your code goes her
        String numberString = String.valueOf(number);
        if(number%100 == 0) {
            if(numberString.length() > 3)
                number = Integer.valueOf(numberString.substring(0,2));
            else  number = Integer.valueOf(numberString.substring(0,1));
        } else if (numberString.length() > 3){
            number = Integer.valueOf(numberString.substring(0,2));
            number++;
            System.out.println(number);
        }else if (number>=100){
            number = Integer.valueOf(numberString.substring(0,1));
            number++;
        }else number=1;

        return number;
    }
}
