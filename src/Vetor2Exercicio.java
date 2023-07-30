public class Vetor2Exercicio {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = new int[5];

        for(int i=0; i<5; i++){
            System.out.println(a[i]);
            b[i]=a[i]*2;
            System.out.println(b[i]);

        }
    }
}
