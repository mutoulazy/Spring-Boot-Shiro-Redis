package com.springboot.service;

import com.springboot.pojo.UserOnline;
import java.util.List;

public interface SessionService {

  /**
   * 获取在线人数
   * @return
   */
  List<UserOnline> list();

  /**
   * 提出在线用户
   * @param sessionId
   * @return
   */
  boolean forceLogout(String sessionId);
}
