package vn.com.vnpt.myvnpt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Nhat on 05-12-02017.
 */

public class customlistviewAdapter extends BaseAdapter {
    String[] result;
    Context context;
    int[] imageId;
    public customlistviewAdapter(Context context, String[] result, int[] imageId) {
        this.context = context;
        this.result = result;
        this.imageId = imageId;
    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.custom_listview, parent, false);

        TextView tvsim = (TextView) rowView.findViewById(R.id.tv_sosim);
        ImageView imgAvatar = (ImageView) rowView.findViewById(R.id.imv_daidien);

        //lấy Nội dung của Item ra để thiết lập nội dung item cho đúng
        tvsim.setText(result[position]);
        //lấy ImageView ra để thiết lập hình ảnh cho đúng
        imgAvatar.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_LONG).show();
            }
        });
        //trả về View này, tức là trả luôn về các thông số mới mà ta vừa thay đổi
        return rowView;
    }
}
