package com.sample.flashcardtwo;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.sample.flashcardtwo.MyActivity;
public class MainActivity extends ActionBarActivity {
	ListView view;
	String str[]={"hello","hai","how","fine","well","go","sorry","hello","hai","how","fine","well","go","sorry",
			"hello","hai","how","fine","well","go","sorry",
			"hello","hai","how","fine","well","go","sorry"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayList<String> words=new ArrayList<String>();
		for(int i=0;i<str.length;i++){
			words.add(str[i]);
		}
		view=(ListView)findViewById(R.id.list);
		ArrayAdapter<String> disList=new ArrayAdapter<String>(this,android.R.layout.activity_list_item,android.R.id.text1, words);
		view.setAdapter(disList);
		view.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				String arr[]=new String[str.length-position];
				int j=0;
				for(int i=position;i<str.length;i++){
					arr[j++]=str[i];
				}
				Bundle bun=new Bundle();
				bun.putStringArray("data",arr);
				Intent intent=new Intent(MainActivity.this,MyActivity.class);
				intent.putExtras(bun);
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
