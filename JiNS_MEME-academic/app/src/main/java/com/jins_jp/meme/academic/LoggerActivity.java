package com.jins_jp.meme.academic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattCharacteristic;

import com.jins_jp.meme.academic.ble.BluetoothLeService;

import java.util.UUID;

/**
 * Created by user2013 on 2016/06/15.
 */
public class LoggerActivity{

    private BluetoothLeService mBluetoothLeService;
    private BluetoothAdapter mBluetoothAdapter;
    private BluetoothGattCharacteristic mBluetoothGattChar;
    private final UUID serviceUUID = BluetoothLeService.SERVICE_UUID;
    private final UUID rxcharaUUID = BluetoothLeService.RX_CHAR_UUID;
    private final UUID txcharaUUID = BluetoothLeService.TX_CHAR_UUID;


}
