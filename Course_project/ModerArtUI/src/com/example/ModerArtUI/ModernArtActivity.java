package com.example.ModerArtUI;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

import java.util.Random;

public class ModernArtActivity extends Activity {
    private static final String MOMA_URL = "http://MoMA.org";
    private Random random = new Random();
    private View leftTop;
    private View leftBottom;
    private View rightTop;
    private View rightBottom;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        leftTop = findViewById(R.id.left_top);
        leftBottom = findViewById(R.id.left_bottom);
        rightTop = findViewById(R.id.right_top);
        rightBottom = findViewById(R.id.right_bottom);

        paintView(leftTop, rightTop, leftBottom, rightBottom);

        SeekBar slider = (SeekBar) findViewById(R.id.slider);

        slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                paintView(leftTop, rightTop, leftBottom, rightBottom);
            }
        });
    }

    private void paintView(View... views) {
        for (View view : views) {
            ((ColorDrawable) view.getBackground()).setColor(0xFF000000 + random.nextInt(0xFFFFFF));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        DialogFragment mDialog = AlertDialogFragment.newInstance();
        mDialog.show(getFragmentManager(), "Alert");
        return true;
    }

    public static class AlertDialogFragment extends DialogFragment {
        public static AlertDialogFragment newInstance() {
            return new AlertDialogFragment();
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            return new AlertDialog.Builder(getActivity())
                    .setMessage(R.string.dialog_text)
                    .setCancelable(false)
                    .setPositiveButton(R.string.visit_moma,
                            new DialogInterface.OnClickListener() {
                                public void onClick(
                                        final DialogInterface dialog, int id) {
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MOMA_URL));
                                    startActivity(intent);
                                }
                            })
                    .setNegativeButton("Not Now",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {
                                    AlertDialogFragment.this.dismiss();
                                }
                            })
                    .create();
        }
    }
}
