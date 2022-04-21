// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.inputs.ClusterExecuteCommandLogConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for ExecuteCommand.
 * 
 */
public final class ClusterExecuteCommandConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterExecuteCommandConfigurationArgs Empty = new ClusterExecuteCommandConfigurationArgs();

    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    @Import(name="logConfiguration")
    private @Nullable Output<ClusterExecuteCommandLogConfigurationArgs> logConfiguration;

    public Optional<Output<ClusterExecuteCommandLogConfigurationArgs>> logConfiguration() {
        return Optional.ofNullable(this.logConfiguration);
    }

    @Import(name="logging")
    private @Nullable Output<String> logging;

    public Optional<Output<String>> logging() {
        return Optional.ofNullable(this.logging);
    }

    private ClusterExecuteCommandConfigurationArgs() {}

    private ClusterExecuteCommandConfigurationArgs(ClusterExecuteCommandConfigurationArgs $) {
        this.kmsKeyId = $.kmsKeyId;
        this.logConfiguration = $.logConfiguration;
        this.logging = $.logging;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterExecuteCommandConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterExecuteCommandConfigurationArgs $;

        public Builder() {
            $ = new ClusterExecuteCommandConfigurationArgs();
        }

        public Builder(ClusterExecuteCommandConfigurationArgs defaults) {
            $ = new ClusterExecuteCommandConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder logConfiguration(@Nullable Output<ClusterExecuteCommandLogConfigurationArgs> logConfiguration) {
            $.logConfiguration = logConfiguration;
            return this;
        }

        public Builder logConfiguration(ClusterExecuteCommandLogConfigurationArgs logConfiguration) {
            return logConfiguration(Output.of(logConfiguration));
        }

        public Builder logging(@Nullable Output<String> logging) {
            $.logging = logging;
            return this;
        }

        public Builder logging(String logging) {
            return logging(Output.of(logging));
        }

        public ClusterExecuteCommandConfigurationArgs build() {
            return $;
        }
    }

}
