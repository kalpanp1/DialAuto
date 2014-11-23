package com.terrifictesters.dialauto;

import java.util.ArrayList;
import java.util.List;

import com.terrifictesters.testdialauto.R;

import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;
import android.content.Context;

public class MainActivity extends ActionBarActivity {
	
	private Spinner spinner1, spinner2;
	private Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addItemsOnSpinner2();
		addListenerOnButton();
		addListenerOnSpinnerItemSelection();

	}
	
	// add items into spinner dynamically
	  public void addItemsOnSpinner2() {
	 
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list = new ArrayList<String>();
		list.add("DLF");
		list.add("Shakthi  Nagar");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);
	  }

	  public void addListenerOnSpinnerItemSelection() {
			spinner1 = (Spinner) findViewById(R.id.spinner1);
			//spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		  }
		 
		  // get the selected dropdown list value
		  public void addListenerOnButton() {
			  
			  final Context context = this;
		 
			spinner1 = (Spinner) findViewById(R.id.spinner1);
			spinner2 = (Spinner) findViewById(R.id.spinner2);
			button1 = (Button) findViewById(R.id.button1);
		 
			button1.setOnClickListener(new OnClickListener() {
				
		 
			  
			  public void onClick(View v) {
		 
			   
				  Intent intent = new Intent(context, Screen2.class);
                  startActivity(intent);
			  }
		 
			});
		  }
		  
		  


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
