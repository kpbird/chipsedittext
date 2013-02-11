package com.kpbird.chipsedittext;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends Activity {

	ChipsMultiAutoCompleteTextview mu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mu = (ChipsMultiAutoCompleteTextview) findViewById(R.id.multiAutoCompleteTextView1);

		String[] item = getResources().getStringArray(R.array.country);

		Log.i("", "Country Count : " + item.length);
		mu.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line, item));
		mu.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
	}

	public void buttonClicked(View v) {
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText(mu.getText().toString());
	}

}
