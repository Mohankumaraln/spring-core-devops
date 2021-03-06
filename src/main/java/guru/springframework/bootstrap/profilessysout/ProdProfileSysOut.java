package guru.springframework.bootstrap.profilessysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdProfileSysOut {

@Autowired
    public ProdProfileSysOut(@Value("${guru.springframework.profile.message}") String msg )
    {
        System.out.println("************Prod*****************");
        System.out.println(msg);
    }

}
