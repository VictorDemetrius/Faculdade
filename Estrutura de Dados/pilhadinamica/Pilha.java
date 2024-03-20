package pilhadinamica;
//@author Victor D. Marqueto

 public class Pilha {
    int tamanho;
    No topo;       
    
    Pilha()
    {
        tamanho = 0;
        topo = null;
    }
    
    boolean estaVazia()
    {
       return tamanho ==0;
    }
    
    void empilhar(Object info)
    {
        No no = new No(info);
        
         if(estaVazia()== false)
        {
            no.ponteiro = topo;
        }
        
       topo = no;
       tamanho++;
       
    }
    
    Object topo()
       {
           if(estaVazia()== false)
           {
               return "Pilha Vazia";
           }
           else
           {
               return topo.info;
           }
       }
    
    Object desempilhar()
    {
        if(estaVazia()== true)
            {
              return "Pilha Vazia";
            }
        Object info = topo.info;
        topo = topo.ponteiro;
        tamanho --;
        return info;
       
    }
    
}


