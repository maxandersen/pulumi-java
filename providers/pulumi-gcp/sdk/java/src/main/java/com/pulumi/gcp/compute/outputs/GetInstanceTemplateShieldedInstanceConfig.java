// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetInstanceTemplateShieldedInstanceConfig {
    private final Boolean enableIntegrityMonitoring;
    private final Boolean enableSecureBoot;
    private final Boolean enableVtpm;

    @CustomType.Constructor
    private GetInstanceTemplateShieldedInstanceConfig(
        @CustomType.Parameter("enableIntegrityMonitoring") Boolean enableIntegrityMonitoring,
        @CustomType.Parameter("enableSecureBoot") Boolean enableSecureBoot,
        @CustomType.Parameter("enableVtpm") Boolean enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    public Boolean enableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }
    public Boolean enableSecureBoot() {
        return this.enableSecureBoot;
    }
    public Boolean enableVtpm() {
        return this.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;
        private Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }
        public Builder enableVtpm(Boolean enableVtpm) {
            this.enableVtpm = Objects.requireNonNull(enableVtpm);
            return this;
        }        public GetInstanceTemplateShieldedInstanceConfig build() {
            return new GetInstanceTemplateShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
