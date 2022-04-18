// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubelet configurations of agent nodes.
 * 
 */
public final class KubeletConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final KubeletConfigResponse Empty = new KubeletConfigResponse();

    /**
     * Allowlist of unsafe sysctls or unsafe sysctl patterns (ending in `*`).
     * 
     */
    @Import(name="allowedUnsafeSysctls")
      private final @Nullable List<String> allowedUnsafeSysctls;

    public List<String> allowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls == null ? List.of() : this.allowedUnsafeSysctls;
    }

    /**
     * The maximum number of container log files that can be present for a container. The number must be ≥ 2.
     * 
     */
    @Import(name="containerLogMaxFiles")
      private final @Nullable Integer containerLogMaxFiles;

    public Optional<Integer> containerLogMaxFiles() {
        return this.containerLogMaxFiles == null ? Optional.empty() : Optional.ofNullable(this.containerLogMaxFiles);
    }

    /**
     * The maximum size (e.g. 10Mi) of container log file before it is rotated.
     * 
     */
    @Import(name="containerLogMaxSizeMB")
      private final @Nullable Integer containerLogMaxSizeMB;

    public Optional<Integer> containerLogMaxSizeMB() {
        return this.containerLogMaxSizeMB == null ? Optional.empty() : Optional.ofNullable(this.containerLogMaxSizeMB);
    }

    /**
     * Enable CPU CFS quota enforcement for containers that specify CPU limits.
     * 
     */
    @Import(name="cpuCfsQuota")
      private final @Nullable Boolean cpuCfsQuota;

    public Optional<Boolean> cpuCfsQuota() {
        return this.cpuCfsQuota == null ? Optional.empty() : Optional.ofNullable(this.cpuCfsQuota);
    }

    /**
     * Sets CPU CFS quota period value.
     * 
     */
    @Import(name="cpuCfsQuotaPeriod")
      private final @Nullable String cpuCfsQuotaPeriod;

    public Optional<String> cpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod == null ? Optional.empty() : Optional.ofNullable(this.cpuCfsQuotaPeriod);
    }

    /**
     * CPU Manager policy to use.
     * 
     */
    @Import(name="cpuManagerPolicy")
      private final @Nullable String cpuManagerPolicy;

    public Optional<String> cpuManagerPolicy() {
        return this.cpuManagerPolicy == null ? Optional.empty() : Optional.ofNullable(this.cpuManagerPolicy);
    }

    /**
     * If set to true it will make the Kubelet fail to start if swap is enabled on the node.
     * 
     */
    @Import(name="failSwapOn")
      private final @Nullable Boolean failSwapOn;

    public Optional<Boolean> failSwapOn() {
        return this.failSwapOn == null ? Optional.empty() : Optional.ofNullable(this.failSwapOn);
    }

    /**
     * The percent of disk usage after which image garbage collection is always run.
     * 
     */
    @Import(name="imageGcHighThreshold")
      private final @Nullable Integer imageGcHighThreshold;

    public Optional<Integer> imageGcHighThreshold() {
        return this.imageGcHighThreshold == null ? Optional.empty() : Optional.ofNullable(this.imageGcHighThreshold);
    }

    /**
     * The percent of disk usage before which image garbage collection is never run.
     * 
     */
    @Import(name="imageGcLowThreshold")
      private final @Nullable Integer imageGcLowThreshold;

    public Optional<Integer> imageGcLowThreshold() {
        return this.imageGcLowThreshold == null ? Optional.empty() : Optional.ofNullable(this.imageGcLowThreshold);
    }

    /**
     * The maximum number of processes per pod.
     * 
     */
    @Import(name="podMaxPids")
      private final @Nullable Integer podMaxPids;

    public Optional<Integer> podMaxPids() {
        return this.podMaxPids == null ? Optional.empty() : Optional.ofNullable(this.podMaxPids);
    }

    /**
     * Topology Manager policy to use.
     * 
     */
    @Import(name="topologyManagerPolicy")
      private final @Nullable String topologyManagerPolicy;

    public Optional<String> topologyManagerPolicy() {
        return this.topologyManagerPolicy == null ? Optional.empty() : Optional.ofNullable(this.topologyManagerPolicy);
    }

    public KubeletConfigResponse(
        @Nullable List<String> allowedUnsafeSysctls,
        @Nullable Integer containerLogMaxFiles,
        @Nullable Integer containerLogMaxSizeMB,
        @Nullable Boolean cpuCfsQuota,
        @Nullable String cpuCfsQuotaPeriod,
        @Nullable String cpuManagerPolicy,
        @Nullable Boolean failSwapOn,
        @Nullable Integer imageGcHighThreshold,
        @Nullable Integer imageGcLowThreshold,
        @Nullable Integer podMaxPids,
        @Nullable String topologyManagerPolicy) {
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        this.containerLogMaxFiles = containerLogMaxFiles;
        this.containerLogMaxSizeMB = containerLogMaxSizeMB;
        this.cpuCfsQuota = cpuCfsQuota;
        this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
        this.cpuManagerPolicy = cpuManagerPolicy;
        this.failSwapOn = failSwapOn;
        this.imageGcHighThreshold = imageGcHighThreshold;
        this.imageGcLowThreshold = imageGcLowThreshold;
        this.podMaxPids = podMaxPids;
        this.topologyManagerPolicy = topologyManagerPolicy;
    }

    private KubeletConfigResponse() {
        this.allowedUnsafeSysctls = List.of();
        this.containerLogMaxFiles = null;
        this.containerLogMaxSizeMB = null;
        this.cpuCfsQuota = null;
        this.cpuCfsQuotaPeriod = null;
        this.cpuManagerPolicy = null;
        this.failSwapOn = null;
        this.imageGcHighThreshold = null;
        this.imageGcLowThreshold = null;
        this.podMaxPids = null;
        this.topologyManagerPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubeletConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedUnsafeSysctls;
        private @Nullable Integer containerLogMaxFiles;
        private @Nullable Integer containerLogMaxSizeMB;
        private @Nullable Boolean cpuCfsQuota;
        private @Nullable String cpuCfsQuotaPeriod;
        private @Nullable String cpuManagerPolicy;
        private @Nullable Boolean failSwapOn;
        private @Nullable Integer imageGcHighThreshold;
        private @Nullable Integer imageGcLowThreshold;
        private @Nullable Integer podMaxPids;
        private @Nullable String topologyManagerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(KubeletConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedUnsafeSysctls = defaults.allowedUnsafeSysctls;
    	      this.containerLogMaxFiles = defaults.containerLogMaxFiles;
    	      this.containerLogMaxSizeMB = defaults.containerLogMaxSizeMB;
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
    	      this.failSwapOn = defaults.failSwapOn;
    	      this.imageGcHighThreshold = defaults.imageGcHighThreshold;
    	      this.imageGcLowThreshold = defaults.imageGcLowThreshold;
    	      this.podMaxPids = defaults.podMaxPids;
    	      this.topologyManagerPolicy = defaults.topologyManagerPolicy;
        }

        public Builder allowedUnsafeSysctls(@Nullable List<String> allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }
        public Builder allowedUnsafeSysctls(String... allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(List.of(allowedUnsafeSysctls));
        }
        public Builder containerLogMaxFiles(@Nullable Integer containerLogMaxFiles) {
            this.containerLogMaxFiles = containerLogMaxFiles;
            return this;
        }
        public Builder containerLogMaxSizeMB(@Nullable Integer containerLogMaxSizeMB) {
            this.containerLogMaxSizeMB = containerLogMaxSizeMB;
            return this;
        }
        public Builder cpuCfsQuota(@Nullable Boolean cpuCfsQuota) {
            this.cpuCfsQuota = cpuCfsQuota;
            return this;
        }
        public Builder cpuCfsQuotaPeriod(@Nullable String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            return this;
        }
        public Builder cpuManagerPolicy(@Nullable String cpuManagerPolicy) {
            this.cpuManagerPolicy = cpuManagerPolicy;
            return this;
        }
        public Builder failSwapOn(@Nullable Boolean failSwapOn) {
            this.failSwapOn = failSwapOn;
            return this;
        }
        public Builder imageGcHighThreshold(@Nullable Integer imageGcHighThreshold) {
            this.imageGcHighThreshold = imageGcHighThreshold;
            return this;
        }
        public Builder imageGcLowThreshold(@Nullable Integer imageGcLowThreshold) {
            this.imageGcLowThreshold = imageGcLowThreshold;
            return this;
        }
        public Builder podMaxPids(@Nullable Integer podMaxPids) {
            this.podMaxPids = podMaxPids;
            return this;
        }
        public Builder topologyManagerPolicy(@Nullable String topologyManagerPolicy) {
            this.topologyManagerPolicy = topologyManagerPolicy;
            return this;
        }        public KubeletConfigResponse build() {
            return new KubeletConfigResponse(allowedUnsafeSysctls, containerLogMaxFiles, containerLogMaxSizeMB, cpuCfsQuota, cpuCfsQuotaPeriod, cpuManagerPolicy, failSwapOn, imageGcHighThreshold, imageGcLowThreshold, podMaxPids, topologyManagerPolicy);
        }
    }
}
