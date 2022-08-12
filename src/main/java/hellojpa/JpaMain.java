package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
            //비영속
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HelloB");
            //영속
//            em.persist(member);

//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//            for (Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }

//            Member member1 = new Member(150L, "A");
//            Member member2 = new Member(160L, "B");
//            em.persist(member1);
//            em.persist(member2);
//            System.out.println("=================");

//            Member member = em.find(Member.class, 150L);
//            em.detach(member); //준영속상태(엔티티 단위)
//            em.clear(); //영속성 컨텍스트 초기화
//            em.close(); //영속성 컨텍스트 종료
//            member.setName("ZZZZZ");

//            Member member = new Member(200L, "member200");
//            em.persist(member);
//            em.flush();

            Member member = new Member();
            member.setId(1L);
            member.setUsername("A");
            member.setRoleType(RoleType.USER);

            em.persist(member);

            //test

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
