package com.example.pruebaweatherlatam

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.crashlytics.FirebaseCrashlytics

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar el color de fondo según el BuildConfig
        findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.root_layout).setBackgroundColor(
            Color.parseColor(BuildConfig.BACKGROUND_COLOR)
        )

        // Enviar log a Firebase Crashlytics
        FirebaseCrashlytics.getInstance().log(
            "Este es un mensaje de prueba (Desarrollo de aplicaciones empresariales Android)"
        )

        // Enviar key específica del build variant
        FirebaseCrashlytics.getInstance().setCustomKey("app_env", BuildConfig.APP_ENV)
    }
}
