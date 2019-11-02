package com.example.teacherstudentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Choose extends AppCompatActivity
{

    private TextView iBuddy, Areyoua;

    private Button Organizer, Attendees, Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        iBuddy = (TextView)findViewById(R.id.iBuddytextview);
        Areyoua = (TextView)findViewById(R.id.textViewChoose);
        Organizer = (Button)findViewById(R.id.radioButtonOrganizer);
        Attendees = (Button)findViewById(R.id.radioButtonAttendees);
        Submit = (Button)findViewById(R.id.buttonSubmit);

        Submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {


            }

        }
    }
}
