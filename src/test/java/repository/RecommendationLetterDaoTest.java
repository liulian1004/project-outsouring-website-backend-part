package repository;

import com.psp.init.ApplicationBootstrap;
import com.psp.model.RecommendationLetter;
import com.psp.model.User;
import com.psp.repository.RecommendationLetterDao;
import com.psp.repository.UserDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationBootstrap.class)
public class RecommendationLetterDaoTest {
    @Autowired
    private RecommendationLetterDao recommendationLetterDao;
    @Autowired
    private UserDao userDao;
    RecommendationLetter recommendationLetter;
    User studentUser;
    long id;

    @Before
    public void init(){

    }

    @After
    public void tearDown(){

    }


    @Test
    public void saveRecommendationLetterTest(){

    }
}
