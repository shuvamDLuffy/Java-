# ASSIGNMENT GIVEN: JAN 18, DEADLINE: JAN 20

# Java Socket Programming
Java Socket programming is used for communication between the applications running on different JRE. Java Socket programming can be connection-oriented or connection-less.
Socket and ServerSocket classes are used for connection-oriented socket programming and DatagramSocket and DatagramPacket classes are used for connection-less socket programming.

The client in socket programming must know two information:
1. IP Address of Server, and
2. Port number.

Here, we are going to make one-way client and server communication. In this application, client sends a message to the server, server reads the message and prints it. Here, two classes are being used: Socket and ServerSocket. The Socket class is used to communicate client and server. Through this class, we can read and write message. The ServerSocket class is used at server-side. The accept() method of ServerSocket class blocks the console until the client is connected. After the successful connection of client, it returns the instance of Socket at server-side.

## Socket class
A socket is simply an endpoint for communications between the machines. The Socket class can be used to create a socket.

### Important methods
1. public InputStream getInputStream()
   * returns the InputStream attached with this socket.
2. public OutputStream getOutputStream()	
   * returns the OutputStream attached with this socket.
3. public synchronized void close()	
   * closes this socket
  
## ServerSocket class
The ServerSocket class can be used to create a server socket. This object is used to establish communication with the clients.

### Important methods
1. public Socket accept()	
   * returns the socket and establish a connection between server and client.
3. public synchronized void close()	
   * closes the server socket.

## Example of Java Socket Programming
### Creating Server:
To create the server application, we need to create the instance of ServerSocket class. Here, we are using 6666 port number for the communication between the client and server. You may also choose any other port number. The accept() method waits for the client. If clients connects with the given port number, it returns an instance of Socket.
```java
ServerSocket ss=new ServerSocket(6666);  
Socket s=ss.accept();//establishes connection and waits for the client   
```

### Creating Client:
To create the client application, we need to create the instance of Socket class. Here, we need to pass the IP address or hostname of the Server and a port number. Here, we are using "localhost" because our server is running on same system.
```java
Socket s=new Socket("localhost",6666);  
````
File: MyServer.java
```java
import java.io.*;  
import java.net.*;  
public class MyServer {  
 public static void main(String[] args){  
 try{  
  ServerSocket ss=new ServerSocket(6666);  
  Socket s=ss.accept();//establishes connection   
  DataInputStream dis=new DataInputStream(s.getInputStream());  
  String  str=(String)dis.readUTF();  
  System.out.println("message= "+str);  
  ss.close();  
 }catch(Exception e)
  {
   System.out.println(e);
  }  
 }  
}
```

File: MyClient.java
```java
import java.io.*;  
import java.net.*;  
public class MyClient {  
 public static void main(String[] args) 
 {  
  try
  {      
   Socket s=new Socket("localhost",6666);  
   DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
   dout.writeUTF("Hello Server");  
   dout.flush();  
   dout.close();  
   s.close();  
  }catch(Exception e)
   {
    System.out.println(e);
   }  
 }  
}
```
