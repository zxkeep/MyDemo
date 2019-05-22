import com.zhengxu.service.impl.QueueSender;
import com.zhengxu.service.impl.TopicSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProducerTest extends BaseTest{
    @Autowired
    private QueueSender queueSender;

    @Autowired
    private TopicSender topicSender;

    @Test
    public void testSendMessage() {
        queueSender.send("spring_queue", "see you next time......");
        topicSender.send("spring_topic", "nice to meet you.....");
    }
}