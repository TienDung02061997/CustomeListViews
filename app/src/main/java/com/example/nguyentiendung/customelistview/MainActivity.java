package com.example.nguyentiendung.customelistview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import com.example.nguyentiendung.customelistview.adapter.CustomApdapter;
import com.example.nguyentiendung.customelistview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lv);

        ArrayList<Contact> arrayAdapter = new ArrayList<Contact>();
        Contact contact = new Contact(Color.BLUE, "Nguyễn Tiến Dũng1", "0355555555555");
        Contact contact1 = new Contact(Color.CYAN, "Nguyễn Tiến Dũng2", "0355555555555");
        Contact contact2 = new Contact(Color.YELLOW, "Nguyễn Tiến Dũng3", "0355555555555");
        Contact contact3 = new Contact(Color.DKGRAY, "Nguyễn Tiến Dũng4", "0355555555555");
        Contact contact4 = new Contact(Color.RED, "Nguyễn Tiến Dũng5", "0355555555555");
        Contact contact5 = new Contact(Color.BLUE, "Nguyễn Tiến Dũng1", "0355555555555");
        Contact contact6 = new Contact(Color.CYAN, "Nguyễn Tiến Dũng2", "0355555555555");
        Contact contact7 = new Contact(Color.YELLOW, "Nguyễn Tiến Dũng3", "0355555555555");
        Contact contact8 = new Contact(Color.DKGRAY, "Nguyễn Tiến Dũng4", "0355555555555");
        Contact contact9 = new Contact(Color.RED, "Nguyễn Tiến Dũng5", "0355555555555");
        arrayAdapter.add(contact);
        arrayAdapter.add(contact1);
        arrayAdapter.add(contact2);
        arrayAdapter.add(contact3);
        arrayAdapter.add(contact4);
        arrayAdapter.add(contact5);
        arrayAdapter.add(contact6);
        arrayAdapter.add(contact7);
        arrayAdapter.add(contact8);
        arrayAdapter.add(contact9);


        CustomApdapter customApdapter = new CustomApdapter(MainActivity.this, R.layout.row_item_contact, arrayAdapter);
        lvContact.setAdapter(customApdapter);
    }
}
