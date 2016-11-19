package ylse_matinez.puppy2;

     import android.app.Activity;
    import android.content.Intent;
    import android.support.v7.widget.RecyclerView;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ImageButton;
    import android.widget.ImageView;
    import android.widget.TextView;
    import android.widget.Toast;

    import java.util.ArrayList;

    /**
     * Created by dugli on 13/11/2016.
     */

    public class FavoritoAdaptador extends RecyclerView.Adapter<FavoritoAdaptador.FavoritosViewHolder> {

        ArrayList<Mascota> mascotasfav;
        Activity activity;

        public FavoritoAdaptador (ArrayList<Mascota> mascotasfav) {
            this.mascotasfav = mascotasfav;

        }

        @Override
        public FavoritosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
            return new FavoritosViewHolder(v);
        }


        @Override
        public void onBindViewHolder(FavoritosViewHolder favoritosViewHolder, int position) {
            final Mascota mascotafav = mascotasfav.get(position);
            favoritosViewHolder.imgFotofav.setImageResource(mascotafav.getFoto());
            favoritosViewHolder.tvNombrefav.setText(mascotafav.getNombre());
            favoritosViewHolder.tvlikefav.setText(mascotafav.getCantLike());
        }

        @Override
        public int getItemCount(){
            return mascotasfav.size();
        }

        public static class FavoritosViewHolder extends RecyclerView.ViewHolder {

            private ImageView imgFotofav;
            private TextView tvNombrefav;
            private TextView tvlikefav;


            public FavoritosViewHolder(View itemView) {
                super(itemView);
                imgFotofav = (ImageView) itemView.findViewById(R.id.imgFotofav);
                tvNombrefav = (TextView) itemView.findViewById(R.id.tvNombrefav);
                tvlikefav = (TextView) itemView.findViewById(R.id.tvlikefav);


            }
        }
    }



