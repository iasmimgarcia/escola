package br.edu.ifmg.escola.constants;

public enum ResourceType {
    LESSON_ONLY("lição"),
    LESSON_TASKS("tarefa"),
    FORUM("Forum"),
    EXTERNAL_LINK("Link externo");

    private String description;

    private ResourceType(String description) {
        this.description = description;
    }
}
