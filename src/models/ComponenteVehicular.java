package models;

public class ComponenteVehicular {
    private String codigo;
    private String fabricante;

    public ComponenteVehicular(String codigo, String fabricante){
        this.codigo = codigo;
        this.fabricante = fabricante;
    }

    public void mostrarInformacion(){
        System.out.println("Código: " + codigo);
        System.out.println("Fabricante: " + fabricante);
    }
}
