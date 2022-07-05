/*Schedule a task using scheduleatFixedRate*/
import java.util.concurrent.*;
class BeepClock implements Runnable{
    public void run()
    {
        System.out.println("Schedule has started");
    }
    public static void main(String[] args)
    {
        ScheduledExecutorService scheduler= Executors.newSingleThreadScheduledExecutor();
        Runnable task= new BeepClock();
        int init=6,perd=3;
        scheduler.scheduleAtFixedRate(task,init,perd,TimeUnit.SECONDS);
    }
}
