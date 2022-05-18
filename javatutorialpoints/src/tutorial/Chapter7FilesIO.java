package tutorial;

public class Chapter7FilesIO {
}

/*
Two Types of Streams:
- InPutStream: read data from a  source
- OutPutStream: writing data to a destination

**I/O = Input/Output

Byte Streams:
- strong flexible support for I/O in Java
- used for I/O of 8 bit bytes
- frequently used classes to byte streams = FileInputStream, FileOutputStream

Character Streams:
- used for I/O of 16-bit unicode
- common classes = FileReader, FileWriter

Standard Streams:
- Standard Input: System.in, keyboard for standard input system to send to program
- Standard Output: System.out, computer screen used for standard output data produced by program
- Standard Error: System.err, computer screen used for standard output error

FileInputStream:
- used for reading data
Example:

InputStream f = new FileInputStream("C:/java/hello")

File f = new File("C:/java/hello");
InputStream f = new FileInputStream(f);

FileOutputStream:
- used to create file and write data in it
Example:

OutputStream f = new FileOutputStream("C:/java/hello");

File f = new File("C:/java/hello");
OutputStream f = new FileOutputStream(f);


 */
