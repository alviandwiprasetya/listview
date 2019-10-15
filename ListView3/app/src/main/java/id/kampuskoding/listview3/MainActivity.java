package id.kampuskoding.listview3;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Presiden RI");

        title = new String[]{"Presiden Soekarno", "Presiden Soeharto", "Presiden B. J. Habibie", "Presiden Abdurrahman Wahid", "Presiden Megawati Soekarnoputri", "Presiden Susilo Bambang Yudhoyono", "Presiden Joko Widodo"};
        description = new String[]{"lihat detail...", "lihat detail...", "lihat detail...", "lihat detail...", "lihat detail...", "lihat detail...", "lihat detail..."};
        icon = new int[]{R.drawable.presiden1, R.drawable.presiden2, R.drawable.presiden3, R.drawable.presiden4, R.drawable.presiden5, R.drawable.presiden6, R.drawable.presiden7};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){
            //do your functionality here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


