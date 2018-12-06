package com.dji.sdk.sample.demo.keymanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dji.common.camera.SettingsDefinitions;
import dji.common.handheldcontroller.ControllerMode;
import dji.keysdk.AccessoryAggregationKey;
import dji.keysdk.AirLinkKey;
import dji.keysdk.BatteryKey;
import dji.keysdk.CameraKey;
import dji.keysdk.DJIKey;
import dji.keysdk.FlightControllerKey;
import dji.keysdk.GimbalKey;
import dji.keysdk.HandheldControllerKey;
import dji.keysdk.KeyManager;
import dji.keysdk.PayloadKey;
import dji.keysdk.ProductKey;
import dji.keysdk.RemoteControllerKey;
import dji.sdk.base.BaseProduct;
import dji.sdk.battery.Battery;
import dji.sdk.camera.Camera;
import dji.sdk.gimbal.Gimbal;
import dji.sdk.products.Aircraft;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 * @author dji
 */
public class KeyManagerUtils {
    private static final String FLIGHT_CONTROLLER_ACCESS_LOCKER = "AccessLocker";
    private static final String FLIGHT_CONTROLLER_FLIGHT_ASSISTANT = "FlightAssistant";
    private static final String BATTERY_BATTERY_AGGREGATION = "BatteryAggregation";
    private static final String AIR_LINK_WIFI_LINK = "WiFiLink";
    private static final String AIR_LINK_LIGHT_BRIDGE = "LightBridge";
    private static final String AIR_LINK_OCUSYNC_LINK = "OcuSyncLink";
    private static final String ACCESSORY_AGGREGATION_BEACON = "Beacon";
    private static final String ACCESSORY_AGGREGATION_SPOTLIGHT = "Spotlight";
    private static final String ACCESSORY_AGGREGATION_SPEAKER = "Speaker";


