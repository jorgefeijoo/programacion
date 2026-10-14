public class Alumno {
    private String nombre;
    private String matricula;
    private int energia;
    private int horas;

   
   
    public Alumno(String nombre, String matricula, int energia, int horas) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.energia = energia;
        this.horas=horas;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEnergia() {
        return energia;
    }

    public void setCalificaciones(int energia) {
        this.energia = energia;
    }



    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

// creacion de metodos
public void estudiar( ){
     double nota =0;
    int i;
    for(i=1; i<=horas;i++){
       energia=energia-10;
       nota=nota+0.5;
       if(energia<=0||nota>=10){
        break;
       }
    }
    System.out.println("la energia actual del alumno es "+ energia +" la nota del alumno es "+nota);
}
    
}
