package com.ookamitech.phiokenosi.trial_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText etWord = (EditText) findViewById(R.id.etWord);
    EditText etMeaning = (EditText) findViewById(R.id.etMeaning);
    Button bSubmit = (Button) findViewById(R.id.bSubmit);

    public AddActivity(EditText etWord, EditText etMeaning) {
        this.etWord = etWord;
        this.etMeaning = etMeaning;
    }

    public EditText getWord() {
        return etWord;
    }

    public void setWord(EditText etWord) {
        this.etWord = etWord;
    }

    public EditText getMeaning() {
        return etMeaning;
    }

    public void setMeaning(EditText etMeaning) {
        this.etMeaning = etMeaning;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(AddActivity.this, DictionaryActivity.class);


            }
        });


    }



}
