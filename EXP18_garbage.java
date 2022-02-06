public class EXP18_garbage
{  
    public void finalize()
    {
        System.out.println("object is garbage collected");
    }  
    public static void main(String args[])
    {  
        EXP18_garbage s1=new EXP18_garbage();  
        EXP18_garbage s2=new EXP18_garbage();  
        s2=s1;  
        s1=null;
        System.gc();  
    }
}     