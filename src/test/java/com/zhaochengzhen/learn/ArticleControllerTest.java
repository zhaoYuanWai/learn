package com.zhaochengzhen.learn;

import com.zhaochengzhen.learn.controller.ArticleController;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

//@Slf4j
public class ArticleControllerTest {

    private static MockMvc mockMvc;

    //  @BeforeAll
    static void setUp() {
        Object[] controllers;
        mockMvc = MockMvcBuilders.standaloneSetup(new ArticleController()).build();
    }

    //测试方法
    // @Test
    public void saveArticle() throws Exception {

        String article = "{\n" +
                "    \"id\": 1,\n" +
                "    \"author\": \"zimug\",\n" +
                "    \"title\": \"手摸手教你开发spring boot\",\n" +
                "    \"content\": \"c\",\n" +
                "    \"createTime\": \"2017-07-16 05:23:34\",\n" +
                "    \"reader\":[{\"name\":\"zimug\",\"age\":18},{\"name\":\"kobe\",\"age\":37}]\n" +
                "}";
        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders
                        .request(HttpMethod.POST, "/rest/articles")
                        .contentType("application/json")
                        .content(article)
        )
                .andExpect(MockMvcResultMatchers.status().isOk())  //HTTP:status 200
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.author").value("zimug"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.reader[0].age").value(18))
                //.andDo(print())
                .andReturn();
        result.getResponse().setCharacterEncoding("UTF-8");
     //   log.info(result.getResponse().getContentAsString());
    }
}
