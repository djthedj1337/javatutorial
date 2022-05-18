package tutorial;

public class Chapter8Exceptions {
}
/*
Exception:
- exceptional event, normal flow disrupted, abnormal terminational
- caused by invalid data, file not found, lost network connection,etc
- user error,programmer error, and other failures

Three Types of Exceptions:
- Checked: notified or "checked" by compiler at compilation time, also called compile time exceptions, cannot be ignored

- Unchecked: occurs at runtime execution, programming bugs such as logic errors or improper use of API, ignored at compilation

- Errors: not technically an exception, arises beyond user/programmer control, ignored at compilation


**Error and Exception are subclasses of Throwable class

Two Main Exception Subclasses:
- IOException Class and RunTimeException Class

Catching Exceptions:
- try and catch blocks, protected code witihn block
- catch block devlares type of exception trying to catch

Throws/Throw Keyword:
- if method does not handle exception, must declare it at least
- throws used to postpone handling of checked exception, throw used to invoke an exception
- can throw multiple exceptions if needed separate by a comma

Finally Block:
- follows try and catch blocks
- ALWAYS executes no matter if exception was caught or not
- try and catch must be present in order for either to be used
- NO code between blocks at all, must be try catch finally (finally optional)



 */
