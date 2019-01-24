package com.example.nguyentiendung.customelistview.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nguyentiendung.customelistview.R;
import com.example.nguyentiendung.customelistview.model.Contact;

import java.util.ArrayList;


public class CustomApdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> contactArrayList;

    public CustomApdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.contactArrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHoder viewHoder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact, parent, false);

         viewHoder=new ViewHoder();

            viewHoder.tv_color = (TextView) convertView.findViewById(R.id.tv_mau);
            viewHoder.tv_name = (TextView) convertView.findViewById(R.id.tv_ten);
            viewHoder.tv_number = (TextView) convertView.findViewById(R.id.tv_ngaysinh);
            Contact contact = contactArrayList.get(position);
            viewHoder.tv_color.setBackgroundColor(contact.getmColor());
            viewHoder.tv_color.setText((position + 1) + "");
            viewHoder.tv_name.setText(contact.getmName());
            viewHoder.tv_number.setText(contact.getmNumber());
// settag luu lai nhung thu da khoi tao
             convertView.setTag(viewHoder);
        }
        else {
            //lay ra nhung thu da khoi tao
            viewHoder=(ViewHoder) convertView.getTag();
        }
        return convertView;
    }

    public class ViewHoder {
        TextView tv_color;
        TextView tv_name;
        TextView tv_number;
    }
}
