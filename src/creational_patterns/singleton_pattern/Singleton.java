package creational_patterns.singleton_pattern;

/**
 * There will be only once instance of this class at all times
 */
public class Singleton {
    /*
        1. why static?
        The getInstance method needs to be static.
        And, non-static variables cannot be referenced from static context.
        2. why volatile?
        The instance variable's value should be visible to all the threads.
        Hence, by using volatile we are asking threads to get its value from main memory instead of CPU cache
     */
    private volatile static Singleton instance;

    private Singleton(){
        System.out.println("Inside the constructor..");
    }

    /*
        This method needs to be static since we can't have the object of Singleton to call it.
     */
    public static Singleton getInstance(){
        if(instance == null){//create instance only if its null
            synchronized (Singleton.class){//to make sure only instance is created in multithreaded application
                if(instance == null){//create instance only if its null
                    System.out.println("Creating new instance..");
                    instance = new Singleton();
                }
            }
        }
        //return existing instance otherwise
        return instance;
    }

}

