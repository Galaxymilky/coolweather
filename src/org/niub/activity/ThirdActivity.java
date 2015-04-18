package org.niub.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ThirdActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.third_layout);
		
		Button button3 = (Button) findViewById(R.id.button_3);
		button3.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intentDial = new Intent(Intent.ACTION_DIAL);
				intentDial.setData(Uri.parse("tel:10086"));
				
//				Intent intent = new Intent(Intent.action_);
				
				startActivity(intentDial);
			}
			
		});
		
	}
}
