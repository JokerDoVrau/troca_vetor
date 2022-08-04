public class Main {    
 
  public static void main(String []args){

        Scanner ler = new Scanner(System.in);
        
        int  n = ler.nextInt();      
        
        int numero[] = new int[n];
        
        for(int i = 0; i <n;i++){
    
            numero[i] = ler.nextInt();

        }
        
        int  b = ler.nextInt();
        int f = 0;
        int  g = ler.nextInt();          
       trocaVetor(numero. f, g, n);
       
        /*for(int i = 0; i <n;i++){
    
            System.out.println(numero[i]);

        }*/
    }
    public static void trocaVetor(int[] v, int f,int g, int n){
        
        int fNum = v[f];
        int gNum = v[g];        
        
        v[g] = fNum;
        v[f] = gNum;
        
        for(int i=0; i<n; i++){
            System.out.println(v[i]);
        }
    }
}
