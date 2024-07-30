package Access;
import model.RequestModel;
import db.Connect;
import java.sql.*;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
public class AccessData {
    public static List<RequestModel>showAll()throws SQLException,ClassNotFoundException{
    List<RequestModel> ls=new LinkedList<>();
    String query="select *from request_membership";
    ResultSet rs=Connect.getPreparedStatement(query).executeQuery();
while(rs.next()){
RequestModel m=new RequestModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8));
ls.add(m);
}    
    return ls;
    }
    public void addRequest(RequestModel r)throws ClassNotFoundException,SQLException{
    PreparedStatement ps=null;
    String query="insert into request_membership(firstname,lastname,email,phone,request_date,reason_to_join,status) values(?,?,?,?,?,?,?)";
    ps=Connect.getPreparedStatement(query);
    ps.setString(1, r.getFirstname());
        ps.setString(2, r.getLastname());
            ps.setString(3, r.getEmail());
                ps.setString(4, r.getPhone());
                    ps.setString(5, r.getRequest_date());
                        ps.setString(6, r.getReason_to_join());
                            ps.setString(7, "pending");
                            ps.executeUpdate();
    }
    public void delete(int id) throws ClassNotFoundException,SQLException{
    PreparedStatement ps=null;
    ps=Connect.getPreparedStatement("delete from request_membership where rmid=?");
    ps.setInt(1, id);
    ps.executeUpdate();
    }
    public void edit(int id,String firstname,String lastname,String email,String phone,String request_date,String reason_to_join,String status)
          throws SQLException,ClassNotFoundException{
      String ql="update request_membership set firstname=?,lastname=?,email=?,phone=?,request_date=?,reason_to_join=?,status=? where rmid=?";
  PreparedStatement ps=Connect.getPreparedStatement(ql);
  ps.setString(1, firstname);
   ps.setString(2, lastname);
    ps.setString(3, email);
     ps.setString(4, phone);
     ps.setString(5, request_date);
      ps.setString(6,reason_to_join);
      ps.setString(7,status);
       ps.setInt(8,id);
     ps.executeUpdate();
  }
    public static List<RequestModel>getReqById(int id){
  List<RequestModel> ls=new LinkedList<>();
  String ql="select *from request_membership where rmid="+id;
  try{
  ResultSet rs=Connect.getPreparedStatement(ql).executeQuery();
  while(rs.next()){
  RequestModel n=new RequestModel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
  ls.add(n);
  }
  }
  catch(Exception e){ e.printStackTrace();}
  return ls;
  }
}
