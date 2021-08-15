import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadKeyBoard {
    public static char readCharacter() {
        char character;
        try {
            character = readChain().charAt(0);
        } catch( Exception e ) {
            System.out.println(e.getMessage());
            character = 0;
        }
        return character;
    }
    public static String readChain() {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = br.readLine();
        } catch( Exception e ) {
            System.out.println(e.getMessage());
            str = "";
        }
        return str;
    }
    public static int readInt() {
        int num;
        try {
            num = Integer.parseInt( readChain().trim() );
        } catch( Exception e ) {
            System.out.println(e.getMessage());
            num = 0;
        }
        return num;
    }
    public static double readDouble() {
        double val;
        try {
            val = Double.parseDouble( readChain().trim() );
        } catch( Exception e ) {
            System.out.println(e.getMessage());
            val = 0;
        }
        return val;
    }
    public static boolean readBoolean() {
        boolean bol = true;
        try {
            bol = Boolean.parseBoolean( readChain().trim().toLowerCase() );
        } catch( Exception e ) {
            System.out.println(e.getMessage());
        }
        return bol;
    }
}
