
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestTrials1 {

    @BeforeClass
    public static void init(){
        RestAssured.baseURI="http://ergast.com/api/f1/2017/circuits.json";
    }

    @Test
    public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {

        System.out.println("Testing URL Content : "+ get().getBody().asString());

        given().
                when().
                get().
                then().
                assertThat().
                body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
    }






}
