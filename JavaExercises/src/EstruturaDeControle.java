import javax.swing.*;



class EstruturaDeControle

{

    public static void main (String entrada[])

    {

        int n1, n2, prod=0;

        char op=0;

        String msg="", msgEntr="Digite 1 para calcular o produto\nDigite 2 para calcular a produtoria\n";



        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));

        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));

        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);



        switch(op)

        {

            case '1':

            {

                if (n1%2==0 && n2%2==0)

                {

                    prod = n1*n2;

                    msg = msg + "Produto de " + n1 + " com " + n2 + " = " + prod + "\n\n";

                }

                break;

            }

            case '2':

            {

                prod = 1;

                for (int i=1; i<=n2; i=i+1)

                {

                    prod = prod * n1;

                }

                msg = msg + "Produtoria de " + n1 + " , " + n2 + " vezes eh: " + prod + "\n\n";

                break;

            }

            default: JOptionPane.showMessageDialog(null, "Opcao invalida, calculos nao realizados");

        }



        if (op >='1' && op <='3')

        {

            JOptionPane.showMessageDialog(null, msg);

        }

        System.exit(0);

    }

}