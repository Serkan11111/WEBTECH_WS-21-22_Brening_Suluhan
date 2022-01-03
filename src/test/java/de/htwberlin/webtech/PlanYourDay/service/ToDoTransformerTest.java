package de.htwberlin.webtech.PlanYourDay.service;

import de.htwberlin.webtech.PlanYourDay.persistence.ToDoEntity;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.doReturn;

class ToDoTransformerTest implements WithAssertions {

    private final ToDoTransformer underTest = new ToDoTransformer();

    @Test
    @DisplayName("should transform ToDoEntity to ToDo")
    void should_transform_person_entity_to_todo() {
        // given
        var ToDoEntity = Mockito.mock(ToDoEntity.class);
        doReturn(111L).when(ToDoEntity).getId();
        doReturn("Projekt").when(ToDoEntity).getTitel();
        doReturn("fertigstellen").when(ToDoEntity).getDescription();
        doReturn("Webtech").when(ToDoEntity).getModule();
        doReturn("2020-1-9").when(ToDoEntity).getDate();
        doReturn(false).when(ToDoEntity).getDone();
        doReturn(false).when(ToDoEntity).getFavorite();

        // when
        var result = underTest.transformEntity(ToDoEntity);

        // then
        assertThat(result.getId()).isEqualTo(111);
        assertThat(result.getTitel()).isEqualTo("Projekt");
        assertThat(result.getDescription()).isEqualTo("fertigstellen");
        assertThat(result.getModule()).isEqualTo("Webtech");
        assertThat(result.getDate()).isEqualTo("2020-1-9");
        assertThat(result.isDone()).isEqualTo(false);
        assertThat(result.isFavorite()).isEqualTo(false);
    }
}