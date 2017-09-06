package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {
    @Autowired
    TaskFinancialDetailsDao taskFinancialDetailsDao;
    @Autowired
    TaskDao taskDao;

    @Test
    public void testFindByPaid() {
        //Given
        TaskFinancialDetails taskFinancialDetails =
                new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();
        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);
        //Then
        Assert.assertEquals(1, resultList.size());
        //CleanUp
        taskFinancialDetailsDao.delete(id);
    }

    @Test
    public void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task("TaskWithFinancialDetails",1);
        TaskFinancialDetails tfd = new TaskFinancialDetails(BigDecimal.valueOf(500),true);
        //When
        taskDao.save(task);
        taskFinancialDetailsDao.save(tfd);
        int t_id = task.getId();
        int tf_id = tfd.getId();
        //Then
        Assert.assertEquals(t_id,task.getId());
        Assert.assertEquals(tf_id,tfd.getId());
        /*
        //CleanUp
        taskDao.delete(t_id);
        taskFinancialDetailsDao.delete(tf_id);
        */
    }
}