    protected static ArrayList<BaseProduct.ComponentKey> getComponentList() {
        ArrayList<BaseProduct.ComponentKey> componentKeyList = new ArrayList<>();
        componentKeyList.clear();

        BaseProduct.ComponentKey componentType = BaseProduct.ComponentKey.CAMERA;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }
        componentType = BaseProduct.ComponentKey.GIMBAL;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }
        componentType = BaseProduct.ComponentKey.REMOTE_CONTROLLER;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }
        componentType = BaseProduct.ComponentKey.FLIGHT_CONTROLLER;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }
        componentType = BaseProduct.ComponentKey.HAND_HELD_CONTROLLER;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }
        componentType = BaseProduct.ComponentKey.AIR_LINK;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }
        componentType = BaseProduct.ComponentKey.MOBILE_REMOTE_CONTROLLER;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }
        componentType = BaseProduct.ComponentKey.PAYLOAD;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }
        componentType = BaseProduct.ComponentKey.ACCESSORY_AGGREGATION;
        if (isComponentConnection(componentType)) {
            componentKeyList.add(componentType);
        }

        return componentKeyList;
    }

    private static boolean isComponentConnection(BaseProduct.ComponentKey componentKey) {
        if (componentKey == null) {
            return false;
        }

        KeyManager keyManager = KeyManager.getInstance();
        DJIKey key;
        Object result = null;

        switch (componentKey) {
            case CAMERA:
                key = CameraKey.create(CameraKey.CONNECTION);
                result = keyManager.getValue(key);
            case GIMBAL:
                key = GimbalKey.create(GimbalKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case REMOTE_CONTROLLER:
                key = RemoteControllerKey.create(RemoteControllerKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case FLIGHT_CONTROLLER:
                key = FlightControllerKey.create(FlightControllerKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case BATTERY:
                key = BatteryKey.create(BatteryKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case HAND_HELD_CONTROLLER:
                key = HandheldControllerKey.create(HandheldControllerKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case AIR_LINK:
                key = AirLinkKey.create(AirLinkKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case MOBILE_REMOTE_CONTROLLER:
                break;
            case PAYLOAD:
                key = PayloadKey.create(PayloadKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case ACCESSORY_AGGREGATION:
                key = AccessoryAggregationKey.create(AccessoryAggregationKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            default:
                break;
        }
        if (result instanceof Boolean && ((Boolean) result)) {
            return true;
        }

        return false;
    }

    protected static HashMap<BaseProduct.ComponentKey, ArrayList<String>> getSubComponentMap() {
        HashMap<BaseProduct.ComponentKey, ArrayList<String>> subComponentMap = new HashMap<>();
        subComponentMap.clear();
        String subComponnetType;

        ArrayList<String> flightControllerList = new ArrayList<>();
        flightControllerList.clear();
        flightControllerList.add("");
        subComponnetType = FLIGHT_CONTROLLER_ACCESS_LOCKER;
        if (isSubComponentConnection(subComponnetType)) {
            flightControllerList.add(subComponnetType);
        }
        subComponnetType = FLIGHT_CONTROLLER_FLIGHT_ASSISTANT;
        if (isSubComponentConnection(subComponnetType)) {
            flightControllerList.add(subComponnetType);
        }
        subComponentMap.put(BaseProduct.ComponentKey.FLIGHT_CONTROLLER, flightControllerList);

        ArrayList<String> batteryList = new ArrayList<>();
        batteryList.clear();
        batteryList.add("");
        subComponnetType = BATTERY_BATTERY_AGGREGATION;
        if (isSubComponentConnection(subComponnetType)) {
            batteryList.add(subComponnetType);
        }
        subComponentMap.put(BaseProduct.ComponentKey.BATTERY, batteryList);

        ArrayList<String> airLinkList = new ArrayList<>();
        airLinkList.clear();
        airLinkList.add("");
        subComponnetType = AIR_LINK_WIFI_LINK;
        if (isSubComponentConnection(subComponnetType)) {
            airLinkList.add(subComponnetType);
        }
        subComponnetType = AIR_LINK_LIGHT_BRIDGE;
        if (isSubComponentConnection(subComponnetType)) {
            airLinkList.add(subComponnetType);
        }
        subComponnetType = AIR_LINK_OCUSYNC_LINK;
        if (isSubComponentConnection(subComponnetType)) {
            airLinkList.add(subComponnetType);
        }
        subComponentMap.put(BaseProduct.ComponentKey.AIR_LINK, airLinkList);

        ArrayList<String> accessoryAggreationList = new ArrayList<>();
        accessoryAggreationList.clear();
        accessoryAggreationList.add("");
        subComponnetType = ACCESSORY_AGGREGATION_BEACON;
        if (isSubComponentConnection(subComponnetType)) {
            accessoryAggreationList.add(subComponnetType);
        }
        subComponnetType = ACCESSORY_AGGREGATION_SPOTLIGHT;
        if (isSubComponentConnection(subComponnetType)) {
            accessoryAggreationList.add(subComponnetType);
        }
        subComponnetType = ACCESSORY_AGGREGATION_SPEAKER;
        if (isSubComponentConnection(subComponnetType)) {
            accessoryAggreationList.add(subComponnetType);
        }
        subComponentMap.put(BaseProduct.ComponentKey.ACCESSORY_AGGREGATION, accessoryAggreationList);

        return subComponentMap;
    }

    private static boolean isSubComponentConnection(String subComponentType) {
        if (subComponentType == null) {
            return false;
        }

        KeyManager keyManager = KeyManager.getInstance();
        DJIKey key;
        Object result = null;

        switch (subComponentType) {
            case FLIGHT_CONTROLLER_ACCESS_LOCKER:
                key = FlightControllerKey.createAccessLockerKey(FlightControllerKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case FLIGHT_CONTROLLER_FLIGHT_ASSISTANT:
                key = FlightControllerKey.createFlightAssistantKey(FlightControllerKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case BATTERY_BATTERY_AGGREGATION:
                key = BatteryKey.createBatteryAggregationKey(BatteryKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case AIR_LINK_WIFI_LINK:
                key = AirLinkKey.createWiFiLinkKey(AirLinkKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case AIR_LINK_LIGHT_BRIDGE:
                key = AirLinkKey.createLightbridgeLinkKey(AirLinkKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case AIR_LINK_OCUSYNC_LINK:
                key = AirLinkKey.createOcuSyncLinkKey(AirLinkKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case ACCESSORY_AGGREGATION_BEACON:
                key = AccessoryAggregationKey.createBeaconKey(AccessoryAggregationKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case ACCESSORY_AGGREGATION_SPOTLIGHT:
                key = AccessoryAggregationKey.createSpotlightKey(AccessoryAggregationKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            case ACCESSORY_AGGREGATION_SPEAKER:
                key = AccessoryAggregationKey.createSpeakerKey(AccessoryAggregationKey.CONNECTION);
                result = keyManager.getValue(key);
                break;
            default:
                break;
        }

        if (result instanceof Boolean && ((Boolean) result)) {
            return true;
        }
        return false;
    }

    protected static HashMap<BaseProduct.ComponentKey, ArrayList<Integer>> getComponentIndexMap() {
        HashMap<BaseProduct.ComponentKey, ArrayList<Integer>> componentIndexMap = new HashMap<>();

        componentIndexMap.clear();
        Object model = null;
        KeyManager keyManager = KeyManager.getInstance();
        if (keyManager != null) {
            model = keyManager.getValue(ProductKey.create(ProductKey.MODEL_NAME));
        }
        if (model != null) {
            BaseProduct product = DJISDKManager.getInstance().getProduct();
            if (product instanceof Aircraft) {

                ArrayList<Integer> cameraIndexList = new ArrayList<>();
                cameraIndexList.clear();
                List<Camera> cameraList = ((Aircraft) product).getCameras();
                for (Camera camera : cameraList) {
                    cameraIndexList.add(camera.getIndex());
                }
                componentIndexMap.put(BaseProduct.ComponentKey.CAMERA, cameraIndexList);

                ArrayList<Integer> gimbalIndexList = new ArrayList<>();
                gimbalIndexList.clear();
                List<Gimbal> gimbalList = ((Aircraft) product).getGimbals();
                for (Gimbal gimbal : gimbalList) {
                    gimbalIndexList.add(gimbal.getIndex());
                }
                componentIndexMap.put(BaseProduct.ComponentKey.GIMBAL, gimbalIndexList);

                ArrayList<Integer> batteryIndexList = new ArrayList<>();
                batteryIndexList.clear();
                List<Battery> batteryList = ((Aircraft) product).getBatteries();
                for (Battery battery : batteryList) {
                    batteryIndexList.add(battery.getIndex());
                }
                componentIndexMap.put(BaseProduct.ComponentKey.BATTERY, batteryIndexList);
            }
        }

        return componentIndexMap;
    }


    protected static HashMap<BaseProduct.ComponentKey, ArrayList<String>> getKeyInterfaceMap() {
        HashMap<BaseProduct.ComponentKey, ArrayList<String>> keyInterfaceMap = new HashMap<>();
        keyInterfaceMap.clear();

        ArrayList<String> cameraKeyList = new ArrayList<>();
        cameraKeyList.clear();
        cameraKeyList.add(CameraKey.MODE);
        cameraKeyList.add(CameraKey.SHOOT_PHOTO_MODE);
        keyInterfaceMap.put(BaseProduct.ComponentKey.CAMERA, cameraKeyList);

        ArrayList<String> gimbalKeyList = new ArrayList<>();
        gimbalKeyList.clear();
        gimbalKeyList.add(GimbalKey.CALIBRATION_PROGRESS);
        gimbalKeyList.add(GimbalKey.CONTROLLER_MODE);
        gimbalKeyList.add(GimbalKey.BALANCE_STATE);
        keyInterfaceMap.put(BaseProduct.ComponentKey.GIMBAL, gimbalKeyList);

        ArrayList<String> batteryKeyList = new ArrayList<>();
        batteryKeyList.clear();
        batteryKeyList.add(BatteryKey.CELL_VOLTAGES);
        batteryKeyList.add(BatteryKey.AGGREGATION_STATE);
        keyInterfaceMap.put(BaseProduct.ComponentKey.BATTERY, batteryKeyList);

        ArrayList<String> remoteControllerKeyList = new ArrayList<>();
        remoteControllerKeyList.clear();
        remoteControllerKeyList.add(RemoteControllerKey.REMOTE_CONTROLLER_CALIBRATION_E_AXIS_STATUS);
        remoteControllerKeyList.add(RemoteControllerKey.CONTROLLING_GIMBAL_INDEX);
        keyInterfaceMap.put(BaseProduct.ComponentKey.REMOTE_CONTROLLER, remoteControllerKeyList);

        ArrayList<String> airLinkKeyList = new ArrayList<>();
        airLinkKeyList.clear();
        airLinkKeyList.add(AirLinkKey.IS_WIFI_LINK_SUPPORTED);
        airLinkKeyList.add(AirLinkKey.SSID);
        airLinkKeyList.add(AirLinkKey.CHANNEL_NUMBER);
        airLinkKeyList.add(AirLinkKey.BANDWIDTH);
        airLinkKeyList.add(AirLinkKey.DATA_RATE);
        keyInterfaceMap.put(BaseProduct.ComponentKey.AIR_LINK, airLinkKeyList);

        ArrayList<String> flightControllerKeyList = new ArrayList<>();
        flightControllerKeyList.clear();
        flightControllerKeyList.add(FlightControllerKey.AIRCRAFT_LOCATION);
        flightControllerKeyList.add(FlightControllerKey.ACCESS_LOCKER_STATE);
        keyInterfaceMap.put(BaseProduct.ComponentKey.FLIGHT_CONTROLLER, flightControllerKeyList);

        ArrayList<String> accessoryKeyList = new ArrayList<>();
        accessoryKeyList.clear();
        accessoryKeyList.add(AccessoryAggregationKey.PLAY_MODE);
        accessoryKeyList.add(AccessoryAggregationKey.BEACON_ENABLED);
        keyInterfaceMap.put(BaseProduct.ComponentKey.ACCESSORY_AGGREGATION, accessoryKeyList);


        return keyInterfaceMap;
    }

    protected static HashMap<String, ArrayList<Enum>> getSetValueMap() {
        HashMap<String, ArrayList<Enum>> setValueMap = new HashMap<>();
        setValueMap.clear();

        setValueMap.put(CameraKey.MODE, makeList(SettingsDefinitions.CameraMode.values()));
        setValueMap.put(CameraKey.SHOOT_PHOTO_MODE, makeList(SettingsDefinitions.ShootPhotoMode.values()));
        setValueMap.put(GimbalKey.CONTROLLER_MODE, makeList(ControllerMode.values()));

        return setValueMap;
    }

    protected static DJIKey createKey(BaseProduct.ComponentKey componentKey, String subComponent, int componentIndex, String keyStr) {
        DJIKey key = null;
        if (componentKey == null || keyStr == null) {
            return null;
        }

        switch (componentKey) {
            case CAMERA:
                key = CameraKey.create(keyStr, componentIndex);
                break;
            case GIMBAL:
                key = GimbalKey.create(keyStr, componentIndex);
                break;
            case REMOTE_CONTROLLER:
                key = RemoteControllerKey.create(keyStr);
                break;
            case PAYLOAD:
                key = PayloadKey.create(keyStr);
                break;
            case HAND_HELD_CONTROLLER:
                key = HandheldControllerKey.create(keyStr);
                break;
            default:
                key = createKeyWithSubComponent(componentKey, subComponent, componentIndex, keyStr);
                break;
        }
        return key;
    }


    private static DJIKey createKeyWithSubComponent(BaseProduct.ComponentKey componentKey, String subComponent, int componentIndex, String keyStr) {
        DJIKey key = null;
        if (componentKey == null || keyStr == null) {
            return null;
        }

        if (componentKey == BaseProduct.ComponentKey.BATTERY) {
            if (subComponent != null) {
                key = BatteryKey.createBatteryAggregationKey(keyStr);
            } else {
                key = BatteryKey.create(keyStr, componentIndex);
            }
        }

        if (componentKey == BaseProduct.ComponentKey.FLIGHT_CONTROLLER) {
            switch (subComponent) {
                case FLIGHT_CONTROLLER_ACCESS_LOCKER:
                    key = FlightControllerKey.createAccessLockerKey(keyStr);
                    break;
                case FLIGHT_CONTROLLER_FLIGHT_ASSISTANT:
                    key = FlightControllerKey.createFlightAssistantKey(keyStr);
                    break;
                default:
                    key = FlightControllerKey.create(keyStr);
                    break;
            }
        }

        if (componentKey == BaseProduct.ComponentKey.AIR_LINK) {
            switch (subComponent) {
                case AIR_LINK_WIFI_LINK:
                    key = AirLinkKey.createWiFiLinkKey(keyStr);
                    break;
                case AIR_LINK_LIGHT_BRIDGE:
                    key = AirLinkKey.createLightbridgeLinkKey(keyStr);
                    break;
                case AIR_LINK_OCUSYNC_LINK:
                    key = AirLinkKey.createOcuSyncLinkKey(keyStr);
                    break;
                default:
                    key = AirLinkKey.create(keyStr);
                    break;
            }
        }

        if (componentKey == BaseProduct.ComponentKey.ACCESSORY_AGGREGATION) {
            switch (subComponent) {
                case ACCESSORY_AGGREGATION_BEACON:
                    key = AccessoryAggregationKey.createBeaconKey(keyStr);
                    break;
                case ACCESSORY_AGGREGATION_SPOTLIGHT:
                    key = AccessoryAggregationKey.createSpotlightKey(keyStr);
                    break;
                case ACCESSORY_AGGREGATION_SPEAKER:
                    key = AccessoryAggregationKey.createSpeakerKey(keyStr);
                    break;
                default:
                    key = FlightControllerKey.create(keyStr);
                    break;
            }
        }

        return key;
    }

    protected static ArrayList<String> getNameList(List<? extends Enum> enums) {
        ArrayList<String> list = new ArrayList<>();
        for (Enum element : enums) {
            list.add(element.toString());
        }
        return list;
    }

    protected static ArrayList<String> makeList(Object[] objects) {
        ArrayList<String> list = new ArrayList<>();
        for (Object element : objects) {
            list.add(element.toString());
        }
        return list;
    }

    protected static ArrayList<Enum> makeList(Enum[] enums) {
        ArrayList<Enum> list = new ArrayList<>();
        for (Enum element : enums) {
            list.add(element);
        }
        return list;
    }
}
