package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){

        Job job1 = new Job();
        Job job2 = new Job();

        Assert.assertNotEquals(job1.getId(),job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){

        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertNotNull(job3.getName());
        Assert.assertTrue(job3.getEmployer() instanceof Employer);
        Assert.assertTrue(job3.getLocation() instanceof Location);
        Assert.assertTrue(job3.getPositionType() instanceof PositionType);
        Assert.assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals(job3.getName(),"Product tester");
        Assert.assertEquals(job3.getEmployer().getValue(),"ACME");
        Assert.assertEquals(job3.getLocation().getValue(),"Desert");
        Assert.assertEquals(job3.getPositionType().getValue(),"Quality control");
        Assert.assertEquals(job3.getCoreCompetency().getValue(),"Persistence");


    }
    @Test
    public void testJobsForEquality(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertNotEquals(job3.getId(), job4.getId());

    }


}
