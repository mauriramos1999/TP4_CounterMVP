package com.example.tp4_pil_mobile_basics_countermvp.mvp

import android.app.Activity
import java.lang.ref.WeakReference

open class ActivityView(activity: Activity) {

    private val activityReference: WeakReference<Activity> = WeakReference(activity)

    val activity: Activity? = activityReference.get()
}