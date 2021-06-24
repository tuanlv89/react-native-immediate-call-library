
package com.reactLibraryImmediatePhoneCall;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNImmediateCallLibraryModule extends ReactContextBaseJavaModule {
  private static final int REQUEST_PHONE_CALL_PERMISSION = 1412;
  private final ReactApplicationContext reactContext;

  public RNImmediateCallLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNImmediateCallLibrary";
  }

  @ReactMethod
  public void immediateCall(String phoneNumber) {
    askPermissionAndCall(phoneNumber);
  }

  private void askPermissionAndCall(String phoneNumber) {
    if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
      int sendMsgPermission = ContextCompat.checkSelfPermission(getReactApplicationContext(), android.Manifest.permission.CALL_PHONE);
      if(sendMsgPermission != PackageManager.PERMISSION_GRANTED) {
        ActivityCompat.requestPermissions(getCurrentActivity(), new String[]{android.Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL_PERMISSION);
        return;
      }
    }
    this.callNow(phoneNumber);
  }

  private void callNow(String phoneNumber) {
    Intent intent = new Intent(Intent.ACTION_CALL);
    intent.setData(Uri.parse("tel:" + phoneNumber));
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    getReactApplicationContext().startActivity(intent);
  }

}