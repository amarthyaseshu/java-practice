package gc.alternatives;

class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}