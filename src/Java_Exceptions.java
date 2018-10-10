public class Java_Exceptions {

    public static void main(String[] args) {
        int a[] = new int[2];

        try {
            System.out.println("Access element 3 in the array" + a[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: " +e);
        }finally {
            a[0] = 6;
            System.out.println("The first element of the array is : " +a[0]);
            System.out.println("This is where the FINALLY statement is executed");
        }
    }

}
