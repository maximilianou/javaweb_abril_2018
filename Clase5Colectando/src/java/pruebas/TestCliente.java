package pruebas;

import entidades.Cliente;

public class TestCliente {
    public static void main(String[] args) {
        System.out.println("[..] test Cliente");
        Cliente mar = new Cliente("20200200","Maria","Martinez");
        Cliente car = new Cliente("30300300","Carla","Rojas");
        Cliente ros = new Cliente("40400400","Rosa","Torres");
        
//        Cliente epa = new Cliente("","Cabron","Rosales");
        

        System.out.println("[OK] test Cliente");
    }
}
