package com.dji.sdk.sample.internal.view;

import java.util.List;
import java.util.Map;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.kankan.wheel.widget.OnWheelClickedListener;
import android.kankan.wheel.widget.OnWheelScrollListener;
import android.kankan.wheel.widget.WheelView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.wheel.wheel.adapter.AbstractWheelTextAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.PickerValueChangeListener;
import com.dji.sdk.sample.internal.utils.DensityUtil;

public class PopupNumberPickerDouble extends PopupWindow {
	
	private List<String> item_texts1 = null;
	Map<Integer, List<Integer>> item_image1;
	
	private List<String> item_texts2 = null;
	Map<Integer, List<Integer>> item_image2;
	
	String[] strItemValue1;
	String[] strItemValue2;
	
	PickerValueChangeListener valueChangeListen;
	WheelView Wheelpicker1;
	WheelView Wheelpicker2;
	
	int picker_currentPos1 = 0;
	int picker_currentPos2 = 0;
	
	int jpeg_seq_interval = 0;
	
	public PopupNumberPickerDouble(Context context)
	{
		super(context);
	}
	@SuppressLint("InflateParams")
    public PopupNumberPickerDouble(Context context,
				List<String> item_strings1,	Map<Integer, List<Integer>> ImagesMap1,
				List<String> item_strings2,	Map<Integer, List<Integer>> ImagesMap2,
			PickerValueChangeListener itemClickEvent, int w, int h, int pos) {

		super(context);
		
		item_texts1 = item_strings1;   
		item_image1 = ImagesMap1;
		item_texts2 = item_strings2;   
		item_image2= ImagesMap2;
		
		valueChangeListen = itemClickEvent;
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.numpicker_continue_shot, null);
		this.setContentView(view);
		this.setWidth(DensityUtil.dip2px(context, w));
		this.setHeight(DensityUtil.dip2px(context, h));
		this.setFocusable(true);//

		ColorDrawable dw = new ColorDrawable(-00000);
		this.setBackgroundDrawable(dw);
		strItemValue1 = new String[item_texts1.size()];
		for (int i = 0; i < item_texts1.size(); i++) 
		{
			strItemValue1[i] = item_texts1.get(i);

		}  
		
		strItemValue2 = new String[item_texts2.size()];
		for (int i = 0; i < item_texts2.size(); i++) 
		{
			strItemValue2[i] = item_texts2.get(i);
		}  
		  
		Wheelpicker1 = (WheelView) view.findViewById(R.id.id_number_picker1);
		Wheelpicker1.addScrollingListener(onWheelScrollListener1);
		Wheelpicker1.addClickingListener(onWheelClickedListener1);
		Wheelpicker1.setViewAdapter(new TypeTextAdapter(context, Wheelpicker1,strItemValue1));
		
		Wheelpicker1.setCurrentItem(pos);

		Wheelpicker2 = (WheelView) view.findViewById(R.id.id_number_picker2);
		Wheelpicker2.addScrollingListener(onWheelScrollListener2);
		Wheelpicker2.addClickingListener(onWheelClickedListener2);
		Wheelpicker2.setViewAdapter(new TypeTextAdapter(context, Wheelpicker2,strItemValue2));
		
		Wheelpicker2.setCurrentItem(pos);
		
		ImageButton select_button = (ImageButton) view.findViewById(R.id.id_select_imageButton1);
		select_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				valueChangeListen.onValueChange(picker_currentPos1, picker_currentPos2);
				
			}
		});

	}
  

	class TypeTextAdapter extends AbstractWheelTextAdapter {

		String[] strItemValue;
		protected TypeTextAdapter(Context context, WheelView wheelView,String[] strItemValue2) {
			super(context, R.layout.numpicker_type_layout, R.id.type_name);
			strItemValue = strItemValue2;
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
	}
	
	class TypeImageAdapter extends AbstractWheelTextAdapter {

		List<Integer> imagelist;
		protected TypeImageAdapter(Context context, WheelView wheelView,List<Integer> imagelis) {
			super(context, R.layout.numpicker_type_layout, R.id.type_name);
			imagelist = imagelis;
		}

		@Override
		public int getItemsCount() {
			return imagelist.size();
		}

		@Override
		protected CharSequence getItemText(int index) {
			return "";
		}

		@Override
		public View getItem(int index, View convertView, ViewGroup parent) {

			View view = super.getItem(index, convertView, parent);
			TextView tv = (TextView) view.findViewById(R.id.type_name);
			tv.setVisibility(View.GONE);
			tv.setText("fff 0");
			ImageView image = (ImageView) view.findViewById(R.id.flag);
			image.setVisibility(View.VISIBLE);
			image.setImageResource(imagelist.get(index));
			tv.setText("fff 1");
			return view;
		}
	}
	
	
	class ItemAdapter extends AbstractWheelTextAdapter {

		List<Integer> imagelist;
		protected ItemAdapter(Context context, WheelView wheelView,List<Integer> imagelis) {
			super(context, R.layout.numpicker_type_layout, R.id.type_name);
			imagelist = imagelis;
		}

		@Override
		public int getItemsCount() {
			return imagelist.size();
		}

		@Override
		protected CharSequence getItemText(int index) {
			return "";
		}

		@Override
		public View getItem(int index, View convertView, ViewGroup parent) {

			View view = super.getItem(index, convertView, parent);
			TextView tv = (TextView) view.findViewById(R.id.type_name);
			tv.setVisibility(View.GONE);
			tv.setText("fff 0");
			ImageView image = (ImageView) view.findViewById(R.id.flag);
			image.setVisibility(View.VISIBLE);
			image.setImageResource(imagelist.get(index));
			tv.setText("fff 1");
			return view;
		}
	}
	
	OnWheelScrollListener onWheelScrollListener1 = new OnWheelScrollListener() {
		@Override
		public void onScrollingStarted(WheelView wheel) {
		}

		@Override
		public void onScrollingFinished(WheelView wheel) {
			int pos = wheel.getCurrentItem();
			picker_currentPos1 = pos;
		}
	};

	OnWheelClickedListener onWheelClickedListener1 = new OnWheelClickedListener() {
		@Override
		public void onItemClicked(WheelView wheel, int itemIndex) {
			picker_currentPos1 = itemIndex;
			
			wheel.setCurrentItem(itemIndex);
		}
	};
	
	OnWheelScrollListener onWheelScrollListener2 = new OnWheelScrollListener() {
		@Override
		public void onScrollingStarted(WheelView wheel) {
		}

		@Override
		public void onScrollingFinished(WheelView wheel) {
			int pos = wheel.getCurrentItem();
			picker_currentPos2 = pos;
		}
	};

	OnWheelClickedListener onWheelClickedListener2 = new OnWheelClickedListener() {
		@Override
		public void onItemClicked(WheelView wheel, int itemIndex) {
			wheel.setCurrentItem(itemIndex);
			picker_currentPos2 = itemIndex;
			
		}
	};

}
