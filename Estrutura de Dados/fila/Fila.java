package fila;
import javax.swing.JOptionPane;
//@author Victor D. Marqueto

public class Fila {
    static int op = 0;
    static Row r = new Row();
    
    
    
    
    public static void main(String[] args) {
         
        Object info;
        do
        {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção \n1 - Enfileirar\n2 - Início\n3 - Desenfileirar\n4 - Fila de tarefas\n0 - Sair"));
                    switch (op)
                            {
                            case 1 : info = JOptionPane.showInputDialog("Digite a informação que deseja enfileirar");
                                     r.enfilerar(info);
                             break;
                            case 2 : JOptionPane.showMessageDialog(null, r.inicio());
                             break;
                            case 3 : JOptionPane.showMessageDialog(null, r.desenfilerar());
                             break;
                            case 4: JOptionPane.showMessageDialog(null,r.tarefa());
                             break;
                            default:
                                JOptionPane.showMessageDialog(null,"Opção Inválida");
                             
                             
                            }
        }while(op!=0);
    }
    
}
