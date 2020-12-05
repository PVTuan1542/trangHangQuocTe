package com.example.hangquocte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hangquocte.danhsachloai.AdapterLoai;
import com.example.hangquocte.danhsachloai.loai;
import com.example.hangquocte.sanpham.AdapterSanPham;
import com.example.hangquocte.sanpham.sanpham;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Gọi recylerview sản phẩm cuối năm
        init_ListSPCuoiNam();
        //Gọi loại danh sách
        init_Loai();
    }

    //Add san pham
    public  void init_ListSPCuoiNam(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview_ThoiTrangCuoiNam);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<sanpham> arrayList =  new ArrayList<>();

        arrayList.add(new sanpham("Áo sơ mi nữ tay phồng theo phong cách retro",R.drawable.sp_aoden,233000 ,118000,5,897));
        arrayList.add(new sanpham("Giày vớ tập đi chống trượt hình động vật dễ thương cho bé",R.drawable.sp_depchobe,68000 ,34000,4,367));
        arrayList.add(new sanpham("Áo Hoodie Tay Dài In Hình Khủng Long Cho Nam",R.drawable.sp_hoodie,201000 ,101000,4,176));
        arrayList.add(new sanpham("Áo tay dài dáng rộng cổ tròn thời trang phong cách cho nam",R.drawable.sp_aotaydai,168000 ,100000,5,67));
        arrayList.add(new sanpham("Áo Thun Lửng Tay Ngắn Thêu Hình Bướm Quyến Rũ Cho Nữ",R.drawable.sp_aothun,100000 ,50000,5,239));

        AdapterSanPham adapter = new AdapterSanPham(arrayList,MainActivity.this,R.layout.row_sanpham);
        recyclerView.setAdapter(adapter);

    }
    //add Loai danh sách
    public  void init_Loai(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview_Menu);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<loai> arrayList =  new ArrayList<>();

        arrayList.add(new loai("VOUCHER",R.drawable.voucher,"NGẤT NGÂY"));
        arrayList.add(new loai("SIÊU SALE",R.drawable.sale,"GÕ CỬA"));
        arrayList.add(new loai("MUA NHIỀU",R.drawable.muanhieu,"GIẢM SÂU"));
        arrayList.add(new loai("QUÀ TẶNG",R.drawable.noel,"GIÁNG SINH"));
        arrayList.add(new loai("SĂN SALE",R.drawable.cart,"QUỐC TẾ"));
        arrayList.add(new loai("ƯU ĐÃI TỪ",R.drawable.uudaithuonghieu,"THƯƠNG HIỆU"));
        arrayList.add(new loai("ĐẶT LỊCH",R.drawable.calendar,"HÓT DEAL"));
        arrayList.add(new loai("DÀNH RIÊNG",R.drawable.danhriengchoban,"CHO BẠN"));

        AdapterLoai adapter = new AdapterLoai(arrayList,MainActivity.this,R.layout.row_danhsachloai);
        recyclerView.setAdapter(adapter);

    }
}