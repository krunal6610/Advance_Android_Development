
package com.example.googlemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(),OnMapReadyCallback {

    lateinit var mMap:GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val mapFragment = supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
      mapFragment.getMapAsync(this)


    }

//    override fun onMapReady(p0: GoogleMap?) {
//
//
//
//    }

    override fun onMapReady(p0: GoogleMap) {
        if (p0 != null) {
            mMap = p0
        }

        //var india = LatLng(20.5937, 78.9629)
        var newNaroda = LatLng(23.068291, 72.660896)
        mMap.addMarker(MarkerOptions().position(newNaroda).title("Maker In New Naroda"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(newNaroda,12f))

    }
}