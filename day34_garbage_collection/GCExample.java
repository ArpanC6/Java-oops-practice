public class GCExample {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object collected by GC");
    }

    public static void main(String[] args) {

        GCExample obj = new GCExample();
        obj = null;   // eligible for GC

        System.gc();  // GC request
    }
}
