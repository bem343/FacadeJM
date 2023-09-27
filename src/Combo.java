public class Combo {

    private Burguer Burguer = new Burguer();
    private Sobremesa Sobremesa = new Sobremesa();
    private Bebida Bebida = new Bebida();
    private int Tipo;

    @Override
    public String toString() {
        String retorno = "\n\n";
        switch (this.Tipo) {
            case 1:  retorno += "Combo Master\n"; break;
            case 2:  retorno += "Super Combo\n"; break;
            default: return "Pedido não registrado!";
        }

        retorno += "Burguer: " + Burguer.getDescricao() + " - " + Burguer.getGramas() + "g - R$" + Burguer.getPreco() + "\n";
        retorno += "Sobremesa: " + Sobremesa.getDescricao() + " - Tam. " + Sobremesa.getTamanho() + " - R$" + Sobremesa.getPreco() + "\n";
        retorno += "Bebida: " + Bebida.getDescricao() + " - " + Bebida.getMl() + "ml - R$" + Bebida.getPreco() + "\n";
        return retorno;
    }

    public void CriarCombo(int Tipo)  {

        this.Tipo = Tipo;
        switch (Tipo) {
            case 1:
                Burguer.setGramas(100);
                Burguer.setDescricao("Humburguer com Cheddar");
                Burguer.setPreco(2.33);

                Sobremesa.setTamanho(3);
                Sobremesa.setDescricao("Milk Shake pequeno");
                Sobremesa.setPreco(6.00);

                Bebida.setMl(120);
                Bebida.setDescricao("Refrigerante pequeno");
                Bebida.setPreco(1.98);
                break;
            case 2:
                Burguer.setGramas(300);
                Burguer.setDescricao("Humburguer duplo");
                Burguer.setPreco(3.89);

                Sobremesa.setTamanho(6);
                Sobremesa.setDescricao("Milk Shake Grande");
                Sobremesa.setPreco(8.00);

                Bebida.setMl(250);
                Bebida.setDescricao("Refrigerante Grande");
                Bebida.setPreco(3.00);
                break;
        }

    }

}
