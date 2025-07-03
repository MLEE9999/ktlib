package ktlib.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookSubscriptionCreatedEvent {
    private String subscriptionId;
    private String userId;
}
