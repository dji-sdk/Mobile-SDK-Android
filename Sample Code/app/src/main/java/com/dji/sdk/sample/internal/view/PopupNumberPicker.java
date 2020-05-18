package com.dji.sdk.sample.internal.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.kankan.wheel.widget.OnWheelClickedListener;
import android.kankan.wheel.widget.OnWheelScrollListener;
import android.kankan.wheel.widget.WheelView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.wheel.wheel.adapter.AbstractWheelTextAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.PickerValueChangeListener;
import com.dji.sdk.sample.internal.utils.DensityUtil;

import java.util.List;

public class PopupNumberPicker extends PopupWindow {

	private List<String> item_texts = null;
	private String[] strItemValue;
	private TypeTextAdapter typeTextAdapter;
	private int pickerToSelectPos;
	private WheelView wheelPicker;

	private int pickerSelectedPos = -1;
	private View view;

	private boolean isSingleSelected;

	public interface PickerOtherActionListener {
		void onOtherAction();
	}

	PickerValueChangeListener onCallBack;
	PickerOtherActionListener otherAction;

	public PopupNumberPicker(Context context) 
	{
		super(context);
	}
	@SuppressLint("InflateParams")
	public PopupNumberPicker(Context context, List<String> item_strings,
                             PickerValueChangeListener itemClickEvent, int w, int h, int pos) {
		this(context, item_strings, itemClickEvent, w, h, pos, false, false);
	}

    public PopupNumberPicker(Context context, List<String> item_strings,
                             PickerValueChangeListener itemClickEvent, int w, int h, int pos, boolean selectable, boolean isSingle) {
		super(context);
		isSingleSelected = isSingle;
		item_texts = item_strings;
		onCallBack = itemClickEvent;


		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		view = inflater.inflate(R.layout.numpicker, null);
		this.setContentView(view);
		this.setWidth(DensityUtil.dip2px(context, w));
		this.setHeight(DensityUtil.dip2px(context, h));
		this.setFocusable(true);//

		ColorDrawable dw = new ColorDrawable(Color.TRANSPARENT);
		this.setBackgroundDrawable(dw);
		strItemValue = new String[item_texts.size()];
		for (int i = 0; i < item_texts.size(); i++) 
		{
			strItemValue[i] = item_texts.get(i);
		}

		wheelPicker = (WheelView) view.findViewById(R.id.id_number_picker1);
		wheelPicker.addScrollingListener(onWheelScrollListener);
		wheelPicker.addClickingListener(onWheelClickedListener);

		if (selectable) {
			boolean[] isSelected = new boolean[item_strings.size()];
			typeTextAdapter = new TypeTextAdapter(context, wheelPicker, isSelected);
		} else {
			typeTextAdapter = new TypeTextAdapter(context, wheelPicker);
		}

		wheelPicker.setViewAdapter(typeTextAdapter);
		//called after setViewAdapter
		wheelPicker.setCurrentItem(pos);
		

		ImageButton select_button = (ImageButton) view.findViewById(R.id.id_select_imageButton1);
		
		pickerToSelectPos = pos;
		
		select_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onCallBack.onValueChange(pickerToSelectPos, -1);
			}
		});
	}

	public int getPickerSelectedPos() {
		return this.pickerSelectedPos;
	}

	public void setPickerSelectedPos(int pickerSelectedPos) {
		this.pickerSelectedPos = pickerSelectedPos;
		if (pickerSelectedPos == pickerToSelectPos) {
			typeTextAdapter.setChange(pickerSelectedPos);
		}
	}

	public PopupNumberPicker(Context context, List<String> item_strings,
                             PickerValueChangeListener itemClickEvent, int otherActionName, PickerOtherActionListener otherAction, int w, int h, int pos) {
		this(context, item_strings, itemClickEvent, w, h, pos, true, true);
		this.otherAction = otherAction;
		final Button other_button = (Button) view.findViewById(R.id.id_select_otherActionButton);
		other_button.setText(otherActionName);
		other_button.setVisibility(View.VISIBLE);
		other_button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				PopupNumberPicker.this.otherAction.onOtherAction();
			}
		});
	}

	public PopupNumberPicker(Context context, List<String> item_strings,
                             PickerValueChangeListener itemClickEvent, int otherActionName, PickerOtherActionListener otherAction, int w, int h, int pos, boolean isSingle) {
		this(context, item_strings, itemClickEvent, w, h, pos, true, isSingle);
		this.otherAction = otherAction;
		final Button other_button = (Button) view.findViewById(R.id.id_select_otherActionButton);
		other_button.setText(otherActionName);
		other_button.setVisibility(View.VISIBLE);
		other_button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				PopupNumberPicker.this.otherAction.onOtherAction();
			}
		});
	}

	class TypeTextAdapter extends AbstractWheelTextAdapter {

		protected TypeTextAdapter(Context context, WheelView wheelView) {
			super(context, R.layout.numpicker_type_layout, R.id.type_name);
		}

		protected TypeTextAdapter(Context context, WheelView wheelView, boolean[] isSelected) {
			super(context, R.layout.numpicker_type_layout, R.id.type_name, isSelected);
		}

		@Override
		public int getItemsCount() {
			return strItemValue.length;
		}

		@Override
		protected CharSequence getItemText(int index) {
			return strItemValue[index].toString();
		}

		@Override
		public View getItem(int index, View convertView, ViewGroup parent) {
			View view = super.getItem(index, convertView, parent);
			return view;
		}

		@Override
		public void setSelected(int index){
			if (isSelected != null) {
				for (int i = 0; i < isSelected.length; i++) {
					if (i == index) {
						isSelected[i] = true;
					} else {
						if (isSingleSelected) {
							isSelected[i] = false;
						}
					}
				}
			}
		}
	}
	
	OnWheelScrollListener onWheelScrollListener = new OnWheelScrollListener() {
		@Override
		public void onScrollingStarted(WheelView wheel) {

		}

		@Override
		public void onScrollingFinished(WheelView wheel) {
			pickerToSelectPos = wheel.getCurrentItem();
		}
	};

	OnWheelClickedListener onWheelClickedListener = new OnWheelClickedListener() {
		@Override
		public void onItemClicked(WheelView wheel, int itemIndex) {
			wheel.setCurrentItem(itemIndex);
			pickerToSelectPos = itemIndex;
		}
	};

}
