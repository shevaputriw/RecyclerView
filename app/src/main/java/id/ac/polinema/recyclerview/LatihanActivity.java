package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.GridAdapter;
import id.ac.polinema.recyclerview.adapters.LatihanAdapter;
import id.ac.polinema.recyclerview.models.Latihan;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class LatihanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<Latihan> teams = new ArrayList<>();

        teams.add(new Latihan("https://www.logofootball.net/wp-content/uploads/chelsea-fc-logo.png", "Chealsea Adalah Club Sepak Bola dari Inggris", "Chealse"));
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City Adalah Club Sepak Bola dari Inggris", "Man. City"));
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool Adalah Club Sepak Bola dari Inggris", "Liverpool"));
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool Adalah Club Sepak Bola dari Inggris", "Liverpool"));
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool Adalah Club Sepak Bola dari Inggris", "Liverpool"));
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool Adalah Club Sepak Bola dari Inggris", "Liverpool"));
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool Adalah Club Sepak Bola dari Inggris", "Liverpool"));
        teams.add(new Latihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool Adalah Club Sepak Bola dari Inggris", "Liverpool"));


        LatihanAdapter adapter = new LatihanAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
