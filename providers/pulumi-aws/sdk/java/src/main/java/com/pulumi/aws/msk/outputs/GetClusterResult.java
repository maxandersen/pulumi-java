// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    private final String arn;
    /**
     * Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
     * 
     */
    private final String bootstrapBrokers;
    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    private final String bootstrapBrokersSaslIam;
    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    private final String bootstrapBrokersSaslScram;
    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    private final String bootstrapBrokersTls;
    private final String clusterName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Apache Kafka version.
     * 
     */
    private final String kafkaVersion;
    /**
     * Number of broker nodes in the cluster.
     * 
     */
    private final Integer numberOfBrokerNodes;
    /**
     * Map of key-value pairs assigned to the cluster.
     * 
     */
    private final Map<String,String> tags;
    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    private final String zookeeperConnectString;

    @CustomType.Constructor
    private GetClusterResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("bootstrapBrokers") String bootstrapBrokers,
        @CustomType.Parameter("bootstrapBrokersSaslIam") String bootstrapBrokersSaslIam,
        @CustomType.Parameter("bootstrapBrokersSaslScram") String bootstrapBrokersSaslScram,
        @CustomType.Parameter("bootstrapBrokersTls") String bootstrapBrokersTls,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kafkaVersion") String kafkaVersion,
        @CustomType.Parameter("numberOfBrokerNodes") Integer numberOfBrokerNodes,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("zookeeperConnectString") String zookeeperConnectString) {
        this.arn = arn;
        this.bootstrapBrokers = bootstrapBrokers;
        this.bootstrapBrokersSaslIam = bootstrapBrokersSaslIam;
        this.bootstrapBrokersSaslScram = bootstrapBrokersSaslScram;
        this.bootstrapBrokersTls = bootstrapBrokersTls;
        this.clusterName = clusterName;
        this.id = id;
        this.kafkaVersion = kafkaVersion;
        this.numberOfBrokerNodes = numberOfBrokerNodes;
        this.tags = tags;
        this.zookeeperConnectString = zookeeperConnectString;
    }

    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
     * 
    */
    public String bootstrapBrokers() {
        return this.bootstrapBrokers;
    }
    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
    */
    public String bootstrapBrokersSaslIam() {
        return this.bootstrapBrokersSaslIam;
    }
    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
    */
    public String bootstrapBrokersSaslScram() {
        return this.bootstrapBrokersSaslScram;
    }
    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
    */
    public String bootstrapBrokersTls() {
        return this.bootstrapBrokersTls;
    }
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Apache Kafka version.
     * 
    */
    public String kafkaVersion() {
        return this.kafkaVersion;
    }
    /**
     * Number of broker nodes in the cluster.
     * 
    */
    public Integer numberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }
    /**
     * Map of key-value pairs assigned to the cluster.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
    */
    public String zookeeperConnectString() {
        return this.zookeeperConnectString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String bootstrapBrokers;
        private String bootstrapBrokersSaslIam;
        private String bootstrapBrokersSaslScram;
        private String bootstrapBrokersTls;
        private String clusterName;
        private String id;
        private String kafkaVersion;
        private Integer numberOfBrokerNodes;
        private Map<String,String> tags;
        private String zookeeperConnectString;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bootstrapBrokers = defaults.bootstrapBrokers;
    	      this.bootstrapBrokersSaslIam = defaults.bootstrapBrokersSaslIam;
    	      this.bootstrapBrokersSaslScram = defaults.bootstrapBrokersSaslScram;
    	      this.bootstrapBrokersTls = defaults.bootstrapBrokersTls;
    	      this.clusterName = defaults.clusterName;
    	      this.id = defaults.id;
    	      this.kafkaVersion = defaults.kafkaVersion;
    	      this.numberOfBrokerNodes = defaults.numberOfBrokerNodes;
    	      this.tags = defaults.tags;
    	      this.zookeeperConnectString = defaults.zookeeperConnectString;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder bootstrapBrokers(String bootstrapBrokers) {
            this.bootstrapBrokers = Objects.requireNonNull(bootstrapBrokers);
            return this;
        }
        public Builder bootstrapBrokersSaslIam(String bootstrapBrokersSaslIam) {
            this.bootstrapBrokersSaslIam = Objects.requireNonNull(bootstrapBrokersSaslIam);
            return this;
        }
        public Builder bootstrapBrokersSaslScram(String bootstrapBrokersSaslScram) {
            this.bootstrapBrokersSaslScram = Objects.requireNonNull(bootstrapBrokersSaslScram);
            return this;
        }
        public Builder bootstrapBrokersTls(String bootstrapBrokersTls) {
            this.bootstrapBrokersTls = Objects.requireNonNull(bootstrapBrokersTls);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kafkaVersion(String kafkaVersion) {
            this.kafkaVersion = Objects.requireNonNull(kafkaVersion);
            return this;
        }
        public Builder numberOfBrokerNodes(Integer numberOfBrokerNodes) {
            this.numberOfBrokerNodes = Objects.requireNonNull(numberOfBrokerNodes);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder zookeeperConnectString(String zookeeperConnectString) {
            this.zookeeperConnectString = Objects.requireNonNull(zookeeperConnectString);
            return this;
        }        public GetClusterResult build() {
            return new GetClusterResult(arn, bootstrapBrokers, bootstrapBrokersSaslIam, bootstrapBrokersSaslScram, bootstrapBrokersTls, clusterName, id, kafkaVersion, numberOfBrokerNodes, tags, zookeeperConnectString);
        }
    }
}
