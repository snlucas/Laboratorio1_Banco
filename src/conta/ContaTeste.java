package src.conta;


public class ContaTeste {
    public static void main(String[] args) {
        Conta c1 = new Conta("1253667");
        c1.depositar(2738.49);
        c1.sacar(189);

        Conta c2 = new Conta("152[{))<script>alert(101);</script>");
        c2.sacar(4855);
        c2.depositar(-100);
        c2.depositar(10);

        Conta c3 = new Conta("45821111111111");
        //Conta c3 = new Conta("12345679");
        c3.depositar(100);
        c3.sacar(118);
        c3.sacar(8);
    }
}