package ylse_matinez.puppy2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.security.KeyStore;
import java.util.ArrayList;

public class Activity_favorito extends AppCompatActivity {

    ArrayList<Mascota> mascotasfav;
    private RecyclerView listaMascotasfav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorito);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.actionBarFavorito);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        listaMascotasfav = (RecyclerView) findViewById(R.id.rvMascotasfav);

        LinearLayoutManager llmfav = new LinearLayoutManager(this);
        llmfav.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotasfav.setLayoutManager(llmfav);
        inicializarListaMascotasfav();
        inicializarAdaptadorfav();
    }

    public  void inicializarAdaptadorfav(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotasfav);
        listaMascotasfav.setAdapter(adaptador);
    }

    public void inicializarListaMascotasfav(){
        mascotasfav = new ArrayList<Mascota>();

        mascotasfav.add(new Mascota("Ronny",R.drawable.mascota1,"5"));
        mascotasfav.add(new Mascota("Sally",R.drawable.mascota2,"1"));
        mascotasfav.add(new Mascota("Tando",R.drawable.mascota3,"3"));
        mascotasfav.add(new Mascota("Catty",R.drawable.mascota4,"2"));
        mascotasfav.add(new Mascota("Sasha",R.drawable.mascota5,"1"));

    }

}
