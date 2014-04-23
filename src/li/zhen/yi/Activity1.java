package li.zhen.yi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Button bt1=(Button) findViewById(R.id.button1);
        TextView t1=(TextView)findViewById(R.id.textView1);
        Bundle bdl=getIntent().getExtras();
        t1.setText("冒号后面的是接受的数据："+bdl.getString("main1"));
        bt1.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		Intent intent2=new Intent();
        		Bundle bdl2=new Bundle();
        		bdl2.putString("cun", "现在的数据来自ACTIVITY1");
        		intent2.putExtras(bdl2);
        		setResult(RESULT_OK,intent2);
				finish();

        	}
        });
    }
}