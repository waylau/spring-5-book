package com.waylau.spring.mail;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.waylau.spring.mail.config.AppConfig;

/**
 * Spring JMS Test.
 * 
 * @since 1.0.0 2018年4月15日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class SpringMailTest {

	private static final String FROM = "waylau521@163.com";
	private static final String TO = "778907484@qq.com";
	private static final String SUBJECT = "Spring Email Test";
	private static final String TEXT = "Hello World! Welcome to waylau.com!";
	private static final String FILE_PATH = "D:\\waylau_181_181.jpg";
	@Autowired
	private JavaMailSender mailSender;

	/**
	 * 发送文本邮件
	 */
	@Test
	public void sendSimpleEmail() {
		SimpleMailMessage message = new SimpleMailMessage();// 消息构造器
		message.setFrom(FROM);// 发件人
		message.setTo(TO);// 收件人
		message.setSubject(SUBJECT);// 主题
		message.setText(TEXT);// 正文
		mailSender.send(message);
		System.out.println("邮件发送完毕");
	}

	/**
	 * 发送带有附件的email
	 * 
	 * @throws MessagingException
	 */
	@Test
	public void sendEmailWithAttachment() throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(FROM);// 发件人
		helper.setTo(TO);// 收件人
		helper.setSubject(SUBJECT);// 主题
		helper.setText(TEXT);// 正文

		// 添加附件
		FileSystemResource image = new FileSystemResource(new File(FILE_PATH));
		System.out.println(image.exists());

		// 添加附加，第一个参数为添加到Email中附件的名称，第二个人参数是图片资源
		helper.addAttachment("waylau_181_181.jpg", image);
		mailSender.send(message);
		System.out.println("邮件发送完毕");
	}

	/**
	 * 发送富文本内容的Email
	 * 
	 * @throws MessagingException
	 */
	@Test
	public void sendRichEmail() throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(FROM);// 发件人
		helper.setTo(TO);// 收件人
		helper.setSubject(SUBJECT);// 主题
		helper.setText("<html><body><h4>Hello World!</h4>"
				+ "Welcome to <a href='https://waylau.com'>waylau.com!</a></body></html>", true);
		
		// 添加附件
		FileSystemResource image = new FileSystemResource(new File(FILE_PATH));
		System.out.println(image.exists());

		// 添加附加，第一个参数为添加到Email中附件的名称，第二个人参数是图片资源
		helper.addAttachment("waylau_181_181.jpg", image);
		mailSender.send(message);
		System.out.println("邮件发送完毕");
	}

}
