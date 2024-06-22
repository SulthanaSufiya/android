package com.example.menu7prg;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater()
                .inflate(R.menu.menu,menu);
        return true;
    }
        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item){

            if (item.getItemId() == R.id.search_item) {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.upload_item) {
                Toast.makeText(this, "Upload", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.copy_item) {
                Toast.makeText(this, "Copy", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.print_item) {
                Toast.makeText(this, "Print", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.share_item) {
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
            }
            if (item.getItemId() == R.id.bookmark_item) {
                Toast.makeText(this, "Bookmark", Toast.LENGTH_SHORT).show();
            }
            return super.onOptionsItemSelected(item);
        }


}
