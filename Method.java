public class Method{


    public static void div(){

        int a = 8 ,b = 16;
        System.out.println(a/b);
    }

   public static void Mul(){

       int a = 2 ,b = 16;
       System.out.println(a*b);
   }
   

    public static void Add(){
      
      int a = 4 , b = 2;
      System.out.println(a+b);

    }
    public static void main(String args[]){

  Method mtd = new Method();    //object
  mtd.Sub();
  mtd.Add();
  mtd.Mul();
  mtd.div();
    }

    void Sub()           //method 
    {
        System.out.println("Hello world: ");
    }
}