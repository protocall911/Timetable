package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewClasses;

    private DaysAdapter adapter;
    private ArrayList<Days> daysArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewClasses = findViewById(R.id.rv_classes);

        recyclerViewClasses.setLayoutManager(new LinearLayoutManager(this));
        daysArrayList = new ArrayList<>();
        adapter = new DaysAdapter(this, daysArrayList);
        recyclerViewClasses.setAdapter(adapter);
        recyclerViewClasses.addItemDecoration(new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL));
        
        createListData();
    }

    private void createListData() {
        Days days_1 = new Days("Понедельник (Нахимовский)", "1. -", "2. Физическая культура (А.В. Андрюков)",
                "3. Системное программирование (А.Д. Нилов)", "4. Иностранный язык в профессиональной деятельности (А.Д. Завьялова, А.Ю. Дымская)",
                "5. Поддержка и тестирование программных модулей (М.А. Дюжева)", "6. -");
        daysArrayList.add(days_1);

        Days days_2 = new Days("Вторник (Нежинская)", "1. Теория вероятностей и математическая статистика (Т.А. Санаева)",
                "2. Основы проектирования баз данных (И.М. Щаников)", "3. Разработка программных модулей (Н.А. Михайлин)",
                "4. Операционные системы и среды (Д.В. Мысев)", "5. -", "6. -");
        daysArrayList.add(days_2);

        Days days_3 = new Days("Среда (Нахимовский)", "1. Основы алгоритмизации и программирования (М.А. Алешин)",
                "2. Числитель: Системное программирование (А.Д. Нилов) Знаменатель: Поддержка и тестирование программных модулей (М.А. Дюжева)",
                "3. Разработка мобильных приложений (Р.Ю. Волков)",
                "4. - ", "5. - ", "6. - ");
        daysArrayList.add(days_3);

        Days days_4 = new Days("Четверг (Нахимовский)", "1. -", "2. Числитель: - Знаменатель: Основы алгоритмизации и программирования (М.А. Алешин)",
                "3. Основы алгоритмизации и программирования (И.Д. Буканов)",
                "4. Разработка программных модулей (Н.А. Михайлин)", "5. Элементы высшей математики (М.В. Черемных)", "6. -");
        daysArrayList.add(days_4);

        Days days_5 = new Days("Пятница (Нахимовский)", "1. Основы проектирования баз данных (И.М. Щаников)", "2. Компьютерные сети (А.Д. Нилов)",
                "3. Числитель: Основы алгоритмизации и программирования (И.Д. Буканов) Знаменатель: Операционные системы и среды (Д.В. Мысев)",
                "4. Числитель: Разработка мобильных приложений (Р.Ю. Волков) Знаменатель: - ", "5. - ", "6. -");
        daysArrayList.add(days_5);


        adapter.notifyDataSetChanged();

    }
}