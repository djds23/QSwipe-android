package me.silfen.deansilfen.qswipe;

/**
 * Created by deansilfen on 12/10/15.
 */
public class Category {
    private String id;

    private String cluesCount;

    private String title;

    private String updatedAt;

    private String createdAt;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getClues_count () {
        return cluesCount;
    }

    public void setClues_count (String cluesCount) {
        this.cluesCount = cluesCount;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getUpdatedAt () {
        return updatedAt;
    }

    public void setUpdated_at (String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt (String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = "+id+", clues_count = "+cluesCount+", title = "+title+", updated_at = "+updatedAt+", created_at = "+createdAt+"]";
    }
}