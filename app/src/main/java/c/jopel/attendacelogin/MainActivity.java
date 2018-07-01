package c.jopel.attendacelogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button MarkAttendance = (Button) findViewById(R.id.MarkAttendance);
        MarkAttendance.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent MarkAttendanceIntent = new Intent(getBaseContext(), MarkAttendance.class);
                startActivity(MarkAttendanceIntent);
            }
        });
        Button Counselling = (Button) findViewById(R.id.counselling);
        Counselling.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent CounsellingIntent = new Intent(getBaseContext(), Counselling.class);
                startActivity(CounsellingIntent);
            }
        });
        Button SyncStudentData = (Button) findViewById(R.id.SyncStudentData);
        SyncStudentData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent SyncStudentDataIntent = new Intent(getBaseContext(), SyncStudentData.class);
                startActivity(SyncStudentDataIntent);
            }
        });
        Button ClearAttendanceData = (Button) findViewById(R.id.ClearAttendanceData);
        ClearAttendanceData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent SyncStudentDataIntent = new Intent(getBaseContext(), ClearAttendanceData.class);
                startActivity(SyncStudentDataIntent);
            }
        });

        Button DownloadExaminationData = (Button) findViewById(R.id.DownloadExaminationData);
        DownloadExaminationData.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent clearExaminationDataIntent = new Intent(getBaseContext(), DownloadExaminationData.class);
                startActivity(clearExaminationDataIntent);
            }
        });

    }
}
