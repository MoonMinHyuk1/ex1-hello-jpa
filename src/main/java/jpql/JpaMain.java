package jpql;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try {
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("member1");
            member.setAge(10);
            member.changeTeam(team);
            member.setType(MemberType.ADMIN);

            em.persist(member);

            em.flush();
            em.clear();

            String query3 = "select m.team from Member m"; //묵시적 내부 조인, 사용 권장X
            String query4 = "select t from Member m join m.team t";
            em.createQuery(query3);
            em.createQuery(query4);

            String query =
                    "select " +
                            "case when m.age <= 10 then '학생요금' " +
                            "     when m.age >= 60 then '경로요금' " +
                            "     else '일반요금' end " +
                    "from Member m";
            TypedQuery<String> result = em.createQuery(query, String.class);

            String query1 = "select coalesce(m.username, '이름 없는 회원') from Member m";
            em.createQuery(query1);

            String query2 = "select nullif(m.username, '관리자') as username from Member m";
            em.createQuery(query2);

            tx.commit();

//            String query = "select m.username, 'HELLO', TRUE from Member m" +
//                            "where m.type = jpql.MemberType.ADMIN";
//            List<Object[]> result = em.createQuery(query)
//                    .getResultList();
//
//            tx.commit();

//            List<Member> result = em.createQuery("select m from Member m order by m.age desc", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            tx.commit();

//            Member member = new Member();
//            member.setUsername("member1");
//            member.setAge(10);
//            em.persist(member);
//
//            TypedQuery<Member> query1 = em.createQuery("select m from Member m", Member.class);
//            List<Member> resultList = query1.getResultList();
//            Member singleResult = query1.getSingleResult(); //결과가 무조건 하나
//
//            TypedQuery<String> query2 = em.createQuery("select m.username from Member m", String.class);
//            Query query3 = em.createQuery("select m.username, m.age from Member m");
//            TypedQuery<Member> query4 = em.createQuery("select m from Member m where m.username = :username", Member.class)
//                            .setParameter("username", "member1");
//            Member singleResult1 = query4.getSingleResult();
//
//            tx.commit();
        } catch(Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
