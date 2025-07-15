package ExceptionsHandling;

public class StackTrace {
    public static void main(String[] args) {

//        level1(); // got an exceptions error

        try {
            level1();
        }catch (ArrayIndexOutOfBoundsException x){
            System.out.println("Exceptions handled.");
            System.out.println("Stack Traced.");
        }
    }
    static void level3(){
         int arr[] = new int[5];
         arr[0] = 3;
         arr[5] = 10;
    }
    static void level2(){
        level3();
    }
    static void level1(){
        level2();
    }
}
