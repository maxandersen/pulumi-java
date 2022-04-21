// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterConfigLifecycleConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigLifecycleConfigGetArgs Empty = new ClusterClusterConfigLifecycleConfigGetArgs();

    /**
     * The time when cluster will be auto-deleted.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds.
     * Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Import(name="autoDeleteTime")
    private @Nullable Output<String> autoDeleteTime;

    public Optional<Output<String>> autoDeleteTime() {
        return Optional.ofNullable(this.autoDeleteTime);
    }

    /**
     * The duration to keep the cluster alive while idling
     * (no jobs running). After this TTL, the cluster will be deleted. Valid range: [10m, 14d].
     * 
     */
    @Import(name="idleDeleteTtl")
    private @Nullable Output<String> idleDeleteTtl;

    public Optional<Output<String>> idleDeleteTtl() {
        return Optional.ofNullable(this.idleDeleteTtl);
    }

    @Import(name="idleStartTime")
    private @Nullable Output<String> idleStartTime;

    public Optional<Output<String>> idleStartTime() {
        return Optional.ofNullable(this.idleStartTime);
    }

    private ClusterClusterConfigLifecycleConfigGetArgs() {}

    private ClusterClusterConfigLifecycleConfigGetArgs(ClusterClusterConfigLifecycleConfigGetArgs $) {
        this.autoDeleteTime = $.autoDeleteTime;
        this.idleDeleteTtl = $.idleDeleteTtl;
        this.idleStartTime = $.idleStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigLifecycleConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigLifecycleConfigGetArgs $;

        public Builder() {
            $ = new ClusterClusterConfigLifecycleConfigGetArgs();
        }

        public Builder(ClusterClusterConfigLifecycleConfigGetArgs defaults) {
            $ = new ClusterClusterConfigLifecycleConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoDeleteTime(@Nullable Output<String> autoDeleteTime) {
            $.autoDeleteTime = autoDeleteTime;
            return this;
        }

        public Builder autoDeleteTime(String autoDeleteTime) {
            return autoDeleteTime(Output.of(autoDeleteTime));
        }

        public Builder idleDeleteTtl(@Nullable Output<String> idleDeleteTtl) {
            $.idleDeleteTtl = idleDeleteTtl;
            return this;
        }

        public Builder idleDeleteTtl(String idleDeleteTtl) {
            return idleDeleteTtl(Output.of(idleDeleteTtl));
        }

        public Builder idleStartTime(@Nullable Output<String> idleStartTime) {
            $.idleStartTime = idleStartTime;
            return this;
        }

        public Builder idleStartTime(String idleStartTime) {
            return idleStartTime(Output.of(idleStartTime));
        }

        public ClusterClusterConfigLifecycleConfigGetArgs build() {
            return $;
        }
    }

}
