package GameEntities;

/**
 * This is the class that will log all the things that have happened so far in the
 * story that will parsed into the AI, it will also be responsible for generating
 * a file --> Go into more depth later
 */
public class GameLogger {
    StringBuilder gameLogs;
    int logCount;

    public GameLogger() {

    }

    public void saveLogs() {
        logCount++;
    }

    public void clearLogs() {

    }

    public void removeLastLog() {
        
    }

}
