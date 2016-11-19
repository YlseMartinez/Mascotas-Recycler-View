package ylse_matinez.puppy2;

/**
 * Created by dugli on 13/11/2016.
 */

public class Mascota {
    private String nombre;
    private int foto;
    private String cantLike;

    public Mascota(String nombre, int foto, String cantLike) {
        this.nombre = nombre;
        this.foto = foto;
        this.cantLike = cantLike;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getCantLike() {
        return cantLike;
    }

    public void setCantLike(String cantLike) {
        this.cantLike = cantLike;
    }
}
