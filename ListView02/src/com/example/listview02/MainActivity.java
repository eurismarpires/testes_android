package com.example.listview02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<Map<String, String>> lista = getListaExemplo();

		String[] from = { "Id", "Nome" };
		int[] to = { android.R.id.text1, android.R.id.text2 };

		SimpleAdapter ad = new SimpleAdapter(this, lista,
				android.R.layout.simple_list_item_2, from, to);
		ListView lv = (ListView) findViewById(R.id.listView1);
		lv.setAdapter(ad);
	}

	private List<Map<String, String>> getListaExemplo() {
		List<Map<String, String>> l = new ArrayList<Map<String, String>>();
		for (int i = 0; i < 10; i++) {
			Map<String, String> m = new HashMap<String, String>();
			m.put("Id", "Outro valor " + String.format("%c", i + 65));
			m.put("Nome", "Outra coisa" + i);
			l.add(m);
		}
		return l;
	}

}
