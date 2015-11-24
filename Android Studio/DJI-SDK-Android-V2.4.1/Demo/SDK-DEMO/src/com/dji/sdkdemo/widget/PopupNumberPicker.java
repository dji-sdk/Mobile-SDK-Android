package com.dji.sdkdemo.widget;

import java.util.List;



import com.dji.sdkdemo.R;
import com.dji.sdkdemo.CameraProtocolDemoActivity.pickerValueChangeListener;
import com.dji.sdkdemo.util.DensityUtil;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.kankan.wheel.widget.OnWheelClickedListener;
import android.kankan.wheel.widget.OnWheelScrollListener;
import android.kankan.wheel.widget.WheelView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.wheel.wheel.adapter.AbstractWheelTextAdapter;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;

public class PopupNumberPicker extends PopupWindow {

	private List<String> item_texts = null;
	String[] strItemValue;
	TypeTextAdapter typeTextAdapter;
	int picker_select_pos;
	
	pickerValueChangeListener onCallBack;
	public PopupNumberPicker(Context context) 
	{
		super(context);
	}
	public PopupNumberPicker(Context context, List<String> item_strings,
			pickerValueChangeListener itemClickEvent, int w, int h, int pos) {
		super(context);

		item_texts = item_strings;
		onCallBack = itemClickEvent;


		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.numpicker, null);
		this.setContentView(view);
		this.setWidth(DensityUtil.dip2px(context, w));
		this.setHeight(DensityUtil.dip2px(context, h));
		this.setFocusable(true);//
		// this.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.pickerbackground_singl));

		ColorDrawable dw = new ColorDrawable(-00000);
		this.setBackgroundDrawable(dw);
		strItemValue = new String[item_texts.size()];
		for (int i = 0; i < item_texts.size(); i++) 
		{
			strItemValue[i] = item_texts.get(i);

		}

		WheelView Wheelpicker = (WheelView) view.findViewById(R.id.id_numberPicker1);
		Wheelpicker.addScrollingListener(onWheelScrollListener);
		Wheelpicker.addClickingListener(onWheelClickedListener);
		
		typeTextAdapter = new TypeTextAdapter(context, Wheelpicker);
		
		//typeTextAdapter.init(0);
		Wheelpicker.setViewAdapter(typeTextAdapter);
		//放到setViewAdapter 之后
		Wheelpicker.setCurrentItem(pos);
		

		ImageButton select_button = (ImageButton) view.findViewById(R.id.id_select_imageButton1);
		
		picker_select_pos = pos;
		
		select_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onCallBack.onValueChange(picker_select_pos, -1);
			}
		});
		
		



	}


	class TypeTextAdapter extends AbstractWheelTextAdapter {


		protected TypeTextAdapter(Context context, WheelView wheelView) {
			// super(context, R.layout.type_layout, R.id.type_name, isSelected);
			super(context, R.layout.numpicker_type_layout, R.id.type_name);
		}

		public int getItemsCount() {
			return strItemValue.length;
		}

		@Override
		protected CharSequence getItemText(int index) {
			// TODO Auto-generated method stub
			return strItemValue[index].toString();
		}

		@Override
		public View getItem(int index, View convertView, ViewGroup parent) {

			View view = super.getItem(index, convertView, parent);
			TextView tv = (TextView) view.findViewById(R.id.type_name);
			
			return view;
		}

	

	}
	
	OnWheelScrollListener onWheelScrollListener = new OnWheelScrollListener() {
		public void onScrollingStarted(WheelView wheel) {
			//select_type = type[wheelView.getCurrentItem()];
		}

		public void onScrollingFinished(WheelView wheel) {
			String select = strItemValue[wheel.getCurrentItem()];
			picker_select_pos = wheel.getCurrentItem();
		}
	};

	OnWheelClickedListener onWheelClickedListener = new OnWheelClickedListener() {

		public void onItemClicked(WheelView wheel, int itemIndex) {
			wheel.setCurrentItem(itemIndex);
			picker_select_pos = itemIndex;
			String select = strItemValue[itemIndex];
		}
	};

}
