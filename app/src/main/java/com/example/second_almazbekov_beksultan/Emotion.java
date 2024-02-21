package com.example.second_almazbekov_beksultan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.second_almazbekov_beksultan.databinding.ActivityEmotionBinding;

import java.util.ArrayList;
import java.util.List;

public class Emotion extends AppCompatActivity {

    ActivityEmotionBinding binding;
    private final List<int[]> combinationList = new ArrayList<>();
    private int[] boxPosition = {0,0,0,0,0,0,0,0,0};
    private int playerTurn = 1;
    private int totalSelection = 0;

    private boolean isEnd = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEmotionBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        combinationList.add(new int[]{0,1,2});
        combinationList.add(new int[]{3,4,5});
        combinationList.add(new int[]{6,7,8});
        combinationList.add(new int[]{0,4,8});
        combinationList.add(new int[]{2,4,6});
        combinationList.add(new int[]{0,3,6});
        combinationList.add(new int[]{1,4,7});
        combinationList.add(new int[]{2,5,8});

        binding.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBoxSelected(0)){
                    performAction((ImageView) v,0);
                }
            }
        });
        binding.image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelected(1)){
                    performAction((ImageView) v,1);
                }
            }
        });
        binding.image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelected(2)){
                    performAction((ImageView) v,2);
                }
            }
        });
        binding.image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelected(3)){
                    performAction((ImageView) v,3);
                }
            }
        });
        binding.image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelected(4)){
                    performAction((ImageView) v,4);
                }
            }
        });
        binding.image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelected(5)){
                    performAction((ImageView) v,5);
                }
            }
        });
        binding.image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelected(6)){
                    performAction((ImageView) v,6);
                }
            }
        });
        binding.image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelected(7)){
                    performAction((ImageView) v,7);
                }
            }
        });
        binding.image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isBoxSelected(8)){
                    performAction((ImageView) v,8);
                }
            }
        });

    }
    private void performAction(ImageView imageView, int selected){
        if (isEnd)return;
        boxPosition[selected] = playerTurn;
        System.out.println(selected);
        if (playerTurn == 1) {
            imageView.setImageResource(R.drawable.x);
            binding.textView3.setText("Ход - O");
            if (checkResult()){
                binding.textView2.setText("X Победил!");
                System.out.println("Player 1");
                isEnd = true;
            }
            playerTurn = 2;
        }
        else {
            imageView.setImageResource(R.drawable.o);
            binding.textView3.setText("Ход - X");
            if (checkResult()){
                binding.textView2.setText("О Победил!");
                System.out.println("Player 2");
                isEnd = true;
            }
            playerTurn = 1;
        }
    }
    private boolean checkResult(){
        boolean res = false;
        for (int i = 0; i < combinationList.size(); i++) {
            final int[] combination = combinationList.get(i);
            if (boxPosition[combination[0]] == playerTurn && boxPosition[combination[1]] == playerTurn &&
            boxPosition[combination[2]] == playerTurn){
                res = true;
            }
        }
        return res;
    }

    private boolean isBoxSelected(int boxPos){
        boolean res = false;
        if (boxPosition[boxPos] == 0){
            res = true;
        }
        return res;
    }

    public void restartMatch(View view) {
        boxPosition = new int[] {0,0,0,0,0,0,0,0,0};
        playerTurn  = 1;
        isEnd = false;
        binding.textView3.setText("Ход - X");
        binding.textView2.setText("Никто!");
        totalSelection = 0;
        binding.image1.setImageResource(R.drawable.border);
        binding.image2.setImageResource(R.drawable.border);
        binding.image3.setImageResource(R.drawable.border);
        binding.image4.setImageResource(R.drawable.border);
        binding.image5.setImageResource(R.drawable.border);
        binding.image6.setImageResource(R.drawable.border);
        binding.image7.setImageResource(R.drawable.border);
        binding.image8.setImageResource(R.drawable.border);
        binding.image9.setImageResource(R.drawable.border);

    }

    public void goBack(View view) {
        onBackPressed();
    }
}