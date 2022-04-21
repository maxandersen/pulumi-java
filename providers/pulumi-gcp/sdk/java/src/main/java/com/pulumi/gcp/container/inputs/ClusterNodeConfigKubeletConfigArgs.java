// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterNodeConfigKubeletConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigKubeletConfigArgs Empty = new ClusterNodeConfigKubeletConfigArgs();

    /**
     * If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    @Import(name="cpuCfsQuota")
    private @Nullable Output<Boolean> cpuCfsQuota;

    public Optional<Output<Boolean>> cpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }

    /**
     * The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `&#34;300ms&#34;`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;,
     * &#34;h&#34;. The value must be a positive duration.
     * 
     */
    @Import(name="cpuCfsQuotaPeriod")
    private @Nullable Output<String> cpuCfsQuotaPeriod;

    public Optional<Output<String>> cpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }

    /**
     * The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `&#34;none&#34;` or `&#34;static&#34;`. Defaults to `none` when `kubelet_config` is unset.
     * 
     */
    @Import(name="cpuManagerPolicy", required=true)
    private Output<String> cpuManagerPolicy;

    public Output<String> cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    private ClusterNodeConfigKubeletConfigArgs() {}

    private ClusterNodeConfigKubeletConfigArgs(ClusterNodeConfigKubeletConfigArgs $) {
        this.cpuCfsQuota = $.cpuCfsQuota;
        this.cpuCfsQuotaPeriod = $.cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = $.cpuManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeConfigKubeletConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeConfigKubeletConfigArgs $;

        public Builder() {
            $ = new ClusterNodeConfigKubeletConfigArgs();
        }

        public Builder(ClusterNodeConfigKubeletConfigArgs defaults) {
            $ = new ClusterNodeConfigKubeletConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpuCfsQuota(@Nullable Output<Boolean> cpuCfsQuota) {
            $.cpuCfsQuota = cpuCfsQuota;
            return this;
        }

        public Builder cpuCfsQuota(Boolean cpuCfsQuota) {
            return cpuCfsQuota(Output.of(cpuCfsQuota));
        }

        public Builder cpuCfsQuotaPeriod(@Nullable Output<String> cpuCfsQuotaPeriod) {
            $.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }

        public Builder cpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            return cpuCfsQuotaPeriod(Output.of(cpuCfsQuotaPeriod));
        }

        public Builder cpuManagerPolicy(Output<String> cpuManagerPolicy) {
            $.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }

        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            return cpuManagerPolicy(Output.of(cpuManagerPolicy));
        }

        public ClusterNodeConfigKubeletConfigArgs build() {
            $.cpuManagerPolicy = Objects.requireNonNull($.cpuManagerPolicy, "expected parameter 'cpuManagerPolicy' to be non-null");
            return $;
        }
    }

}
