package com.example.retrofit_tutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.retrofit_tutorial.adapter.CharacterAadapter;
import com.example.retrofit_tutorial.viewmodel.CharacterViewModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView characterRecyclerView;
    private CharacterAadapter characterAadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characterRecyclerView = findViewById(R.id.character_recycler_view_id);
        characterAadapter =  new CharacterAadapter();

        characterRecyclerView.setAdapter(characterAadapter);
        characterRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        CharacterViewModel characterViewModel = ViewModelProviders.of(this).get(CharacterViewModel.class);

        characterViewModel.atualizarGames();
        characterViewModel.getCharacterLiveData()
                .observe(this,characterList -> characterAadapter.addCharacter(characterList));


    }
}


/*              TODO RETROFIT COM STETHO
* TODO 1- Criar a model apartir do retorno que vem do json.
*  2- se houver necessidade criar a response model.
*  3- criar a service( retrofitservice + interfaceAPi)
*  4- criar a repository.
*  5- criar a ViewModel
*  6- dar permissao no manifest!
*  Para ADICIONAR O STETHO
*  no retrofit service settar ele.
*  criar uma classe aplication
*  colocar dentro do manifest como application name

* */

/*          TODO RECYCLERVIEW
*todo 1- criar o recyclerView no xml
* 2- criar o content list item
* 3- criar o adapter
* 3.1- se voce estiver usando MVVM criar o metodo que atualiza a lista
* 4- criar a classe view holder a fazer o bind
* 5- na pagina correspondete a posciao no xml(nesse caso a mainactivity)
* 6- setUp recyclerview
*
* */