package exercicio.loop;

// @author FATEC ZONA LESTE

public class ExercicioLoop {

        public static void main(String[] args) {
/* Exercicio 1     
            
            for(int i = 1; i <= 10; i++)
                {         for(int j = 1; j <= 10; j++)
                            {
                                System.out.print(j*i+ " | ");
                            }  
                    System.out.print("\n");     
                }
*/
//-------------------------------------------------------------------------------------------   
/* Exercicio 2
      int i = 3;        
        for(int j = 1; j <= 10; j++)
            {
                System.out.print( i +" x " +j+ " = "+ j*i+"\n");
            }
*/
//-------------------------------------------------------------------------------------------
/* Exercicio 3
    String num;
    int n;
    num = JOptionPane.showInputDialog("Digite um numero: ");
    n = Integer.parseInt(num);
            for(int i = 1; i <= 10; i++)
               {
                    System.out.print( n +" x " +i+ " = "+ n*i+"\n");
               }
*/
//------------------------------------------------------------------------------------------- 
/* Exercicio 5
   int n = 0;
   int i = 3;
        
    while(i<7)
    {
            n=n+i;
            JOptionPane.showMessageDialog(null,n);
            i++;
    }
*/
//-------------------------------------------------------------------------------------------
/* Exercicio 6 sala
    String num;
    int n;
    num = JOptionPane.showInputDialog("Digite o numero que deseja: ");
    n = Integer.parseInt(num);
        for(int i = 1; i<=n; i++)
            {
                 for( int j = 1; j<=i; j++)
                    {
                         System.out.print(i);
                         System.out.println();
                    }
    }
*/
//-------------------------------------------------------------------------------------------
/* Exercicio 6
    String num;
    int n, result = 0;
        
    for(int i = 0; i <5; i++)
        {
            num = JOptionPane.showInputDialog("DIGITE UM NUMERO: ");
            n = Integer.parseInt(num);
            result = result+n;
        }
        
    System.out.print(result);
        
*/
//-------------------------------------------------------------------------------------------
        
/*Exercicio 7
        
    String num;
    int n = 0;
    int result = 0;
        
    for(int i = 0; i < n; i++ )
    {
        num = JOptionPane.showInputDialog("Digite a quantidade de número ");
        n = Integer.parseInt(num);
        result = result + n;
    }
        result = result/n;
        System.out.print(result);

*/
//-------------------------------------------------------------------------------------------    
/*Exercicio 8
    String num;
    int n = 0;
    int result = 0;
        
        for(int i = 0; i < 5; i++ )
            {
                num = JOptionPane.showInputDialog("Digite a quantidade de número ");
                n = Integer.parseInt(num);
                   if(n<0)
                    {
                        System.out.print(n);
                    }
        
            }
*/
//-------------------------------------------------------------------------------------------
/* Exercicio 9      
     
     String num;
     int n = 0;     
        do{
            num = JOptionPane.showInputDialog("Digite a quantidade de número ");
            n = Integer.parseInt(num);
            System.out.print(n);
          }while(n==0); 
*/     
//-------------------------------------------------------------------------------------------
/* Exercicio 10
    String num;
    int n, result;  
           
        num = JOptionPane.showInputDialog("Digite um número ");
        n = Integer.parseInt(num);
        int r = n;
        
           for(int i = 1 ; i <=n; i++)
           {    
                result = n*r;
                r--;
                System.out.println(result);
           }
*/      
//-------------------------------------------------------------------------------------------  
/* Exercicio 11
    int n;
    int cont;
    int result = 1;
    for(int i = 0; i <1000 ; i++ )
    {
        System.out.print(result+" ");
        result = result + n;
    }
*/
//-------------------------------------------------------------------------------------------   
/* Exercicio 12
    String num;
    int n;
    num = JOptionPane.showInputDialog("Digite o tamanho que deseja da figura: ");
    n = Integer.parseInt(num);
        for(int i = 1; i<=n; i++)
            {
                for( int j = 1; j<=i; j++)
                   {
                        System.out.print("*");
                        System.out.println();
                    } 
            }
*/
//-------------------------------------------------------------------------------------------   
        
/*Exercicio 13
    boolean ver= false;
    do{
            for(int i = 1; i<=7; i++)
                {
                    for( int j = 1; j<=i; j++)
                    {
                        System.out.print("*");
                        System.out.println();
                    }
                }
    }while(ver=true);


  }
*/


   }
}