public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }



    public void saque(Double valor) throws ContaExceptions {
        if (valor > limiteSaque) {
            throw new ContaExceptions("O valor não pode exceder o limite de saque ");
        }
        if (valor > saldo) {
            throw new ContaExceptions("Sem saldo suficinte");
        }
        saldo -= valor;
    }

}
