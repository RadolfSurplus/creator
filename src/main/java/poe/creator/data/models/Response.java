package poe.creator.data.models;

public class Response<T> {

    private String status;
    private T entity;

    public Response() {
    }

    public Response(String status, T entity) {
        this.status = status;
        this.entity = entity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
