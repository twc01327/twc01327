package com.twc01327.projectday2.simpleuilayyout;

import android.os.Bundle;
import android.app.Activity;
import android.text.Layout;
import android.view.Gravity;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	LinearLayout linearLayout;
	EditText toEditext;
	EditText subjectEditext;
	EditText messageEditext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentViewCode();
    }


    public void setContentViewCode(){
    	linearLayout = new LinearLayout(this);
    	linearLayout.setPadding(10, 0, 10, 0);
    	linearLayout.setOrientation(LinearLayout.VERTICAL);
    	linearLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
    	toEditext = new EditText(this);
    	toEditext.setHint("To");
    	toEditext.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
    	subjectEditext = new EditText(this);
    	subjectEditext.setHint("Subject");
    	subjectEditext.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
    	messageEditext = new EditText(this);
    	messageEditext.setHint("Message");
    	messageEditext.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
    	messageEditext.setGravity(Gravity.TOP);
    	linearLayout.addView(toEditext);
    	linearLayout.addView(subjectEditext);
    	linearLayout.addView(messageEditext);
    	setContentView(linearLayout);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
