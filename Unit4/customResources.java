public class customResources {
    public static void main(String[] args) {
        try (cusRes cr = new cusRes()) {
            System.out.println("Using custom resource");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
    }
}

class cusRes implements AutoCloseable {

    public void close() {
        System.out.println("Closing custom resource");
    }

}

class MyException extends Exception {
    public String getMessage() {
        return "This is a custom exception message.";
    }
}
