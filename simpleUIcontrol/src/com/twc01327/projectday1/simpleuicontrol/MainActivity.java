package com.twc01327.projectday1.simpleuicontrol;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.textView1);
	}

	public void moveLeft(View v) {
		moveWidget(-10);
	}

	public void moveRight(View v) {
		moveWidget(10);
	}
	public void moveWidget(int position){
		RelativeLayout.LayoutParams params = (LayoutParams) textView
				.getLayoutParams();
		params.leftMargin+=position;
		textView.setLayoutParams(params);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
