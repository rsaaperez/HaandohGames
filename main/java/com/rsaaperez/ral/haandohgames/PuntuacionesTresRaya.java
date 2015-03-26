package com.rsaaperez.ral.haandohgames;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

import static com.rsaaperez.ral.haandohgames.TresEnRaya.ODB_NAME;


public class PuntuacionesTresRaya extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntuaciones_tres_raya);
        ODB odb = ODBFactory.open(ODB_NAME);
        Objects<Puntuaciones> puntuaciones = odb.getObjects(Puntuaciones.class);
        setListAdapter(new ArrayAdapter<Puntuaciones>(this,android.R.layout.simple_list_item_1, (java.util.List<Puntuaciones>) puntuaciones));
        odb.close();
    }

}
