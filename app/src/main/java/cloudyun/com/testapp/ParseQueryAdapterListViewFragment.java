package cloudyun.com.testapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.parse.ParseObject;
import com.parse.ParseQueryAdapter;

/**
 * Created by 2013_13_mbp on 12/24/14.
 */
public class ParseQueryAdapterListViewFragment extends ListFragment {

    protected ParseQueryAdapter<ParseObject> adapter;

    public ParseQueryAdapterListViewFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ParseQueryAdapter<ParseObject>(getActivity(), "TestAppObject");
        adapter.setTextKey("name");

        setListAdapter(adapter);
    }
}
