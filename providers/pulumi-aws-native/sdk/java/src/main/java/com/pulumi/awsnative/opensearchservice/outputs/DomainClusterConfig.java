// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice.outputs;

import com.pulumi.awsnative.opensearchservice.outputs.DomainZoneAwarenessConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainClusterConfig {
    private final @Nullable Integer dedicatedMasterCount;
    private final @Nullable Boolean dedicatedMasterEnabled;
    private final @Nullable String dedicatedMasterType;
    private final @Nullable Integer instanceCount;
    private final @Nullable String instanceType;
    private final @Nullable Integer warmCount;
    private final @Nullable Boolean warmEnabled;
    private final @Nullable String warmType;
    private final @Nullable DomainZoneAwarenessConfig zoneAwarenessConfig;
    private final @Nullable Boolean zoneAwarenessEnabled;

    @CustomType.Constructor
    private DomainClusterConfig(
        @CustomType.Parameter("dedicatedMasterCount") @Nullable Integer dedicatedMasterCount,
        @CustomType.Parameter("dedicatedMasterEnabled") @Nullable Boolean dedicatedMasterEnabled,
        @CustomType.Parameter("dedicatedMasterType") @Nullable String dedicatedMasterType,
        @CustomType.Parameter("instanceCount") @Nullable Integer instanceCount,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("warmCount") @Nullable Integer warmCount,
        @CustomType.Parameter("warmEnabled") @Nullable Boolean warmEnabled,
        @CustomType.Parameter("warmType") @Nullable String warmType,
        @CustomType.Parameter("zoneAwarenessConfig") @Nullable DomainZoneAwarenessConfig zoneAwarenessConfig,
        @CustomType.Parameter("zoneAwarenessEnabled") @Nullable Boolean zoneAwarenessEnabled) {
        this.dedicatedMasterCount = dedicatedMasterCount;
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        this.dedicatedMasterType = dedicatedMasterType;
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.warmCount = warmCount;
        this.warmEnabled = warmEnabled;
        this.warmType = warmType;
        this.zoneAwarenessConfig = zoneAwarenessConfig;
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    public Optional<Integer> dedicatedMasterCount() {
        return Optional.ofNullable(this.dedicatedMasterCount);
    }
    public Optional<Boolean> dedicatedMasterEnabled() {
        return Optional.ofNullable(this.dedicatedMasterEnabled);
    }
    public Optional<String> dedicatedMasterType() {
        return Optional.ofNullable(this.dedicatedMasterType);
    }
    public Optional<Integer> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    public Optional<Integer> warmCount() {
        return Optional.ofNullable(this.warmCount);
    }
    public Optional<Boolean> warmEnabled() {
        return Optional.ofNullable(this.warmEnabled);
    }
    public Optional<String> warmType() {
        return Optional.ofNullable(this.warmType);
    }
    public Optional<DomainZoneAwarenessConfig> zoneAwarenessConfig() {
        return Optional.ofNullable(this.zoneAwarenessConfig);
    }
    public Optional<Boolean> zoneAwarenessEnabled() {
        return Optional.ofNullable(this.zoneAwarenessEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer dedicatedMasterCount;
        private @Nullable Boolean dedicatedMasterEnabled;
        private @Nullable String dedicatedMasterType;
        private @Nullable Integer instanceCount;
        private @Nullable String instanceType;
        private @Nullable Integer warmCount;
        private @Nullable Boolean warmEnabled;
        private @Nullable String warmType;
        private @Nullable DomainZoneAwarenessConfig zoneAwarenessConfig;
        private @Nullable Boolean zoneAwarenessEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfig = defaults.zoneAwarenessConfig;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        public Builder dedicatedMasterCount(@Nullable Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = dedicatedMasterCount;
            return this;
        }
        public Builder dedicatedMasterEnabled(@Nullable Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = dedicatedMasterEnabled;
            return this;
        }
        public Builder dedicatedMasterType(@Nullable String dedicatedMasterType) {
            this.dedicatedMasterType = dedicatedMasterType;
            return this;
        }
        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder warmCount(@Nullable Integer warmCount) {
            this.warmCount = warmCount;
            return this;
        }
        public Builder warmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }
        public Builder warmType(@Nullable String warmType) {
            this.warmType = warmType;
            return this;
        }
        public Builder zoneAwarenessConfig(@Nullable DomainZoneAwarenessConfig zoneAwarenessConfig) {
            this.zoneAwarenessConfig = zoneAwarenessConfig;
            return this;
        }
        public Builder zoneAwarenessEnabled(@Nullable Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = zoneAwarenessEnabled;
            return this;
        }        public DomainClusterConfig build() {
            return new DomainClusterConfig(dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, warmCount, warmEnabled, warmType, zoneAwarenessConfig, zoneAwarenessEnabled);
        }
    }
}
