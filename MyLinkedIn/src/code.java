import java.util.*;

abstract class Account {
    private String accountId;
    private String password;
    private String username;
    private String email;
    private AccountStatus status;

    public boolean resetPassword() {
        // implementation
        return false;
    }
}

class Achievement {
    private String title;
    private Date dateAwarded;
    private String description;
}

class Analytics {
    private int searchAppearances;
    private int profileViews;
    private int postImpressions;
    private int totalConnections;
}

interface Observer {
    void update(String message);
}

abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
    private Account account;

    // abstract methods
}

class Admin extends Person {
    public boolean blockUser(User user) {
        // implementation
        return false;
    }

    public boolean unblockUser(User user) {
        // implementation
        return false;
    }

    public boolean disablePage(CompanyPage page) {
        // implementation
        return false;
    }

    public boolean enablePage(CompanyPage page) {
        // implementation
        return false;
    }

    public boolean deleteGroup(Group group) {
        // implementation
        return false;
    }
}

class User extends Person implements Observer {
    private int userId;
    private Date dateOfJoining;
    private Profile profile;

    private List<User> followsUsers = new ArrayList<>(); // contain most recent 10 follows
    private List<CompanyPage> followCompanies = new ArrayList<>();
    private List<User> connections = new ArrayList<>();
    private List<Group> joinedGroups = new ArrayList<>();
    private List<CompanyPage> createdPages = new ArrayList<>();
    private List<Group> createdGroups = new ArrayList<>();

    public boolean sendMessage(Message message) {
        // implementation
        return false;
    }

    public boolean sendInvite(ConnectionInvitation invite) {
        // implementation
        return false;
    }

    public boolean cancelInvite(ConnectionInvitation invite) {
        // implementation
        return false;
    }

    public boolean createPage(CompanyPage page) {
        // implementation
        return false;
    }

    public boolean deletePage(CompanyPage page) {
        // implementation
        return false;
    }

    public boolean createGroup(Group group) {
        // implementation
        return false;
    }

    public boolean deleteGroup(Group group) {
        // implementation
        return false;
    }

    public boolean createPost(Post post) {
        // implementation
        return false;
    }

    public boolean deletePost(Post post) {
        // implementation
        return false;
    }

    public boolean createComment(Comment comment) {
        // implementation
        return false;
    }

    public boolean deleteComment(Comment comment) {
        // implementation
        return false;
    }

    public boolean react(Post post) {
        // implementation
        return false;
    }

    public boolean requestRecommendation(User user) {
        // implementation
        return false;
    }

    public boolean acceptRecommendation(User user) {
        // implementation
        return false;
    }

    public boolean applyForJob(Job job) {
        // implementation
        return false;
    }

    @Override
    public void update(String message) {
        // implementation to receive notifications
    }
}

class Job {
    private int jobId;
    private String jobTitle;
    private Date dateOfPosting;
    private String description;
    private CompanyPage company;
    private String employmentType;
    private Address location;
    private JobStatus status;
}

class CompanyPage {
    private int pageId;
    private String name;
    private String description;
    private String type;
    private int companySize;
    private User createdBy;
    private List<Job> jobs = new ArrayList<>();

    public boolean createJobPosting() {
        // implementation
        return false;
    }

    public boolean deleteJobPosting(Job job) {
        // implementation
        return false;
    }
}

class Group extends Subject {
    private int groupId;
    private String name;
    private String description;
    private int totalMembers;
    private List<Observer> members = new ArrayList<>();

    public boolean updateDescription() {
        // implementation
        return false;
    }

    @Override
    public void attach(Observer observer) {
        members.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        members.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : members) {
            observer.update("Hey new post in the group");
        }
    }
}

class Experience {
    private String title;
    private String company;
    private Address location;
    private Date startDate;
    private Date endDate;
    private String description;
}

class Education {
    private String school;
    private String degree;
    private Date startDate;
    private Date endDate;
    private String description;
}

class Skill {
    private String name;
}

class Profile {
    private String headline;
    private String about;
    private String gender;
    private List<Byte> profilePicture = new ArrayList<>();
    private List<Byte> coverPhoto = new ArrayList<>();

    private List<Experience> experiences = new ArrayList<>();
    private List<Education> educations = new ArrayList<>();
    private List<Skill> skills = new ArrayList<>();
    private List<Achievement> achievements = new ArrayList<>();
    private List<Recommendation> recommendations = new ArrayList<>();
    private Analytics analytics;

    public boolean addExperience(Experience experience) {
        // implementation
        return false;
    }

    public boolean addEducation(Education education) {
        // implementation
        return false;
    }

    public boolean addSkill(Skill skill) {
        // implementation
        return false;
    }

    public boolean addAchievement(Achievement achievement) {
        // implementation
        return false;
    }
}

class Recommendation {
    private int userId;
    private Date createdOn;
    private String description;
    private boolean isAccepted;
}

abstract class Search {
    public abstract List<User> searchUser(String name);
    public abstract List<CompanyPage> searchCompany(String name);
    public abstract List<Group> searchGroup(String name);
    public abstract List<Job> searchJob(String title);
}

class SearchCatalog extends Search {
    private Map<String, List<User>> users = new HashMap<>();
    private Map<String, List<CompanyPage>> companies = new HashMap<>();
    private Map<String, List<Job>> jobs = new HashMap<>();
    private Map<String, List<Group>> groups = new HashMap<>();

    public void addNewUser(User user) {
        // implementation
    }

    public void addNewCompany(CompanyPage company) {
        // implementation
    }

    public void addNewGroup(Group group) {
        // implementation
    }

    public void addNewJob(Job job) {
        // implementation
    }

    @Override
    public List<User> searchUser(String name) {
        // implementation
        return null;
    }

    @Override
    public List<CompanyPage> searchCompany(String name) {
        // implementation
        return null;
    }

    @Override
    public List<Group> searchGroup(String name) {
        // implementation
        return null;
    }

    @Override
    public List<Job> searchJob(String title) {
        // implementation
        return null;
    }
}

class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public boolean sendNotification(Account account) {
        // implementation
        return false;
    }
}

class Post {
    private int postId;
    private User postOwner;
    private String text;
    private List<Byte> media = new ArrayList<>();
    private int totalReacts;
    private int totalShares;
    private List<Comment> comments = new ArrayList<>();

    public boolean updateText() {
        // implementation
        return false;
    }
}

class Comment {
    private int commentId;
    private User commentOwner;
    private String text;
    private int totalReacts;
    private List<Comment> comments = new ArrayList<>();

    public boolean updateText() {
        // implementation
        return false;
    }
}

class Message {
    private int messageId;
    private User sender;
    private List<User> recipients = new ArrayList<>();
    private String text;
    private List<Byte> media = new ArrayList<>();

    public boolean addRecipients(List<User> recipients) {
        // implementation
        return false;
    }
}

class ConnectionInvitation {
    private User sender;
    private User recipients;
    private Date dateCreated;
    private ConnectionInviteStatus status;

    public boolean acceptConnection() {
        // implementation
        return false;
    }

    public boolean rejectConnection() {
        // implementation
        return false;
    }
}

abstract class Subject {
    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract void notifyObservers();
}

class Address {
    private int zipCode;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
}

enum AccountStatus {
    ACTIVE,
    DEACTIVATED,
    BLOCKED,
    DELETED
}

enum ConnectionInviteStatus {
    PENDING,
    ACCEPTED,
    IGNORED
}

enum JobStatus {
    OPEN,
    ON_HOLD,
    CLOSED
}
