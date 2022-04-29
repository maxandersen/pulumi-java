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
 * The native cloud connection configuration
 * 
 */
public final class CspmMonitorAwsOfferingNativeCloudConnectionArgs extends ResourceArgs {

    public static final CspmMonitorAwsOfferingNativeCloudConnectionArgs Empty = new CspmMonitorAwsOfferingNativeCloudConnectionArgs();

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

    private CspmMonitorAwsOfferingNativeCloudConnectionArgs() {}

    private CspmMonitorAwsOfferingNativeCloudConnectionArgs(CspmMonitorAwsOfferingNativeCloudConnectionArgs $) {
        this.cloudRoleArn = $.cloudRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CspmMonitorAwsOfferingNativeCloudConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CspmMonitorAwsOfferingNativeCloudConnectionArgs $;

        public Builder() {
            $ = new CspmMonitorAwsOfferingNativeCloudConnectionArgs();
        }

        public Builder(CspmMonitorAwsOfferingNativeCloudConnectionArgs defaults) {
            $ = new CspmMonitorAwsOfferingNativeCloudConnectionArgs(Objects.requireNonNull(defaults));
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

        public CspmMonitorAwsOfferingNativeCloudConnectionArgs build() {
            return $;
        }
    }

}
