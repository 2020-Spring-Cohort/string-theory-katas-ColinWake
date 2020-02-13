package translating_names;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameChangerTest {


  private NameChanger underTest;
  private String result;

  @BeforeEach
  void setUp() {

    underTest = new NameChanger();
  }

  @Test
  public void translateToSnakeCase_GivenHelloWorld_Returns_hello_world() {
    result = underTest.translateToSnakeCase("HelloWorld");
    assertThat(result).isEqualTo("hello_world");
  }

  @Test
  public void translateToSnakeCaseGiven_hello_world_Returns_hello_world() {
    result = underTest.translateToSnakeCase("hello_world");
    assertThat(result).isEqualTo("hello_world");
  }

  @Test
  public void translateToSnakeCaseGiven_WorldHello_Returns_world_hello() {
    result = underTest.translateToSnakeCase("WorldHello");
    assertThat(result).isEqualTo("world_hello");
  }

  @Test
  public void translateToSnakeCaseGiven_worldHello_Returns_world_hello() {
    result = underTest.translateToSnakeCase("worldHello");
    assertThat(result).isEqualTo("world_hello");
  }

  @Test
  public void translateToSnakeCaseGiven_hiThere_Returns_hi_there() {
    result = underTest.translateToSnakeCase("hiThere");
    assertThat(result).isEqualTo("hi_there");
  }

  @Test
  public void translateToSnakeCaseGiven_HiThere_Returns_hi_there() {
    result = underTest.translateToSnakeCase("HiThere");
    assertThat(result).isEqualTo("hi_there");
  }

  @Test
  public void translateToSnakeCaseGiven_thisCoolString_Returns_this_cool_string() {
    result = underTest.translateToSnakeCase("thisCoolString");
    assertThat(result).isEqualTo("this_cool_string");
  }

  @Test
  public void translateToSnakeCaseGiven_123HelloThere_Returns_123_hello_there() {
    result = underTest.translateToSnakeCase("123HelloThere");
    assertThat(result).isEqualTo("123_hello_there");
  }
}
