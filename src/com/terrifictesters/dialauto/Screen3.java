package com.terrifictesters.dialauto;

import com.terrifictesters.testdialauto.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class Screen3 extends Activity {
	
	Button b1;
	EditText name;
	EditText contact;
	EditText from;
	EditText to;
	
	
	
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.screen3);
	
	b1 = (Button) findViewById(R.id.button1);
	name = (EditText) findViewById(R.id.editText1);
	contact = (EditText) findViewById(R.id.editText2);
	from = (EditText) findViewById(R.id.editText3);
	to = (EditText) findViewById(R.id.editText4);
	
	
	
	// mess = (TextView) findViewById (R.id.message);
	
	b1.setOnClickListener(new OnClickListener(){
		public void onClick(View view) {
			sendSMS();
			
		}
	});
	
}
protected void sendSMS() {
	Log.i("Send SMS", "");

    String phoneNo = contact.getText().toString();
    Screen2 s = new Screen2();
    TextView mess = s.t1 = (TextView) findViewById(R.id.message);
	String message = mess.getText().toString();

    try {
       SmsManager smsManager = SmsManager.getDefault();
       smsManager.sendTextMessage(phoneNo, null, message, null, null);
       Toast.makeText(getApplicationContext(), "SMS sent.",
       Toast.LENGTH_LONG).show();
    } catch (Exception e) {
       Toast.makeText(getApplicationContext(),
       "SMS faild, please try again.",
       Toast.LENGTH_LONG).show();
       e.printStackTrace();
    }



	}

	
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
}
	
	
	
	

}
