package com.dji.sdk.sample.demo.keymanager;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.dji.sdk.sample.internal.view.PresentableView;
import com.dji.sdk.sample.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dji.common.error.DJIError;
import dji.keysdk.DJIKey;
import dji.keysdk.KeyManager;
import dji.keysdk.callback.GetCallback;
import dji.keysdk.callback.KeyListener;
import dji.keysdk.callback.SetCallback;
import dji.sdk.base.BaseProduct;


/**
 * @author dji
 */
public class KeyManagerView extends RelativeLayout implements PresentableView, View.OnClickListener, AdapterView.OnItemSelectedListener {

    private static final String COMPONENT = "Component: ";
    private static final String SUB_COMPONENT = "SubComponenet: ";
    private static final String COMPONENT_INDEX = "ComponentIndex: ";
    private static final String KEY_TYPE = "Type: ";
    private static final String KEY_INTERFACE = "Key: ";
    private static final String VALUE = "Value: ";

    private Spinner mComponenetSpinner;
    private Spinner mSubComponentSpinner;
    private Spinner mComponentIndexSpinner;
    private Spinner mKeyInterfaceSpinner;
    private TextView mGetValueTv;
    private TextView mListenKeyTv;
    private TextView mKeyValueTv;
    private Spinner mSetValueSpinner;
    private Button mGetValueBtn;
    private Button mSetValueBtn;
    private Button mListenKeyBtn;
    private ArrayAdapter mComponentAdapter;
    private ArrayAdapter mSubComponentAdapter;
    private ArrayAdapter mComponentIndexAdapter;
    private ArrayAdapter mKeyInterfaceAdapter;
    private ArrayAdapter mSetValueAdapter;

    private List<BaseProduct.ComponentKey> mComponentKeyList = new ArrayList<>();
    private HashMap<BaseProduct.ComponentKey, ArrayList<String>> mSubComponentMap = new HashMap<>();
    private HashMap<BaseProduct.ComponentKey, ArrayList<Integer>> mComponentIndexMap = new HashMap<>();
    private HashMap<BaseProduct.ComponentKey, ArrayList<String>> mKeyInterfaceMap = new HashMap<>();
    private HashMap<String, ArrayList<Enum>> mSetValueMap = new HashMap<>();
    private ArrayList<String> currentSubComponentList = new ArrayList<>();
    private ArrayList<Integer> currentComponentIndexList = new ArrayList<>();
    private ArrayList<String> currentKeyInterfaceList = new ArrayList<>();

    private BaseProduct.ComponentKey currentComponentKey;
    private String currentSubComponent = null;
    private int currentComponetIndex;
    private DJIKey currentKey;
    private String currentKeyStr;
    private Object newValue;
    private StringBuilder reslutInfo = null;

    private KeyListener keyListener;
    private boolean isKeyListened = false;
    private boolean isFirstGetValue = false;

    private Handler handler = new Handler();

    public KeyManagerView(Context context) {
        super(context);
        initUI(context);
    }

    private void initUI(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_key_manager, this, true);

        mComponenetSpinner = (Spinner) findViewById(R.id.component_spinner);
        mSubComponentSpinner = (Spinner) findViewById(R.id.sub_component_spinner);
        mComponentIndexSpinner = (Spinner) findViewById(R.id.component_index_spinner);
        mKeyInterfaceSpinner = (Spinner) findViewById(R.id.key_interface_spinner);
        mGetValueTv = (TextView) findViewById(R.id.get_value_tv);
        mListenKeyTv = (TextView) findViewById(R.id.listen_key_tv);
        mKeyValueTv = (TextView) findViewById(R.id.key_vaule_tv);
        mSetValueSpinner = (Spinner) findViewById(R.id.set_value_spinner);
        mGetValueBtn = (Button) findViewById(R.id.get_value_btn);
        mSetValueBtn = (Button) findViewById(R.id.set_value_btn);
        mListenKeyBtn = (Button) findViewById(R.id.listen_key_btn);

        mComponentKeyList = KeyManagerUtils.getComponentList();
        mComponentAdapter = getArrayAdapter();
        mComponentAdapter.addAll(KeyManagerUtils.getNameList(mComponentKeyList));
        mComponenetSpinner.setAdapter(mComponentAdapter);
        mComponenetSpinner.setSelection(0);

        mSubComponentAdapter = getArrayAdapter();
        mSubComponentSpinner.setAdapter(mSubComponentAdapter);
        mSubComponentSpinner.setEnabled(false);

        mComponentIndexAdapter = getArrayAdapter();
        mComponentIndexSpinner.setAdapter(mComponentIndexAdapter);
        mComponentIndexSpinner.setEnabled(false);

        mKeyInterfaceAdapter = getArrayAdapter();
        mKeyInterfaceSpinner.setAdapter(mKeyInterfaceAdapter);
        mKeyInterfaceSpinner.setEnabled(false);

        mSetValueAdapter = getArrayAdapter();
        mSetValueSpinner.setAdapter(mSetValueAdapter);
        mSetValueSpinner.setEnabled(false);

