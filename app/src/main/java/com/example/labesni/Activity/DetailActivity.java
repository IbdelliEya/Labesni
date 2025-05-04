package com.example.labesni.Activity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bumptech.glide.Glide;
import com.example.labesni.Adapter.ColorAdapter;
import com.example.labesni.Adapter.PicListAdapter;
import com.example.labesni.Adapter.SizeAdapter;
import com.example.labesni.Domain.ItemsModel;
import com.example.labesni.Helper.ManagmentCart;
import com.example.labesni.R;
import com.example.labesni.databinding.ActivityDetailBinding;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
 private ActivityDetailBinding binding;
 private ItemsModel object;
 private int numberOrder=1;
private ManagmentCart managmentCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ManagmentCart ManagmentCart = new ManagmentCart(this);

        getBundles();
        initPicList();
        initSize();
        initColor();

    }

    private void initColor() {
        binding.recyclerColor.setAdapter(new ColorAdapter(object.getColor()));
        binding.recyclerColor.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
    }

    private void initSize() {
        binding.recyclerSize.setAdapter(new SizeAdapter(object.getSize()));
        binding.recyclerSize.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
    }

    private void initPicList() {
        ArrayList<String> picList=new ArrayList<>(object.getPicUrl());

        Glide.with(this)
                .load(picList.get(0))
                .into(binding.pic);

        binding.picList.setAdapter(new PicListAdapter(picList,binding.pic));
        binding.picList.
                setLayoutManager(new LinearLayoutManager(this,
                        LinearLayoutManager.HORIZONTAL,false));
    }

    private void getBundles() {
        object= (ItemsModel) getIntent().getSerializableExtra( "object");
        binding.titleTxt.setText(object.getTitle());
        binding.priceTxt.setText("dt"+object.getPrice());
        binding.oldPriceTxt.setText("dt"+object.getOldPrice());
        binding.oldPriceTxt.setPaintFlags(binding.oldPriceTxt.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);

        binding.descriptionTxt.setText(object.getDescription());
        binding.addToCartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                object.setNumberinCart(numberOrder);
                managmentCart.insertItem(object);
            }
        });
        binding.backBtn.setOnClickListener(v -> finish());
    }

}