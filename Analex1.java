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



import java.io.*;
import java.util.Scanner;

public class AnaLex1 {

    static int c;
    static int Renglon;
    static int filesize;
    static int a_i = 0;
    static int a_a = 0;
    static boolean fin_archivo = false;
    static char[] linea;
    static String entrada;
    static String salida;
    static int Com;
    static int Est;
    static String Lex, miToken;

    public static String obtenLexema(){
        String x = "";
        for(int i = a_i; i < a_a; i++){
            x = x + linea[i];
        }
        return x;
    }
    public static boolean esLetra(int x){
        return (x >= 65 && x <= 90) || (x >= 97 && x <= 122);
    }

    public static boolean esDigito(int x){
        return x >= 48 && x <= 57; 
    }

    public static boolean esDelim(int x){
        return x == ' ' || x == '\t' || x == '\n' || x == '\r'
        || x == 32 || x == 9 || x == 10;
    }

    //Rutina de error
    public static void rut_error(){
        System.out.println("\n\nERROR Lexicografico("+Renglon+"):  compilacion terminada, en el caracter["+Character.toString(c)+"] !!!!\n");
        System.exit(4);
    }

    public static char[] abreLeeCierra(String xName){
        File xFile = new File(xName);
        char[] data;
        try{
        FileReader fin = new FileReader(xFile);
            filesize = (int)xFile.length();
            data= new char[filesize+1];
            fin.read(data,0,filesize);
            data[filesize]=' ';
            filesize++;

            return(data);
        } catch (FileNotFoundException exc){}
            catch (IOException exc){}
            return null;
    }

    public static int lee_car(){
        if(a_a<=filesize-1){

            if(linea[a_a]==10){
                Renglon++;
            }
        
            return(linea[a_a++]);

        }else{

            fin_archivo = true;
            return 255;
        }
    }

    public static String pausa(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nada=null;
        try{
            nada = entrada.readLine();
            return(nada);

        } catch(Exception e) {
            System.err.println(e);
        }

        return("");
    }

    public static boolean creaEscribeArchivo(File xFile, String mensaje){
        try {
            PrintWriter fileOut = new PrintWriter(
            new FileWriter(xFile, true) );
            fileOut.println(mensaje);
            fileOut.close();

            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    public static File xArchivo(String xName){
        File xFile = new File(xName);

        return xFile;
    }
    
    public static int Diagrama(){
        a_a = a_i;

        switch (Com) {
            case 0:
                Com = 4;
                break;
            case 4:
                Com = 12;
                break;
            case 12:
                Com = 17;
                break;
            case 17:
                Com = 20;
                break;
            case 20:
                Com = 27;
                break;
            case 27:
                Com = 30;
                break;
            case 30:
                Com = 41;
                break;
            case 41:
                Com = 48;
                break;
            case 48:
                rut_error();
            default:
                break;
        }
        return Com;
    }

    public static String Token(){

        while (true) {
            switch (Est) {
                case 0:
                    c = lee_car();
                    if (esLetra(c)) {
                        Est = 1;
                    }else{
                        Est = Diagrama();
                    }
                    break;
                
                case 1:
                    c = lee_car();
                    if (esDigito(c) || esLetra(c)) {
                        Est = 1;
                    }else{
                        if (c == '_') {
                            Est = 2;
                        }else{
                            Est = 3;
                        }
                    }
                    break;

                case 2:
                    c = lee_car();
                    if (esDigito(c) || esLetra(c)) {
                        Est = 1;
                    }else{
                        Est = Diagrama();
                    }
                    break;
                
                case 3:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("id");
                
                case 4:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 5;
                    }else{
                        Est = Diagrama();
                    }
                    break;
                    
                case 5:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 5;
                    } else if (c == '.') {
                        Est = 6;
                    } else if (c == 'e' || c == 'E') {
                        Est = 8;
                    } else {
                        Est = 11;
                    }
                    break;

                case 6:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 7;
                    }else{
                        Est = Diagrama();
                    }
                    break;

                case 7:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 7;
                    } else if (c == 'e' || c == 'E') {
                        Est = 8;
                    } else {
                        Est = 11;
                    }
                    break;

                case 8:
                    c = lee_car();
                    if (c == '+' || c == '-'){
                        Est = 9;
                    }else{
                        if (esDigito(c)){
                            Est = 10;
                        }else{
                            Est = Diagrama();
                        }
                    }
                    break;

                case 9:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 10;
                    }else{
                        Est = Diagrama();
                    }
                    break; 

