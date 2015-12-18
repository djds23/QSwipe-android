package me.silfen.deansilfen.qswipe;

/**
 * Created by deansilfen on 12/10/15.
 */

public class Clue {
    private String id;

    private Category category;

    private String updated_at;

    private Integer invalid_count;

    private Integer gameId;

    private String value;

    private String answer;

    private String categoryId;

    private String createdAt;

    private String question;

    private String airdate;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public Category getCategory () {
        return category;
    }

    public void setCategory (Category category) {
        this.category = category;
    }

    public String getUpdated_at () {
        return updated_at;
    }

    public void setUpdated_at (String updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getInvalid_count () {
        return invalid_count;
    }

    public void setInvalid_count (Integer invalid_count) {
        this.invalid_count = invalid_count;
    }

    public Integer getGameId () {
        return gameId;
    }

    public void setGameId (Integer gameId) {
        this.gameId = gameId;
    }

    public String getValue () {
        return value;
    }

    public void setValue (String value) {
        this.value = value;
    }

    public String getAnswer () {
        return answer;
    }

    public void setAnswer (String answer) {
        this.answer = answer;
    }

    public String getCategoryId ()
    {
        return categoryId;
    }

    public void setCategoryId (String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCreatedAt () {
        return createdAt;
    }

    public void setCreated_at (String createdAt) {
        this.createdAt = createdAt;
    }

    public String getQuestion () {
        return question;
    }

    public void setQuestion (String question) {
        this.question = question;
    }

    public String getAirdate () {
        return airdate;
    }

    public void setAirdate (String airdate) {
        this.airdate = airdate;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = "+id+", category = "+category+", updated_at = "+updated_at+", invalid_count = "+invalid_count+", game_id = "+gameId+", value = "+value+", answer = "+answer+", category_id = "+categoryId+", created_at = "+createdAt+", question = "+question+", airdate = "+airdate+"]";
    }
}
