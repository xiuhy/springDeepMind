package org.yhx.spring.deepmind.web.controller;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcSpitterRepository implements SpitterRepository {
  
  //private JdbcOperations jdbc;

//  @Autowired
//  public JdbcSpitterRepository(JdbcOperations jdbc) {
//    this.jdbc = jdbc;
//  }

  public Spitter save(Spitter spitter) {
    System.out.println(spitter);
//    jdbc.update(
//        "insert into Spitter (username, password, first_name, last_name, email)" +
//        " values (?, ?, ?, ?, ?)",
//        spitter.getUsername(),
//        spitter.getPassword(),
//        spitter.getFirstName(),
//        spitter.getLastName(),
//        spitter.getEmail());
    return spitter; // TODO: Determine value for id
  }

  public Spitter findByUsername(String username) {
//    return jdbc.queryForObject(
//        "select id, username, null, first_name, last_name, email from Spitter where username=?",
//        new SpitterRowMapper(),
//        username);

    Spitter spitter=new Spitter();
    return spitter;
  }
  
//  private static class SpitterRowMapper implements RowMapper<Spitter> {
//    public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
//      return new Spitter(
//          rs.getLong("id"),
//          rs.getString("username"),
//          null,
//          rs.getString("first_name"),
//          rs.getString("last_name"),
//          rs.getString("email"));
//    }
//  }

}
