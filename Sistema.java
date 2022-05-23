package sprint2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Sistema {
 
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        ArrayList<perfilCandidato> listaCandidatos = new ArrayList<>();
        ArrayList<perfilRecrutador> listaRecrutadores = new ArrayList<>();
       
        int perfilOpcao;
        int opcao;
        
        // variaveis candidato
        
        int id;
        String nome;
        int idade;
        String email;
        int tel;
        int cpf;
        String sexo;
        String estadoCivil;
        String endereco;
        String curriculo;
        
        // classes
        
        perfilCandidato perfilCan = null;
        perfilRecrutador perfilRec = null;
        
        // variaveis recrutador
        
        String area;
        
        
        System.out.printf("IBMatch - Sistema de Cadastro de Candidatos e Recrutadores \n\n");
        System.out.printf("Voce é \n" +
        				  "1 - CANDIDATO" +
        				  "2 - RECRUTADOR");
        System.out.printf("DIGITE 1 OU 2 PARA ESCOLHER => ");
        perfilOpcao = ler.nextInt();
        
        if (perfilOpcao == 1) {
        do {        
            System.out.printf("IBMatch - Sistema de Cadastro de Candidatos e Recrutadores \n\n VOCE ESCOLHEU: CANDIDATO \n\n");
            System.out.printf("Escolha uma das opções abaixo:\n");
            System.out.printf("1 - Incluir novo candidato \n" +
                              "2 - Atualizar cadastro de candidato \n" +
                              "3 - Excluir candidato \n" +
                              "4 - Exibir todos os candidatos \n" +
                              "5 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
           
            if (opcao == 1) {
                perfilCan = new perfilCandidato();
               
                id = listaCandidatos.size() + 1;
                perfilCan.setId(id);
               
                System.out.printf("\nDigite o nome do candidato: ");
                nome = ler.next();
                perfilCan.setNome(nome);
               
                System.out.printf("Digite a idade do candidato: ");
                idade = ler.nextInt();
                perfilCan.setIdade(idade);
                
                System.out.printf("Digite o email do candidato: ");
                email = ler.next();
                perfilCan.setEmail(email);
                
                System.out.printf("Digite o telefone do candidato: ");
                tel = ler.nextInt();
                perfilCan.setTelefone(tel);
                
                System.out.printf("Digite o CPF do candidato: ");
                cpf = ler.nextInt();
                perfilCan.setCpf(cpf);
                
                System.out.printf("Digite o estado civil do candidato: ");
                estadoCivil = ler.next();
                perfilCan.setEstadoCivil(estadoCivil);
                
                System.out.printf("Digite o endereco do candidato: ");
                endereco = ler.next();
                perfilCan.setEndereco(endereco);
               
                listaCandidatos.add(perfilCan);
               
                System.out.printf("Candidato incluido com sucesso.");
                System.in.read();
            }
            else if (opcao == 2) {    
            	
                for(perfilCandidato perfilC: listaCandidatos) {
                    System.out.printf("ID: %d - Nome: %s - Idade: %s \n", perfilC.getId(), perfilC.getNome(), perfilC.getIdade());
                }
               
                System.out.printf("\nDigite o id do candidato que deseja atualizar: ");
                id = ler.nextInt();
               
                System.out.printf("Digite o novo nome do candidato: ");
                nome = ler.next();
                perfilCan.setNome(nome);
         
               
                perfilCandidato perfilC = listaCandidatos.get(id-1);
               

                System.out.printf("Nome de candidato atualizado com sucesso!");
                System.in.read();
            }
            else if (opcao == 3) {
                for(perfilCandidato perfilC: listaCandidatos) {
                    System.out.printf("ID: %d - Nome: %s - Idade: %s \n", perfilC.getId(), perfilC.getNome(), perfilC.getIdade());
                }
               
               
                System.out.printf("\nDigite o id do candidato para exclusão: ");
                id = ler.nextInt();
 
                listaCandidatos.remove(id-1);
               
                System.out.printf("Candidato excluído com sucesso!");
                System.in.read();
            }
            else if (opcao == 4) {
                for(perfilCandidato perfilC: listaCandidatos) {
                    System.out.printf("ID: %d - Nome: %s - Idade: %s \n", perfilC.getId(), perfilC.getNome(), perfilC.getIdade());
                }
               
               
                System.in.read();
            }
        }while(opcao != 5);
        } 
        
        else if (perfilOpcao == 2) {
        	do {        
                System.out.printf("IBMatch - Sistema de Cadastro de Candidatos e Recrutadores \n\n VOCE ESCOLHEU: RECRUTADOR \n\n");
                System.out.printf("Escolha uma das opções abaixo:\n");
                System.out.printf("1 - Incluir novo recrutador \n" +
                                  "2 - Atualizar cadastro de recrutador \n" +
                                  "3 - Excluir recrutador \n" +
                                  "4 - Exibir todos os recrutadores \n" +
                                  "5 - Sair\n\n");
                System.out.printf("Digite a opção desejada: ");
                opcao = ler.nextInt();
               
                if (opcao == 1) {
                    
                	perfilRec = new perfilRecrutador();
                   
                    id = listaCandidatos.size() + 1;
                    perfilRec.setIdRecrutador(id);
                   
                    System.out.printf("\nDigite o nome do recrutador: ");
                    nome = ler.next();
                    perfilRec.setNome(nome);
                   
                    System.out.printf("Digite a área de atuacao do recrutador:  ");
                    area = ler.next();
                    perfilRec.setAreaAtuacao(area);
                    
                    System.out.printf("Digite o email do recrutador: ");
                    email = ler.next();
                    perfilRec.setEmailCorporativo(email);
                    
                    System.out.printf("Digite o telefone do recrutador: ");
                    tel = ler.nextInt();
                    perfilRec.setTelefoneContato(tel);
                
                   
                    listaRecrutadores.add(perfilRec);
                   
                    System.out.printf("Recrutador incluido com sucesso.");
                    System.in.read();
                }
                else if (opcao == 2) {    
                	
                    for(perfilRecrutador perfilR: listaRecrutadores) {
                        System.out.printf("ID: %d - Nome: %s - Area atuacao: %s \n", perfilR.getIdRecrutador(), perfilR.getNome(), perfilR.getAreaAtuacao());
                    }
                   
                    System.out.printf("\nDigite o id do recrutador que deseja atualizar o email: ");
                    id = ler.nextInt();
                   
                    System.out.printf("Digite o novo email do recrutador: ");
                    email = ler.next();
                    perfilRec.setEmailCorporativo(email);
             
                   
                    perfilRecrutador perfilR = listaRecrutadores.get(id-1);
                   

                    System.out.printf("Nome de candidato atualizado com sucesso!");
                    System.in.read();
                }
                else if (opcao == 3) {
                	
                    for(perfilRecrutador perfilR: listaRecrutadores) {
                        System.out.printf("ID: %d - Nome: %s - Area atuacao: %s \n", perfilR.getIdRecrutador(), perfilR.getNome(), perfilR.getAreaAtuacao());
                    }
                   
                   
                    System.out.printf("\nDigite o id do recrutador para exclusão: ");
                    id = ler.nextInt();
     
                    listaRecrutadores.remove(id-1);
                   
                    System.out.printf("Recrutador excluído com sucesso!");
                    System.in.read();
                }
                else if (opcao == 4) {
                    for(perfilRecrutador perfilR: listaRecrutadores) {
                        System.out.printf("ID: %d - Nome: %s - Area atuacao: %s \n", perfilR.getIdRecrutador(), perfilR.getNome(), perfilR.getAreaAtuacao());
                    }
                   
                   
                    System.in.read();
                }
            }while(opcao != 5);
            
        }
       
        ler.close();
        
    }
}

