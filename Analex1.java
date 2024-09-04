import java.io.*;

public class Analex1 {
    static int c;
    static int a_a;
    static int a_i;
    static int filesize;
    static int Renglon;
    static boolean fin_archivo = false;
    static char[] linea;
    static String entrada, salida;
    static int COM;
    static int EST;
    static String[] pr = new String[5];

    public static String reservada(String x) {
        for (int i = 0; pr.length; i++)
            if (pr[i].equals(x))
                return (x);
        return ("id");
    }

    public static String obten_lex() {
        String lexema = "";
        while (Character.isLetterOrDigit(c)) {
            lexema += Character.toString(c);
            c = lee_car();
        }
        return (lexema);
    }

    public static boolean es_letra(int x) {
        System.out.println("es_letra");
        return true;
    }

    public static boolean es_digito(int x) {
        System.out.println("es_digito");
        return true;
    }

    public static boolean es_delim(int x) {
        System.out.println("es_espacio");
        return true;
    }

    public

    public static void rut_error() {
        System.out.println("\n\nERROR Lexicografico(" + Renglon + "):  compilacion terminada, en el caracter["
                + Character.toString(c) + "] !!!!\n");
        System.exit(4);
    }

    public static int lee_car() {
        if (a_a <= filesize - 1) {
            if (linea[a_a] == 10) {
                Renglon++;
            }
            return (linea[a_a++]);
        } else {
            fin_archivo = true;
            return 255;
        }
    }

    public static String pausa() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nada = null;
        try {
            nada = entrada.readLine();
            return (nada);
        } catch (Exception e) {
            System.err.println(e);
        }
        return ("");
    }

    public static char[] abreLeeCierra(String xName) {
        File xFile = new File(xName);
        char[] data;
        try {
            FileReader fin = new FileReader(xFile);
            filesize = (int) xFile.length();
            data = new char[filesize + 1];
            fin.read(data, 0, filesize);
            data[filesize] = ' ';
            filesize++;
            return (data);
        } catch (FileNotFoundException exc) {
        } catch (IOException exc) {
        }
        return null;
    }

    public static boolean creaEscribeArchivo(File xFile, String mensaje) {
        try {
            PrintWriter fileOut = new PrintWriter(
                    new FileWriter(xFile, true));
            fileOut.println(mensaje);
            fileOut.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public static File xArchivo(String xName) {
        File xFile = new File(xName);
        return xFile;
    }

    public static int DIAGRAMA() {
        a_a = a_i;
        switch (COM) {
            case 0:
                COM = 4;
                break;
            case 4:
                COM = 4;
                break;
            case 0:
                COM = 4;
                break;
            case 4:
                COM = 4;
                break;
            case 0:
                COM = 4;
                break;
            case 4:
                COM = 4;
                break;
        }
        return (COM);

    }

    public static String TOKEN() {
        while (true) {
            switch (EST) {
                case 0:

                    break;

            }
        }

    }

    public static void main(String[] args) {

        pr[0] = "if";
        pr[1] = "entonces";
        pr[2] = "finsi";

        if (args.length == 0) {
            System.out.println("Error: Falta el archivo");
            System.exit(4);
        }
        entrada = args[0] + ".cm";

        if (!xArchivo(entrada).exists()) {
            System.out.println("Error: El archivo no existe");
            System.exit(4);
        }
        System.out.println(args[0]);
        pausa();

        linea = abreLeeCierra(entrada);

        do {

            int xx = lee_car();
            System.out.println("ASCI =" + xx + "  char=" + Character.toString((char) xx) + "Contador= " + a_a);
            // lenta
        } while (!fin_archivo);

    }
}
