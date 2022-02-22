
public class MaximumOccurringCharacter  {
    //Return maximum occurring character in an input string

    static final int ASCII_SIZE = 256;
    static char getMax(String input){
        int[] count = new int[ASCII_SIZE];
        int len = input.length();
        for(int i =0; i < len; i++){
            count[input.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for(int i = 0; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
                result = input.charAt(i); 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String iString = "jgty";
        System.out.println(getMax(iString));
    }
}
