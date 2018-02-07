public class NumberFun
{
    public static void main(String[] args)
    {
        System.out.println(NumberFun.findNextSquare(10000));
        
    }
    
    public static long findNextSquare(long sq)
    {
        long output = -1;
        Long input = new Long(sq);
        if(Math.floor(input.doubleValue()) == input.doubleValue())
        {
            output = new Double(Math.sqrt(input.doubleValue())).longValue() + 1;
            output *= output;
        }
        return output;
    }
}