package com.dnd.pololef.dndcharacter.Screen.SelectCharacters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.dnd.pololef.dndcharacter.R;
import com.dnd.pololef.dndcharacter.Screen.EditCharacter.EditCharacterActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView characterList = (ListView)findViewById(R.id.listview_characters);
        characterList.setAdapter(new SelectCharacterAdapter(MainActivity.this));
    }
}
