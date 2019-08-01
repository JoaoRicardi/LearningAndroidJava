package com.example.retrofit_tutorial.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit_tutorial.R;
import com.example.retrofit_tutorial.model.Character;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CharacterAadapter extends RecyclerView.Adapter<CharacterAadapter.ViewHolder>{

    private List<Character> characterList = new ArrayList<>();

    public void atualizarCharacter(List<Character> characterList){
        this.characterList = characterList;
        notifyDataSetChanged();
    }

    public void addCharacter(List<Character> characterList){
        this.characterList.addAll(characterList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.character_content_list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Character character = characterList.get(position);
        holder.bind(character);
    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView nome;
        private TextView firstTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.character_image_id);
            nome = itemView.findViewById(R.id.nome_do_personagem_text_view_id);
            firstTime = itemView.findViewById(R.id.fist_appeard_in_text_view_id);
        }

        private void bind(Character character){
            Picasso.get().load(character.getImage().getIcon_url()).into(image);
            nome.setText(character.getName());
            firstTime.setText(character.getFirst_apeard().getGameName());
        }
    }
}
