import java.net.SocketException;
import java.nio.file.AccessDeniedException;
import java.rmi.server.ExportException;
import java.util.Scanner;

public class exception{
    public static void raiseException(Integer exceptionId) throws Exception {
        Scanner wer = new Scanner(System.in);
        System.out.println("Enter 1,2,3,4");
        int i = wer.nextInt();
        if ( i == 1 ) throw new SocketException();
        if ( i == 2) throw new ClassNotFoundException();
        if ( i == 3) throw new AccessDeniedException("pp");
        if ( i == 4 ) throw new ExportException("ii");
        else System.out.println("in");
        }
        }
