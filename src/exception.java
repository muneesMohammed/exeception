public class exception {

    public static void main(String[] args) {
        try{
            int a=45,b=0;
            int c=a/b;
            System.out.println("result "+c);
        }catch (ArithmeticException e){
            System.out.println("can't divide by zero");

        }
        try {
            int num=Integer.parseInt("sneha");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("Number format exception");
        }
        try{
            int a[]=new int[5];
            a[7]=9;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" array index out of bounds");
        }
    }
}