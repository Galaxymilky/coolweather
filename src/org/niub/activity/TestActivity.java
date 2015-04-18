package org.niub.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class TestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new OnClickListener(){
//        	@Override
        	public void onClick(View v){
        		Toast.makeText(TestActivity.this, "You clicked Button_1", Toast.LENGTH_SHORT).show();
//        		finish();//销毁当前活动
//        		Intent intent = new Intent(TestActivity.this, SecondActivity.class);
//        		startActivity(intent); 
        		Intent intent1 = new Intent("org.niub.testactivity.ACTION_STRART");
        		intent1.addCategory("org.niub.testactivity.MY_CATEGORY");
        		
        		String data = "This comes from firstActivity";
        		intent1.putExtra("extra_data", data);
        		startActivity(intent1);
        		
        	}
        });
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	getMenuInflater().inflate(R.menu.main, menu);
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	switch(item.getItemId()){
    	case R.id.add_item:
    		Toast.makeText(this, "clicked Add", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.remove_item:
    		Toast.makeText(this, "clicked Remove", Toast.LENGTH_SHORT).show();
    		break;
    		default:
    	}
    	
    	return true;
    }
    
   
    
}