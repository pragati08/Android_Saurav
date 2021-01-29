package com.example.barcodereader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.zxing.BarcodeFormat;
import com.zxing.BarcodeReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      My logic2
//        ImageView imageView = (ImageView) findViewById(R.id.image);
//        Context context = null;
//        ContextWrapper cw = new ContextWrapper(context);
//        //path to /data/data/yourapp/app_data/dirName
//        File directory = cw.getDir("assets", Context.MODE_PRIVATE);
//        File mypath=new File(directory,"newbarcode.gif");
//
//        imageView.setImageDrawable(Drawable.createFromPath(mypath.toString()));
//
//          Bitmap bitmap= BitmapFactory.decodeFile(mypath.getAbsolutePath());
         Context context = null;
        public String getBitmapFromAsset(Context context,String Object path)
        Bitmap bitmap;
        {
            bitmap = context.assets.open(path).use;
         BitmapFactory.decodeStream(it) }
        getBitmapFromAsset(this@activity, "newbarcode.gif")
        BarcodeReader b= new BarcodeReader();
        BarcodeReader.Result rs = b.read(bitmap,200,200);

        TextView scannedtext;
        scannedtext =(TextView) findViewById(R.id.textView);
        scannedtext.setText((rs.getText()));



    }
}