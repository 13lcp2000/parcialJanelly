package parcialDiego;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        problema1();
        problema2();
    }
    
    //Problemas Resueltos
    
    private static void problema1() {
        
        mostrar("PROBLEMA #1");
        String respuesta;
        int numEstudiantes = 0;
        double PromedioGrupo = 0;
        int numEstudiantesQueGanan = 0;
        
        do {
            
            Estudiante e = crearEstudiante();
            numEstudiantes += 1;
            
            PromedioGrupo += (e.calcularDefinitiva());
            if (e.calcularDefinitiva() > 2.95) {numEstudiantesQueGanan += 1;}
            
            respuesta = ingresarS("Hay otro Estudiante?");
            
        }while(((respuesta.charAt(0)+"").equalsIgnoreCase("s")));
        
        promedioDelGrupo(numEstudiantes, PromedioGrupo);
        mostrar("Aprobaron " + numEstudiantesQueGanan + " estudiantes.");
    }
    
    public static void problema2() {
        
        mostrar("PROBLEMA #2");
        int ganaronUSB = 0;
        int valorCompra = 0;
        String respuesta = "";
        int totalEnDescuentos = 0;
        
        do {            
            valorCompra = ingresarI("Digite el valor de su compra");
            
            if ((valorCompra >= 100000) && (valorCompra < 999.999 )) {
               mostrar("Usted se acaba de ganar un Descuento"
                       +"\n del 23% sobre el valor de su compra "
                       +"\nel valor total a pagar es "+(valorCompra * 0.77));
               totalEnDescuentos += (valorCompra * 0.23);
            }else if(valorCompra > 1000000){
               mostrar("Usted se acaba de ganar un Descuento"
                      +"\n del 23% sobre el valor de su compra "
                      +"\nel valor total a pagar es "+(valorCompra * 0.77));
                mostrar("Y ademas... se gano tambien una USB! :D");
               totalEnDescuentos += (valorCompra * 0.23);
            }
        respuesta = ingresarS("Hay otro Cliente?");
        }while(((respuesta.charAt(0)+"").equalsIgnoreCase("s")));
        mostrar("El total de descuento que otogro el\n"
                + "Supermercado fue de " + totalEnDescuentos);
    } 
    
    //Metodos para resolver los Problemas
    
    public static Estudiante crearEstudiante() {
        Estudiante e = new Estudiante(
                ingresarD("Digite la Nota1 del estudiante"),
                ingresarD("Digite la Nota2 del estudiante"),
                ingresarD("Digite la Nota3 del estudiante"));
        return e;
    }

    public static double ingresarD(String cadena) {
        double d = (Double.parseDouble(JOptionPane.showInputDialog(cadena)));
        return d;
    }
    
    public static int ingresarI(String cadena) {
        Integer i = (Integer.parseInt(JOptionPane.showInputDialog(cadena)));
        return i;
    }
    
    public static String ingresarS(String cadena) {
        String s = JOptionPane.showInputDialog(cadena);
        return s;
    }

    public static void mostrar(String cadena) {
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    public static void promedioDelGrupo(int numEst, double PromGrup){
        mostrar("El promedio del grupo en general fue de: "+ (PromGrup/numEst) +".");
    }
    
}