package com.epam;

/**
 * Created by Ivan on 5/3/2017.
 */
public class gitoverview {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "gitoverview{" +
                "id=" + id +
                '}';
    }

    public boolean isNew(){
        return (this.id == null);
    }
}
