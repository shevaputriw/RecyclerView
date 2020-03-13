package id.ac.polinema.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.Latihan;

public class LatihanAdapter extends RecyclerView.Adapter<LatihanAdapter.ViewHolder> {
    private Context context;
    private List<Latihan> items;
    private static  final int LOGO_LEFT = 1;
    private static final int LOGO_RIGHT = 2;

    public LatihanAdapter(Context context, List<Latihan> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        if(viewType == LOGO_LEFT) {
            view = LayoutInflater.from(context).inflate(R.layout.item_latihan, parent, false);
        } else if(viewType == LOGO_RIGHT) {
            view = LayoutInflater.from(context).inflate(R.layout.item_latihan2, parent, false);
        }
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Latihan item = items.get(position);

        //Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.nameText.setText(item.getNama());
        holder.nameText1.setText(item.getNama1());
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    @Override
    public int getItemViewType(int position) {
        return (position % 4 == 0 || position % 4 == 3) ? LOGO_RIGHT : LOGO_LEFT;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText, nameText1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
            nameText1 = itemView.findViewById(R.id.text_name1);
        }
    }
}
