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

        Assert.assertNotEquals(job3, job4);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        String newLine = System.lineSeparator();
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(job5.toString().startsWith(newLine));
        Assert.assertTrue(job5.toString().endsWith(newLine));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        String newLine = System.lineSeparator();
       //
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = newLine +
                "Id: "+job5.getId() + newLine +
                "Name: Product tester"+newLine +
                "Employer: ACME" + newLine +
                "Location: Desert" + newLine +
                "Position Type: Quality control"+newLine +
                "Core Competency: Persistence" + newLine;
        String actual = job5.toString();
        String message =" Testing the String method";
        Assert.assertEquals(message,expected,actual);

    }

    @Test
    public void testToStringHandlesEmptyField(){
        String newLine = System.lineSeparator();
        Job job5 = new Job(null, new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = newLine +
                "Id: "+job5.getId() + newLine +
                "Name: Data not available"+newLine +
                "Employer: ACME" + newLine +
                "Location: Data not available" + newLine +
                "Position Type: Quality control"+newLine +
                "Core Competency: Persistence" + newLine;
        String actual = job5.toString();
        String message =" Testing the String method";
        Assert.assertEquals(message,expected,actual);

    }

}
