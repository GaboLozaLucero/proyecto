package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.UserDto;
import bo.ucb.edu.ingsoft.model.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonDao {
    public void create(Person person);
}
