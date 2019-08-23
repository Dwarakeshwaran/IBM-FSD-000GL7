#IOFILE STREAM

## Reading and Writing

Data can be read in the form of Char or Byte.

## InputStream Methods

int read()
int read(byte[] buffer)
int read(byte[] buffer, int offset, int length)

## OutputStream Methods

void read(int c)
void read(byte[] buffer)
void read(byte[] buffer, int offset, int length)

## The Reader Methods

int read()
int read(char[] cbuffer)
int read(char[] cbuffer, int offset, int length)

## Node Streams

#### Type

File			FileReader, FileWriter, FileInputStream, FileInputStream
Memory: Array	CharArrayReader, harArrayWriter, ByteArray
Memory: String	StringReader, StringWriter, NA
Pipe			PipedReader, PipedWriter, Piped

## Notes

BufferedReader and BufferedWriter fastly reads and writes the data
Don't place the text files inside src folder




