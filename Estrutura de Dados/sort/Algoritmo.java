package algoritmo;

public class Algoritmo {

   
    public static void main(String[] args) {
        
        int n []= {7,9,5,6,7,2};
        
       selectSort(n);
       insertSort(n);
       bubbleSort(n);
        
      
    }
    
    private static void selectSort(int n [])  
    {
        int ind = 0;
        for(int i = 0; i < n.length; i++)
        {
            //Inicia a variavel com o valor maximo do tipo int
            int aux = Integer.MAX_VALUE;
            //Compara a posição 
            for (int j = i; j < n.length; j++)
             {
                 //Compara se a posição atual é menor que o valor da variavel aux
                 if(n[j]<aux)
                 {  
                    //Salva o menor valor a variavel
                    aux = n[j] ;
                    //Salva o indice do vetor onde estava o valor menor
                    ind = j; 
                 }
             
             }
            // Atribui o valor atual da posição do vetor n a posição do menor valor
            n[ind] = n[i];
            //Atribuia o menor valor a posicão atual do vetor n
            n[i] = aux;
            
            System.out.println(n[i]);
        }
    }
        
        
     private static void insertSort(int n[])
     {
         int ind = n.length;
         
         for(int i = 1; i< ind; i++)
         {
             //Atribui a posição e o valor no vetor n as variaveis
             int aux = n[i];
             int j = i;
             //Comparar a posição e o valor do vetor com a variavel aux  e j
             while(j >= 0 && n[j] > aux)
             {
                 //Realiza a troca 
                 n[j+1] = n[j];
                 j = j-1;
             }
            
           n[j+1] = aux;
           System.out.println(n[i]);
         }
     
     }
     
     private static void bubbleSort(int n[])
     {
         int aux = n.length;
         boolean altera = false;
         for(int i = 1; i <aux-1; i++)
         {  //Compara o valor atual com o da frente
             for(int j = i+1;j < aux-i-1; j++)
             {
                  
                //Se o valor da posição a? frente for maior 
                if(n[i] > n[i+1])
                    //Caso tenha alteração no vetor n altera recebe true
                    altera = true;
                    {
                        //Realiza a troca de posição dos valores
                        int temp = n[i+1];
                        n[i] = n[i+1];
                        n[i+1]=temp;
                    }
             }
             //Verifica se houve alteração no vetor n
             if(altera == false)
             {
                 break;
             }
             //Caso não tenha alteração nas posições do vetor altera recebe false
             else
             {
                 altera = false;
             }
             System.out.println(n[i]);
         }
     }
}

