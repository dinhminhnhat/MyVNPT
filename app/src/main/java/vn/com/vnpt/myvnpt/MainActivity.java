package vn.com.vnpt.myvnpt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView    sosim ;
TextView thongtin;
TextView trangthai;
TextView gia;
TextView loaisim;
ImageView avatar;
ListView lvDanhSack;
EditText editTim;
Button btn_Tim;
  //  public static int[] imgAvatar = {R.mipmap.gn,R.mipmap.birthday,R.mipmap.valentine};
    //Nội dung của từng Item trong ListView
    //public static String[] so = {"0909090990", "0123456789",
      //      "Valentine"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Anhxa();
        lvDanhSack = (ListView) findViewById(R.id.lvDanhSack);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        //Ở bước này mình đã làm tắt đi 1 bước, chính xác là
//        //CustomAdapter adapter=new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar);
//        //lvCustomListView.setAdapter(adapter);
        //lvDanhSack.setAdapter(new customlistviewAdapter(MainActivity.this,so,imgAvatar));
    }

    public void Anhxa(){
        sosim = (TextView)findViewById(R.id.tv_sosim);
        thongtin = ( TextView) findViewById(R.id.tv_thongtin);
        trangthai = (TextView) findViewById(R.id.tv_trangthaisim);
        gia = (TextView) findViewById(R.id.tv_giasim);
        loaisim = (TextView) findViewById(R.id.tv_nhomsim);
        avatar = (ImageView) findViewById(R.id.imv_daidien);
        lvDanhSack = (ListView) findViewById(R.id.lvDanhSack);
        editTim = (EditText) findViewById(R.id.editTim);
        btn_Tim = (Button) findViewById(R.id.btn_tim);
    }


}
