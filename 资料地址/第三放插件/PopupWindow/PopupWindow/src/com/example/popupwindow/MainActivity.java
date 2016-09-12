package com.example.popupwindow;


import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button)findViewById(R.id.clickme);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SignPopupWindow popupWindow = new SignPopupWindow(MainActivity.this);
				popupWindow.showAtLocation(MainActivity.this.findViewById(R.id.setting_layout), Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
