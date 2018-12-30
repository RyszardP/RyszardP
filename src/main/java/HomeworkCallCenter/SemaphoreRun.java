package HomeworkCallCenter;

import java.util.concurrent.Semaphore;


public class SemaphoreRun extends Clients implements Runnable  {

    //занято - true, свободно - false
    public static final int OPERATORS_QUANTITY = 3;
    private static final boolean[] FREE_OPERATORS = new boolean[OPERATORS_QUANTITY];
    private static final Semaphore SEMAPHORE = new Semaphore(OPERATORS_QUANTITY, true);
    public int operatorNumber;

    public SemaphoreRun(String clientName, int clientID) {
        super(clientName, clientID);
    }


    @Override
    public void run() {

        try {
            SEMAPHORE.acquire();

            //Ищем свободное место
            synchronized (FREE_OPERATORS) {
                for (int i = 0; i < OPERATORS_QUANTITY; i++) {
                    if (!FREE_OPERATORS[i]) {
                        FREE_OPERATORS[i] = true;
                        operatorNumber = i;
                        System.out.println("Client " + clientName + " is talking with operator " + i);
                        break;
                    }
                }
            }

            Thread.sleep(speakTimeMS);
            synchronized (FREE_OPERATORS) {
                if (operatorNumber != -1) {
                    FREE_OPERATORS[operatorNumber] = false;
                } else {
                    System.out.println(operatorNumber);
                }
            }

            SEMAPHORE.release();
            System.out.println("Client " + clientName + " finished talking");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
