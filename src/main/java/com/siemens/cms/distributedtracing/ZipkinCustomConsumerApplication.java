package com.siemens.cms.distributedtracing;

import com.siemens.cms.distributedtracing.consumer.MyMessageListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.stream.SleuthSink;
import org.springframework.cloud.sleuth.stream.SleuthStreamAutoConfiguration;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Import;

@EnableBinding(SleuthSink.class)
@SpringBootApplication(exclude = SleuthStreamAutoConfiguration.class)
@Import(MyMessageListener.class)
//@IntegrationComponentScan
public class ZipkinCustomConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinCustomConsumerApplication.class, args);
	}
}
