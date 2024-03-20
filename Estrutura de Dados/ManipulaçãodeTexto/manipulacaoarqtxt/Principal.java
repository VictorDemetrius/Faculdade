package manipulacaoarqtxt;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

//@author Victor D. Marqueto

public class Principal {
    
    public static void main(String[] args)  {
                
            /*try{
                leituraArquivo();
                escritaArquivo();
             }catch (Exception e)
            {
                System.out.println("Verifiquei o nome do arquivo");
            }*/
            
            //metodoSubString();
            //metodoSplit();
            
    }

    
    private static void leituraArquivo() throws FileNotFoundException, IOException {
        
        final String ARQ_ENT = "Caminho onde está o arquivo que vai ser lido";
        FileReader fr = new FileReader(ARQ_ENT);
        BufferedReader br = new BufferedReader(fr);
        
        String linha = br.readLine();
        while(linha != null)
            {
                System.out.println(linha);
                linha = br.readLine();
            }
    }

    private static void escritaArquivo() throws  IOException  {
        
        final String ARQ_SAIDA = "Caminho onde será criado o arquivo";
        FileWriter fw = new FileWriter(ARQ_SAIDA);
        BufferedWriter bw = new BufferedWriter(fw);
        
        String linha = "Hello world";
        bw.write(linha); bw.newLine();
        
        linha = "I'll kill you ><";
        bw.write(linha);
        
        bw.flush();//"commit"
    }

    private static void metodoSubString() {
        
        String dataAMR = "2022/10/28";
             
        String subAno = dataAMR.substring(0,4);
        String subMes = dataAMR.substring(4,8);
        String subDia = dataAMR.substring(8,10);
        
        String dataBR = subDia + subMes +subAno;
        System.out.println(dataBR);
        
    }

    private static void metodoSplit() {
        
        String nomeCompleto = "Victor Demetrius Marqueto Nascimento";
        String [] nomes = nomeCompleto.split(" ");
        System.out.println(nomes[0]);
        
        //Exercicio
        String dataAMR = "2022/10/28";
        String [] dataBR = dataAMR.split("/");
        System.out.println(dataBR[2]+"/"+dataBR[1]+"/"+dataBR[0]);
    }   
   
}
