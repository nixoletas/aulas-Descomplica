import javax.swing.*;



public class ModulosEMatrizes {



    //funcao de fazer a produtoria dos numeros da matriz

    public static void produtoria (){

        int prod = 1;

        int vet[] = new int[5];



        for (int i = 0; i < vet.length ; i++){

            prod = prod * vet[i];

        }

    }



    public static void main (String entrada[]){

        int vetor[] = {2,4,6,8,10};

        String msg = "vetor = ";

        String msg2 = "Somatoria dos números do vetor = ";

        String msg3 = "Produtoria dos números do vetor = ";

        String msg4 = "Produtoria dos números do vetor utilizando função = ";

        int soma = 0;

        int produto = 1;



        //exibe o vetor na tela

        for (int i = 0; i < vetor.length ; i++){

           msg = msg + vetor[i] + " ";

        }

        JOptionPane.showMessageDialog(null, msg);



        //faz a somatoria dos numeros do vetor

        for (int i = 0; i < vetor.length ; i++){

            soma = soma + vetor[i];

        }

        msg2 = msg2 + soma + " ";

        JOptionPane.showMessageDialog(null, msg2);



        //faz a produtoria dos numeros do vetor

        for (int i = 0; i < vetor.length ; i++){

            produto = produto * vetor[i];

        }

        msg3 = msg3 + produto + " ";

        JOptionPane.showMessageDialog(null, msg3);



        //faz a produtoria atravez de uma funcao

        produtoria();

        msg4 = msg4 + produto + " ";

        JOptionPane.showMessageDialog(null, msg4);

    }

}