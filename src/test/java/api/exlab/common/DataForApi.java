package api.exlab.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DataForApi {
    /**
     * {
     * "name": "{{$randomFirstName}}",
     * "email": "{{$randomEmail}}",
     * "password": "Test123467",
     * "about": "About Me",
     * "terms": "10"
     * }
     */

    public static Map<String, Object> registerUserBody(String name, String email, String password, String about, String terms) {


        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("name",name);
        requestMap.put("email",email);
        requestMap.put("password",password);
        requestMap.put("about",about);
        requestMap.put("terms",terms);
        return requestMap;

    }

    /**
     * {
     *   "job": "Junior Developer",
     *   "company": "{{$randomCompanyName}}",
     *   "location": "USA",
     *   "fromdate": "2020-11-11",
     *   "todate": "2021-11-11",
     *   "current": "false",
     *   "description": "Description"
     * }
     */
    public static Map <String,Object> userExperienceBody(String job,String company,String location,String fromdate,String todate,String current,String description){
        Map<String,Object> experienceBody=new HashMap<>();
        experienceBody.put("job",job);
        experienceBody.put("company",company);
        experienceBody.put("location",location);
        experienceBody.put("fromdate",fromdate);
        experienceBody.put("todate",todate);
        experienceBody.put("current",current);
        experienceBody.put("description",description);
        return experienceBody;
    }
}
