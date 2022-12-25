package service.group;

import data.group.Group;
import data.group.GroupStream;
import data.comparator.GroupStreamComparator;
import data.group.StudentGroup;
import data.user.Student;
import data.user.Teacher;
import data.user.User;
import util.ReaderFromTxt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStreamService implements DataGroupService{

    public GroupStream readAllGroups(String path){
        return null;
    }

    @Override
    public void sort(Group groupStreams){
        ((GroupStream)(groupStreams)).getGroups().sort(new GroupStreamComparator());
    }
}
