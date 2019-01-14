/*Write a method to replace all spaces in a string with '%20'. You may assume that the string has
sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.)
        EXAMPLE
        Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith"*/


package Arrays_Strings;

public class String_Manipulation {

    public static String replaceSpaces(char[] s,int length)
    {
        int spaceCount = 0, index;
        for(int i = 0; i<length;i++){
            if(s[i] == ' ')
                spaceCount++;
        }

        index = length + spaceCount*2;

        if(length < s.length)
            s[length] = '\0';
        for(int i = length-1; i>=0 ; i--)
        {
            if(s[i] == ' ')
            {
                s[index - 1] = '0';
                s[index - 2] = '2';
                s[index - 3] = '%';
                index = index - 3;
            }
            else
            {
                s[index - 1] = s[i];
                index--;
            }
        }
        return new String(s);

    }

    public static void main(String[] args) {
         int trueLength = 13;
         String str = "Mr John Smith    ";
         //str = str.replaceAll("\\s","%20");
         char[] s = str.toCharArray();
         String output = replaceSpaces(s,trueLength);
         System.out.println(output);
    }
}
