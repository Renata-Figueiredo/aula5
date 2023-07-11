public class App {
    public static void main(String[] args) throws Exception {
        int arrayUm[] = new int[10]; // a primeira forma de criar um array

        int valorInt = 0;
        double valorDouble = 0.0;
        boolean valorBoolean = false;

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayUm[i]);
        }

        int arrayInt[] = { 1, 2, 3, 4, 5 }; // a segunda forma de criar um array

        int matrizUm[][] = { 
            { 1, 2 }, 
            { 3, 4 }
        };
        //  coluna
        //   0  1
        // { 1, 2 } // linha 0
        // { 3, 4 } // linha 1

        int matrizDois[][] = new int[10][2];

        matrizDois[0][0] = 10;
        matrizDois[0][1] = 5;

        System.out.println(arrayUm[0]);

        System.out.println(arrayInt.length);
        System.out.println(arrayUm.length);
        System.out.println(matrizDois[0].length);

    }
}
