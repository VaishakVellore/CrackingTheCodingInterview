/*StringRotation:Assumeyouhaveamethodi5Sub5tringwhichchecksifonewordisasubstring of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one call to i5Sub5tring (e.g., "waterbottle" is a rotation of" erbottlewat").
 * */

package Arrays_Strings;

public class StringRotation {

    static boolean isRotation(String s1, String s2, int rotation)
    {
        if(s1.length() != s2.length())
            return false;

        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        for( int i =0; i<= rotation; i++)
        {
            x.append(s1.charAt(i));
        }

        for( int i =rotation; i<=s1.length()-1; i++)
        {
            y.append(s1.charAt(i));
        }
        y = y.append(x);
        String result = y.toString();

        for(int i = 0; i<result.length()-1;i++){
            if(result.charAt(i) != s2.charAt(i) )
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "rbottlewate";
        int rotation = 4;

        boolean output = isRotation(s1,s2, rotation);
        System.out.println(output);
    }
}
