package entidades;

public class Roupa {
    private String brand;
    private String type;
    private String size;
    private int inventory;
    private double price;

    public Roupa(String brand, String type, String size, int inventory, double price) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.inventory = inventory;
        this.price = price;
    }

    public String getInventoryValue() {
        return "\nValor em estoque: R$" + inventory * price;
    }

    public String setIncreaseInventory(int toIncrease) {
        if (toIncrease > 0) {
            this.inventory += toIncrease;
            return "\nEstoque atualizado: " + this.inventory + getInventoryValue();
        } else {
            return "\nValor inválido!";
        }
    }

    public String setDecreaseInventory(int toDecrease) {
        if (toDecrease < 0) {
            return "\nValor inválido!";
        } else if (toDecrease > this.inventory) {
            return "\nNão há peças suficientes disponíveis";
        } else {
            this.inventory -= toDecrease;
            return "\nEstoque atualizado: " + this.inventory  + getInventoryValue();
        }
    }

    @Override
    public String toString() {
        return  "\nMarca: " + brand +
                "\nTipo: " + type +
                "\nTamanho: " + size +
                "\nEstoque: " + inventory + " unidades" +
                getInventoryValue();
    }
}
