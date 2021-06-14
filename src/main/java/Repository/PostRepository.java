package Repository;

import com.codeup.springblog.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByTitle(String ad_to_be_deleted);
}
