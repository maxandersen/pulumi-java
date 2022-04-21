// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointKafkaSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointKafkaSettingsArgs Empty = new EndpointKafkaSettingsArgs();

    /**
     * Kafka broker location. Specify in the form broker-hostname-or-ip:port.
     * 
     */
    @Import(name="broker", required=true)
    private Output<String> broker;

    public Output<String> broker() {
        return this.broker;
    }

    /**
     * Shows detailed control information for table definition, column definition, and table and column changes in the Kafka message output. The default is `false`.
     * 
     */
    @Import(name="includeControlDetails")
    private @Nullable Output<Boolean> includeControlDetails;

    public Optional<Output<Boolean>> includeControlDetails() {
        return Optional.ofNullable(this.includeControlDetails);
    }

    /**
     * Include NULL and empty columns for records migrated to the endpoint. The default is `false`.
     * 
     */
    @Import(name="includeNullAndEmpty")
    private @Nullable Output<Boolean> includeNullAndEmpty;

    public Optional<Output<Boolean>> includeNullAndEmpty() {
        return Optional.ofNullable(this.includeNullAndEmpty);
    }

    /**
     * Shows the partition value within the Kafka message output unless the partition type is `schema-table-type`. The default is `false`.
     * 
     */
    @Import(name="includePartitionValue")
    private @Nullable Output<Boolean> includePartitionValue;

    public Optional<Output<Boolean>> includePartitionValue() {
        return Optional.ofNullable(this.includePartitionValue);
    }

    /**
     * Includes any data definition language (DDL) operations that change the table in the control data, such as `rename-table`, `drop-table`, `add-column`, `drop-column`, and `rename-column`. The default is `false`.
     * 
     */
    @Import(name="includeTableAlterOperations")
    private @Nullable Output<Boolean> includeTableAlterOperations;

    public Optional<Output<Boolean>> includeTableAlterOperations() {
        return Optional.ofNullable(this.includeTableAlterOperations);
    }

    /**
     * Provides detailed transaction information from the source database. This information includes a commit timestamp, a log position, and values for `transaction_id`, previous `transaction_id`, and `transaction_record_id` (the record offset within a transaction). The default is `false`.
     * 
     */
    @Import(name="includeTransactionDetails")
    private @Nullable Output<Boolean> includeTransactionDetails;

    public Optional<Output<Boolean>> includeTransactionDetails() {
        return Optional.ofNullable(this.includeTransactionDetails);
    }

    /**
     * The output format for the records created on the endpoint. The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
     * 
     */
    @Import(name="messageFormat")
    private @Nullable Output<String> messageFormat;

    public Optional<Output<String>> messageFormat() {
        return Optional.ofNullable(this.messageFormat);
    }

    /**
     * The maximum size in bytes for records created on the endpoint The default is `1,000,000`.
     * 
     */
    @Import(name="messageMaxBytes")
    private @Nullable Output<Integer> messageMaxBytes;

    public Optional<Output<Integer>> messageMaxBytes() {
        return Optional.ofNullable(this.messageMaxBytes);
    }

    /**
     * Set this optional parameter to true to avoid adding a &#39;0x&#39; prefix to raw data in hexadecimal format. For example, by default, AWS DMS adds a &#39;0x&#39; prefix to the LOB column type in hexadecimal format moving from an Oracle source to a Kafka target. Use the `no_hex_prefix` endpoint setting to enable migration of RAW data type columns without adding the `&#39;0x&#39;` prefix.
     * 
     */
    @Import(name="noHexPrefix")
    private @Nullable Output<Boolean> noHexPrefix;

    public Optional<Output<Boolean>> noHexPrefix() {
        return Optional.ofNullable(this.noHexPrefix);
    }

    /**
     * Prefixes schema and table names to partition values, when the partition type is `primary-key-type`. Doing this increases data distribution among Kafka partitions. For example, suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary key. In this case, the same primary key is sent from thousands of tables to the same partition, which causes throttling. The default is `false`.
     * 
     */
    @Import(name="partitionIncludeSchemaTable")
    private @Nullable Output<Boolean> partitionIncludeSchemaTable;

    public Optional<Output<Boolean>> partitionIncludeSchemaTable() {
        return Optional.ofNullable(this.partitionIncludeSchemaTable);
    }

    /**
     * The secure password you created when you first set up your MSK cluster to validate a client identity and make an encrypted connection between server and client using SASL-SSL authentication.
     * 
     */
    @Import(name="saslPassword")
    private @Nullable Output<String> saslPassword;

    public Optional<Output<String>> saslPassword() {
        return Optional.ofNullable(this.saslPassword);
    }

    /**
     * The secure user name you created when you first set up your MSK cluster to validate a client identity and make an encrypted connection between server and client using SASL-SSL authentication.
     * 
     */
    @Import(name="saslUsername")
    private @Nullable Output<String> saslUsername;

    public Optional<Output<String>> saslUsername() {
        return Optional.ofNullable(this.saslUsername);
    }

    /**
     * Set secure connection to a Kafka target endpoint using Transport Layer Security (TLS). Options include `ssl-encryption`, `ssl-authentication`, and `sasl-ssl`. `sasl-ssl` requires `sasl_username` and `sasl_password`.
     * 
     */
    @Import(name="securityProtocol")
    private @Nullable Output<String> securityProtocol;

    public Optional<Output<String>> securityProtocol() {
        return Optional.ofNullable(this.securityProtocol);
    }

    /**
     * The Amazon Resource Name (ARN) for the private certificate authority (CA) cert that AWS DMS uses to securely connect to your Kafka target endpoint.
     * 
     */
    @Import(name="sslCaCertificateArn")
    private @Nullable Output<String> sslCaCertificateArn;

    public Optional<Output<String>> sslCaCertificateArn() {
        return Optional.ofNullable(this.sslCaCertificateArn);
    }

    /**
     * The Amazon Resource Name (ARN) of the client certificate used to securely connect to a Kafka target endpoint.
     * 
     */
    @Import(name="sslClientCertificateArn")
    private @Nullable Output<String> sslClientCertificateArn;

    public Optional<Output<String>> sslClientCertificateArn() {
        return Optional.ofNullable(this.sslClientCertificateArn);
    }

    /**
     * The Amazon Resource Name (ARN) for the client private key used to securely connect to a Kafka target endpoint.
     * 
     */
    @Import(name="sslClientKeyArn")
    private @Nullable Output<String> sslClientKeyArn;

    public Optional<Output<String>> sslClientKeyArn() {
        return Optional.ofNullable(this.sslClientKeyArn);
    }

    /**
     * The password for the client private key used to securely connect to a Kafka target endpoint.
     * 
     */
    @Import(name="sslClientKeyPassword")
    private @Nullable Output<String> sslClientKeyPassword;

    public Optional<Output<String>> sslClientKeyPassword() {
        return Optional.ofNullable(this.sslClientKeyPassword);
    }

    /**
     * Kafka topic for migration. Defaults to `kafka-default-topic`.
     * 
     */
    @Import(name="topic")
    private @Nullable Output<String> topic;

    public Optional<Output<String>> topic() {
        return Optional.ofNullable(this.topic);
    }

    private EndpointKafkaSettingsArgs() {}

    private EndpointKafkaSettingsArgs(EndpointKafkaSettingsArgs $) {
        this.broker = $.broker;
        this.includeControlDetails = $.includeControlDetails;
        this.includeNullAndEmpty = $.includeNullAndEmpty;
        this.includePartitionValue = $.includePartitionValue;
        this.includeTableAlterOperations = $.includeTableAlterOperations;
        this.includeTransactionDetails = $.includeTransactionDetails;
        this.messageFormat = $.messageFormat;
        this.messageMaxBytes = $.messageMaxBytes;
        this.noHexPrefix = $.noHexPrefix;
        this.partitionIncludeSchemaTable = $.partitionIncludeSchemaTable;
        this.saslPassword = $.saslPassword;
        this.saslUsername = $.saslUsername;
        this.securityProtocol = $.securityProtocol;
        this.sslCaCertificateArn = $.sslCaCertificateArn;
        this.sslClientCertificateArn = $.sslClientCertificateArn;
        this.sslClientKeyArn = $.sslClientKeyArn;
        this.sslClientKeyPassword = $.sslClientKeyPassword;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointKafkaSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointKafkaSettingsArgs $;

        public Builder() {
            $ = new EndpointKafkaSettingsArgs();
        }

        public Builder(EndpointKafkaSettingsArgs defaults) {
            $ = new EndpointKafkaSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder broker(Output<String> broker) {
            $.broker = broker;
            return this;
        }

        public Builder broker(String broker) {
            return broker(Output.of(broker));
        }

        public Builder includeControlDetails(@Nullable Output<Boolean> includeControlDetails) {
            $.includeControlDetails = includeControlDetails;
            return this;
        }

        public Builder includeControlDetails(Boolean includeControlDetails) {
            return includeControlDetails(Output.of(includeControlDetails));
        }

        public Builder includeNullAndEmpty(@Nullable Output<Boolean> includeNullAndEmpty) {
            $.includeNullAndEmpty = includeNullAndEmpty;
            return this;
        }

        public Builder includeNullAndEmpty(Boolean includeNullAndEmpty) {
            return includeNullAndEmpty(Output.of(includeNullAndEmpty));
        }

        public Builder includePartitionValue(@Nullable Output<Boolean> includePartitionValue) {
            $.includePartitionValue = includePartitionValue;
            return this;
        }

        public Builder includePartitionValue(Boolean includePartitionValue) {
            return includePartitionValue(Output.of(includePartitionValue));
        }

        public Builder includeTableAlterOperations(@Nullable Output<Boolean> includeTableAlterOperations) {
            $.includeTableAlterOperations = includeTableAlterOperations;
            return this;
        }

        public Builder includeTableAlterOperations(Boolean includeTableAlterOperations) {
            return includeTableAlterOperations(Output.of(includeTableAlterOperations));
        }

        public Builder includeTransactionDetails(@Nullable Output<Boolean> includeTransactionDetails) {
            $.includeTransactionDetails = includeTransactionDetails;
            return this;
        }

        public Builder includeTransactionDetails(Boolean includeTransactionDetails) {
            return includeTransactionDetails(Output.of(includeTransactionDetails));
        }

        public Builder messageFormat(@Nullable Output<String> messageFormat) {
            $.messageFormat = messageFormat;
            return this;
        }

        public Builder messageFormat(String messageFormat) {
            return messageFormat(Output.of(messageFormat));
        }

        public Builder messageMaxBytes(@Nullable Output<Integer> messageMaxBytes) {
            $.messageMaxBytes = messageMaxBytes;
            return this;
        }

        public Builder messageMaxBytes(Integer messageMaxBytes) {
            return messageMaxBytes(Output.of(messageMaxBytes));
        }

        public Builder noHexPrefix(@Nullable Output<Boolean> noHexPrefix) {
            $.noHexPrefix = noHexPrefix;
            return this;
        }

        public Builder noHexPrefix(Boolean noHexPrefix) {
            return noHexPrefix(Output.of(noHexPrefix));
        }

        public Builder partitionIncludeSchemaTable(@Nullable Output<Boolean> partitionIncludeSchemaTable) {
            $.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
            return this;
        }

        public Builder partitionIncludeSchemaTable(Boolean partitionIncludeSchemaTable) {
            return partitionIncludeSchemaTable(Output.of(partitionIncludeSchemaTable));
        }

        public Builder saslPassword(@Nullable Output<String> saslPassword) {
            $.saslPassword = saslPassword;
            return this;
        }

        public Builder saslPassword(String saslPassword) {
            return saslPassword(Output.of(saslPassword));
        }

        public Builder saslUsername(@Nullable Output<String> saslUsername) {
            $.saslUsername = saslUsername;
            return this;
        }

        public Builder saslUsername(String saslUsername) {
            return saslUsername(Output.of(saslUsername));
        }

        public Builder securityProtocol(@Nullable Output<String> securityProtocol) {
            $.securityProtocol = securityProtocol;
            return this;
        }

        public Builder securityProtocol(String securityProtocol) {
            return securityProtocol(Output.of(securityProtocol));
        }

        public Builder sslCaCertificateArn(@Nullable Output<String> sslCaCertificateArn) {
            $.sslCaCertificateArn = sslCaCertificateArn;
            return this;
        }

        public Builder sslCaCertificateArn(String sslCaCertificateArn) {
            return sslCaCertificateArn(Output.of(sslCaCertificateArn));
        }

        public Builder sslClientCertificateArn(@Nullable Output<String> sslClientCertificateArn) {
            $.sslClientCertificateArn = sslClientCertificateArn;
            return this;
        }

        public Builder sslClientCertificateArn(String sslClientCertificateArn) {
            return sslClientCertificateArn(Output.of(sslClientCertificateArn));
        }

        public Builder sslClientKeyArn(@Nullable Output<String> sslClientKeyArn) {
            $.sslClientKeyArn = sslClientKeyArn;
            return this;
        }

        public Builder sslClientKeyArn(String sslClientKeyArn) {
            return sslClientKeyArn(Output.of(sslClientKeyArn));
        }

        public Builder sslClientKeyPassword(@Nullable Output<String> sslClientKeyPassword) {
            $.sslClientKeyPassword = sslClientKeyPassword;
            return this;
        }

        public Builder sslClientKeyPassword(String sslClientKeyPassword) {
            return sslClientKeyPassword(Output.of(sslClientKeyPassword));
        }

        public Builder topic(@Nullable Output<String> topic) {
            $.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public EndpointKafkaSettingsArgs build() {
            $.broker = Objects.requireNonNull($.broker, "expected parameter 'broker' to be non-null");
            return $;
        }
    }

}
