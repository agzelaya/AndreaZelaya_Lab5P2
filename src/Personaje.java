public class Personaje {
    private String nombre;
    private String poder;
    private String debilidad;
    private String universo;
    private int fuerza;
    private int agilidad_fisica;
    private int agilidad_mental;
    private int hp;

    public Personaje() {
    }

    public Personaje(String nombre, String poder, String debilidad, String universo, int fuerza, int agilidad_fisica, int agilidad_mental, int hp) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agilidad_fisica = agilidad_fisica;
        this.agilidad_mental = agilidad_mental;
        this.hp = hp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad_fisica() {
        return agilidad_fisica;
    }

    public void setAgilidad_fisica(int agilidad_fisica) {
        this.agilidad_fisica = agilidad_fisica;
    }

    public int getAgilidad_mental() {
        return agilidad_mental;
    }

    public void setAgilidad_mental(int agilidad_mental) {
        this.agilidad_mental = agilidad_mental;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return nombre;
    }


    
    
}
