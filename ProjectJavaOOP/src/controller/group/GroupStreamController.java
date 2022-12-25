package controller.group;

import data.group.GroupStream;
import service.group.GroupStreamService;

public class GroupStreamController implements GroupController<GroupStream> {
    private final GroupStreamService groupStreamService;

    public GroupStreamController(GroupStreamService groupStreamService) {
        this.groupStreamService = groupStreamService;
    }

    @Override
    public void sort(GroupStream group) {
        groupStreamService.sort(group);
    }

    @Override
    public GroupStream findById(int id) {
        return (GroupStream) groupStreamService.findById(id);
    }

    @Override
    public void save(GroupStream group) {
        groupStreamService.sort(group);
    }
}
