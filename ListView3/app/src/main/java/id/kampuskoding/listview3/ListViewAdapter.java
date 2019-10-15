package id.kampuskoding.listview3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

    //variables
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mDescTv = view.findViewById(R.id.mainDesc);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(modellist.get(postition).getTitle());
        holder.mDescTv.setText(modellist.get(postition).getDesc());
        //set the result in imageview
        holder.mIconIv.setImageResource(modellist.get(postition).getIcon());

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                if (modellist.get(postition).getTitle().equals("Presiden Soekarno")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Presiden Soekarno");
                    intent.putExtra("contentTv", "Lahir: Blitar, Jawa Timur, 6 Juni 1901.\n" +
                            "Meninggal: Jakarta 21 Juni 1970.\n" +
                            "Agama: Islam.\n" +
                            "Pendidikan: SMP / SMA di Surabaya, ITB di Bandung.\n" +
                            "Pengalaman: Penulis/Kolumnis dan Pejuang Politik / Diplomatic Pendiri PNI (4 Juli 1927); ProklamatorR.I.");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Presiden Soeharto")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Presiden Soeharto");
                    intent.putExtra("contentTv", "Lahir : Kemusuk, Argamulyo, Yogyakarta, 8 juni 1921\n" +
                            "Pendidikan : SD di Twir, Yogyakarta, Wuryantoro dan Solo; SMP dan Sekolah Agama di Wonogiri dan Yogyakarta (1935- 1939); Sekolah Bintara di Gombong, Jawa Tengah (1941).\n" +
                            "Pengalaman : Prajurit Teladan (1941-1942); Polisi Surela dan Tentara Peta (1942-1945); Pengawal Panglima Besar Soedirman; Pemimpin Serangan Umum merebut Ibu kota Yogyakarta (1 Maret 1949); Komandan Kostrad dan Panglima Sementara TNI AD (sampai dengan 1965); Panglima AD (1966); Ketua Presidium KabinetAmpera (1966).");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Presiden B. J. Habibie")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Presiden B. J. Habibie");
                    intent.putExtra("contentTv", "Lahir : Pare-pare, Sulawesi Selatan, 25 Juni\n" +
                            "Pendidikan : SD, SMP, SMA, Bandung (1954), mendapat gelar Diploma Ingenieur jurusan Kontruksi Pesawat Terbang Rheinisc-Westflaelische Tegnische, Aachen, Jerman Barat.\n" +
                            "Pengalaman: Asisten Riset Ilmu Pengetahuan Institut Kontruksi Ringan Rheinisc Technische, Aachen, Jerman Barat(1960-1965), Menteri Negara Riset dan Teknologi (1978), Dirut PT Pal, Surabaya (1978), Ketua BPPT, Ketua ICMI.");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Presiden Abdurrahman Wahid")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Presiden Abdurrahman Wahid");
                    intent.putExtra("contentTv", "Lahir : Denanyar, Jombang, Jawa Timur, 4 Agustus 1940\n" +
                            "Pendidikan : SD, Jakarta (1953);SMEP, Yogyakarta (1956); Pesantren Tambakberas,\n" +
                            "Jombang (1959 -1963); Departemen og Higher Islamic and Arabic Studies, Universitas Al Azhar, Kairo; Fakultas Sastra Universitas Bagdad, Irak (1970)\n" +
                            "Pengalaman : Guru Madrasah Mu’alimat, Tambakberas, Jombang (1959-1963); Dosen dan Dekan Fakultas Ushuluddin Universitas Hasyim Ashari, Jombang (1974-1979); Pengasuh Pondok Pesantren Ciganjur,\n" +
                            "Jakarta Selatan (1979); Ketua Tanfidziyah PB Nahdhatul Ulama (1984-1998).");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Presiden Megawati Soekarnoputri")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Presiden Megawati Soekarnoputri");
                    intent.putExtra("contentTv", "Lahir : Jakarta 23 Januari 1946.\n" +
                            "Pendidikan : SD – SMA, Perguruan Cikini, Jakarta.\n" +
                            "Kuliah Fakultas Pertanian Unpad, Fakultas Fisiologi Universitas Indonesia.\n" +
                            "Pengalaman : Ketua PDI (Munaslub PDI 1993); Ketua PDI-P (1999-sekarang); Wakil Presiden Rl (1999-2001)");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Presiden Susilo Bambang Yudhoyono")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Presiden Susilo Bambang Yudhoyono");
                    intent.putExtra("contentTv", "Nama : Jenderal TNI (Purn) Susilo Bambang Yudhoyono\n" +
                            "Lahir : Pacitan, Jawa Timur, 9 September 1949\n" +
                            "Agama : Islam\n" +
                            "Istri : Kristiani Herawatiputri\n" +
                            "Pendidikan :\n" +
                            "* Akademi Angkatan Bersenjata RI (Akabri) tahun 1973\n" +
                            "* American Language Course, Lackland, Texas AS, 1976\n" +
                            "* Airbone and Ranger Course, Fort Benning , AS, 1976\n" +
                            "* Infantry Officer Advanced Course, Fort Benning, AS, 1982-1983\n" +
                            "* On the job training di 82-nd Airbone Division, Fort Bragg, AS, 1983\n" +
                            "* Jungle Warfare School, Panama, 1983\n" +
                            "* Antitank Weapon Course di Belgia dan Jerman, 1984\n" +
                            "* Kursus Komando Batalyon, 1985\n" +
                            "* Sekolah Komando Angkatan Darat, 1988-1989\n" +
                            "* Command and General Staff College, Fort Leavenwort, Kansas, AS\n" +
                            "* Master of Art (MA) dari Management Webster University, Missouri, AS");
                    mContext.startActivity(intent);
                }
                if (modellist.get(postition).getTitle().equals("Presiden Joko Widodo")){
                    //start NewActivity with title for actionbar and text for textview
                    Intent intent = new Intent(mContext, NewActivity.class);
                    intent.putExtra("actionBarTitle", "Presiden Joko Widodo");
                    intent.putExtra("contentTv", "Lahir : Surakarta, 21 Juni 1961\n" +
                            "Istri : Ny. Hj. Iriana Joko Widodo\n" +
                            "Anak:\n" +
                            "Gibran Rakabumi Raka\n" +
                            "Kahiyang Ayu\n" +
                            "Kaesang Pangerap\n" +
                            "Agama : Islam\n" +
                            "Hobby : Penikmat musik rock\n" +
                            "Riwayat Pendidikan :\n" +
                            "*SDN 111 Tirtoyoso Solo, SMPN 1 Solo, SMAN 6 Solo\n" +
                            "* Almamater : Fakultas Kehutanan UGM Yogyakarta lulusan 1985\n" +
                            "Pengalaman : Pengusaha, Eksportir Mebel, Walikota Solo, Gubernur DKI Jakarta dan Presiden Indonesia ke-7");
                    mContext.startActivity(intent);
                }
            }
        });


        return view;
    }
    //filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else {
            for (Model model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }
}