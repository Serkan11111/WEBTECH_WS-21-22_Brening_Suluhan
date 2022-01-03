package de.htwberlin.webtech.PlanYourDay.web;

import de.htwberlin.webtech.PlanYourDay.service.ToDoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ToDoRestController.class)
class ToDoRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ToDoService toDoService;

    @Test
    @DisplayName("should return 404 if todo is not found")
    void should_return_404_if_todo_is_not_found() throws Exception {
        // given
        doReturn(null).when(toDoService).findById(anyLong());

        // when
        mockMvc.perform(get("/api/v1/todos/123"))
                // then
                .andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("should validate create todo request")
    void should_validate_create_todo_request() throws Exception {
        // given
        String toDoToCreateAsJson = "{\"titel\":, \"description\":, \"module\":, \"date\":,\"done\":, \"favorite\":}";

        // when
        mockMvc.perform(
                        post("/api/v1/todos")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(toDoToCreateAsJson)
                )
                // then
                .andExpect(status().isBadRequest());
    }
}
