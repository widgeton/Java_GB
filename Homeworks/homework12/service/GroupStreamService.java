package service;

import data.GroupStream;
import data.GroupStreamComparator;

import java.util.List;

public class GroupStreamService {
    public void sortGroupStreams(List<GroupStream> groupStreams){
        groupStreams.sort(new GroupStreamComparator());
    }
}
