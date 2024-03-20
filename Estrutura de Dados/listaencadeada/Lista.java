package listaencadeada;
import javax.swing.JOptionPane;

//@author Victor D. Marqueto
public class Lista {
    
    No inicio;
    No fim;
    int tamanho;
    
    Lista(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }
    
    void adicionar(String nome, String tel){
        No no = new No(nome,tel);
        
        if(estaVazia())
        {
            inicio = no;
        }
        else
        {
            fim.proximo = no;
        }
       fim = no;
       tamanho++;
    
    }
    
    boolean estaVazia()
    {
        return tamanho == 0;
        
        /*if(inicio == null)
        {
           
        return(true);
        }
        else
        {
            return(false);
        
        }*/
     
    
    }
    
    void imprimirLista()
    {
        No no = inicio;
       for(int i = 0; i<tamanho ;i++)
       {
           JOptionPane.showMessageDialog(null,no.nome+" : " + no.tel);
           no = no.proximo;
       }
        
    }
     
    
    String buscaTelefone(String nome)
    {
        No no = inicio;
        for(int i = 0; i < tamanho; i++)
        {
            if(no.nome.equals(nome))
            {
                return no.tel;
            }
        no = no.proximo;
        }
        
        return "Não localizado";
    }
    
    
      String posicao(String nome)
      {
          String busca;
          busca = JOptionPane.showInputDialog("Digite o nome desejado");
          
          No no = inicio;
        for(int i = 0; i < tamanho; i++)
        {
            if(no.nome.equals(busca))
            {
                return "posição "+i;
            }
        no = no.proximo;
        }
        return "Nome inválido";
      }


    
           
    
    
}
