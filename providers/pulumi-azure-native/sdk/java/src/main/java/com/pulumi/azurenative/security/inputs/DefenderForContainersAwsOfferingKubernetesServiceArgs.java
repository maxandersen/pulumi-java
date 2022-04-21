// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The kubernetes service connection configuration
 * 
 */
public final class DefenderForContainersAwsOfferingKubernetesServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefenderForContainersAwsOfferingKubernetesServiceArgs Empty = new DefenderForContainersAwsOfferingKubernetesServiceArgs();

    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    @Import(name="cloudRoleArn")
    private @Nullable Output<String> cloudRoleArn;

    public Optional<Output<String>> cloudRoleArn() {
        return Optional.ofNullable(this.cloudRoleArn);
    }

    private DefenderForContainersAwsOfferingKubernetesServiceArgs() {}

    private DefenderForContainersAwsOfferingKubernetesServiceArgs(DefenderForContainersAwsOfferingKubernetesServiceArgs $) {
        this.cloudRoleArn = $.cloudRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefenderForContainersAwsOfferingKubernetesServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefenderForContainersAwsOfferingKubernetesServiceArgs $;

        public Builder() {
            $ = new DefenderForContainersAwsOfferingKubernetesServiceArgs();
        }

        public Builder(DefenderForContainersAwsOfferingKubernetesServiceArgs defaults) {
            $ = new DefenderForContainersAwsOfferingKubernetesServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudRoleArn(@Nullable Output<String> cloudRoleArn) {
            $.cloudRoleArn = cloudRoleArn;
            return this;
        }

        public Builder cloudRoleArn(String cloudRoleArn) {
            return cloudRoleArn(Output.of(cloudRoleArn));
        }

        public DefenderForContainersAwsOfferingKubernetesServiceArgs build() {
            return $;
        }
    }

}
