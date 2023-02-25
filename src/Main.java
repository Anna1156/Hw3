import java.net.SocketException;
import java.nio.file.AccessDeniedException;
import java.rmi.server.ExportException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
      Scanner wer = new Scanner(System.in);
        System.out.print("Enter 1,2,3 or 4: ");
        int i = wer.nextInt();
        if ( i == 1 ) throw new SocketException();{
            try {
                throw new SocketException();
            }catch (SocketException e) {
                System.out.println("SocketException");
            }
        }
        if ( i == 2) throw new ClassNotFoundException();
        try {
            throw new ClassNotFoundException();
        }catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        }
        if ( i == 3) throw new AccessDeniedException("AccessDeniedException");
        try {
            throw new AccessDeniedException("AccessDeniedException");
        }catch (AccessDeniedException e) {
            System.out.println("AccessDeniedException");
        }
        if ( i == 4 ) throw new ExportException("ExportException");try {
            throw new ExportException("kk");
        }catch (ExportException e) {
            System.out.println("ExportException");
        }

    }
}


