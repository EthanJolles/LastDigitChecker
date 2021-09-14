public class Main
{

    public static void main(String[] args)
    {
    }

    public static boolean checkRange(int x)
    {
        return(x>=10 && x<=1000);
    }

    public static boolean checkLast(int x, int y)
    {
        return(x%10==y%10);
    }

    public static boolean hasSameLastDigit(int x, int y, int z)
    {
        if(checkRange(x) && checkRange(y) && checkRange(z))
        {
            return((checkLast(x,y)) || (checkLast(x, z) || checkLast(y, z)));
        }
        return false;
    }
}
