package com.first.getdata;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	Button get,pre;
	TextView display;
	String words[]={"corpulent","fleshy","The frogs are dull skinned then, but soon become corpulent and bright."};
	int i;
	String sam[]={"word","meaning","example"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		get=(Button)findViewById(R.id.button1);
		pre=(Button)findViewById(R.id.button2);
		display=(TextView)findViewById(R.id.textView1);
		get.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					display.setText(sam[i]+"        :       "+words[i]);
					i++;
				}
				catch(Exception e){display.setText("no words");}
				}
		});
		pre.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					i--;
					display.setText(sam[i]+"        :       "+words[i]);
				}
				catch(Exception e){display.setText("no words");}
				}
		});
	}
}
