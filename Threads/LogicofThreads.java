
/*   Threads in Java : The JVM allows an application to have multiple threads running concurrently
    				   Each thread can execute parts of you code in parallel with the main thread
    				   Each thread has a priority.
    				   Threads with higher priority are executed in preference compared to threads with a lower priority

    		The Java Virtual Machine continues to execute threads until either of the following occurs
    			1. The exit method of class Runtime has been called
    			2. All user threads have died

    	    When a JVM starts up, there is a thread which calls the main method
    		This thread is called “main”


    	 */


public class LogicofThreads {
    public static void main(String[] args) {

        System.out.println(Thread.activeCount());   // checks how many thread is active now(normally current just main thread)

/* output will be 2 because there are other threads that are running in the background as part of the Java Virtual Machine (JVM) itself.
These system threads are managing various aspects of the JVM, such as
garbage collection, finalization,etc. even though you've only created one thread explicitly in your code,
there are other threads created and managed by the JVM itself,
leading to the count being more than 1. This is why Thread.activeCount() returns a count of 2.   */


        System.out.println(Thread.currentThread().getName()); // will prints the name of current threads
        Thread.currentThread().setName("My Main"); // changes the name of current thread



        Thread.currentThread().setPriority(1); // change the high of priority
        System.out.println(Thread.currentThread().getPriority()); // gives the number of priority


        System.out.println(Thread.currentThread().isAlive());  // checks our main thread is alive (output will be true or false)



    for (int i = 3; i > 0; i--) {
         System.out.println(i);
      try {
      Thread.sleep(1000); // between each element wait 1 second / we should write as millisecond  1000 milis = 1 second

        } catch (InterruptedException e) {
                System.out.println("Errorrr!!!!!!!!!!!!!!!!");
      }
    }
        System.out.println("Everything is okay!");









    }
}
