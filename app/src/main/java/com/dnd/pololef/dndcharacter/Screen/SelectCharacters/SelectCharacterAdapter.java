package com.dnd.pololef.dndcharacter.Screen.SelectCharacters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.dnd.pololef.dndcharacter.R;
import com.dnd.pololef.dndcharacter.Screen.EditCharacter.EditCharacterActivity;

import java.util.zip.Inflater;

/**
 * Created by Pololef on 2017/4/4.
 * 選擇腳色清單的配置器
 */
public class SelectCharacterAdapter extends BaseAdapter implements View.OnClickListener {
    public SelectCharacterAdapter(Activity activity){
        mInflater = (LayoutInflater)(activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        mActivity = activity;
    }

    private LayoutInflater mInflater;

    private Activity mActivity;

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.select_character_item,null);
            Button enterButton = (Button)convertView.findViewById(R.id.button_enter_edit);
            enterButton.setOnClickListener(this);
        }
        return convertView;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(mActivity, EditCharacterActivity.class);
        mActivity.startActivity(intent);
    }
}
