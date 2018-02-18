package batch;

import org.springframework.batch.item.ItemProcessor;

public class MessagesItemProcessor implements ItemProcessor<User, String> {

    public String process(User user) throws Exception {
        Message m = new Message();
        m.setContent("Hello " + user.getName()
                + ",please pay promptly at the end of this month.");
        System.out.println("Processor: "+m.getContent());
        return m.getContent();
    }

}