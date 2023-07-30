public class Vetor3Exercicio {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int [] b = {11,12,13,14,15,16,17,18,19,20};
        int [] c = new int[10];

        for(int i=0; i<10; i++){
            System.out.println(a[i]);
            System.out.println(b[i]);
            c[i]=a[i]+b[i];
            System.out.println(c[i]);

        }
    }
}
