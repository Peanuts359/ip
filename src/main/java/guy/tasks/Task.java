package guy.tasks;
public abstract class Task {
    protected String name;
    protected boolean isDone;

    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    public void mark() {
        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }

    public String getStatus() {
        return (isDone ? "X" : " ");
    }
    public boolean isComplete() {
        return this.isDone;
    }

    @Override
    public String toString() {
        return ('[' + getStatus() + ']' + ' ' + name);
    }

    public String saveFormat() {
        return (" | " + (this.isDone ? 1 : 0) + " | " + this.name);
    }
}
