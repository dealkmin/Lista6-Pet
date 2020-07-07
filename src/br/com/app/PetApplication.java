package br.com.fatec.app;

import br.com.fatec.negocio.*;
import br.com.fatec.modelo.*;


public class App {
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
			
			op = controle.opcao(); // capita um int 
			
			switch (op) {
			
				case 0: //SAIR
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
					
			
				case 1: //Faz o Cadastro
			
					menu.menuCadastro();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
					case 1:	// Cadastra o Cliente
						agenda.cadastroCliente();
						break;
					
					case 2:	// Cadastra o Funcionar
						agenda.cadastroFuncionario();
						break;
					
					case 0: // Voltar 
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
					
					
				case 2: //Agendamentos
					
					menu.agendar();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
						case 0:	// Cancelar Agendamento
							break;
							
						case 1: // Adicionar Agendamento
							encontrado = false;
							
							vazia = agenda.verificaLista();
							
							if(!vazia){
								
								String cpf = agenda.verificaCPF();
														
								for(Pessoa cliente: agenda.clientes) {
									// Pegar o CPF de todos os clientes cadastrados na lista
									String k = cliente.getCpf(); 
															
									if (cpf.equals(k)) {
										encontrado = true;
										// Verifica se o CPF Solicitado Está na Lista
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
							
						case 2: // Editar Agendamento
							encontrado = false;
							vazia = agenda.verificaLista();
							
							if(!vazia) {
								
								String cpf = agenda.verificaCPF();
														
								for(Pessoa cliente: agenda.clientes) {
									// CPF de Todos os Clientes Cadastrados na Lista
									String k = cliente.getCpf(); 
									
									if (cpf.equals(k)) {
										encontrado = true;
										
										// Vê se o CPF solicitado é igual a um CPF da lista de clientes
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
					
				
				case 3:	//Lista de Clientes e Funcionários
					menu.menuListagem();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
					
					case 1: // Lista de Clientes
						agenda.listaClientes();
						break;
					
					case 2: // Lista Dos Funcionários
						agenda.listaFuncionarios();
						break;
					
					case 0: // Voltar
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
				
					
				case 4: //Ranking dos Pets
					menu.menuRanking();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
					case 1:	// Ranking das Raças 
						menu.menuRankingRacasComuns();
						
						controle = new Controle();
						op = controle.opcao();
						
						agenda.gerarRankingRacas(op);
						break;
					case 2: // Ranking dos Gêneros
						menu.menuRankingGenerosFavoritos();
						
						controle = new Controle();
						op = controle.opcao();
						
						agenda.gerarRankingGeneros(op);
						
						break;
					case 0: // Voltar
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

				case 5: //HISTORICO DE ATENDIMENTO FUNCIONARIO PETSITTER
					menu.menuHistorico();
					controle = new Controle();
					op = controle.opcao();
					
					switch(op) {
					case 1:	// HISTORICO DO CLIENTE				
						agenda.historicoCliente();
						break;
					case 2: // HISTORICO DO FUNCIONARIO
						agenda.historicoFuncionario();
						break;
					case 0: // VOLTAR
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