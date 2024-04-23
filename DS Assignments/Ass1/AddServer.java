import java.net.*;
import java.rmi.*;

public class AddServer {

	public static void main(String args[]) {

		try {
			
			AddServerImpl addServerImpl = new AddServerImpl();
			Naming.rebind("AddServerImpl", addServerImpl);
		}
		catch(Exception e) {

			System.out.println("Exception: " + e);
		}
	}
}























/*

Terminal 1:

1] javac *.java
2] rmic AddServerImpl
3] rmiregistry

Terminal 2:

1] java AddServer


Terminal 3:

1] java AddClient 10.0.2.15 8 9
// 10.0.2.15 -> IPv4 address of Connected Network

*/
