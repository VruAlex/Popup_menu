package com.example.vrushabh.popup_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =  findViewById(R.id.btnShow);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View my) {
                PopupMenu popupAlex = new PopupMenu(MainActivity.this, my);
                popupAlex.setOnMenuItemClickListener(MainActivity.this);
                popupAlex.inflate(R.menu.menu);
                popupAlex.show();
            }
        });
    }

    public boolean onMenuItemClick (MenuItem item) {
        //Toast Massage for every click
        Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            //We add a new intent while click on new button {NewActivity}
            case R.id.New_Activity:
                Intent i = new Intent(this, NewActivity.class);
                startActivity(i);
                return true;
            case R.id.upload_item:
                // do your code
                return true;
            case R.id.copy_item:
                // do your code
                return true;
            case R.id.print_item:
                // do your code
                return true;
            case R.id.share_item:
                // do your code
                return true;

            case R.id.bookmark_item:
                // do your code
                return true;
            default:
                return false;
        }
    }
}
