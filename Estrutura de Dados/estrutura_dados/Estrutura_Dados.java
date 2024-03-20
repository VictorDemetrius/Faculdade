package estrutura_dados;
//@author Victor D. Marqueto
public class Estrutura_Dados {

    
    public static void main(String[] args) {
       
        int resul = multRec(4,3);
        
        System.out.println(resul);
    }
    
    //Método Recursivo
    
            
      public static int multRec(int v1, int v2)
    {
      
        if(v2==1)
            {
                return v1;
            }
        else{
                return v1 + multRec(v1,v2-1);
            }
        
    }
    
}
