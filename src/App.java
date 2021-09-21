import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // portugol para faça
        // quando queremos executar um bloco de codigo um quantidade determinada de
        // vezes
        /*
         * for (int i = 1; i <= 100; i++) {//i=i+1 //verifica se o numero é par if (i %
         * 2 == 0) { System.out.println(i); } }
         */
        int i = 1;
        /*
         * while (i <= 100) { if (i % 2 != 0) { System.out.println(i); } i++; }
         */
        /*
         * do{ if (i % 2 == 0) { System.out.println(i); } i++; }while(i <= 100);
         */

        /*for (i = 100; i >= 1; i--) {// i=i-1
            // verifica se o numero é par
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        /*int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadatro");
            System.out.println("2 - imprimir cadastro");
            System.out.println("0 - sair");
            System.out.println("digite uma opcao: ");
            Scanner entrada = new Scanner(System.in);
            String temp = entrada.nextLine();
            opcao = Integer.parseInt(temp);

            /*if (opcao == 1) {
                System.out.println("opção 1 escolhida");
            } else if (){
                
            }*/
            /*switch (opcao) {
                case 1:
                    System.out.println("opção 1 escolhida");
                    break;
                case 2:
                    System.out.println("opção 2 escolhida");
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
            
                default:
                    System.out.println("opção invalida");
                    break;
            }
        } while (opcao != 0);*/
        /*for(i = 0; i < 10; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }*/

        /*i = 0;
        while(true){
            if(i == 4){
                break;
            }
            System.out.println(i);
            i++;
        }*/

        for(i = 0; i < 10; i++){
            if(i == 4){
                continue;
                //System.out.println("Arroz");
            }
            System.out.println(i);
        }
    }
}
