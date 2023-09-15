public class Arrays
{
    public static void main(String[] args)
    {
        String[] StringArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int i = 0; i < StringArray.length; i++) {
            System.out.println(StringArray[i]);
        }
        for (int i = 0; i < StringArray.length; i++) {
            System.out.print(StringArray[i]);
        }
        for (int i = 0; i < StringArray.length; i++) {
            System.out.println(" ");
        }
        for (int i = 0; i < StringArray.length; i++) {
            System.out.print(StringArray[i]);
            if (i < StringArray.length-1) {
                System.out.print("-");
            }
        }
    }
}