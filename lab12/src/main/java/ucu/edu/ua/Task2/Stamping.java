package ucu.edu.ua.Task2;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Stamping {
    public static <T> void stamp(Group<T> group) {
        Queue<Group<T>> queue = new LinkedBlockingQueue<>();
        queue.add(group);

        while (!queue.isEmpty()) {
            Group<T> currentGroup = queue.poll();
            for (Task<T> task : currentGroup.getTasks()) {
                if (task instanceof Signature) {
                    Signature<T> signature = (Signature<T>) task;
                    signature.setHeader("groupId", currentGroup.getGroupUuid());
                } else if (task instanceof Group) {
                    queue.add((Group<T>) task);
                }
            }
        }
    }
}
