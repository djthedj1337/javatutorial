package tutorial;

public class Chapter21Threads {
}
/*
Two Types of Threads:
- Daemon Thread:
    - low priority, always running in the background, JVM doesnt wait for daemon to finish
    - created by JVM usually for garbage collection job
    - JVM forces daemon to terminate if user thread finished execution
    - cannot keep running by JVM only
    - background tasks
- User Thread
    - high priority, JVM waits for user to finish
    - CPU priority over Daemon
    - created by application for concurrent task execution
    - can continue running by JVM only
    - critical tasks

**utilize iaDaemon() and setDaemon() to check for daemon thread or set one
 */
