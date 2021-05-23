import java.rmi.*;

public interface FactInterface extends Remote

{

int fact(int n)throws Exception;

}