        mComponenetSpinner.setOnItemSelectedListener(this);
        mSubComponentSpinner.setOnItemSelectedListener(this);
        mComponentIndexSpinner.setOnItemSelectedListener(this);
        mKeyInterfaceSpinner.setOnItemSelectedListener(this);
        mSetValueSpinner.setOnItemSelectedListener(this);

        mGetValueBtn.setOnClickListener(this);
        mSetValueBtn.setOnClickListener(this);
        mListenKeyBtn.setOnClickListener(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mSubComponentMap = KeyManagerUtils.getSubComponentMap();
        mComponentIndexMap = KeyManagerUtils.getComponentIndexMap();
        mKeyInterfaceMap = KeyManagerUtils.getKeyInterfaceMap();
        mSetValueMap = KeyManagerUtils.getSetValueMap();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unListenKey();
        handler.removeCallbacksAndMessages(null);
    }


    private Runnable runUpdateSubComponent = new Runnable() {
        @Override
        public void run() {
            mSubComponentSpinner.setEnabled(true);
            mSubComponentAdapter.notifyDataSetChanged();
        }
    };

    private Runnable runUpdateComponentIndex = new Runnable() {
        @Override
        public void run() {
            mComponentIndexSpinner.setEnabled(true);
            mComponentIndexAdapter.notifyDataSetChanged();
        }
    };

    private Runnable runUpdateKeyInterface = new Runnable() {
        @Override
        public void run() {
            mKeyInterfaceSpinner.setEnabled(true);
            mKeyInterfaceAdapter.notifyDataSetChanged();
        }
    };

    private Runnable runUpdateSetValue = new Runnable() {
        @Override
        public void run() {
            mSetValueSpinner.setEnabled(true);
            mSetValueAdapter.notifyDataSetChanged();
        }
    };

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        isFirstGetValue = false;
        switch (adapterView.getId()) {
            case R.id.component_spinner:
                updateComponent(i);
                break;
            case R.id.sub_component_spinner:
                updateSubComponent(i);
                break;
            case R.id.component_index_spinner:
                updateComponentIdex(i);
                break;
            case R.id.key_interface_spinner:
                updateKeyInterface(i);
                break;
            default:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        currentKey = KeyManagerUtils.createKey(currentComponentKey, currentSubComponent, currentComponetIndex, currentKeyStr);
        switch (view.getId()) {
            case R.id.get_value_btn:
                getValue();
                break;
            case R.id.set_value_btn:
                setValue();
                break;
            case R.id.listen_key_btn:
                if (isKeyListened) {
                    isKeyListened = false;
                    unListenKey();
                } else {
                    isKeyListened = true;
                    listenKey();
                }
                break;
            default:
                break;
        }
    }

    private void getValue() {
        if (isFirstGetValue) {
            postReslutToToast("You has already got Value!");
            return;
        }

        if (currentKey == null) {
            return;
        }

        KeyManager.getInstance().getValue(currentKey, new GetCallback() {
            @Override
            public void onSuccess(@NonNull Object value) {
                if (value != null) {
                    isFirstGetValue = true;
                    sendMessageToTV("Get", value);
                }
                postReslutToToast("Get Value Success!");
            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                postReslutToToast("Get Value Failed: " + error.getDescription());
            }
        });
    }

    private void setValue() {
        ArrayList<Enum> setValueList = mSetValueMap.get(currentKeyStr);
        int newValuePosition = mSetValueSpinner.getSelectedItemPosition();
        if (setValueList != null && !setValueList.isEmpty() && newValuePosition >= 0) {
            newValue = setValueList.get(newValuePosition);
        }

        if (currentKey == null || newValue == null) {
            return;
        }

        KeyManager.getInstance().setValue(currentKey, newValue, new SetCallback() {
            @Override
            public void onSuccess() {
                sendMessageToTV("Set", newValue);
                postReslutToToast("Set Value Success!");
            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                postReslutToToast("Set Value Failed: " + error.getDescription());
            }
        });
    }

    private void listenKey() {
        if (currentKey == null) {
            return;
        }
        sendMessageToTV("Listen");
        keyListener = new KeyListener() {
            @Override
            public void onValueChange(@Nullable Object oldValue, @Nullable Object newValue) {
                if (newValue != null) {
                    sendMessageToTV("Listen", newValue);
                    postReslutToToast("Listen key: " + currentKeyStr + ", oldValue: " + oldValue.toString() + ", newValue: " + newValue.toString());
                }
            }
        };

        handler.post(new Runnable() {
            @Override
            public void run() {
                mListenKeyBtn.setText("UnListen");
            }
        });
        KeyManager.getInstance().addListener(currentKey, keyListener);
    }

    private void unListenKey() {
        if (currentKey == null) {
            return;
        }

        if (keyListener != null) {
            handler.post(new Runnable() {
                @Override
                public void run() {
                    mListenKeyBtn.setText("Listen");
                }
            });
            KeyManager.getInstance().removeListener(keyListener);
        }
    }

