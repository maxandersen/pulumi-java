// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodeConfigKubeletConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigKubeletConfigGetArgs Empty = new ClusterNodeConfigKubeletConfigGetArgs();

    /**
     * If true, enables CPU CFS quota enforcement for
     * containers that specify CPU limits.
     * 
     */
    @Import(name="cpuCfsQuota")
      private final @Nullable Output<Boolean> cpuCfsQuota;

    public Output<Boolean> cpuCfsQuota() {
        return this.cpuCfsQuota == null ? Codegen.empty() : this.cpuCfsQuota;
    }

    /**
     * The CPU CFS quota period value. Specified
     * as a sequence of decimal numbers, each with optional fraction and a unit suffix,
     * such as `&#34;300ms&#34;`. Valid time units are &#34;ns&#34;, &#34;us&#34; (or &#34;µs&#34;), &#34;ms&#34;, &#34;s&#34;, &#34;m&#34;,
     * &#34;h&#34;. The value must be a positive duration.
     * 
     */
    @Import(name="cpuCfsQuotaPeriod")
      private final @Nullable Output<String> cpuCfsQuotaPeriod;

    public Output<String> cpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod == null ? Codegen.empty() : this.cpuCfsQuotaPeriod;
    }

    /**
     * The CPU management policy on the node. See
     * [K8S CPU Management Policies](https://kubernetes.io/docs/tasks/administer-cluster/cpu-management-policies/).
     * One of `&#34;none&#34;` or `&#34;static&#34;`. Defaults to `none` when `kubelet_config` is unset.
     * 
     */
    @Import(name="cpuManagerPolicy", required=true)
      private final Output<String> cpuManagerPolicy;

    public Output<String> cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }

    public ClusterNodeConfigKubeletConfigGetArgs(
        @Nullable Output<Boolean> cpuCfsQuota,
        @Nullable Output<String> cpuCfsQuotaPeriod,
        Output<String> cpuManagerPolicy) {
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy, "expected parameter 'cpuManagerPolicy' to be non-null");
    }

    private ClusterNodeConfigKubeletConfigGetArgs() {
        this.cpuCfsQuota = Codegen.empty();
        this.cpuCfsQuotaPeriod = Codegen.empty();
        this.cpuManagerPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigKubeletConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> cpuCfsQuota;
        private @Nullable Output<String> cpuCfsQuotaPeriod;
        private Output<String> cpuManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigKubeletConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
        }

        public Builder cpuCfsQuota(@Nullable Output<Boolean> cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }
        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Codegen.ofNullable(cpuCfsQuota);
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable Output<String> cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Codegen.ofNullable(cpuCfsQuotaPeriod);
            return this;
        }
        public Builder cpuManagerPolicy(Output<String> cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Output.of(Objects.requireNonNull(cpuManagerPolicy));
            return this;
        }        public ClusterNodeConfigKubeletConfigGetArgs build() {
            return new ClusterNodeConfigKubeletConfigGetArgs(cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy);
        }
    }
}
