package api.utils;

import com.github.javafaker.Faker;
import io.cucumber.core.backend.StepDefinition;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class ApiPayload {
    private static final Faker faker = new Faker(new Locale("en-US"));
    public static String name;
    public static String accountCorporateCode ;
    public static String contractCode ;
    public static String contractName ;
    public static String refName ;
    public static String companyName ;
    public static String vatNumber ;
    public static String fiscalCode ;
    public static String email;
    public static String phone;
    public static String mobile ;
    public static String referencePerson ;

    public String UserCred() {
       String payload = "{\"username\":\"platformops@lifedata.ai\",\"password\":\"Lifedata@124\"}";
        return payload;
    }
    public String createAccountPayload()
    {
        accountCorporateCode = "QA" +faker.code().asin();
        companyName = "QA" +faker.company().name();
        vatNumber = "QA" +faker.number().digits(5);
        fiscalCode = "QA" +faker.code().ean8();
        email = faker.internet().emailAddress();
        phone = faker.phoneNumber().phoneNumber();
        mobile =faker.phoneNumber().cellPhone();
        referencePerson = faker.name().fullName();
        String payload = "{\n" +
                "  \"account_corporate_code\": \""+accountCorporateCode+"\",\n" +
                "  \"company_name\": \""+companyName+"\",\n" +
                "  \"vat_number\": \""+vatNumber+"\",\n" +
                "  \"fiscal_code\": \""+fiscalCode+"\",\n" +
                "  \"is_supplier\": false,\n" +
                "  \"is_customer\": true,\n" +
                "  \"is_credit_blocked\": true,\n" +
                "  \"is_administrative_blocked\": false,\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"address\": {\n" +
                "        \"country\": \"ITA\",\n" +
                "        \"administrative_level_3\": null,\n" +
                "        \"administrative_level_2\": \"Lombardia\",\n" +
                "        \"administrative_level_1\": \"Nord\",\n" +
                "        \"city\": \"Milano\",\n" +
                "        \"postal_code\": \"20121\",\n" +
                "        \"street\": \"Piazza del Duomo\",\n" +
                "        \"hamlet\": \"null\",\n" +
                "        \"building_nr\": null,\n" +
                "        \"company_name\": \"QA COMPANY\",\n" +
                "        \"reference_person\": \""+referencePerson+"\",\n" +
                "        \"phone\":\" "+phone+"\",\n" +
                "        \"mobile\": \" "+mobile+"\",\n" +
                "        \"email\": \""+email+"\"\n" +
                "      },\n" +
                "      \"type\": \"REGISTERED_OFFICE\",\n" +
                "      \"default\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}" ;
       return payload;
    }
    public String createAccountPayloadWithoutAccountCorporateCode()
    {
        accountCorporateCode = "";
        companyName = "QA" +faker.company().name();
        vatNumber = "QA" +faker.number().digits(5);
        fiscalCode = "QA" +faker.code().ean8();
        email = faker.internet().emailAddress();
        phone = faker.phoneNumber().phoneNumber();
        mobile =faker.phoneNumber().cellPhone();
        referencePerson = faker.name().fullName();
        String payload = "{\n" +
                "  \"account_corporate_code\": \""+accountCorporateCode+"\",\n" +
                "  \"company_name\": \""+companyName+"\",\n" +
                "  \"vat_number\": \""+vatNumber+"\",\n" +
                "  \"fiscal_code\": \""+fiscalCode+"\",\n" +
                "  \"isSupplier\": false,\n" +
                "  \"isCustomer\": true,\n" +
                "  \"isCreditBlocked\": true,\n" +
                "  \"isAdministrativeBlocked\": false,\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"address\": {\n" +
                "        \"country\": \"ITA\",\n" +
                "        \"administrative_level_3\": \"MI\",\n" +
                "        \"administrative_level_2\": \"Lombardia\",\n" +
                "        \"administrative_level_1\": \"Nord\",\n" +
                "        \"city\": \"Milano\",\n" +
                "        \"postalCode\": \"20121\",\n" +
                "        \"street\": \"Piazza del Duomo\",\n" +
                "        \"hamlet\": \"null\",\n" +
                "        \"buildingNr\": \"1\",\n" +
                "        \"companyName\": \"QA COMPANY\",\n" +
                "        \"referencePerson\": \""+referencePerson+"\",\n" +
                "        \"phone\":\" "+phone+"\",\n" +
                "        \"mobile\": \" "+mobile+"\",\n" +
                "        \"email\": \""+email+"\"\n" +
                "      },\n" +
                "      \"type\": \"REGISTERED_OFFICE\",\n" +
                "      \"default\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}" ;
        return payload;
    }
    public String createAccountPayloadWithoutCompanyName()
    {
        accountCorporateCode = "QA" +faker.code().asin();
        companyName = "";
        vatNumber = "QA" +faker.number().digits(5);
        fiscalCode = "QA" +faker.code().ean8();
        email = faker.internet().emailAddress();
        phone = faker.phoneNumber().phoneNumber();
        mobile =faker.phoneNumber().cellPhone();
        referencePerson = faker.name().fullName();
        String payload ="{\n" +
                "  \"account_corporate_code\": \""+accountCorporateCode+"\",\n" +
                "  \"company_name\": \""+companyName+"\",\n" +
                "  \"vat_number\": \""+vatNumber+"\",\n" +
                "  \"fiscal_code\": \""+fiscalCode+"\",\n" +
                "  \"isSupplier\": false,\n" +
                "  \"isCustomer\": true,\n" +
                "  \"isCreditBlocked\": true,\n" +
                "  \"isAdministrativeBlocked\": false,\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"address\": {\n" +
                "        \"country\": \"ITA\",\n" +
                "        \"administrative_level_3\": \"MI\",\n" +
                "        \"administrative_level_2\": \"Lombardia\",\n" +
                "        \"administrative_level_1\": \"Nord\",\n" +
                "        \"city\": \"Milano\",\n" +
                "        \"postalCode\": \"20121\",\n" +
                "        \"street\": \"Piazza del Duomo\",\n" +
                "        \"hamlet\": \"null\",\n" +
                "        \"buildingNr\": \"1\",\n" +
                "        \"companyName\": \"QA COMPANY\",\n" +
                "        \"referencePerson\": \""+referencePerson+"\",\n" +
                "        \"phone\":\" "+phone+"\",\n" +
                "        \"mobile\": \" "+mobile+"\",\n" +
                "        \"email\": \""+email+"\"\n" +
                "      },\n" +
                "      \"type\": \"REGISTERED_OFFICE\",\n" +
                "      \"default\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}" ;
        return payload;
    }

    public String createAccountPayloadWithoutFiscalCode()
    {
        accountCorporateCode = "QA" +faker.code().asin();
        companyName = "QA" +faker.company().name();
        vatNumber = "QA" +faker.number().digits(5);
        fiscalCode = "" ;
        email = faker.internet().emailAddress();
        phone = faker.phoneNumber().phoneNumber();
        mobile =faker.phoneNumber().cellPhone();
        referencePerson = faker.name().fullName();
        String payload = "{\n" +
                "  \"account_corporate_code\": \""+accountCorporateCode+"\",\n" +
                "  \"company_name\": \""+companyName+"\",\n" +
                "  \"vat_number\": \""+vatNumber+"\",\n" +
                "  \"fiscal_code\": \""+fiscalCode+"\",\n" +
                "  \"isSupplier\": false,\n" +
                "  \"isCustomer\": true,\n" +
                "  \"isCreditBlocked\": true,\n" +
                "  \"isAdministrativeBlocked\": false,\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"address\": {\n" +
                "        \"country\": \"ITA\",\n" +
                "        \"administrative_level_3\": \"MI\",\n" +
                "        \"administrative_level_2\": \"Lombardia\",\n" +
                "        \"administrative_level_1\": \"Nord\",\n" +
                "        \"city\": \"Milano\",\n" +
                "        \"postalCode\": \"20121\",\n" +
                "        \"street\": \"Piazza del Duomo\",\n" +
                "        \"hamlet\": \"null\",\n" +
                "        \"buildingNr\": \"1\",\n" +
                "        \"companyName\": \"QA COMPANY\",\n" +
                "        \"referencePerson\": \""+referencePerson+"\",\n" +
                "        \"phone\":\" "+phone+"\",\n" +
                "        \"mobile\": \" "+mobile+"\",\n" +
                "        \"email\": \""+email+"\"\n" +
                "      },\n" +
                "      \"type\": \"REGISTERED_OFFICE\",\n" +
                "      \"default\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}" ;
        return payload;
    }
    public String createAccountPayloadWithoutVatNumber()
    {
        accountCorporateCode = "QA" +faker.code().asin();
        companyName = "QA" +faker.company().name();
        vatNumber = "";
        fiscalCode = "QA" +faker.code().ean8();
        email = faker.internet().emailAddress();
        phone = faker.phoneNumber().phoneNumber();
        mobile =faker.phoneNumber().cellPhone();
        referencePerson = faker.name().fullName();
        String payload = "{\n" +
                "  \"account_corporate_code\": \""+accountCorporateCode+"\",\n" +
                "  \"company_name\": \""+companyName+"\",\n" +
                "  \"vat_number\": \""+vatNumber+"\",\n" +
                "  \"fiscal_code\": \""+fiscalCode+"\",\n" +
                "  \"isSupplier\": false,\n" +
                "  \"isCustomer\": true,\n" +
                "  \"isCreditBlocked\": true,\n" +
                "  \"isAdministrativeBlocked\": false,\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"address\": {\n" +
                "        \"country\": \"ITA\",\n" +
                "        \"administrative_level_3\": \"MI\",\n" +
                "        \"administrative_level_2\": \"Lombardia\",\n" +
                "        \"administrative_level_1\": \"Nord\",\n" +
                "        \"city\": \"Milano\",\n" +
                "        \"postalCode\": \"20121\",\n" +
                "        \"street\": \"Piazza del Duomo\",\n" +
                "        \"hamlet\": \"null\",\n" +
                "        \"buildingNr\": \"1\",\n" +
                "        \"companyName\": \"QA COMPANY\",\n" +
                "        \"referencePerson\": \""+referencePerson+"\",\n" +
                "        \"phone\":\" "+phone+"\",\n" +
                "        \"mobile\": \" "+mobile+"\",\n" +
                "        \"email\": \""+email+"\"\n" +
                "      },\n" +
                "      \"type\": \"REGISTERED_OFFICE\",\n" +
                "      \"default\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}" ;
        return payload;
    }
    public String createUpdatedAccountPayload()
    {
        accountCorporateCode = "QA" +faker.code().asin();
        companyName = "QA" +faker.company().name();
        vatNumber = "QA" +faker.number().digits(5);
        fiscalCode = "QA" +faker.code().ean8();
        email = faker.internet().emailAddress();
        phone = faker.phoneNumber().phoneNumber();
        mobile =faker.phoneNumber().cellPhone();
        referencePerson = faker.name().fullName();
        String payload = "{\n" +
                "  \"account_corporate_code\": \""+accountCorporateCode+"\",\n" +
                "  \"company_name\": \""+companyName+"\",\n" +
                "  \"vat_number\": \""+vatNumber+"\",\n" +
                "  \"fiscal_code\": \""+fiscalCode+"\",\n" +
                "  \"is_supplier\": false,\n" +
                "  \"is_customer\": true,\n" +
                "  \"is_credit_blocked\": true,\n" +
                "  \"is_administrative_blocked\": false,\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"address\": {\n" +
                "        \"country\": \"ITA\",\n" +
                "        \"administrative_level_3\": \"MI\",\n" +
                "        \"administrative_level_2\": \"Lombardia\",\n" +
                "        \"administrative_level_1\": \"Nord\",\n" +
                "        \"city\": \"Milano\",\n" +
                "        \"postal_code\": \"20121\",\n" +
                "        \"street\": \"Piazza del Duomo\",\n" +
                "        \"hamlet\": \"null\",\n" +
                "        \"building_nr\": \"1\",\n" +
                "        \"company_name\": \"QA COMPANY\",\n" +
                "        \"reference_person\": \""+referencePerson+"\",\n" +
                "        \"phone\":\" "+phone+"\",\n" +
                "        \"mobile\": \" "+mobile+"\",\n" +
                "        \"email\": \""+email+"\"\n" +
                "      },\n" +
                "      \"type\": \"REGISTERED_OFFICE\",\n" +
                "      \"default\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}" ;
        return payload;
    }
    public String createAccountPayload( String vatNumber)
    {
        accountCorporateCode = "QA" +faker.code().asin();
        companyName = "QA" +faker.company().name();
        fiscalCode = "QA" +faker.code().ean8();
        email = faker.internet().emailAddress();
        phone = faker.phoneNumber().phoneNumber();
        mobile =faker.phoneNumber().cellPhone();
        referencePerson = faker.name().fullName();
        String payload = "{\n" +
                "  \"account_corporate_code\": \""+accountCorporateCode+"\",\n" +
                "  \"company_name\": \""+companyName+"\",\n" +
                "  \"vat_number\": \""+vatNumber+"\",\n" +
                "  \"fiscal_code\": \""+fiscalCode+"\",\n" +
                "  \"is_supplier\": false,\n" +
                "  \"is_customer\": true,\n" +
                "  \"is_credit_blocked\": true,\n" +
                "  \"is_administrative_blocked\": false,\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"address\": {\n" +
                "        \"country\": \"ITA\",\n" +
                "        \"administrative_level_3\": \"MI\",\n" +
                "        \"administrative_level_2\": \"Lombardia\",\n" +
                "        \"administrative_level_1\": \"Nord\",\n" +
                "        \"city\": \"Milano\",\n" +
                "        \"postal_code\": \"20121\",\n" +
                "        \"street\": \"Piazza del Duomo\",\n" +
                "        \"hamlet\": \"null\",\n" +
                "        \"building_nr\": \"1\",\n" +
                "        \"company_name\": \"QA COMPANY\",\n" +
                "        \"reference_person\": \""+referencePerson+"\",\n" +
                "        \"phone\":\" "+phone+"\",\n" +
                "        \"mobile\": \" "+mobile+"\",\n" +
                "        \"email\": \""+email+"\"\n" +
                "      },\n" +
                "      \"type\": \"REGISTERED_OFFICE\",\n" +
                "      \"default\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}" ;
        return payload;
    }

    public  String createContractPayload(int AccountID) {

        contractCode = "QA" +faker.code().asin();
        contractName = "QA" +faker.company().name();
        phone = faker.phoneNumber().cellPhone();
        email =faker.internet().emailAddress();
        referencePerson = "QA " +faker.name().fullName();

        String payload = "{\n" +
                "  \"code\": \"QAB000FQ9CT_test\",\n" +
                "  \"name\": \"QAXS-test2\",\n" +
                "  \"account_id\": "+AccountID+",\n" +
                "  \"company_id\": 3,\n" +
                "  \"valid_from\": \"2024-01-20\",\n" +
                "  \"valid_until\": \"\",\n" +
                "  \"addresses\": [\n" +
                "    {\n" +
                "      \"address\": {\n" +
                "        \"country\": \"ITA\",\n" +
                "        \"administrative_level_3\": \"Firenze\",\n" +
                "        \"administrative_level_2\": \"Città Metropolitana di Firenze\",\n" +
                "        \"administrative_level_1\": \"Toscana\",\n" +
                "        \"city\": \"Firenze\",\n" +
                "        \"postal_code\": \"50123\",\n" +
                "        \"hamlet\": \"\",\n" +
                "        \"street\": \"Piazza di San Lorenzo\",\n" +
                "        \"building_nr\": \"2r\",\n" +
                "        \"company_name\": \"Jimmy's Leather Collection\",\n" +
                "        \"reference_person\": \"DEVQA Test\",\n" +
                "        \"phone\": \""+phone+"\",\n" +
                "        \"mobile\": \""+phone+"\",\n" +
                "        \"email\": \""+email+"\"\n" +
                "      },\n" +
                "      \"type\": \"REGISTERED_OFFICE\",\n" +
                "      \"default\": true\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        return payload;
    }

    public String createAccountBlockPayloadWithTrue(String s){
        Boolean value =Boolean.parseBoolean(s);
        String payload ="{\n" +
                "  \"administrative_block\": "+value+",\n" +
                "  \"credit_block\": "+value+"\n" +
                "}";

        return payload;
    }

    public String createAccountBlockPayloadWithFalse(){
        String payload ="{\n" +
                "  \"administrative_block\": false,\n" +
                "  \"credit_block\": false\n" +
                "}";

        return payload;
    }
}
