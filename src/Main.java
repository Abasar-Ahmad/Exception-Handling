import javax.sql.rowset.spi.SyncFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* ismai int a=5/0; hai jo ki infinite loop mai chala jaye ga jis vajah se ye ArithmeticException mai
       chala jayega , try mai ab jo dusra statement hai arr[6] print karne vala vo vala print nhi hoga kiyo ki
       statement a=5/0; mai hi atak jayega .
       exception likhne ka fayda ye hota hai ki jab laks of code rahega and koi naya banda aayega job pe to
       agar pahle se pta ho ki kis types ki exception hai to use asani hogi otherwise usko bahut se code padhna
       padega.
        */

      /*
       System.out.println("A");
        int arr[]={1,2,3,4};
        try{
            int a=5/0;
            System.out.println(arr[6]);
        }
        // try agar run na ho raha to catch uska exception type bataye ga or print krega apne andar
        catch (ArithmeticException e)
        {
            System.out.println("B");
        }
        // agar koi exception milta hai or agar uska catch nhi milta hai tab bhi finally run karega
        // finally all condintion mai run karega
        finally {
            System.out.println("C");
        }
        System.out.println("D");
        */



       /*
        System.out.println("A");
        int arr[]={1,2,3,4};
        try {
            System.out.println(arr[6]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("B");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("E");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");
        */



       /* // agar ArrayIndexOutOfBoundsException error hai , or catch mai uska naam nhi hai tab bhi error dega
        System.out.println("A");
        int arr[]={1,2,3,4};
        try {
            System.out.println(arr[6]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");

        */


       /*
        // agar exception ka naam na diya hai to aap sirf Exception likh sakte hai

        System.out.println("A");
        int arr[]={1,2,3,4};
        try {
            System.out.println(arr[6]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("B");
        }

        catch (Exception e)
        {
            System.out.println("K");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");
        */

        // yaha pe jab ham fun ko call krainge tab ArithmeticException kr ke ek error aayega
        // jisko solvo karne ke liye ham Exception handling ka use kainge
        System.out.println("A");
            fun();
        System.out.println("B");

        /*
        System.out.println("A");
        try {
            fun();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("GGG");
        }
        catch (ArithmeticException e)
        {
            System.out.println("This is ArithmaticEception");
        }
        System.out.println("B");

         */

    }

    // i have create a function where we have  a Arithmetic Exception mistake a=5/0;
    public static int fun()
    {
        int a=5/0;

        return 10;
    }
}