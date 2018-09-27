package com.example.mahika.panorama;

import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.support.v4.content.ContextCompat;
import android.support.v4.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.View;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.content.Context;
//
//public class MainActivity extends AppCompatActivity {
//
//
//
//    // Check if device has camera
//    private boolean checkCameraHardware(Context context) {
//        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    // Get instance of camera object
//    public static Camera getCameraInstance() {
//        Camera c = null;
//        try {
//            c = Camera.open();
//        } catch (Exception e) {
//        }
//        return c;
//    }
//
//





    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    private static final int REQUEST_TAKE_PHOTO = 1;
//
//    private Button takePictureButton;
//    private ImageView imageView;
//    private Uri file;
//    String mCurrentPhotoPath;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        takePictureButton = (Button)findViewById(R.id.takePictureButton);
//        imageView = (ImageView)findViewById(R.id.imageView);
//
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//            takePictureButton.setEnabled(false);
//            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 0);
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        if (requestCode == 0) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED
//                    && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
//                takePictureButton.setEnabled(true);
//            }
//        }
//    }
//
//
//    public void takePicture(View view) throws IOException {
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//
//        File file = null;
//        try {
//            file = getOutputMediaFile();
//        } catch (IOException ex){
//            return;
//        }
//
//        if (file != null) {
//            Uri photoUri = Uri.fromFile(getOutputMediaFile());
//            intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);
//            startActivityForResult(intent, REQUEST_TAKE_PHOTO);
//        }
//    }
//
//    private File getOutputMediaFile() throws IOException {
//        File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
//
//        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//        String imageFileName = "JPEG_" + timeStamp + "_";
//        File image = File.createTempFile(imageFileName, ".jpg", mediaStorageDir);
//        mCurrentPhotoPath = "file:" + image.getAbsolutePath();
//        return image;
//        //return new File(mediaStorageDir.getPath() + File.separator + "IMG_" + timeStamp + ".jpg");
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == REQUEST_TAKE_PHOTO && resultCode == RESULT_OK) {
//            // Show the thumbnail on ImageView
//            Uri imageUri = Uri.parse(mCurrentPhotoPath);
//            File file = new File(imageUri.getPath());
//            try {
//                InputStream ims = new FileInputStream(file);
//                imageView.setImageBitmap(BitmapFactory.decodeStream(ims));
//            } catch (FileNotFoundException e) {
//                return;
//            }
//
//            // ScanFile so it will show in gallery
//            MediaScannerConnection.scanFile(MainActivity.this,
//                    new String[]{(imageUri.getPath())}, null,
//                    new MediaScannerConnection.OnScanCompletedListener() {
//                        @Override
//                        public void onScanCompleted(String path, Uri uri) {
//                        }
//                    });
//        }
//    }
//
//}
