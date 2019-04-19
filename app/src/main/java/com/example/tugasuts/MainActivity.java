package com.example.tugasuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //variabel
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDetails = new ArrayList<>();
    private ArrayList<String> mDeskripsi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://s1.bukalapak.com/img/1775836121/w-1000/Kucing_Russian_Blue.png");
        mNames.add("Kucing Russian Blue");
        mDetails.add("Asal Rusia");
        mDeskripsi.add("Kucing biru rusia (bahasa Inggris: Russian Blue cat) adalah salah satu ras kucing yang memiliki bulu berwarna perak biru. Kucing ini sangat cerdas dan lucu, tetapi cenderung pemalu di sekitar orang asing. Kucing biru rusia merupakan kucing yang memiliki ikatan yang erat dengan sahabatnya manusia. Kucing biru rusia sering dicari karena memiliki kepribadian dan warna bulu yang disukai orang-orang. Beberapa Kucing biru rusia memiliki kupalan kecil pada bulu di bagian atas kedua matanya yang miring sedikit ke bawah untuk memberikan perasaan bahwa Kucing biru rusia terlihat kesal.");

        mImageUrls.add("https://harga.info/wp-content/uploads/2018/01/Gambar-Kucing-Bengal.jpg");
        mNames.add("Kucing Bengal");
        mDetails.add("Asal Amerika Serikat");
        mDeskripsi.add("Kucing bengal atau Blacan adalah keturunan ketiga dari hasil persilangan antara kucing american shorthair dengan kucing asian leopard. Kucing ini berasal dari California, Amerika Serikat. Meskipun tergolong kucing hutan, namun ras bengal termasuk hewan yang banyak digemari dan dijadikan hewan peliharaan. Kucing ini memiliki ukuran badan yang panjang dengan otot-otot pada tubuhnya yang kuat. Ia memiliki tulang yang besar dan tebal, serta bulu yang tebal, rapat dan halus. Dalam proses pemeliharaannya, kucing ini memerlukan perawatan khusus pada bulunya, yaitu dengan digosok secara lembut menggunakan sikat yang halus. Populasi kucing bengal belum begitu banyak sehingga harganya tergolong tinggi, yaitu bisa mencapai 10-40 juta rupiah.");


        mImageUrls.add("http://hargakucing.com/wp-content/uploads/2017/03/harga-kucing-british-shorthair.png");
        mNames.add("Kucing Bulu Pendek Britania");
        mDetails.add("Asal Inggris");
        mDeskripsi.add("Kucing bulu pendek britania adalah salah satu ras kucing tertua yang nenek moyang dipercayai memiliki hubungan dengan bangsa Romawi yang pernah dahulu menguasai Inggris. Kucing ini adalah kucing berbadan sedang dengan bulu yang pendek. Selain itu, kucing ini juga banyak menjadi ikon.");


        mImageUrls.add("https://kucingpedia.com/wp-content/uploads/2018/09/Generasi-Kaki-Pendek-compressed.jpg");
        mNames.add("Kucing Munchkin");
        mDetails.add("Asal Amerika Serikat");
        mDeskripsi.add("Kucing munchkin adalah salah satu ras kucing berkaki pendek yang terbentuk karena mutasi genetik alami. Ras ini baru mulai dikembangbiakkan sekitar tahun 1980-an di Amerika Serikat, negara asalnya. Karena kakinya yang pendek, munchkin menjadi salah satu ras kucing terkecil di dunia.\n" +
                "\n" +
                "Munchkin ada yang berbulu panjang dan pendek. Karena keunikan ras kucing ini, munchkin sering dipersilangkan denga ras lain. Munchkin adalah nenek moyang dari beberapa ras kucing berkaki pendek baru, yaitu nenek moyang ras skookum (persilangan dengan ras laperm), ras minskin dan bambino (persilangan dengan ras sfinks), ras lambkin (persilangan dengan ras rex selkirk), ras genetta (persilangan dengan ras bengal), dan ras napoleon (persilangan dengan ras persia, himalaya, dan eksotis).");

        mImageUrls.add("https://4.bp.blogspot.com/-pIACQ-g9RVs/W4jyvq0q3vI/AAAAAAAAH6U/sGWTlt2fHF0EWeEG38isJvm_nfVxIdXBgCLcBGAs/s1600/Kucing%2BPersia.jpg");
        mNames.add("Kucing Persia");
        mDetails.add("Asal Iran");
        mDeskripsi.add("Kucing persia adalah ras kucing domestik berbulu panjang dengan karakter wajah bulat dan moncong pendek. Namanya mengacu pada Persia, nama lama Iran, di mana kucing serupa ditemukan. Sejak akhir abad 19, kucing jenis ini dikembangkan di Britania Raya dan Amerika Serikat usai Perang Dunia II. Di Britania Raya, ras ini disebut kucing bulu panjang persia, dibagi dalam dua jenis, yaitu chinchilla dengan warna perak cerah dan yang agak gelap.");

        mImageUrls.add("https://1.bp.blogspot.com/-gFg_4LyBJpU/V6rYit5EvBI/AAAAAAAAAxA/5ZydoQxdmhwbLEmcON1spadDlB7iduG6ACLcB/s1600/foto%2Bdan%2Bgambar%2BKarakter%2Bpendiam%2BKucing%2Bras%2BNorwegian%2BForest%2Bdan%2Bcara%2Bmerawat.JPG");
        mNames.add("Kucing Hutan Norwegia");
        mDetails.add("Asal Norwegia");
        mDeskripsi.add("Kucing hutan norwegia (bahasa Inggris: Norwegian Forest cat) adalah salah satu ras kucing alami yang berasal dari daerah yang bernama Norway. Nenek moyang dari ras kucing ini diduga berasal dari hutan-hutan di daerah Norwegia dan Skandinavia. Keunikan dari kucing hutan norwegia adalah pada bulunya. Bulunya akan menjadi panjang dan tebal ketika musim dingin tiba, dan akan rontok atau menipis ketika musim semi tiba. Kucing hutan norwegia dengan bulu warna yang gelap akan cenderung mempunyai bulu yang lebih pendek daripada bulu yang berwarna terang.");

        mImageUrls.add("https://i0.wp.com/www.infocatdog.com/wp-content/uploads/2018/08/CD-15_PROFIL-CAT_Kucing-Siam_FOTO-1.jpg?fit=2685%2C1790");
        mNames.add("Kucing Siam");
        mDetails.add("Asal Thailand");
        mDeskripsi.add("Kucing siam adalah salah satu ras kucing pertama yang diakui jelas sebagai kucing berjenis oriental. Sesuai dengan namanya, kucing siam berasal dari negara Siam (sekarang Thailand), sehingga ras kucing ini sangat mudah ditemukan di negara Thailand.");

        mImageUrls.add("https://zanial1485home.files.wordpress.com/2019/01/1eb49f6eb43cd32981149e9dedae3b72.jpg?w=880");
        mNames.add("Kucing Telinga Lipat Skotlandia");
        mDetails.add("Asal Skotlandia");
        mDeskripsi.add("Kucing telinga lipat skotlandia (bahasa Inggris: Scottish Fold cat; dahulu bernama flops) adalah salah satu ras kucing alami yang berasal dari Skotlandia. Ciri khas dan keunikannya adalah terdapat pada telingnya yang melipat, sehingga ras ini disebut dengan kucing berwajah burung hantu atau kucing coupari. Namun, beberapa kucing telinga lipat skotlandia ada yang lahir dengan telinga yang tidak terlipat, yaitu telinga yang tegak dan meruncing seperti kucing biasanya.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, mDetails, mDeskripsi,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
