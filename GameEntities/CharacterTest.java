package GameEntities;

public class CharacterTest {

    private Character testCharacter;


    private void setUp() {
        testCharacter = new Character("testCharacter1");
    }

    private void testGetName() {
        assert("testCharacter1".equals(testCharacter.getName()));

    }

}