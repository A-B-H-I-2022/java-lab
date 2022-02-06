import java.io.IOException;
class UserDef extends Exception
{
    UserDef(){} 
}

public class Exp20
 {
    public static void main(String args[])
    {
        try
        {
            throw new IOException();
        }
        catch (Exception ud)
        {
            System.out.println("Caught user defined exception from throw:"+ud);
        }

    }
}