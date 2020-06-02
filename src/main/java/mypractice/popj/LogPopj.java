package mypractice.popj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_log")
public class LogPopj {
     @TableId(type = IdType.AUTO)
     private  int id;
     private  int userId;
     private  String  userAction;
     private  Date createTime;

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public int getUserId() {
          return userId;
     }

     public void setUserId(int userId) {
          this.userId = userId;
     }

     public String getUserAction() {
          return userAction;
     }

     public void setUserAction(String userAction) {
          this.userAction = userAction;
     }

     public Date getCreateTime() {
          return createTime;
     }

     public void setCreateTime(Date createTime) {
          this.createTime = createTime;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          LogPopj logPopj = (LogPopj) o;
          return id == logPopj.id &&
                  userId == logPopj.userId &&
                  Objects.equals(userAction, logPopj.userAction) &&
                  Objects.equals(createTime, logPopj.createTime);
     }

     @Override
     public int hashCode() {
          return Objects.hash(id, userId, userAction, createTime);
     }

     @Override
     public String toString() {
          return "LogPopj{" +
                  "id=" + id +
                  ", userId=" + userId +
                  ", userAction='" + userAction + '\'' +
                  ", createTime=" + createTime +
                  '}';
     }
}
