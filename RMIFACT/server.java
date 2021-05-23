import java.net.*;

import java.rmi.*;

public class server

{

public static void main(String args[])

{

try

{

FactImpl m=new FactImpl();

Naming.rebind("abc",m);
System.out.println("System is Ready!!!");

}

catch(Exception e)

{

System.out.println("Exception"+e);

}

}

}
