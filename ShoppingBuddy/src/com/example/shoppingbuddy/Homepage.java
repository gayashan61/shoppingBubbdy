package com.example.shoppingbuddy;

import java.io.FileOutputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Homepage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.homepage);
		String id = "v";
		Bundle extras = getIntent().getExtras();
		if(extras !=null)
		{
		    id = extras.getString("xx");
		}
		else{
			id = "Take a photo";
		}
		Button p1_button = (Button)findViewById(R.id.button1);
		p1_button.setText(id.toString());
		
		
		p1_button.setOnClickListener(new View.OnClickListener(){
	        @Override
	        public void onClick(View v) {
	            // TODO Auto-generated method stub
	           // Toast.makeText(getBaseContext(), "Hello", Toast.LENGTH_SHORT).show();
	        	takePic();
	        }
	    });
				
	}
	
	private void takePic() {
	    Intent cameraIntent = new Intent(
	            android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
	    startActivityForResult(cameraIntent, 2);


	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 2) {
		            Bitmap photo = (Bitmap) data.getExtras().get("data");
		            ImageView test = (ImageView) findViewById(R.id.imageView1);
		            test.setImageBitmap(photo);

		            try {
		                FileOutputStream out = new FileOutputStream(Environment.getExternalStorageDirectory()+"filename");
		                photo.compress(Bitmap.CompressFormat.JPEG, 90, out);
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        }
		    }
	
	//String imageFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/name.png";
	
	
	
	
	
	

}
