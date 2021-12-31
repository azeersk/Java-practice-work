public class mainClassObj {
    public static void main(String[] args){
        try{
            int a = 5;
            for(int i = 0; i<=a; i++){
                System.out.println(10/(a-i));
            }
        }
        catch (Exception e){
            System.out.println("Exception is: "+e);
        }
        finally {
            System.out.println("this is finally block!");
        }
    }
}
