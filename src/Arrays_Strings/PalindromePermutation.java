package Arrays_Strings;

//Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
// A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of
// letters. The palindrome does not need to be limited to just dictionary words.

public class PalindromePermutation {

    static int getCharNumber(Character c)
    {
        int val = Character.getNumericValue('c');
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        if(a <= val && val<= z)
            return val -a;
        return -1;
    }

    static boolean ispalinperm(String s)
    {
        int odd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];
        for(char c : s.toCharArray()){
            int x = getCharNumber(c);
            if( x != -1)
            {
                table[x]++;
                if(table[x]%2 == 1)
                    odd++;
                else
                    odd--;

            }
        }
        return odd <= 1;
    }

    public static void main(String[] args) {
         String str = "taco cat";
         boolean result = ispalinperm(str);
         System.out.println(result);
    }
}
