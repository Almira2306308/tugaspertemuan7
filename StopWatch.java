package stopwatch;

public class StopWatch {
    //atribut private
    private long startTime;
    private long endTime;

    //konstruktor tanpa argumen
    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    //method untuk reset startTime
    public void start(){
        startTime = System.currentTimeMillis();
    }

    //method untuk reset endTime
    public void stop(){
        endTime = System.currentTimeMillis();
    }

    //getter untuk startTime
    public long getStartTime(){
        return startTime;
    }

    //getter untuk endTime
    public long getStopTime(){
        return endTime;
    }
    
    //method untuk mengembalikan waktu yang telah berlalu
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
