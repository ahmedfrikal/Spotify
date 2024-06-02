package fr.codecake.spotify_clone.usercontext.domain;


import fr.codecake.spotify_clone.sharedkernel.domain.AbstractAuditingEntity;
import jakarta.persistence.*;

@Entity
@Table(name ="spotify_user")
public class User extends AbstractAuditingEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "userSequenceGenerator")
    @SequenceGenerator(name = "userSequenceGenerator",sequenceName = "user_generator",allocationSize = 1)
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;


    private String email;

    private Subscription subscription =Subscription.FREE;

    @Column(name = "image_url")
    private String  imageUrl;

    @Override
    public Long getId() {
        return id;
    }
}
