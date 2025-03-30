package com.example.lostdevicerecoveryapp.screen

import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.activity.result.ActivityResultLauncher

object BluetoothManager {
    fun enableBluetooth(activity: Activity, launcher: ActivityResultLauncher<Intent>) {
        val bluetoothAdapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()

        // Check if the device supports Bluetooth
        if (bluetoothAdapter == null) {
            Log.e("Bluetooth", "Device does not support Bluetooth")
            return
        }

        // Enable Bluetooth using system request
        if (!bluetoothAdapter.isEnabled) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            launcher.launch(enableBtIntent) // Launch system prompt
        } else {
            Log.d("Bluetooth", "Bluetooth is already enabled")
        }
    }
}
