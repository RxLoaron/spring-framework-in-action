package spring.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lyp3314@gmail.com on 2017/9/11.
 */

@Repository(value = "userDao")
public class UserDaoImp implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int getUserCount() {
        String sql = "select count(*) from tb_user;";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int deleteUserById(int userId) {
        return 0;
    }

    @Override
    public User getUserById(int userId) {
        String sql = "select * from tb_user where id = ?;";

        final User user = jdbcTemplate.queryForObject(sql, new Object[]{userId}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user1 = new User(rs.getString("username"), rs.getString("email"), rs.getInt("sex"));
                return user1;
            }
        });
        return user;
    }
}
