package com.pavimalar.HostelManagementSystem.Screens;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.pavimalar.HostelManagementSystem.Database.DatabaseClient;
import com.pavimalar.HostelManagementSystem.Database.Tables.Student;
import com.pavimalar.HostelManagementSystem.R;

public class StudentActivity extends AppCompatActivity {

    Button addButton;
    EditText name,age,regNumber;
    Spinner departmnet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        addButton=findViewById(R.id.btn_add);
        name=findViewById(R.id.name);
        regNumber=findViewById(R.id.regNumber);
        age=findViewById(R.id.age);
        departmnet=findViewById(R.id.department);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get Student Details
                Student student=new Student();
                student.setName(name.getText().toString());
                student.setAge(Integer.valueOf(age.getText().toString()));
                student.setDepartment(departmnet.getSelectedItem().toString());
                student.setYear(1);
                student.setRegNumber(Integer.valueOf(regNumber.getText().toString()));
                SaveStudent saveStudent=new SaveStudent();
                saveStudent.execute(student);
            }
        });
    }


    class SaveStudent extends AsyncTask<Student, Void, Void> {

        @Override
        protected Void doInBackground(Student... students) {

            DatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                    .studentDao()
                    .insertStudent(students[0]);
            /*List<Student> studentList= DatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                    .studentDao()
                    .getAllStudents();
            Log.d("Student Size","-----------------------------------"+studentList.size());*/
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            //finish();
            //startActivity(new Intent(getApplicationContext(), MainActivity.class));
            Toast.makeText(getApplicationContext(), "Student Details Saved Successfully..!!", Toast.LENGTH_LONG).show();
        }
    }

}
