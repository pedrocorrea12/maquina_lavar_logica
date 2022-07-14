/**
 * 
 */
package Parte1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author jpedr
 *
 */
public class maquina_de_lavar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);

  
        boolean configurado = false;
        String modelo;
        String nome;
        int stage1, stage2, stage3, stage4, stage5, opcao_menu, opcao_estagio;
        int opcao;

        do {
            System.out.println("==============================================");
            System.out.println("MENU DE SIMULA��O");
            System.out.println("==============================================");

            System.out.println("1-Configurar m�quina de lavar");
            System.out.println("2-Simular m�quina de lavar");
            System.out.println("0-Sair");

            System.out.println("Digite o c�digo: ");
            opcao = teclado.nextInt();

            if (opcao == 1){
                System.out.println("==============================================");
                System.out.println("CONFIGURAR M�QUINA DE LAVAR");
                System.out.println("==============================================");

                System.out.println("Modelo:");
                modelo = teclado.next();
                System.out.println("Nome:");
                nome = teclado.next();
                System.out.println("Voltagem 220/110 V:");
                int voltagem = teclado.nextInt();
                System.out.println("Quantos kg:");
                int kg = teclado.nextInt();
                System.out.println("Dura��o do est�gio 1 - Lava��o Pesada: ");
                stage1 = teclado.nextInt();
                System.out.println("Dura��o do est�gio 2 - Lava��o Normal: ");
                stage2 = teclado.nextInt();
                System.out.println("Dura��o do est�gio 3 - Lava��o Leve: ");
                stage3 = teclado.nextInt();
                System.out.println("Dura��o do est�gio 4 - Enxague: ");
                stage4 = teclado.nextInt();
                System.out.println("Dura��o do est�gio 5 - Centrifuga:");
                System.out.println("Sua m�quina foi configurada");
                configurado = true;
                
            } else if (opcao == 2 && configurado == true){
                System.out.println("==============================================");
                System.out.println("SIMULA��O M�QUINA DE LAVAR");
                System.out.println("==============================================");

                System.out.println("==============================================");
                System.out.println("QUAL EST�GIO VOC� DESEJA COME�AR");
                System.out.println("==============================================");
                System.out.println("1-Lava��o Pesada");
                System.out.println("2-Lava��o Normal");
                System.out.println("3-Lava��o Leve");
                System.out.println("4-Lava��o enxague");
                System.out.println("5-Lava��o Centrifuga");
                System.out.println("Selecione o est�gio inicial:");
                opcao_estagio = teclado.nextInt();

                
                switch (opcao_estagio) {
                   
                
                case 1:
                        for (int i = 20; i <= 00; i += 20) {
                            System.out.println("Est�gio 1 - Em Lava��o Pesada: " + i + "%");
                            Thread.sleep(5000);
                        }
                        for (int i = 20; i <= 100; i += 20) {
                            System.out.println("Est�gio 2 - Em Lava��o Normal: " + i + "%");
                            Thread.sleep(5000);
                        }
                        for (int i = 20; i <= 100; i += 20) {
                            System.out.println("Est�gio 3 - Em Lava��o Leve: " + i + "%");
                            Thread.sleep(5000);
                        }
                        for (int i = 20; i <= 100; i += 20) {
                            System.out.println("Est�gio 4 - Em Enxague: " + i + "%");
                            Thread.sleep(5000);
                        }
                        for (int i = 20; i <= 100; i += 20) {
                            System.out.println("Est�gio 5 - Em Centr�fuga: " + i + "%");
                            Thread.sleep(5000);
                        }
                        break;
                    case 2:
        				
        				System.out.println("Est�gio 2 - Em Lava��o Normal: 20%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 2 - Em Lava��o Normal: 40%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 2 - Em Lava��o Normal: 60%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 2 - Em Lava��o Normal: 80%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 2 - Em Lava��o Normal: 100%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 3 - Em Lava��o Leve: 20%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 3 - Em Lava��o Leve: 40%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 3 - Em Lava��o Leve: 60%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 3 - Em Lava��o Leve: 80%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 3 - Em Lava��o Leve: 100%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 4 - Em Enxague: 20%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 4 - Em Enxague: 40%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 4 - Em Enxague: 60%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 4 - Em Enxague: 80%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 4 - Em Enxague: 100%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 5 - Centrifuga: 20%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 5 - Centrifuga: 40%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 5 - Centrifuga: 60%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 5 - Centrifuga: 80%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Est�gio 5 - Centrifuga: 100%");
        				TimeUnit.SECONDS.sleep(5);
        				} break;
            				case 3:
        		
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Est�gio 3 - Em Lava��o Leve: "+i+"%");
					   Thread.sleep(5000);
				}
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Est�gio 4 - Em Enxague: "+i+"%");
					   Thread.sleep(5000);
				}
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Est�gio 5 - Em Centr�fuga: "+i+"%");
					   Thread.sleep(5000);
				}break;
        				case 4:
    			
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Est�gio 4 - Em Enxague: "+i+"%");
					   Thread.sleep(250);
				}
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Est�gio 5 - Em Centr�fuga: "+i+"%");
					   Thread.sleep(250);
					   
				}break;
        				case 5:
		
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Est�gio 5 - Em Centr�fuga: "+i+"%");
					   Thread.sleep(250);   
				}break;

                System.out.println("Processo finalizado!");
            } else {
                System.out.println("voc� escolheu uma op��o inv�lida");
            }
        } while (opcao != 0);
    }

		  
		
		
		
	}


