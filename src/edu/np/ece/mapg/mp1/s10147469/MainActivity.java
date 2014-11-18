package edu.np.ece.mapg.mp1.s10147469;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	int myNumber = 9;
	EditText etNumber;
	Button btGuess;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etNumber = (EditText) this.findViewById(R.id.etNumber);
        btGuess = (Button) this.findViewById(R.id.btGuess);
        btGuess.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() 
    {
		
		@Override
		public void onClick(View v) {
			// Converting the string to an integer
			String str = etNumber.getText().toString();
			int num = Integer.parseInt(str);
		if ((num >= 0) && (num <= 9)) 
		{		
			//to make sure the number is within a range of 0 to 9
				if (num == myNumber){
					Toast.makeText(MainActivity.this,
							"Bingo! Correct number.",
							Toast.LENGTH_SHORT).show(); }
				else {
					Toast.makeText(MainActivity.this,
							"Try again!",
							Toast.LENGTH_SHORT).show(); }
		}
		
		else 
		{
			//to inform the user of the invalid number
			Toast.makeText(MainActivity.this,
					"Please enter a number that is within a range of 0 to 9 only.",
					Toast.LENGTH_LONG).show(); 
		}
	}
    
};
			
			
			
		
	
    
    
    

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
