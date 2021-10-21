package com.example.practica_t3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.practica_t3.adapter.AnimeAdapter;
import com.example.practica_t3.entidades.Anime;
import com.example.practica_t3.service.AnimeService;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv= findViewById(R.id.anime);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Retrofit retrofit= new  Retrofit.Builder()
                .baseUrl("https://josue.free.beeceptor.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimeService service=retrofit.create(AnimeService.class);

        List<Anime> data= Arrays.asList(
                new Anime("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRO_EE1vga2erwWCurJ9wV5sjPb3sRB8KGU4Snufr2zlDfMql3zhD8CEdpHO2aAXDVC2Vk&usqp=CAU","Resident Evil: La tiniebla infinita ","Años después de los horrores de Raccoon City, Claire y Leon se ven atrapados en una oscura conspiración cuando un ataque informático asola la Casa Blanca."),
                new Anime("https://upload.wikimedia.org//wikipedia/en/e/e6/Yasuke_poster.jpg","Yasuke","En el Japón feudal, un guerrero samurái de ascendencia africana debe volver a su vida de espadas y violencia para proteger a una misteriosa chica de las fuerzas oscuras."),
                new Anime("https://i.pinimg.com/originals/f7/30/01/f73001b81ce6bc6f200ddada3204009f.jpg","BNA: Brand New Animal","La existencia de animales humanoides que han vivido en la oscuridad durante siglos ha sido revelada al mundo."),
                new Anime("https://images-na.ssl-images-amazon.com/images/I/9145Oc7gAJS.jpg","El gran farsante","Makoto Edamura, supuestamente el mayor estafador de Japón, obtiene más de lo que esperaba cuando intenta estafar al ladrón Laurent Thierry."),
                new Anime("https://i.pinimg.com/originals/7c/db/17/7cdb17c7c1f728d3c5d2bc4f71f0c30c.jpg","Cagaster","Pasados treinta años después de la aparición de una epidemia, una joven y un exterminador buscan a su madre incansablemente"),
                new Anime("https://static.wikia.nocookie.net/doblaje/images/7/79/B_-_The_Beginning_-_Poster.jpg/revision/latest?cb=20191219030517&path-prefix=es","B The Beginning","El investigador Keith Flick vuelve a unirse a la fuerza policial justo cuando aparece el asesino en serie B."),
                new Anime("https://studiosol-a.akamaihd.net/uploadfile/letras/fotos/0/f/8/0/0f80a7ffda2db6d99fb0b64e73d8cb17.jpg","Carole & Tuesday","Carole, que trabaja a tiempo parcial, conoce a una chica rica llamada Tuesday y cada una se da cuenta de que ha encontrado la pareja musical que necesita."),
                new Anime("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT39lY8Zo2jY_mm6Q_FPbHwp2uHbJxu8zU8SlM6pAZH&usqp=CAE&s","Rey chamán","El chamán Yoh Asakura participa en un torneo que se celebra cada 500 años y compite con otros chamanes para convertirse en el todopoderoso Rey Chamán."),
                new Anime("https://occ-0-1722-92.1.nflxso.net/dnm/api/v6/E8vDc_W8CLv7-yMQu8KMEC7Rrr8/AAAABSWraVs-rMq-GbFrO_luHMT4uPrKxCbVU18n16HV1uLp3ZIXpP3aD5MZDjs0v5zg601h3g9aiSOe7Q385xjDOd909ZR3.jpg?r=7bc","Titanes del Pacífico: Tierra de nadie","Luego de que Kaiju devasta Australia, dos hermanos buscan a sus padres y encuentran nuevas criaturas, personajes y aliados"),
                new Anime("https://areajugones.sport.es/wp-content/uploads/2021/08/maxresdefault-1080x609.jpg","Bleach","Ichigo dedica su vida a proteger inocentes y ayuda a los espíritus a encontrar la paz")

        );
        AnimeAdapter adapter=new AnimeAdapter(data);
        rv.setAdapter(adapter);


        //service.create((Anime) data).enqueue(new Callback<Anime>() {
      //      @Override
      //      public void onResponse(Call<Anime> call, Response<Anime> response) {
       ///         Log.i("MAIN_APP",new Gson().toJson(response.body()));
       //     }

        //    @Override
        //    public void onFailure(Call<Anime> call, Throwable t) {
        //        Log.i("MAIN_APP","No se puede establecer comunicacion con el API");
        //    }
       // });
    }
}