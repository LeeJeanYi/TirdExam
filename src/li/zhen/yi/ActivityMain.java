package li.zhen.yi;

import android.R.bool;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.*;
import android.content.Intent;
public class ActivityMain extends Activity {
    /** Called when the activity is first created. */
	static final int REQUEST_CODE=1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       Button bt1=(Button)findViewById(R.id.button1);
       Button bt2=(Button) findViewById(R.id.button2);
       Button bt3=(Button) findViewById(R.id.button3);
       
       
       bt3.setOnClickListener(new OnClickListener(){
    	   public void onClick(View v){
    		   Uri uri=Uri.parse("tel:110");
    		   Intent intent=new Intent(Intent.ACTION_DIAL,uri);
    		   startActivity(intent);
    	   }
    	   
       });

       bt2.setOnClickListener(new OnClickListener(){
    	   public void onClick(View v){
    		   
    		   Intent intent=new Intent(ActivityMain.this,Activity2.class);
    		   startActivity(intent);
    	   }
    	   
       });
	   
	   bt1.setOnClickListener(new OnClickListener(){
    	  
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			

			Intent intent=new Intent(ActivityMain.this,Activity1.class);
			intent.putExtra("main1", "这是ActivityMain传来的");
			startActivityForResult(intent, REQUEST_CODE);
		}
    	   
       });
    }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == RESULT_OK) {
			String temp=null;
			 Bundle extras = data.getExtras();
		        if (extras != null) {
		        	temp = extras.getString("cun");
		        }
			setTitle(temp);

      
		// TODO Auto-generated method stub
		
	}
    
}
}