package org.droidplanner.widgets.spinners;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.MAVLink.Messages.ApmModes;

import java.util.List;

public class ModeAdapter extends ArrayAdapter<ApmModes> {

	public ModeAdapter(Context context, int resource, List<ApmModes> objects) {
		super(context, resource, objects);
		addAll(objects);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
        final ApmModes mode = getItem(position);
		TextView view = (TextView) super.getView(position, convertView, parent);
		view.setText(mode.getName());
		return view;
	}

	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		return getView(position, convertView, parent);
	}

}