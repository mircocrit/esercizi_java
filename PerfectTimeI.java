import java.rmi.*;
interface PerfectTimeI extends Remote {
	long getPerfectTime() throws RemoteException;
} 