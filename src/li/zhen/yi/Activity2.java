package li.zhen.yi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        setTitle("Õâ¸öÊÇACTIVITY2");
        Button b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener(){
      	  
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			

    			Intent intent=new Intent(Activity2.this,ActivityMain.class);
    			startActivity(intent);
    			
    		}
        	   
           });
    }
}