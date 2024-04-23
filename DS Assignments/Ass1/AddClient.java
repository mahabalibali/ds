
import java.rmi.*;

public class AddClient{

	public static void main(String args[]) {

		try{

			String addServerURL = "rmi://" + args[0] + "/AddServerImpl";
			AddServerIntf addServerIntf =
			(AddServerIntf)Naming.lookup(addServerURL);
			System.out.println("The first number is: " + args[1]);
			double d1 = Double.valueOf(args[1]).doubleValue();
			System.out.println("The second number is: " + args[2]);
			double d2 = Double.valueOf(args[2]).doubleValue();
			System.out.println("The sum is: " + addServerIntf.add(d1,d2));
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
