package com.test.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailsact);
        
        Button btn = (Button)findViewById(R.id.button1);
        final TestActivity ta = (TestActivity)this.getParent();
        btn.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				ta.tabHost.setCurrentTab(1);
			}
		});
    }
}