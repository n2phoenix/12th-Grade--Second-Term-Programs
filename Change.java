import java.util.*;
class Change
{
    String str;
    String newstr;
    int len;

    Change()
    {
        str = "";
        newstr = "";
        len = 0;
    }

    void inputword()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter string: ");
        str = in.nextLine();
        str = str.trim();
        len = str.length();
        recchange (0);
    }

    char caseconvert (char ch)
    {
        int x = ch;
        if (x >= 65 && x <= 90)
            x += 32;
        else if (x >= 97 && x <= 122)
            x -= 32;

        ch = (char) x;
        return ch;
    }

    void recchange (int a)
    {
        if (a < len)
            newstr += caseconvert (str.charAt (a)) + "";
        else
        {
            display();
            return;
        }
        recchange (a + 1);
    }

    void display()
    {
        System.out.println ("Original: " + str);
        System.out.println ("Toggled: " + newstr);
    }
}