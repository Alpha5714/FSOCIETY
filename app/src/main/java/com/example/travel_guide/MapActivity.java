package com.example.travel_guide;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class MapActivity extends AppCompatActivity implements OnMapReadyCallback{
    @Override
    public void onMapReady(GoogleMap googleMap) {
        Toast.makeText(this, "Map is Ready", Toast.LENGTH_SHORT).show();
        mMap=googleMap;
            mMap.setMyLocationEnabled(true);
            mMap.getUiSettings().setMyLocationButtonEnabled(false);
            LatLng Lumbini = new LatLng(27.6792, 83.5070);
            LatLng Tilaurakot = new LatLng(27.5829, 83.0845);
            LatLng Ranimahal = new LatLng(27.9267, 83.5278);
            LatLng Banbatika = new LatLng(27.6527, 83.4824);
            mMap.addMarker(new MarkerOptions()
                    .position(Lumbini)
                    .title("Lumbini")
                    .snippet("Wanna Visit"));
            mMap.addMarker(new MarkerOptions()
                    .position(Tilaurakot)
                    .title("Tilaurakot")
                    .snippet("Wanna Visit"));
            mMap.addMarker(new MarkerOptions()
                    .position(Ranimahal)
                    .title("Ranimahal")
                    .snippet("Wanna Visit"));
            mMap.addMarker(new MarkerOptions()
                    .position(Banbatika)
                    .title("Banbatika")
                    .snippet("Wanna Visit"));


            };



    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

}
