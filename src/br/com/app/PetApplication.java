package br.com.app;

import br.com.negocio.*;
import br.com.modelo.*;


public class PetApplication {
	public static void main(String[] args) {
		
		AsciiArt.printAsciiArt("🐾 PetSitter");
		
		Menu menu = new Menu();
		
		Agenda agenda = new Agenda();
	
		
		int op = 1000;
		boolean continuar = true;
		
		while (continuar) {
			menu.imprimirMenu();
			
			Controle controle;
			controle = new Controle();
			
			boolean encontrado = false;
			boolean vazia = false;
			
			op = controle.opcao(); 
			
			switch (op) {
			
				case 0: 
					System.out.println("Quer mesmo Sair do Programa?");
					System.out.println("ESCOLHA:\n[1] Sim\n[2] Não");
					System.out.print("Opçao: ");
					int escolha = controle.opcao();
					
					while (escolha > 2 || escolha == 0) {
						System.out.println("Opção Inválida.");
						System.out.println("ESCOLHA:\n[1] Sim\n[2] Não");
						System.out.print("OPCAO: ");
						escolha = controle.opcao();
					}
					
					if (escolha == 1) {
						System.out.println("----------Programa Finalizado----------");
						System.exit(1);
					}
					else {
						System.out.println("O Programa Não Foi Encerrado.");
					}
					break;
					
			
				case 1: 
			
					menu.menuCadastro();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
					case 1:	
						agenda.cadastroCliente();
						break;
					
					case 2:	
						agenda.cadastroFuncionario();
						break;
					
					case 0:  
						continue;
					default:
						while(op>2 || op<1) {
							System.out.println("\nInforme Uma Opção Válida");
							System.out.print("Escolha uma Opção:");
							op = controle.opcao();
						}
						break;
					}
					
					break;
					
					
				case 2: 
					
					menu.agendar();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
						case 0:	
							break;
							
						case 1: 
							encontrado = false;
							
							vazia = agenda.verificaLista();
							
							if(!vazia){
								
								String cpf = agenda.verificaCPF();
														
								for(Pessoa cliente: agenda.clientes) {
									
									String k = cliente.getCpf(); 
															
									if (cpf.equals(k)) {
										encontrado = true;
										
										int posicao = agenda.clientes.indexOf(cliente);
										agenda.marcarData(posicao);
										System.out.println("Agendamento Realizado");
										break;
									}
									else {
										continue;
									}							
								}
								if(!encontrado) {
									System.out.printf("\nNão Existe Cliente Com o CPF %s.", cpf);
								}
							}
							break;
							
						case 2: 
							encontrado = false;
							vazia = agenda.verificaLista();
							
							if(!vazia) {
								
								String cpf = agenda.verificaCPF();
														
								for(Pessoa cliente: agenda.clientes) {
									
									String k = cliente.getCpf(); 
									
									if (cpf.equals(k)) {
										encontrado = true;
										
										
										int posicao = agenda.clientes.indexOf(cliente);
										agenda.editarAgendamento(posicao);
										System.out.println("Agendamento Realizado");
										break;
									}
									else {
										continue;
									}							
								}
								if(!encontrado) {
									System.out.printf("\nNão Existe Cliente Com Esse CPF %s.", cpf);
								}
							}
							break;
						
						default:
							while(op>2 || op<1) {
								System.out.println("\nInforme Uma Opção Válida!");
								System.out.print("Escolha Uma Opção:");
								op = controle.opcao();
							}
						break;
					}
					break;
					
				
				case 3:	
					menu.menuListagem();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
					
					case 1: 
						agenda.listaClientes();
						break;
					
					case 2: 
						agenda.listaFuncionarios();
						break;
					
					case 0: 
						continue;
					
					default:
						while(op>2 || op<1) {
							System.out.println("\nInforme Uma Opção Válida");
							System.out.print("Escolha Uma Opção:");
							op = controle.opcao();
						}
						break;
					}
					break;
				
					
				case 4: 
					menu.menuRanking();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
					case 1:
						menu.menuRankingRacasComuns();
						
						controle = new Controle();
						op = controle.opcao();
						
						agenda.gerarRankingRacas(op);
						break;
					case 2: 
						menu.menuRankingGenerosFavoritos();
						
						controle = new Controle();
						op = controle.opcao();
						
						agenda.gerarRankingGeneros(op);
						
						break;
					case 0: 
						continue;
					
					default:
						while(op>2 || op<1) {
							System.out.println("\nInforme Uma Opção Válida");
							System.out.print("Escolha uma Opção:");
							op = controle.opcao();
						}
						break;
					}
					break;

				case 5: 
					menu.menuHistorico();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
					case 1:				
						agenda.historicoCliente();
						break;
					case 2: 
						agenda.historicoFuncionario();
						break;
					case 0: 
						break;
					
					default:
						while(op>2 || op<1) {
							System.out.println("\nINFORME UMA OPÇÃO VÁLIDA!");
							System.out.print("ESCOLHA UMA OPÇÃO:");
							op = controle.opcao();
						}
						break;
					}
					break;
				
			}
		}
		
	}
}