package lab12;

/**
 *
 * @author User
 */
public class maxvalue {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] a={10,20,30,40,50};
        Double[] b={1.1,2.2,3.3,4.4,5.5};
        max<Integer> obj1=new max<Integer>(a);
        max<Double> obj2=new max<Double>(b);
        Integer in=obj1.Max();
        Double db=obj2.Max();
        System.out.println("Minimum of integer array : "+in);
        System.out.println("Minimum of double array : "+db);
        
    }
}

class max<t extends Number>{
  t arr[];
  t max;
  maxx(t ar[])
  {
   arr=ar;
  }
  t Max()
  {
      max=arr[0];
      for(int i=0;i<arr.length-1;i++)
      {
        if(arr[i].intValue()>max.intValue())
        {
          max=arr[i];
        }
      }
   return max;
  }     
}
