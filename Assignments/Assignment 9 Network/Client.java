import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

class Client
{
	public static void main(String[] args) throws IOException
	{
		Socket socket = new Socket("localhost",333);
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1="", str2="";
		while(!str1.equals("stop"))
		{
			str1 = br.readLine();
			dos.writeUTF(str1);
			dos.flush();
			str2 = dis.readUTF();
			System.out.println("Server says:" + str2);
		}
		dos.close();
		socket.close();
	}
}