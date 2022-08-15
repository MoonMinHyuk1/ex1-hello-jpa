package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@SequenceGenerator(
//        name="member_seq_generator",
//        sequenceName = "member_seq", //매핑할 데이터베이스 시퀀스 이름
//        initialValue = 1, allocationSize = 50
//)
@Entity
public class Member {
    //다양한 연관관계 매핑
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "USERNAME")
    private String username;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID", insertable = false, updatable = false)
    private Team team;

    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    private Locker locker;

//    @ManyToMany
//    @JoinTable(name = "MEMBER_PRODUCT")
//    private List<Product> products = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberProduct> memberProducts = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    //연관관계 매핑 기초
//    @Id @GeneratedValue
//    @Column(name = "MEMBER_ID")
//    private Long id;
//    @Column(name = "USERNAME")
//    private String username;
////    @Column(name = "TEAM_ID")
////    private Long teamId;
//    @ManyToOne
//    @JoinColumn(name = "TEAM_ID")
//    private Team team;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
////    public Long getTeamId() {
////        return teamId;
////    }
////
////    public void setTeamId(Long teamId) {
////        this.teamId = teamId;
////    }
//
//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//        team.getMembers().add(this); //객체지향스럽게
//    }

//엔티티 매핑
//    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_generator")
//    private Long id;
//
////    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
////    private Long id;
//    @Column(name = "name", nullable = false, columnDefinition = "varchar(100) default 'EMPTY'") //NOT NULL
//    private String username;
////    private int age;
////    @Enumerated(EnumType.STRING)
////    private RoleType roleType;
////    @Temporal(TemporalType.TIMESTAMP)
////    private Date createdDate;
////    @Temporal(TemporalType.TIMESTAMP)
////    private Date lastModifiedDate;
////    @Lob
////    private String description;
////    @Transient
////    private int temp;
////
////    private LocalDate testLocalDate;
////    private LocalDateTime testLocalDateTime;
//
//    public Member() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
////    public int getAge() {
////        return age;
////    }
////
////    public void setAge(int age) {
////        this.age = age;
////    }
////
////    public RoleType getRoleType() {
////        return roleType;
////    }
////
////    public void setRoleType(RoleType roleType) {
////        this.roleType = roleType;
////    }
////
////    public Date getCreatedDate() {
////        return createdDate;
////    }
////
////    public void setCreatedDate(Date createdDate) {
////        this.createdDate = createdDate;
////    }
////
////    public Date getLastModifiedDate() {
////        return lastModifiedDate;
////    }
////
////    public void setLastModifiedDate(Date lastModifiedDate) {
////        this.lastModifiedDate = lastModifiedDate;
////    }
////
////    public String getDescription() {
////        return description;
////    }
////
////    public void setDescription(String description) {
////        this.description = description;
////    }
////
////    public int getTemp() {
////        return temp;
////    }
////
////    public void setTemp(int temp) {
////        this.temp = temp;
////    }
}
