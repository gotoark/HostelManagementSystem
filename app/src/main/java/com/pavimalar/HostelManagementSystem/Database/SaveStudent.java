package com.pavimalar.HostelManagementSystem.Database;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.pavimalar.HostelManagementSystem.Database.Tables.Student;

import java.util.List;

class SaveStudent extends AsyncTask<Context, Void, Void> {

    @Override
    protected Void doInBackground(Context... contexts) {

        //Student
           /* Student student=new Student();
            student.setName("Pavi");
            student.setAge(18);
            student.setDepartment("CSE");
            student.setYear(1);
            student.setRegNumber(1001);
            DatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                    .studentDao()
                    .insertStudent(student);*/
        List<Student> studentList= DatabaseClient.getInstance(contexts[0]).getAppDatabase()
                .studentDao()
                .getAllStudents();
        Log.d("sdfsdf","-----------------------------------"+studentList.size());
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        //finish();
        //startActivity(new Intent(getApplicationContext(), MainActivity.class));
       // Toast.makeText(this, "Student Details Saved Successfully..!!", Toast.LENGTH_LONG).show();
    }
}
