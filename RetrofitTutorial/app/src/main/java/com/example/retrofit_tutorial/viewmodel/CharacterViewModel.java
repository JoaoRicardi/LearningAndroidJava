package com.example.retrofit_tutorial.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.retrofit_tutorial.model.Character;
import com.example.retrofit_tutorial.repository.CharacterRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class CharacterViewModel extends AndroidViewModel {

    private MutableLiveData<List<Character>> characterLiveData = new MutableLiveData<>();

    private CompositeDisposable disposable = new CompositeDisposable();
    private CharacterRepository characterRepository = new CharacterRepository();

    public CharacterViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<List<Character>> getCharacterLiveData() {
        return characterLiveData;
    }

    public void atualizarGames(){
        disposable.add(
                characterRepository.getCharactersList()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.newThread())
                    .subscribe(charactersList -> characterLiveData.setValue(charactersList),
                            throwable -> throwable.printStackTrace()
                    )
        );
    }


}
