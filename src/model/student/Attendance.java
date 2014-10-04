/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.student;

import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author Pubudu
 */
public class Attendance {
    
    private String studentId;
    private Time timestamp;
    private Date date;

    public Attendance(String studentId, long currentTime) {
        this.studentId = studentId;
        this.timestamp = new Time(currentTime);
        this.date = new Date(currentTime);
    }

    public String getStudentId() {
        return studentId;
    }

    public Time getTimestamp() {
        return timestamp;
    }

    public Date getDate() {
        return date;
    }
    
}
