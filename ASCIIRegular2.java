import java.util.Arrays;

public class ASCIIRegular2 {

    public static void main (String [] args) {

        exercise();
    }


    public static void exercise() {
        int[] tab = new int[32];
        char[] chars = new char[tab.length];
        charASCII(tab, chars);
        System.out.println("chars: " + Arrays.toString(chars));
    }
    public static char[] charASCII(int[] tab, char[] chars) {
        //Return an array of type char with characters from the ASCII table from the exclamation mark to the tilde character.
        //Omit numeric values from 0 to 9 and the alphabet.

        //Initializing the four arrays with different lengths each.
        //Note that each next array has a less length than the previous array

        int[] tab1 = new int[tab.length - 17];
        int[] tab2 = new int[tab1.length - 8];
        int[] tab3 = new int[tab2.length - 1];
        int[] tab4 = new int[tab3.length - 2];


        for (int i = 0; i < tab4.length; i ++) {                                    //As you see, a condition in a loop concerns an array with the shortest length
            tab4[i] = 123 + i;                                                      // Here we fill the shortest array.
            tab1[i] = 33 + i;                                                       // Note that we could start filling an array tab3 instead of tab1, then tab2 and then tab1. I started from 'tab1' according to the order of values from the ASCII table. 'tab1' stores values which occur in the ASCII table before values which are stored by remaining arrays(tab2, tab3, tab4)
            tab1[i + 4] = 37 + i;
            tab1[i + 8] = 41 + i;
            tab1[i + 11] = 44 + i;
            tab2[i] = 58 + i;
            tab2[i + 3] = 61 + i;
            tab3[i] = 91 + i;
            tab3[i + 2] = 93 + i;
            tab[i] = tab1[i];                                                       // Here we start to fill an array tab. By this code we fill the first four indices of tab('i' = 0,1,2,3)
            tab[i + 4] = tab1[i + 4];
            tab[i + 8] = tab1[i + 8];
            tab[i + 11] = tab1[i + 11];
            tab[i + tab1.length] = tab2[i];
            tab[i + tab1.length + 3] = tab2[i + 3];
            tab[i + tab1.length + 7] = tab3[i];
            tab[i + tab1.length + 9] = tab3[i + 2];
            tab[i + tab1.length + 13] = tab4[i];                                    // Filling of the last four indices of an array tab
            chars[i] = (char) tab[i];                                               // Filling of the first four indices of a char array
            chars[i + 4] = (char) tab[i + 4];
            chars[i + 8] = (char) tab[i + 8];
            chars[i + 11] = (char) tab[i + 11];
            chars[i + tab1.length] = (char) tab[i + tab1.length];
            chars[i + tab1.length + 3] = (char) tab[i + tab1.length + 3];
            chars[i + tab1.length + 7] = (char) tab[i + tab1.length + 7];
            chars[i + tab1.length + 9] = (char) tab[i + tab1.length + 9];
            chars[i + tab1.length + 13] = (char) tab[i + tab1.length + 13];         // A char array is filled

        }

        System.out.println("exercise: ");
        System.out.println("tab1: " + Arrays.toString(tab1));
        System.out.println("tab2: " + Arrays.toString(tab2));
        System.out.println("tab3: " + Arrays.toString(tab3));
        System.out.println("tab4: " + Arrays.toString(tab4));
        System.out.println("tab: " + Arrays.toString(tab));

        return chars;
    }
}
