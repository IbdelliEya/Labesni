package com.example.labesni.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.labesni.Domain.BannerModel;
import com.example.labesni.Domain.CategoryModel;
import com.example.labesni.Domain.ItemsModel;
import com.example.labesni.Respository.MainRespository;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {
    private final MainRespository respository=new MainRespository();
    public LiveData<ArrayList<CategoryModel>> loadCategory(){
        return respository.loadCategory();
    }

    public LiveData<ArrayList<BannerModel>> loadBanner(){
        return respository.loadBanner();
    }


    public LiveData<ArrayList<ItemsModel>> loadPopular(){
        return respository.loadPopular();

    }
}
