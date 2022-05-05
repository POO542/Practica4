public class Practica4
{
    public static void main(String[] args)
    {
        int opcion;
        String nombre, apellidoPaterno, apellidoMaterno;
        Operaciones usuario = new Operaciones();
        do {
            System.out.println("1. CURP");
            System.out.println("2. RFC");
            System.out.println("3. CURP y RFC");
            System.out.println("4. Salir");
            opcion = CapturaEntrada.capturarEntero("Ingrese opcion");
            switch (opcion)
            {
                case 1:
                    nombre = CapturaEntrada.capturarString("Captura nombre");
                    apellidoPaterno = CapturaEntrada.capturarString("Captura apellido paterno");
                    apellidoMaterno = CapturaEntrada.capturarString("Captura apellido mateno");
                    usuario.setBase(nombre,apellidoPaterno,apellidoMaterno,CapturaEntrada.capturarString("Fecha (dd/mm/aa)"));
                    usuario.setCurp(CapturaEntrada.capturarString("Sexo (H/M)"),CapturaEntrada.capturarString("Estado (MX)"),nombre,apellidoPaterno,apellidoMaterno);
                    System.out.println(usuario.getCurp());
                    break;
                case 2:
                    nombre = CapturaEntrada.capturarString("Captura nombre");
                    apellidoPaterno = CapturaEntrada.capturarString("Captura apellido paterno");
                    apellidoMaterno = CapturaEntrada.capturarString("Captura apellido mateno");
                    usuario.setBase(nombre,apellidoPaterno,apellidoMaterno,CapturaEntrada.capturarString("Fecha (dd/mm/aa)"));
                    usuario.setRfc();
                    System.out.println(usuario.getRfc());
                    break;
                case 3:
                    nombre = CapturaEntrada.capturarString("Captura nombre");
                    apellidoPaterno = CapturaEntrada.capturarString("Captura apellido paterno");
                    apellidoMaterno = CapturaEntrada.capturarString("Captura apellido mateno");
                    usuario.setBase(nombre,apellidoPaterno,apellidoMaterno,CapturaEntrada.capturarString("Fecha (dd/mm/aa)"));
                    usuario.setCurp(CapturaEntrada.capturarString("Sexo (H/M)"),CapturaEntrada.capturarString("Estado (MX)"),nombre,apellidoPaterno,apellidoMaterno);
                    usuario.setRfc();
                    System.out.print("Su CURP es: ");
                    System.out.println(usuario.getCurp());
                    System.out.print("Su RFC es: ");
                    System.out.println(usuario.getRfc());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 4);
    }
}
