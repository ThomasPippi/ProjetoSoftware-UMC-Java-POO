package entidades;

public class Vendedor extends Funcionario implements Bonificacao {
    private double metaVendas;

    public Vendedor(String nome, double salario, double metaVendas) {
        super(nome, salario);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "\nVendedor:" + super.toString() + "\nMetaVendas: " + metaVendas + "\nComissão: " + calcularComissao();
    }


    @Override
    public double calcularComissao() {
       return getSalario() * 0.02;
    }
}