    private void updateComponent(final int index) {
        currentComponentKey = mComponentKeyList.get(index);
        sendMessageToTV();
        postKeyInfoToTV("KeyName");

        mSubComponentAdapter.clear();
        currentSubComponentList = mSubComponentMap.get(currentComponentKey);
        if (currentSubComponentList != null && !currentSubComponentList.isEmpty()) {
            mSubComponentAdapter.addAll(currentSubComponentList);
            handler.post(runUpdateSubComponent);
        } else {
            currentSubComponent = null;
            handler.post(new Runnable() {
                @Override
                public void run() {
                    mSubComponentSpinner.setEnabled(false);
                }
            });
        }

        mComponentIndexAdapter.clear();
        currentComponentIndexList = mComponentIndexMap.get(currentComponentKey);
        if (currentComponentIndexList != null && !currentComponentIndexList.isEmpty()) {
            mComponentIndexAdapter.addAll(currentComponentIndexList);
            handler.post(runUpdateComponentIndex);
        } else {
            currentComponetIndex = -1;
            handler.post(new Runnable() {
                @Override
                public void run() {
                    mComponentIndexSpinner.setEnabled(false);
                }
            });
        }

        mKeyInterfaceAdapter.clear();
        mSetValueAdapter.clear();
        currentKeyInterfaceList = mKeyInterfaceMap.get(currentComponentKey);
        if (currentKeyInterfaceList != null && !currentKeyInterfaceList.isEmpty()) {
            mKeyInterfaceAdapter.addAll(currentKeyInterfaceList);
            handler.post(runUpdateKeyInterface);
        } else {
            currentKeyStr = null;
            handler.post(new Runnable() {
                @Override
                public void run() {
                    mKeyInterfaceSpinner.setEnabled(false);
                }
            });
        }
    }

    private void updateSubComponent(final int index) {
        mSetValueAdapter.clear();
        if (currentSubComponentList != null && !currentSubComponentList.isEmpty()) {
            currentSubComponent = currentSubComponentList.get(index);
            sendMessageToTV();
        }
    }

    private void updateComponentIdex(final int index) {
        if (currentComponentIndexList != null && !currentComponentIndexList.isEmpty()) {
            currentComponetIndex = currentComponentIndexList.get(index);
            sendMessageToTV();
        }
    }

    private void updateKeyInterface(final int index) {
        mSetValueAdapter.clear();
        if (currentKeyInterfaceList != null && !currentKeyInterfaceList.isEmpty()) {
            currentKeyStr = currentKeyInterfaceList.get(index);
            ArrayList<Enum> setValueList = mSetValueMap.get(currentKeyStr);
            if (setValueList != null && !setValueList.isEmpty()) {
                mSetValueAdapter.addAll(setValueList);
                handler.post(runUpdateSetValue);
            } else {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        mSetValueSpinner.setEnabled(false);
                    }
                });
            }
            sendMessageToTV();
            postKeyInfoToTV(currentKeyStr);
        }
    }

    private void postReslutToToast(final String text) {
        post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getContext().getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void postResultToTV(final StringBuilder text) {
        post(new Runnable() {
            @Override
            public void run() {
                mKeyValueTv.setText(text);
            }
        });
    }

    private void postKeyInfoToTV(final String key) {
        post(new Runnable() {
            @Override
            public void run() {
                mGetValueTv.setText(key);
                mListenKeyTv.setText(key);
            }
        });
    }

    private void sendMessageToTV() {
        sendMessageToTV(null, null);
    }

    private void sendMessageToTV(final String type) {
        sendMessageToTV(type, null);
    }

    private void sendMessageToTV(final String type, final Object value) {
        reslutInfo = new StringBuilder();
        reslutInfo.append(COMPONENT);
        reslutInfo.append(currentComponentKey);
        reslutInfo.append("\n");

        if (currentSubComponent != null) {
            reslutInfo.append(SUB_COMPONENT);
            reslutInfo.append(currentSubComponent);
            reslutInfo.append("\n");
        }

        if (currentComponetIndex != -1) {
            reslutInfo.append(COMPONENT_INDEX);
            reslutInfo.append(currentComponetIndex);
            reslutInfo.append("\n");
        }

        if (type != null) {
            reslutInfo.append(KEY_TYPE);
            reslutInfo.append(type);
            reslutInfo.append("\n");
        }

        if (currentKeyStr != null) {
            reslutInfo.append(KEY_INTERFACE);
            reslutInfo.append(currentKeyStr);
            reslutInfo.append("\n");
        }

        if (value != null) {
            reslutInfo.append(VALUE);
            reslutInfo.append(value.toString());
            reslutInfo.append("\n");
        }
        postResultToTV(reslutInfo);
    }

    private ArrayAdapter<String> getArrayAdapter() {
        ArrayAdapter<String> adapter = new ArrayAdapter(getContext(), android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return adapter;
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_key_manager;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
