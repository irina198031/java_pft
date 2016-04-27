package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();
        if (app.getGroupHelper().list().size()== 0)  {
            app.getGroupHelper().create(new GroupData().withName("test1"));
        }
    }

    @Test
    public void testGroupDeletion() {


        List<GroupData> before = app.getGroupHelper().list();
        //int before = app.getGroupHelper().getGroupCount();
        int index = before.size() - 1;
        app.getGroupHelper().selectGroup(index);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().list();
        //int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(index);
        /*for (int i = 0; i < after.size(); i++) {
            Assert.assertEquals(before.get(i), after.get(i));*/
            Assert.assertEquals(before, after);

    }

}
