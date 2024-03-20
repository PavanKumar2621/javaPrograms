import java.net.InetAddress;
import java.io.*;
public class IPADDRESS {
	public static void main(String[] args) throws Exception
	 {
		InetAddress IP = InetAddress.getLocalHost();
		System.out.println("IP Address of the System is : "+IP.getHostAddress());
	}
}