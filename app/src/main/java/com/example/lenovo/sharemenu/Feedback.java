package com.example.lenovo.sharemenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity  implements View.OnClickListener{
    Button s,s1;
    EditText enn,en1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        s=findViewById(R.id.ds);
        s1=findViewById(R.id.ds1);
        enn=findViewById(R.id.sd);
        en1=findViewById(R.id.sd1);

        s.setOnClickListener(this);
        s1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        try {
            String name=enn.getText().toString();
            String na=en1.getText().toString();

            if(view.getId()== R.id.ds)
            {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"souvikhalder504@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"feed back frm app");
                intent.putExtra(Intent.EXTRA_TEXT,"Name = "+name +"\n Message = "+na);
                startActivity(Intent.createChooser(intent,"Feedback with"));

            }
            else if(view.getId()== R.id.ds1)
            {
                enn.setText("");
                en1.setText("");

            }


        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Exception :"+e,Toast.LENGTH_SHORT).show();

        }
     


    }
}
