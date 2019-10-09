package slate.users;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "slate-users")
public class ApplicationUser {

    //Variables
    private  String id;
    private String alias;
    private String languagePref;
    private String name;


    public ApplicationUser(String alias, String languagePref, String name) {
        this.alias = alias;
        this.languagePref = languagePref;
        this.name = name;
    }

    public ApplicationUser() {
    }



    /**
     * Getters
     */
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }


    @DynamoDBHashKey
    public String getAlias() {
        return alias;
    }

    @DynamoDBAttribute
    public String getLanguagePref() {
        return languagePref;
    }

    @DynamoDBAttribute
    public String getName() {
        return name;
    }


    /**
     * ALl Setters
     * @param
     */

    public void setId(String id) {
        this.id = id;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setLanguagePref(String languagePref) {
        this.languagePref = languagePref;
    }

    public void setName(String name) {
        this.name = name;
    }
}