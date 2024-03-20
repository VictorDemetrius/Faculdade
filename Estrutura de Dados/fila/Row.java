package fila;
import javax.swing.JOptionPane;
//@author FATEC ZONA LESTE

public class Row {
    int tamanho;
    No inicio;
    No fim;

     Row() {
     this.tamanho = 0;
     this.inicio = null;
     this.fim = null;
    
    }
    
     boolean estaVazia()
     {
         return tamanho == 0;
     }
    
    void enfilerar(Object info)
    {
        No no = new No(info);
        
         if(estaVazia())
        {
            this.inicio = no;
        }
        else
        {
            this.fim.prox = no;
        }
         this.fim = no;
        tamanho++;
    }
    
    Object desenfilerar()
    {   
         if(estaVazia() == true)
            {
                JOptionPane.showMessageDialog(null,"Fila está vazia");
                return null;
            }
        else
            {   
                Object info = this.inicio.info;
                this.inicio = this.inicio.prox;
                this.tamanho--;
                return info;
            }
    }
    
    Object inicio()
    {
         if(estaVazia() == true)
            {
                JOptionPane.showMessageDialog(null,"Fila está vazia");
                return null;
            }
         else
            {
                return this.inicio.info;
                      
            }
    }
    
    String  tarefa()
    {
        String retorno = "";
        No noAtual = inicio;
        for(int i = 1; i <= tamanho; i++)
        {
            retorno += noAtual.info +"\n";
            noAtual = noAtual.prox;
        }
        return retorno;
    }
}
