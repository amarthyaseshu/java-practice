package gc;

class MyClass {
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize method called");
        } finally {
            super.finalize();
        }
    }
}