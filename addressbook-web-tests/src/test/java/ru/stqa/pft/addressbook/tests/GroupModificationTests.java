package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

/**
 * Created by irina on 3/12/2016.
 */
public class GroupModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().groupPage();
        if (app.getGroupHelper().list().size()== 0) {
            app.getGroupHelper().create(new GroupData().withName("test1"));
        }
    }

        @Test
        public void testGroupModification () {


            List<GroupData> before = app.getGroupHelper().list();
            //int before = app.getGroupHelper().getGroupCount();
            int index = before.size() - 1;
            GroupData group = new GroupData().withId(before.get(index).getId()).withName("test1").withHeader("test2").withFooter("test3");
            app.getGroupHelper().modify(index, group);
            List<GroupData> after = app.getGroupHelper().list();
            //int after = app.getGroupHelper().getGroupCount();
            Assert.assertEquals(after.size(), before.size());

            before.remove(index);
            before.add(group);
            Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
            before.sort(byId);
            after.sort(byId);
            Assert.assertEquals(before, after);
        }

    }

