package 单例模式;

import java.util.concurrent.CountDownLatch;

/**
 * 测试几种单例模式的速度
 */
public class TestSingleton {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		int threadNum = 10;//10个线程
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 100000; i++) {
						Object o = Singleton5.INSTANCE;
					}
					countDownLatch.countDown();//计数器-1
				}
			}).start();
		}

		countDownLatch.await();//main线程阻塞
		long end = System.currentTimeMillis();
		System.out.println("耗时："+(end-start));

		/**
		 * 结果:
		 * Singleton1耗时：5
		 * Singleton2耗时：227
		 * Singleton3耗时：7
		 * Singleton4耗时：40
		 * Singleton5耗时：5
		 */
	}
}
