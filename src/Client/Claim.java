package Client;

import java.util.Queue;
import java.util.UUID;

public class Claim {
    private UUID identifier;
    private String description;
    public Queue<Document> documents;

    // Constructor of the claim
    public Claim() {
    }

    // Sets the ClaimID
    public void setClaimID(UUID identifier) {
        this.identifier = identifier;
    }

    //Writes description of claim
    public void setClaimDescription(String description) {
        this.description = description;
    }

    //Associate document to a claim, checks if the claim exists, if the person signing is employee/client, receives the content of the document
    public void associateDocument(UUID uuid, String content, int signature) {
        if (!isClaimByUUID(uuid) and method_to_check_clientsignature_false and_method_to_check_employeesignature_false )
        {
            System.out.println("You can't add Documents to claims");
        }else{
            Document document = new Document(content);
            documents.add(document);
        }
    }

    //Checks if claim exists and prints out contents for each document associated with it
    public void listDocument(UUID uuid) {
        if (!isClaimByUUID(uuid)) {
            System.out.println("This claim doesn't exist");
        } else {
            System.out.println(documents.iterator().next().getContents() + "\n");
        }
    }


}