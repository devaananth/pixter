package org.example.sudoku;

//import org.example.sudoku.R;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
//import R.attr;
public class MainScreen extends Activity 
{  
Button b1;
Button b2;
Button b3;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
        setContentView(R.layout.main); 
        b1 = (Button) findViewById(R.id.viewPicturesButton);
        b2 = (Button) findViewById(R.id.options_button);
 //       b1.setOnClickListener(myhandler1);
 //       b2.setOnClickListener(myhandler2);
        
//        setContentView(R.layout.viewpictures); 
//        b3 = (Button) findViewById(R.id.next_pic);
//        b2.setOnClickListener(myhandler3);
        
      }
//      View.OnClickListener myhandler1 = new View.OnClickListener() {
//        public void onClick(View v) {
//        	startActivity(new Intent(MainScreen.this, image.class));
 //       	startActivity(new Intent(MainScreen.this, image.class));
//        }
//      };
//      View.OnClickListener myhandler2 = new View.OnClickListener() {
//        public void onClick(View v) {
//        	startActivity(new Intent(MainScreen.this, Options.class));
//        }
//      };
    public void myhandler1(View v)
    {
	  startActivity(new Intent(MainScreen.this, image.class));
    }
      
    public void options_handler(View v)
	{
      startActivity(new Intent(MainScreen.this, Options.class));
	}
    public void delete_handler(View v)
	{
      startActivity(new Intent(MainScreen.this, delete.class));
	}
    public void readsd_handler(View v)
	{
      startActivity(new Intent(MainScreen.this, startReadSD.class));
	}
    
    
//      View.OnClickListener myhandler3 = new View.OnClickListener() {
//          public void onClick(View v) {
//          	startActivity(new Intent(MainScreen.this, image.class));
//          }
//        };

   }