                case 10:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 10;
                    }else{
                        Est = 11;   
                    }
                    break;

                case 11:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("num");

                case 12:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 13;
                    }else{
                        Est = Diagrama();
                    }
                    break;

                case 13:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 13;
                    }else if (c == '.') {
                        Est = 14;
                    }else{
                        Est = Diagrama();
                    } 
                    break;

                case 14:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 15;
                    }else{
                        Est = Diagrama();
                    }
                    break;

                case 15:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 15;
                    }else{
                        Est = 16;
                    }
                    break;

                case 16:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("num");

                case 17:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 18;
                    }else{
                        Est = Diagrama();
                    }
                    break;

                case 18:
                    c = lee_car();
                    if (esDigito(c)) {
                        Est = 18;
                    }else{
                        Est = 19;
                    }
                    break;

                case 19:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("num");

                case 20:
                    c = lee_car();
                        switch (c) {
                            case '>':
                                Est = 21;
                                break;
                            case '<':
                                Est = 23;
                                break;
                            default:
                                Est = Diagrama();
                        }
                        break;

                case 21:
                    c = lee_car();
                    if (c == '=') {
                        Est = 22;
                    }else{
                        Est = 24;
                    }
                    break;

                case 22:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("mai");

                case 23:
                    c = lee_car();
                    if (c == '=') {
                        Est = 25;
                    }else{
                        Est = 26;
                    }
                    break;

                case 24:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("may");

                case 25:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("mei");

                case 26:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("men");

                case 27:
                    c = lee_car();
                    if(esDelim(c)){
                        Est = 28;
                    }else{
                        Est = Diagrama();
                    }
                    break;

                case 28:
                    c = lee_car();
                    if (esDelim(c)) {
                        Est = 28;
                    }else{
                        Est = 29;
                    }
                    break;

                case 29:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("nosirve");

                case 30:
                    c = lee_car();
                    switch (c) {
                        case '=':
                            Est = 31;
                            break;
                        case '!':
                            Est = 34;
                            break;
                        case '&':
                            Est = 37;
                            break;
                        case '|':
                            Est = 39;
                            break;
                        default:
                            Est = Diagrama();
                    }
                    break;

                case 31:
                    c = lee_car();
                    if (c == '=') {
                        Est = 32;
                    }else{
                        Est = 33;
                    }
                    break;

                case 32:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("ig");

                case 33:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("asig");
                
                case 34:
                    c = lee_car();
                    if (c == '=') {
                        Est = 35;
                    }else{
                        Est = 36;
                    }

                case 35:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("mai");

                case 36:
                    a_a--;
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("not");

                case 37:
                    c = lee_car();
                    if (c == '&') {
                        Est = 38;
                    }else{
                        Est = Diagrama();
                    }
                
                case 38:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("and");

                case 39:
                    c = lee_car();
                    if (c == '|') {
                        Est = 40;
                    }else{
                        Est = Diagrama();
                    }
                
                case 40:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("or");

                case 41:
                    c = lee_car();
                    switch (c) {
                        case '(':
                            Est = 42;
                            break;
                        case ')':
                            Est = 43;
                            break;
                        case '+':
                            Est = 44;
                            break;
                        case '-':
                            Est = 45;
                            break;
                        case '*':
                            Est = 46;
                            break;
                        case '/':
                            Est = 47;
                            break;
                        default:
                            Est = Diagrama();
                    }
                    break;

                case 42:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("pa");

                case 43:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("pc");

                case 44:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("mas");

                case 45:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("menos");

                case 46:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("*");

                case 47:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("/");

                case 48:
                    c = lee_car();
                    if (c == 255) {
                        Est = 49;
                    }else{
                        Est = Diagrama();
                    }
                    break;

                case 49:
                    Lex = obtenLexema();
                    a_i = a_a;
                    return("nosirve");

                default:
                    return ("");
            }
        }
    }

    public static void main(String[] args) {

        /*try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digitar cadena y al final $");
            String cadena = scanner.nextLine();

            linea = cadena.toCharArray();
        }

        filesize = linea.length;

        do {
            Est = 0;
            Com = 0;
            miToken = Token();
            System.out.println("Token encontrado: " + miToken+ " Lexema: " +Lex);
            a_i = a_a;
        } while (a_a < linea.length && linea[a_a - 1] != '$');
*/

        if(args.length == 0){
            System.out.println("ERROR: Falta el archivo");
            System.exit(4);
        }
        
        entrada = args[0] + ".cm";
        salida = args[0]+".cm1";
        
        if(!xArchivo(entrada).exists()){
            System.out.println("ERROR: El archivo " +entrada+ " no existe");
            System.exit(4);
        }

        System.out.println(entrada);
        pausa();

        linea = abreLeeCierra(entrada);
        
        while (!fin_archivo) {
            Est = 0;
            Com = 0;
            miToken = Token();
            if(!miToken.equals("nosirve")){
                creaEscribeArchivo(xArchivo(salida), miToken);
                creaEscribeArchivo(xArchivo(salida), Lex);
                creaEscribeArchivo(xArchivo(salida), Renglon+"");
            }
            //System.out.println("Token: "+miToken+ ", Lexema: "+Lex+ ", Renglon: " +Renglon);
            //pausa();


        }
        System.out.println("Analisis Lexicografico Correcto");

        /*do{
            int xx = lee_car();
            System.out.println("ascii = " +xx+ ", caracter = " +(char)xx+ ", l: " +a_a);
            pausa() ;
        }while(!fin_archivo);

        for(int i=0; i<=1000; i++){
            System.out.println("Elemento " +i+ " " + linea[i]);
            //System.out.println("Elemento "+i+" " + linea[i]*1);
            pausa();
        }

        rut_error();
        System.out.println(args[1]);*/
    }
}
