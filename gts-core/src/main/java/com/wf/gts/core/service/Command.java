package com.wf.gts.core.service;


@FunctionalInterface
public interface Command {
  
  /**
   * 执行命令接口
   * @param txCompensationAction 封装命令信息
   */
  void execute(TxCompensationAction txCompensationAction);

}
