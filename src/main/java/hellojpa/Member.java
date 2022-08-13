package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

//@SequenceGenerator(
//        name="member_seq_generator",
//        sequenceName = "member_seq", //매핑할 데이터베이스 시퀀스 이름
//        initialValue = 1, allocationSize = 50
//)
//@Entity
public class Member {
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
