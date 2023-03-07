package SusSystem1.crm;

public class ServiceFlorestaTech {
    private ServiceFlorestaTech(){
        super();
    }

    public static void gravarcliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema do Floresta Tech");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
