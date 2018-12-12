package preference;

import org.springframework.data.annotation.Id;

public class StorePreference {

    @Id
    private String id;

    private String storeId;
    private String notificationType;

    public StorePreference() {}

    public StorePreference(String storeId, String notificationType) {
        this.storeId = storeId;
        this.notificationType = notificationType;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, storeId='%s', notificationType='%s']",
                id, storeId, notificationType);
    }

}