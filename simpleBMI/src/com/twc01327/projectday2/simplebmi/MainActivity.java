package com.twc01327.projectday2.simplebmi;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText editText_weight;
	EditText editText_height;
	Button button_calc;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_weight = (EditText) findViewById(R.id.editText_weight);
        editText_height = (EditText) findViewById(R.id.editText_height);
        button_calc = (Button) findViewById(R.id.button_calc);
        button_calc.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				// TODO Auto-generated method stub
				Double weight, height, bmi;
				String str_weight = editText_weight.getText().toString();
				String str_height = editText_height.getText().toString();
				if(!isIntNumber(str_height)){
					Toast.makeText(MainActivity.this,"身高未輸入", Toast.LENGTH_SHORT).show();
				}else if(!isIntNumber(str_weight)){
					Toast.makeText(MainActivity.this,"體重未輸入", Toast.LENGTH_SHORT).show();
				}else{
					weight = Double.valueOf(str_weight);
					height = Double.valueOf(str_height);
					bmi = weight/Math.pow(height/100,2);
					Toast.makeText(MainActivity.this,new DecimalFormat("#.##").format(bmi), Toast.LENGTH_SHORT).show();
				}
				
			}
		});
        
        
    }

	public boolean isIntNumber(String num) {
		try {
			Integer.parseInt(num);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
