package com.example.a03;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tv = (TextView)findViewById(R.id.textView1);
		tv.setText("Texto alterado");
		
		List<String> l = getListaExemplo();
		
		ArrayAdapter<String> ad = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,l);
							
		ListView lv = (ListView)findViewById(R.id.listView1);
		lv.setAdapter(ad);
		
	}
	private List<String> getListaExemplo(){
		List<String> l = new ArrayList<String>();
		for(int i = 0; i < 100; i++){
			l.add("Exemplo " + i);			
		}
		return l;
	}

}
