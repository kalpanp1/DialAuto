package com.terrifictesters.dialauto;

import com.terrifictesters.testdialauto.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Context;
import android.widget.*;

public class Screen2 extends Activity {

	TextView t1;
	Button b1;
	final Context context = this; 
	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen2);
		
		
		t1 = (TextView) findViewById(R.id.message);
		b1 = (Button) findViewById(R.id.button1);
		
		b1.setOnClickListener(new OnClickListener() {
			
			 
			  
			  public void onClick(View v) {
		 
			   				  
				  Intent intent = new Intent(context, Screen3.class);
                startActivity(intent);
			  }
		
	});
}

	
}
