package masterung.androidthai.in.th.learnrecycleview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import masterung.androidthai.in.th.learnrecycleview.MainActivity;
import masterung.androidthai.in.th.learnrecycleview.R;
import masterung.androidthai.in.th.learnrecycleview.utility.MyAdapter;
import masterung.androidthai.in.th.learnrecycleview.utility.MyData;

/**
 * Created by masterung on 10/2/2018 AD.
 */

public class MainFragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

//        Create ListView
        createListView();

    }   // onActivityCreated

    private void createListView() {
        ListView listView = getView().findViewById(R.id.listviewOld);
        MyData myData = new MyData();
        MyAdapter myAdapter = new MyAdapter(
                getActivity(),
                myData.getFoodStrings(),
                myData.getFoodInts());
        listView.setAdapter(myAdapter);
    }

    private void createToolbar() {

        Toolbar toolbar = getView().findViewById(R.id.toolbarMain);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("ListView");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("Show Old ListView");

        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_action_navigation);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Click Navigation", Toast.LENGTH_SHORT).show();
            }
        });


        setHasOptionsMenu(true);


    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.itemRecycleView) {
            getActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contentMainFragment, new ShowRecycleViewFragment())
                    .addToBackStack(null)
                    .commit();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}
