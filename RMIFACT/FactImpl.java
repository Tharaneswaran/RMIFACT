import java.rmi.*;

import java.rmi.server.*;

public class FactImpl extends UnicastRemoteObject implements FactInterface

{

public FactImpl()throws Exception

{

}

public int fact(int n)

{

int i,c=1;

for(i=1;i<=n;i++)

{

c=i*c;

}

return c;

}

}