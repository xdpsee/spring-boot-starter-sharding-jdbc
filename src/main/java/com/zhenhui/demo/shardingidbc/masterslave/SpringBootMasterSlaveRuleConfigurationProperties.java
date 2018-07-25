package com.zhenhui.demo.shardingidbc.masterslave;

import org.springframework.boot.context.properties.ConfigurationProperties;

import io.shardingjdbc.core.yaml.masterslave.YamlMasterSlaveRuleConfiguration;

@ConfigurationProperties(prefix = "sharding.jdbc.config.masterslave")
public class SpringBootMasterSlaveRuleConfigurationProperties extends YamlMasterSlaveRuleConfiguration {
}
