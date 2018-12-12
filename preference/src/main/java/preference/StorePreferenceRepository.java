package preference;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "storePreferences", path = "storePreferences")
public interface StorePreferenceRepository extends MongoRepository<StorePreference, String> {

    public StorePreference findByStoreId(@Param("storeId") String storeId);

}