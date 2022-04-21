// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kafkaconnect.inputs;

import com.pulumi.awsnative.kafkaconnect.enums.ConnectorKafkaClusterEncryptionInTransitType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Details of encryption in transit to the Kafka cluster.
 * 
 */
public final class ConnectorKafkaClusterEncryptionInTransitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorKafkaClusterEncryptionInTransitArgs Empty = new ConnectorKafkaClusterEncryptionInTransitArgs();

    @Import(name="encryptionType", required=true)
    private Output<ConnectorKafkaClusterEncryptionInTransitType> encryptionType;

    public Output<ConnectorKafkaClusterEncryptionInTransitType> encryptionType() {
        return this.encryptionType;
    }

    private ConnectorKafkaClusterEncryptionInTransitArgs() {}

    private ConnectorKafkaClusterEncryptionInTransitArgs(ConnectorKafkaClusterEncryptionInTransitArgs $) {
        this.encryptionType = $.encryptionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorKafkaClusterEncryptionInTransitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorKafkaClusterEncryptionInTransitArgs $;

        public Builder() {
            $ = new ConnectorKafkaClusterEncryptionInTransitArgs();
        }

        public Builder(ConnectorKafkaClusterEncryptionInTransitArgs defaults) {
            $ = new ConnectorKafkaClusterEncryptionInTransitArgs(Objects.requireNonNull(defaults));
        }

        public Builder encryptionType(Output<ConnectorKafkaClusterEncryptionInTransitType> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        public Builder encryptionType(ConnectorKafkaClusterEncryptionInTransitType encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        public ConnectorKafkaClusterEncryptionInTransitArgs build() {
            $.encryptionType = Objects.requireNonNull($.encryptionType, "expected parameter 'encryptionType' to be non-null");
            return $;
        }
    }

}
