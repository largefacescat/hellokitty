package com.example.hellokitty;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button bt_openActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initViews();
		setListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	private void initViews(){
		bt_openActivity = (Button) findViewById(R.id.open_activity);
	}
	
	private void setListener(){
		bt_openActivity.setOnClickListener(changeOperationListener);
		bt_openActivity.setContentDescription("1");
	}

	OnClickListener changeOperationListener = new OnClickListener(){

		@Override
		public void onClick(View view) {
			switch(Integer.parseInt(view.getContentDescription().toString())){
			case 1:
				openActivity();
				break;
			}
		}
		
	};
	
	private void openActivity(){
		Intent intent;
        intent = new Intent(MainActivity.this, FirstActivity.class);  
        startActivityForResult(intent,0);
	}
	
}
