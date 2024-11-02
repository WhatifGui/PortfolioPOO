package gerenciabanco;


import java.util.Scanner;

public class Banco {
    
    
    private double saldo;
    private final String agencia = "0001";
    private String nome;
    private String cpf;
    private String endereco;
    
    public Banco(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    
    public double getSaldo(){
        return saldo;
    }
    public String getAgencia(){
        return agencia;
    }
    public String getNome(){
        return nome;
    }       
    public void setNome(String nome){
        this.nome = nome;
    }       
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf ;
    }        
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
       this.endereco = endereco;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }        
    public void depSaldo(double saldo){
        this.saldo = this.saldo + saldo;
    }        
    public double extratoSaldo(){
        return this.getSaldo();
    }        
    public void sacar(double valor){
        if(valor <= saldo){
            this.saldo = this.saldo - valor;
            System.out.println("Sacando o valor: "+ valor);
            System.out.println("Saldo atual: R$ "+ this.saldo);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void menu() {
    	Scanner sc = new Scanner(System.in);
    	int x;

    	do {
    		double value;
    		
    		System.out.println("MENU BANCO ALPHA & OMEGA");
    		System.out.println("1. DEPOSITAR");
    		System.out.println("2. SACAR");
    		System.out.println("3. Extrato");
    		System.out.println("4. Informação da conta");
    		System.out.println("5. Encerrar sessão");
    		x = sc.nextInt();
    		switch(x) {
    			case 1: 
    				System.out.println("Deseja depositar quanto?");
    				value = sc.nextDouble();
    				this.depSaldo(value);
    				break;
    			case 2:
    				System.out.println("Deseja sacar quanto?");
    				value = sc.nextDouble();
    				this.sacar(value);
    				break;
    			case 3:
    				System.out.println("Saldo atual: " + this.getSaldo());
    				break;
    			case 4:
    				System.out.println("NOME: "+ this.getNome());
    				System.out.println("Endereço: "+ this.getNome());
    				System.out.println("CPF: "+ this.getCpf());
    				System.out.println("Agencia: "+ this.getAgencia());
    			case 5:
    				System.out.println("Programa encerrado.");
    				break;
    			default:
    				System.out.println("Não indentificado escolha no menu, escolha entre: 1,2,3 e 4.");
    				break;
    		}
    	}while(x != 5);
    	sc.close();
    }
}
