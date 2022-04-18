// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1beta2.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Spec to control the desired behavior of daemon set rolling update.
 * 
 */
public final class RollingUpdateDaemonSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RollingUpdateDaemonSetArgs Empty = new RollingUpdateDaemonSetArgs();

    /**
     * The maximum number of DaemonSet pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total number of DaemonSet pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up. This cannot be 0. Default value is 1. Example: when this is set to 30%, at most 30% of the total number of nodes that should be running the daemon pod (i.e. status.desiredNumberScheduled) can have their pods stopped for an update at any given time. The update starts by stopping at most 30% of those DaemonSet pods and then brings up new DaemonSet pods in their place. Once the new pods are available, it then proceeds onto other DaemonSet pods, thus ensuring that at least 70% of original number of DaemonSet pods are available at all times during the update.
     * 
     */
    @Import(name="maxUnavailable")
      private final @Nullable Output<Either<Integer,String>> maxUnavailable;

    public Output<Either<Integer,String>> maxUnavailable() {
        return this.maxUnavailable == null ? Codegen.empty() : this.maxUnavailable;
    }

    public RollingUpdateDaemonSetArgs(@Nullable Output<Either<Integer,String>> maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    private RollingUpdateDaemonSetArgs() {
        this.maxUnavailable = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateDaemonSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<Integer,String>> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateDaemonSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxUnavailable(@Nullable Output<Either<Integer,String>> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Builder maxUnavailable(@Nullable Either<Integer,String> maxUnavailable) {
            this.maxUnavailable = Codegen.ofNullable(maxUnavailable);
            return this;
        }        public RollingUpdateDaemonSetArgs build() {
            return new RollingUpdateDaemonSetArgs(maxUnavailable);
        }
    }
}
