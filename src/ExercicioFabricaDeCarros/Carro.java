package ExercícioFábricaDeCarros;

public abstract class Carro {
    private int CavalosDePotencia;
    private String Combustivel;
    private String Cor;

    public Carro (int CavalosDePotencia, String Combustivel, String Cor) {
        this.CavalosDePotencia = CavalosDePotencia;
        this.Combustivel = Combustivel;
        this.Cor = Cor;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + Combustivel + " está funcionando e pronto para o uso" + horsePower + " horsepowers.n ");
    }
    public void clean(){
        System.out.println("Car has been cleaned, and the " + color.toLowerCase() + " color shines");
    }
    public void mechanicCheck(){
        System.out.println("Car has been checked by the mechanic. Everything looks good! ");
    }
    public void fuelCar(){
        System.out.println("Car is being filled with " + fuelSource.toLowerCase());
    }
}
