package poe.creator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CreatorTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnCurrentItem() throws Exception {
        //TODO Test user current item getting functional
        mockMvc.perform(get("/create/current"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.entity.prefix").exists());
    }

    @Test
    public void selectItemBase() throws Exception {
        //TODO Test user select item base functional
    }

    @Test
    public void selectItemType() throws Exception {
        //TODO Test user select item type functional
    }

    @Test
    public void addSuffixToItem() throws Exception {
        //TODO Test suffix adding to user current item
    }

    @Test
    public void addPrefixToItem() throws Exception {
        //TODO Test prefix adding to user current item
    }
}
