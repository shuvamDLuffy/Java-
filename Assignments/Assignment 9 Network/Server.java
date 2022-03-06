import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;

class Server
{
	public static void main(String[] args) throws IOException
	{
		//create a serversocket
		ServerSocket serverSocket = new ServerSocket(333);
		
		//connect server with client socket
		Socket socket = serverSocket.accept();

		DataInputStream dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1="", str2="";
		while(!str1.equals("stop"))
		{
			str1 = dis.readUTF();
			System.out.println("Client says:" + str1);
			str2 = br.readLine();
			dos.writeUTF(str2);
			dos.flush();
		}
		dis.close();
		socket.close();
		serverSocket.close();
	}
}