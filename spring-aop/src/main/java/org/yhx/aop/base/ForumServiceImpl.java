package org.yhx.aop.base;

public class ForumServiceImpl implements ForumService {
    @Override
    public void removeTopic(int topicId) {
        System.out.println("模拟删除topicId:"+topicId);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeForum(int forumId) {
        System.out.println("模拟删除forumId:"+forumId);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
