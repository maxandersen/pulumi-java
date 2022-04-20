// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodePoolNodeConfigKubeletConfig {
    /**
     * If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    private final @Nullable Boolean cpuCfsQuota;
    /**
     * The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `&#34;300ms&#34;`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;,
     * &#34;h&#34;. The value must be a positive duration.
     * 
     */
    private final @Nullable String cpuCfsQuotaPeriod;
    /**
     * The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `&#34;none&#34;` or `&#34;static&#34;`. Defaults to `none` when `kubelet_config` is unset.
     * 
     */
    private final String cpuManagerPolicy;

    @CustomType.Constructor
    private ClusterNodePoolNodeConfigKubeletConfig(
        @CustomType.Parameter("cpuCfsQuota") @Nullable Boolean cpuCfsQuota,
        @CustomType.Parameter("cpuCfsQuotaPeriod") @Nullable String cpuCfsQuotaPeriod,
        @CustomType.Parameter("cpuManagerPolicy") String cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = cpuManagerPolicy;
    }

    /**
     * If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
    */
    public Optional<Boolean> cpuCfsQuota() {
        return Optional.ofNullable(this.cpuCfsQuota);
    }
    /**
     * The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `&#34;300ms&#34;`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;,
     * &#34;h&#34;. The value must be a positive duration.
     * 
    */
    public Optional<String> cpuCfsQuotaPeriod() {
        return Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }
    /**
     * The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `&#34;none&#34;` or `&#34;static&#34;`. Defaults to `none` when `kubelet_config` is unset.
     * 
    */
    public String cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigKubeletConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cpuCfsQuota;
        private @Nullable String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigKubeletConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }        public ClusterNodePoolNodeConfigKubeletConfig build() {
            return new ClusterNodePoolNodeConfigKubeletConfig(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
