public class ArithmeticOperationDemo {
    
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        // create three threads for addition, subtraction, and multiplication
        Thread addThread = new Thread(new AddTask(a, b));
        Thread subThread = new Thread(new SubTask(a, b));
        Thread mulThread = new Thread(new MulTask(a, b));
        
        // start all three threads
        addThread.start();
        subThread.start();
        mulThread.start();
        
        // wait for all three threads to complete
        try {
            addThread.join();
            subThread.join();
            mulThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All arithmetic operations completed.");
    }
    
    // Runnable task for performing addition
    static class AddTask implements Runnable {
        private int a, b;
        
        public AddTask(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void run() {
            int sum = a + b;
            System.out.println("Addition result: " + sum);
        }
    }
    
    // Runnable task for performing subtraction
    static class SubTask implements Runnable {
        private int a, b;
        
        public SubTask(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void run() {
            int diff = a - b;
            System.out.println("Subtraction result: " + diff);
        }
    }
    
    // Runnable task for performing multiplication
    static class MulTask implements Runnable {
        private int a, b;
        
        public MulTask(int a, int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void run() {
            int prod = a * b;
            System.out.println("Multiplication result: " + prod);
        }
    }
}

