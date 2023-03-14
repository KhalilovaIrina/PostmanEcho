import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostData {
@Test
    void shouldReturnSameBody() {
    given()
            .baseUri("https://postman-echo.com")
            .body("14.03.2023") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
            .when()
            .post("/post")
// Проверки
            .then()
            .statusCode(200)
            .body("data", equalTo("14.03.2023"))
    ;
}
}
