package HomeworkCallCenter ;

public class Main{


    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            new Thread(new SemaphoreRun(NameGenerator.generateName() + i, i)).start();
            Thread.sleep(400);
        }
    }

}