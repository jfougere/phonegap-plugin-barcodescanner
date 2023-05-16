package com.transatel.plugins.barcodescanner;

import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.transatel.selfcare.ubigi.R;

/**
 * Custom Scannner Activity extending from Activity to display a custom layout form scanner view.
 */
public class CustomScannerActivity extends CaptureActivity {

  @Override
  protected DecoratedBarcodeView initializeContent() {
    setContentView(R.layout.custom_scanner);
    return findViewById(R.id.zxing_barcode_scanner);
  }
  public void back(View view) {
      this.finish();
  }
}
