package com.mobile3121.datepickerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.DatePicker;

public class MainActivity extends Activity {
private DatePicker mydate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//ȡ�������id
	  mydate=(DatePicker) findViewById(R.id.dateID);
	  //��������
	  mydate.updateDate(1998, 7, 28);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
