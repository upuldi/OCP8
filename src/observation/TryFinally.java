package observation;


public class TryFinally {

    private String tryAndFinallyDemoMethod() {

        try {
            System.out.println("Try");
            return "String";
        } finally {
            System.out.println("Finally ");
        }

        //You don't have to have a return statement here
    }

    /**
     * with the introduction of the catch block we are altering the flow, now the flow of control can jump into
     * the catch block from try block, So we need a return statement in there
     *
     * @return
     */
    private String tryCatchAndFinallyDemo() {

        try {
            System.out.println("Inside try");
            return "String";
        } catch (Exception e) {
            System.out.println("Inside catch");
            return "String";
        } finally {
            System.out.println("Inside finally");
        }
    }



    public static void main(String[] args) {

    }

}
