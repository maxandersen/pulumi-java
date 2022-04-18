// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The kubernetes to scuba connection configuration
 * 
 */
public final class DefenderForContainersAwsOfferingResponseKubernetesScubaReader extends com.pulumi.resources.InvokeArgs {

    public static final DefenderForContainersAwsOfferingResponseKubernetesScubaReader Empty = new DefenderForContainersAwsOfferingResponseKubernetesScubaReader();

    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    @Import(name="cloudRoleArn")
      private final @Nullable String cloudRoleArn;

    public Optional<String> cloudRoleArn() {
        return this.cloudRoleArn == null ? Optional.empty() : Optional.ofNullable(this.cloudRoleArn);
    }

    public DefenderForContainersAwsOfferingResponseKubernetesScubaReader(@Nullable String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
    }

    private DefenderForContainersAwsOfferingResponseKubernetesScubaReader() {
        this.cloudRoleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingResponseKubernetesScubaReader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingResponseKubernetesScubaReader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRoleArn = defaults.cloudRoleArn;
        }

        public Builder cloudRoleArn(@Nullable String cloudRoleArn) {
            this.cloudRoleArn = cloudRoleArn;
            return this;
        }        public DefenderForContainersAwsOfferingResponseKubernetesScubaReader build() {
            return new DefenderForContainersAwsOfferingResponseKubernetesScubaReader(cloudRoleArn);
        }
    }
}
