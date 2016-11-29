/**
 * Created by ANDRES on 27/10/2016.
 */
public class cuenta {
    private double balance;

    //void hace que no retorne nada
    //dentro de los parentecis en parametros de entrada  argumentos

    public void depositar(double cantidad){
        this.setBalance(this.getBalance() +cantidad);
    }

    public void retirar(double cantidad){
        this.setBalance(this.getBalance() - cantidad);

    }

    public double getBalance() {
        return balance;// para obtener el valor
    }

    public void setBalance(double balance) {
        this.balance = balance;//para asignarle el valor
    }
}
