package com.example.calculatorapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	EditText editTextInput1, editTextInput2, editTextOut; 
	Button ButtonMinus, buttonDiv, ButtonMulti, ButtonPlus; 
	TextView OutputText;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        editTextInput1 = (EditText)findViewById(R.id.EditTextInput1); 
        editTextInput2 =(EditText)findViewById(R.id.EditTextInput2);
        
        OutputText = (TextView)findViewById(R.id.OutputText); 
        editTextOut=(EditText)findViewById(R.id.editTextOut);
       
        ButtonPlus = (Button)findViewById(R.id.ButtonPlus); 
        ButtonMinus = (Button)findViewById(R.id.ButtonMinus); 
        ButtonMulti = (Button)findViewById(R.id.ButtonMulti); 
        buttonDiv = (Button)findViewById(R.id.ButtonDiv); 
        
        ButtonPlus.setOnClickListener((OnClickListener) this); 
        ButtonMinus.setOnClickListener((OnClickListener) this); 
        ButtonMulti.setOnClickListener((OnClickListener) this); 
        buttonDiv.setOnClickListener((OnClickListener) this); 
    }

    
    public void onClick(View v) { 
    	// TODO Auto-generated method stub
    	    double a = Double.parseDouble(editTextInput1.getText().toString()); 
    	    double b = Double.parseDouble(editTextInput2.getText().toString()); 
    	    switch (v.getId()) { 
    	    case R.id.ButtonPlus: 
    	    	editTextOut.setText(Double.toString(a+b)); 
    	    break; 
    	    case R.id.ButtonMinus: 
    	    	editTextOut.setText(Double.toString(a-b)); 
    	    break; 
    	    case R.id.ButtonMulti: 
    	    	editTextOut.setText(Double.toString(a*b)); 
    	    break; 
    	    case R.id.ButtonDiv: 
    	    	editTextOut.setText(Double.toString(a/b)); 
    	    break; 
    	    default: 
    	    break; 
    	   }
    	  } 
    
}
