// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1.inputs.RollingUpdateDaemonSetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DaemonSetUpdateStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonSetUpdateStrategyArgs Empty = new DaemonSetUpdateStrategyArgs();

    @InputImport(name="rollingUpdate")
    private final @Nullable Input<RollingUpdateDaemonSetArgs> rollingUpdate;

    public Input<RollingUpdateDaemonSetArgs> getRollingUpdate() {
        return this.rollingUpdate == null ? Input.empty() : this.rollingUpdate;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public DaemonSetUpdateStrategyArgs(
        @Nullable Input<RollingUpdateDaemonSetArgs> rollingUpdate,
        @Nullable Input<String> type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    private DaemonSetUpdateStrategyArgs() {
        this.rollingUpdate = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetUpdateStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RollingUpdateDaemonSetArgs> rollingUpdate;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetUpdateStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder setRollingUpdate(@Nullable Input<RollingUpdateDaemonSetArgs> rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        public Builder setRollingUpdate(@Nullable RollingUpdateDaemonSetArgs rollingUpdate) {
            this.rollingUpdate = Input.ofNullable(rollingUpdate);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public DaemonSetUpdateStrategyArgs build() {
            return new DaemonSetUpdateStrategyArgs(rollingUpdate, type);
        }
    }
}
