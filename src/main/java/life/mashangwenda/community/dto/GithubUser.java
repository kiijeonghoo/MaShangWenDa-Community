package life.mashangwenda.community.dto;

/**
 * @author Bukki
 * description:
 * date: 2020/8/9 19:16
 */
public class GithubUser {
    private String name;
    private String bio;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
