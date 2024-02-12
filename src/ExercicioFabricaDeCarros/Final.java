package ExercicioFabricaDeCarros;

public class Demo {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("A", true);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.create(cliente.getGradeRequest());
        carro.motor();
    }

    private static Fabrica getFabrica (Cliente cliente){
        if (cliente.HasCompanyContratc()){
            return new Contratos();
        } else {
            return new SemContrato();
        }
    }
}
