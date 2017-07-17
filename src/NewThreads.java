import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Lenovo on 17.07.2017.
 */
public class NewThreads {
    public static void main(String[] args) {
        new NewThreads();
    }



    private ExecutorService executorService;

    public NewThreads() {

//        executorService = Executors.newFixedThreadPool(20000);
//        executorService.execute(new TaskRunnable(1));
//        executorService.execute(new TaskRunnable(2));
//        executorService.execute(new TaskRunnable(3));
    }

    private class TaskRunnable implements Runnable {

        private int id;

        public TaskRunnable(int id){
            this.id = id;
        }

        @Override
        public void run() {
            for(int i = 0; i <= 1000; i++) {
                System.out.println("Jestem zadaniem " + id);
            }
        }

    }
}
