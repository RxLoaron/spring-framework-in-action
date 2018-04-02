package spring.jdbctemplate;

/**
 * Created by lyp3314@gmail.com on 2017/9/11.
 */

public interface UserDao {
    int getUserCount();

    int insertUser(User user);

    int deleteUserById(int userId);

    User getUserById(int userId);
}
