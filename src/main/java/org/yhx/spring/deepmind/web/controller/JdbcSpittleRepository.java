package org.yhx.spring.deepmind.web.controller;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class JdbcSpittleRepository implements SpittleRepository {

//  private JdbcOperations jdbc;

//  @Autowired
//  public JdbcSpittleRepository(JdbcOperations jdbc) {
//    this.jdbc = jdbc;
//  }

  public List<Spittle> findRecentSpittles() {
    List<Spittle> list = new ArrayList<Spittle>();
    return list;
//    return jdbc.query(
//        "select id, message, created_at, latitude, longitude" +
//        " from Spittle" +
//        " order by created_at desc limit 20",
//        new SpittleRowMapper());
  }

  public List<Spittle> findSpittles(long max, int count) {

    List<Spittle> list = new ArrayList<Spittle>();
    return list;
//    return jdbc.query(
//        "select id, message, created_at, latitude, longitude" +
//        " from Spittle" +
//        " where id < ?" +
//        " order by created_at desc limit 20",
//        new SpittleRowMapper(), max);
  }

  public Spittle findOne(long id) {
    Spittle spittle=new Spittle("est",new Date());
    return spittle;
//    return jdbc.queryForObject(
//        "select id, message, created_at, latitude, longitude" +
//        " from Spittle" +
//        " where id = ?",
//        new SpittleRowMapper(), id);
  }

  public void save(Spittle spittle) {
    System.out.println(spittle);
//    jdbc.update(
//        "insert into Spittle (message, created_at, latitude, longitude)" +
//        " values (?, ?, ?, ?)",
//        spittle.getMessage(),
//        spittle.getTime(),
//        spittle.getLatitude(),
//        spittle.getLongitude());
  }

//  private static class SpittleRowMapper implements RowMapper<Spittle> {
//    public Spittle mapRow(ResultSet rs, int rowNum) throws SQLException {
//      return new Spittle(
//          rs.getLong("id"),
//          rs.getString("message"),
//          rs.getDate("created_at"),
//          rs.getDouble("longitude"),
//          rs.getDouble("latitude"));
//    }
//  }
  
}
