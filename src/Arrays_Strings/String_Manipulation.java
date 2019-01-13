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
