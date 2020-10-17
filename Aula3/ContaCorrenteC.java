public class ContaCorrenteC {
    public String Nome;
    public String CPF;
    public double Saldo;

    public ContaCorrenteC(String nome, String cpf){
        Nome = nome;
        CPF = cpf;
        Saldo = 0;
    }

    public ContaCorrenteC(String nome, String cpf, Double saldo){
        Nome = nome;
        CPF = cpf;
        Saldo = saldo;
    }

    public double getSaldo(){
        return Saldo;
    }

    public String getTitular(){
        return Nome + ", " + CPF;
    }

    public void depositar(double quantia){
        if(quantia>0)
            Saldo += quantia;
    }

    public void sacar(double quantia){
        if(quantia>0 && quantia<=Saldo)
            Saldo -= quantia;
    }

    public static void transferir(ContaCorrenteC a, ContaCorrenteC b, double quantia){
        if(quantia <= a.Saldo){
            a.sacar(quantia);
            b.depositar(quantia);
        }
    }
}
