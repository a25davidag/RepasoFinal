import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        //1: Pedir 5 números, y mostrar al final si se ha introducido alguno negativo.
        Scanner sp = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("introduce nuemeros");
            numeros[i] = sp.nextInt();
        }
        boolean resultado = hayUnNegativo(numeros);
        if(resultado){
            System.out.println("hay numero negativo");
        }else{
            System.out.println("no hay numeros negativos");
        }
        //2 Pedir números e indicar si es múltiplo de 3. El programa finaliza con -1
        Scanner sj = new Scanner(System.in);
        int multiplo;
        do {
            System.out.println("pon numeros hasta poner '-1' para salir de la funcion ");
            multiplo = sj.nextInt();
            if (multiplo % 3 == 0) {
                System.out.println("es multiplo de 3");
            }else {
                System.out.println("no es multiplo");
            }
        } while (multiplo != -1);
        //3 Leer 5 números y mostrarlos en orden inverso al introducido
        int[] inverso = {3, 7, 3, 9, 3};
        for (int i = 0; i < inverso.length; i++) {
            //System.out.println(inverso[inverso.length-i-1]);
            System.out.println(inverso.length-1-i);
        }
        //4 Realizar una aplicación que devuelva si una palabra es un palíndromo o no.
        Scanner pj = new Scanner(System.in);
        System.out.println("pon una palabra cualquiera");
        String palabra1 = pj.nextLine();
        char[] caracteres = palabra1.toCharArray();

        if (palindromo(caracteres)){
            System.out.println("es palindrmo");
        }else{
            System.out.println("no lo es");
        }

    }
    public static boolean hayUnNegativo(int[] nums) {
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] < 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean palindromo(char[] caracteres){
     for(int i = 0; i < caracteres.length/2; i++){
         System.out.println(caracteres[i]);
         System.out.println(caracteres[caracteres.length-i-1]);
         if(caracteres[i] != caracteres[caracteres.length-i-1]){
             return false;
         }
        }
     return true;
    }
}
