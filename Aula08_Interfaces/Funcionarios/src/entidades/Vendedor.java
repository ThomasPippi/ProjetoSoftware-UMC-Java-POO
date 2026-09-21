package entidades;

public class Vendedor extends Funcionario {
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
}
