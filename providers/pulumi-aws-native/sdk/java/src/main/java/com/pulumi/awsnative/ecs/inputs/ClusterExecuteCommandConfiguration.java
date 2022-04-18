// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.inputs.ClusterExecuteCommandLogConfiguration;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for ExecuteCommand.
 * 
 */
public final class ClusterExecuteCommandConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final ClusterExecuteCommandConfiguration Empty = new ClusterExecuteCommandConfiguration();

    @Import(name="kmsKeyId")
      private final @Nullable String kmsKeyId;

    public Optional<String> kmsKeyId() {
        return this.kmsKeyId == null ? Optional.empty() : Optional.ofNullable(this.kmsKeyId);
    }

    @Import(name="logConfiguration")
      private final @Nullable ClusterExecuteCommandLogConfiguration logConfiguration;

    public Optional<ClusterExecuteCommandLogConfiguration> logConfiguration() {
        return this.logConfiguration == null ? Optional.empty() : Optional.ofNullable(this.logConfiguration);
    }

    @Import(name="logging")
      private final @Nullable String logging;

    public Optional<String> logging() {
        return this.logging == null ? Optional.empty() : Optional.ofNullable(this.logging);
    }

    public ClusterExecuteCommandConfiguration(
        @Nullable String kmsKeyId,
        @Nullable ClusterExecuteCommandLogConfiguration logConfiguration,
        @Nullable String logging) {
        this.kmsKeyId = kmsKeyId;
        this.logConfiguration = logConfiguration;
        this.logging = logging;
    }

    private ClusterExecuteCommandConfiguration() {
        this.kmsKeyId = null;
        this.logConfiguration = null;
        this.logging = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterExecuteCommandConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private @Nullable ClusterExecuteCommandLogConfiguration logConfiguration;
        private @Nullable String logging;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterExecuteCommandConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.logConfiguration = defaults.logConfiguration;
    	      this.logging = defaults.logging;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder logConfiguration(@Nullable ClusterExecuteCommandLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public Builder logging(@Nullable String logging) {
            this.logging = logging;
            return this;
        }        public ClusterExecuteCommandConfiguration build() {
            return new ClusterExecuteCommandConfiguration(kmsKeyId, logConfiguration, logging);
        }
    }
}
