// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs Empty = new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs();

    /**
     * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. Default is `false`.
     * 
     */
    @Import(name="allowNonRestoredState")
    private @Nullable Output<Boolean> allowNonRestoredState;

    public Optional<Output<Boolean>> allowNonRestoredState() {
        return Optional.ofNullable(this.allowNonRestoredState);
    }

    private ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs() {}

    private ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs $) {
        this.allowNonRestoredState = $.allowNonRestoredState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowNonRestoredState(@Nullable Output<Boolean> allowNonRestoredState) {
            $.allowNonRestoredState = allowNonRestoredState;
            return this;
        }

        public Builder allowNonRestoredState(Boolean allowNonRestoredState) {
            return allowNonRestoredState(Output.of(allowNonRestoredState));
        }

        public ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs build() {
            return $;
        }
    }

}
