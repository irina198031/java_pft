package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;
import java.util.Set;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.goTo().groupPage();


        Set<GroupData> before = app.getGroupHelper().all();
        //int before = app.getGroupHelper().getGroupCount();
        GroupData group = new GroupData().withName("test1");
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        Set<GroupData> after = app.getGroupHelper().all();
        //int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after.size(), before.size() + 1);


        /*int max = 0;
        for(GroupData g:after){
            if(g.getId()>max){
                max=g.getId();
            }
        }*/

        //Comparator<? super GroupData> byId = (o1, o2) -> Integer.compare(o1.getId(), o2.getId());
        
        //group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        group.withId(after.stream().mapToInt((g)-> g.getId()).max().getAsInt());
        before.add(group);
        /*Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);*/
        Assert.assertEquals(before,after);

    }

}
