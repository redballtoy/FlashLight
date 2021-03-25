package com.example.redballtoy.flashlight

import android.content.Context
import android.hardware.camera2.CameraManager

class Flash(val context: Context, var isFlash: Boolean = false) {

    fun setFlash() {
        val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as CameraManager
        //получить id фронтальной камеры
        val cameraId = cameraManager.cameraIdList[0]
        //указываем для какой камеры используем вспышку и включаем или отключаем ее
        cameraManager.setTorchMode(cameraId, isFlash)
    }
}