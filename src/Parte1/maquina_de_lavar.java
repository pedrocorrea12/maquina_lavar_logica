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
            System.out.println("MENU DE SIMULAÇÃO");
            System.out.println("==============================================");

            System.out.println("1-Configurar máquina de lavar");
            System.out.println("2-Simular máquina de lavar");
            System.out.println("0-Sair");

            System.out.println("Digite o código: ");
            opcao = teclado.nextInt();

            if (opcao == 1){
                System.out.println("==============================================");
                System.out.println("CONFIGURAR MÁQUINA DE LAVAR");
                System.out.println("==============================================");

                System.out.println("Modelo:");
                modelo = teclado.next();
                System.out.println("Nome:");
                nome = teclado.next();
                System.out.println("Voltagem 220/110 V:");
                int voltagem = teclado.nextInt();
                System.out.println("Quantos kg:");
                int kg = teclado.nextInt();
                System.out.println("Duração do estágio 1 - Lavação Pesada: ");
                stage1 = teclado.nextInt();
                System.out.println("Duração do estágio 2 - Lavação Normal: ");
                stage2 = teclado.nextInt();
                System.out.println("Duração do estágio 3 - Lavação Leve: ");
                stage3 = teclado.nextInt();
                System.out.println("Duração do estágio 4 - Enxague: ");
                stage4 = teclado.nextInt();
                System.out.println("Duração do estágio 5 - Centrifuga:");
                System.out.println("Sua máquina foi configurada");
                configurado = true;
                
            } else if (opcao == 2 && configurado == true){
                System.out.println("==============================================");
                System.out.println("SIMULAÇÃO MÁQUINA DE LAVAR");
                System.out.println("==============================================");

                System.out.println("==============================================");
                System.out.println("QUAL ESTÁGIO VOCÊ DESEJA COMEÇAR");
                System.out.println("==============================================");
                System.out.println("1-Lavação Pesada");
                System.out.println("2-Lavação Normal");
                System.out.println("3-Lavação Leve");
                System.out.println("4-Lavação enxague");
                System.out.println("5-Lavação Centrifuga");
                System.out.println("Selecione o estágio inicial:");
                opcao_estagio = teclado.nextInt();

                
                switch (opcao_estagio) {
                   
                
                case 1:
                        for (int i = 20; i <= 00; i += 20) {
                            System.out.println("Estágio 1 - Em Lavação Pesada: " + i + "%");
                            Thread.sleep(5000);
                        }
                        for (int i = 20; i <= 100; i += 20) {
                            System.out.println("Estágio 2 - Em Lavação Normal: " + i + "%");
                            Thread.sleep(5000);
                        }
                        for (int i = 20; i <= 100; i += 20) {
                            System.out.println("Estágio 3 - Em Lavação Leve: " + i + "%");
                            Thread.sleep(5000);
                        }
                        for (int i = 20; i <= 100; i += 20) {
                            System.out.println("Estágio 4 - Em Enxague: " + i + "%");
                            Thread.sleep(5000);
                        }
                        for (int i = 20; i <= 100; i += 20) {
                            System.out.println("Estágio 5 - Em Centrífuga: " + i + "%");
                            Thread.sleep(5000);
                        }
                        break;
                    case 2:
        				
        				System.out.println("Estágio 2 - Em Lavação Normal: 20%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 2 - Em Lavação Normal: 40%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 2 - Em Lavação Normal: 60%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 2 - Em Lavação Normal: 80%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 2 - Em Lavação Normal: 100%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 3 - Em Lavação Leve: 20%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 3 - Em Lavação Leve: 40%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 3 - Em Lavação Leve: 60%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 3 - Em Lavação Leve: 80%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 3 - Em Lavação Leve: 100%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 4 - Em Enxague: 20%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 4 - Em Enxague: 40%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 4 - Em Enxague: 60%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 4 - Em Enxague: 80%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 4 - Em Enxague: 100%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 5 - Centrifuga: 20%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 5 - Centrifuga: 40%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 5 - Centrifuga: 60%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 5 - Centrifuga: 80%");
        				TimeUnit.SECONDS.sleep(5);
        				System.out.println("Estágio 5 - Centrifuga: 100%");
        				TimeUnit.SECONDS.sleep(5);
        				} break;
            				case 3:
        		
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Estágio 3 - Em Lavação Leve: "+i+"%");
					   Thread.sleep(5000);
				}
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Estágio 4 - Em Enxague: "+i+"%");
					   Thread.sleep(5000);
				}
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Estágio 5 - Em Centrífuga: "+i+"%");
					   Thread.sleep(5000);
				}break;
        				case 4:
    			
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Estágio 4 - Em Enxague: "+i+"%");
					   Thread.sleep(250);
				}
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Estágio 5 - Em Centrífuga: "+i+"%");
					   Thread.sleep(250);
					   
				}break;
        				case 5:
		
				for(int i = 20; i< 100;i+=20){
					   System.out.println("Estágio 5 - Em Centrífuga: "+i+"%");
					   Thread.sleep(250);   
				}break;

                System.out.println("Processo finalizado!");
            } else {
                System.out.println("você escolheu uma opção inválida");
            }
        } while (opcao != 0);
    }

		  
		
		
		
	}


