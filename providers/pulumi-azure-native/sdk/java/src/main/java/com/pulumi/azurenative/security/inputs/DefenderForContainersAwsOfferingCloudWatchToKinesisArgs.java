// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The cloudwatch to kinesis connection configuration
 * 
 */
public final class DefenderForContainersAwsOfferingCloudWatchToKinesisArgs extends ResourceArgs {

    public static final DefenderForContainersAwsOfferingCloudWatchToKinesisArgs Empty = new DefenderForContainersAwsOfferingCloudWatchToKinesisArgs();

    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    @Import(name="cloudRoleArn")
    private @Nullable Output<String> cloudRoleArn;

    /**
     * @return The cloud role ARN in AWS for this feature
     * 
     */
    public Optional<Output<String>> cloudRoleArn() {
        return Optional.ofNullable(this.cloudRoleArn);
    }

    private DefenderForContainersAwsOfferingCloudWatchToKinesisArgs() {}

    private DefenderForContainersAwsOfferingCloudWatchToKinesisArgs(DefenderForContainersAwsOfferingCloudWatchToKinesisArgs $) {
        this.cloudRoleArn = $.cloudRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefenderForContainersAwsOfferingCloudWatchToKinesisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefenderForContainersAwsOfferingCloudWatchToKinesisArgs $;

        public Builder() {
            $ = new DefenderForContainersAwsOfferingCloudWatchToKinesisArgs();
        }

        public Builder(DefenderForContainersAwsOfferingCloudWatchToKinesisArgs defaults) {
            $ = new DefenderForContainersAwsOfferingCloudWatchToKinesisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudRoleArn The cloud role ARN in AWS for this feature
         * 
         * @return builder
         * 
         */
        public Builder cloudRoleArn(@Nullable Output<String> cloudRoleArn) {
            $.cloudRoleArn = cloudRoleArn;
            return this;
        }

        /**
         * @param cloudRoleArn The cloud role ARN in AWS for this feature
         * 
         * @return builder
         * 
         */
        public Builder cloudRoleArn(String cloudRoleArn) {
            return cloudRoleArn(Output.of(cloudRoleArn));
        }

        public DefenderForContainersAwsOfferingCloudWatchToKinesisArgs build() {
            return $;
        }
    }

}
