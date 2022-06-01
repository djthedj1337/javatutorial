package tutorial;

public class Chapter17NetworkMultiThreading {
}
/*
Network Programming:
- writing programs that execute across multiple devices that are connected to each other by a network
- java.net package

TCP v. UDP:
Transmission Control Protocol(TCP) - comms between two apps, used over internet protocol (TCP/IP)
User Datagram Protocol(UDP) = connection-less protocol that allows packets of data between applications

Socket Programming:
- sockets provide communication between two computers using TCP
- create socket on user end/client program then connect to server socket, then server creates socket on its end of comms
    - now server created socket allows write/read comms between client and server
1. Server instantiates ServerSocket object, with relevant port # comms
2. Server invokes accept() method which waits until client connects to server on port
3. Client instantiates socket object, with relevant server name and server port #
4. Constructor of client Socket attempts to connect client to specified server and port #
5. Server accept() method returns reference to new socket on server that is connected to client's socket
6. Comms occur between I/o streams, Server OUTPUTStream is connected to Client INPUTstream, Server INPUTstream is connceted to Client OUTPUT stream
**two way communication stream

Multithreading:
- contains two or more parts than run concurrently
- extends multitasking which is when multiple processes share common processing resources such as CPU

Thread Life Cycle:
1. New: thread beings life cycle, remains "new" until thread is started, aka "born thread"
2. Runnable: thread becomes "runnable" after newly born thread is started, considered to be task executing
3. Waiting: thread transitions to waiting while waiting for another thread, transitions back to runnable when thread signals waiting thread to continue
4. Timed Waiting: interval state of waiting, thread return to runnable when interval expires or conditions are met
5. Terminated(Dead) - thread completes tasks or is otherwise terminated

Thread Priorities:
- range between MIN_PRIORITY(1) and MAX_PRIORITY(10) , NORM_PRIORITY is normal priority(5)
- doesn't always guarantee order as thread execution order is platform dependent

Creating Thread:
- must implement run method, instantiate run thread
- call start method to execute call to run method


 */
