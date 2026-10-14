public class AppAlumno {
    public static void main(String[] args) {
        Alumno a1=new Alumno("Jorge","SanClemente",8,6);
    System.out.println("O nome do alumno e "+a1.getNombre()+" esta matriculado en "+ a1.getMatricula()+" y su nota media es "+a1.getEnergia());
    a1.estudiar();
   
   System.out.println("-----------------------------------------");
   
   Alumno a2 = new Alumno();
    a2.setNombre("Eli");
    a2.setMatricula("San Clemente");
    a2.setCalificaciones(90);
    a2.setHoras(5);
    a2.estudiar();
    System.out.println("O nome do alumno e "+a2.getNombre()+" esta matriculado en "+ a2.getMatricula()+" y su nota media es "+a2.getEnergia());
    }
}
