package Client;

import java.util.HashMap;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class ClaimsDataStore {
    public HashMap<UUID, Claim> Datastore = new HashMap<UUID, Claim>();


    //Constructor
    public ClaimsDataStore(HashMap datastore) {
        Datastore = datastore;
    }

    //Method creates a new Claim and adds Claim to the datastore
    public void addClaim(String description, int signature) {
        if (method_to_check_clientsignature_false) {
            System.out.println("You are not our client");
        } else {
            Claim claim = new Claim();
            UUID uuid = uuidGen();
            claim.setClaimID(uuid);
            claim.setClaimDescription(description);
            Datastore.put(uuid, claim);
        }
    }

    //UUID
    public UUID uuidGen() {
        return randomUUID();
    }

    //checks if a claim is in the DataStore
    public boolean isClaimByUUID(UUID uid) {
        return Datastore.containsKey(uuid);
    }

}
