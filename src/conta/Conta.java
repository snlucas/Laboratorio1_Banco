package src.conta;
import java.util.Scanner;


public class Conta {
    private double saldo;
    private String numero;

    public void depositar(double valor) {
        if (valor > 0)
            this.saldo += valor;
        else
            System.out.println("[ ERRO ] - Valor informado deve ser positivo e não nulo!");
    }

    public boolean sacar(double valor) {
        if (this.saldo < valor) {
            return false;
        }

        this.saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "\nConta: " + this.numero + "\n\tSaldo: " + this.saldo;
    }

    public Conta(String numero) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número da conta: ");
        this.numero = sc.nextLine();
        sc.close();

        this.saldo = 0;
    }

}