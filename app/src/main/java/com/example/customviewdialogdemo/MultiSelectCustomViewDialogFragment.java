package com.example.customviewdialogdemo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.TextView;

public class MultiSelectCustomViewDialogFragment extends DialogFragment {
    private static final String KEY_STRING_LIST= "string_list";

    public static MultiSelectCustomViewDialogFragment newInstance(String[] stringList) {
        MultiSelectCustomViewDialogFragment dialogFragment = new MultiSelectCustomViewDialogFragment();
        Bundle args = new Bundle();
        args.putStringArray(KEY_STRING_LIST, stringList);
        dialogFragment.setArguments(args);
        return dialogFragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Bundle args = getArguments();
        final String[] stringList = args.getStringArray(KEY_STRING_LIST);
        final boolean[] values = new boolean[stringList.length];

        TextView textView = new TextView(getContext());
        textView.setPadding(10, 10, 10, 10);
        textView.setText("This custom view doesn't appear when the list scrolls.");

        return new AlertDialog.Builder(getContext())
                .setMultiChoiceItems(stringList, values, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                    }
                })
                .setView(textView)
                .create();
    }
}
