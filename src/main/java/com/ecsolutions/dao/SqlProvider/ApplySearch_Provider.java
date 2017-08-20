package com.ecsolutions.dao.SqlProvider;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by Administrator on 2017/8/3.
 */
public class ApplySearch_Provider {
    public String search(Map<String, Object> map)
    {

        String startDate = (String) map.get("param1");
        String endDate = (String) map.get("param2");
        String personalFlag = (String) map.get("param3");
        String status = (String) map.get("param4");
        String manager = (String) map.get("param5");
        String custCod = (String) map.get("param6");
        String lastName = (String) map.get("param7");
        String lregno = (String) map.get("param8");
        return new SQL() {{
            SELECT("ApplySerial.bpm_no as bpm_no,ApplySerial.custcode as custcode,LoanApplicant.lastName as lastName,ApplySerial.status as status,LoanApplicant.pidno as pidno,to_char(ApplySerial.startdate,'YYYY-MM-DD') as startdate ");
            FROM("ApplySerial ,LoanApplicant ");
            WHERE("ApplySerial.custcode=LoanApplicant.custcod");
            if(!startDate.equals("") && startDate != null) {
                WHERE("ApplySerial.startdate>= to_date(#{param1},'YYYY-MM-DD')");
            }
            if(!endDate.equals("") && endDate != null){
                WHERE("ApplySerial.startdate<= to_date(#{param2},'YYYY-MM-DD')");
            }
            if(!personalFlag.equals("") && personalFlag != null){
                WHERE("LoanApplicant.personalFlag=#{param3}");
            }
            if(!status.equals("") && status != null){
                WHERE("ApplySerial.status=#{param4}");
            }
            if(!manager.equals("") && manager != null){
                WHERE("LoanApplicant.accoffic=#{param5}");
            }
            if(!custCod.equals("") && custCod != null){
                WHERE("ApplySerial.custCode=#{param6}");
            }
            if(!lastName.equals("") && lastName != null){
                WHERE("LoanApplicant.lastName=#{param7}");
            }

            if(!lregno.equals("") && lregno != null){
                WHERE("LoanApplicant.lregno=#{param8}");
            }
        }}.toString();
    }


}
