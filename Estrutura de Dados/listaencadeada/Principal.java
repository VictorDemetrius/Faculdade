package listaencadeada;
import javax.swing.JOptionPane;

//@author Victor D. Marqueto
public class Principal {
    
      public static void main(String[] args) {
          
         Lista lista = new Lista();
         lista.adicionar("John", "97234-6743");
         lista.adicionar("Sam", "98756-9854");
         lista.adicionar("April", "98234-7654");
         
         
         //lista.imprimirLista();
         
         String tel = lista.buscaTelefone("Sam");
         JOptionPane.showMessageDialog(null,tel);
                 
         tel = lista.buscaTelefone("Julie");
         JOptionPane.showMessageDialog(null,tel);
            
        
         
                 
          
    }
    
}

    
