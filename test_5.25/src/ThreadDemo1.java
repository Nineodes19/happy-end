/**
 * @program:test_5.25
 * @author:Nine_odes
 * @description:
 * @create:2020-05-25 19:38
 **/

/**
 * 定时器的实现原理
 * 1.内部包含一个阻塞的优先队列，包含了所有需要执行的定时任务
 * 2.每个任务里面包含两个内容（要执行的具体动作RUnnable，啥时候执行）
 * 3.有一个专门的扫描线程，会定期检查优先队列中的队首元素，
 * 4.为了防止忙等
 */
public class ThreadDemo1 {
}
