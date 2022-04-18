// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetInstanceTemplateShieldedInstanceConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateShieldedInstanceConfig Empty = new GetInstanceTemplateShieldedInstanceConfig();

    @Import(name="enableIntegrityMonitoring", required=true)
      private final Boolean enableIntegrityMonitoring;

    public Boolean enableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }

    @Import(name="enableSecureBoot", required=true)
      private final Boolean enableSecureBoot;

    public Boolean enableSecureBoot() {
        return this.enableSecureBoot;
    }

    @Import(name="enableVtpm", required=true)
      private final Boolean enableVtpm;

    public Boolean enableVtpm() {
        return this.enableVtpm;
    }

    public GetInstanceTemplateShieldedInstanceConfig(
        Boolean enableIntegrityMonitoring,
        Boolean enableSecureBoot,
        Boolean enableVtpm) {
        this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring, "expected parameter 'enableIntegrityMonitoring' to be non-null");
        this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot, "expected parameter 'enableSecureBoot' to be non-null");
        this.enableVtpm = Objects.requireNonNull(enableVtpm, "expected parameter 'enableVtpm' to be non-null");
    }

    private GetInstanceTemplateShieldedInstanceConfig() {
        this.enableIntegrityMonitoring = null;
        this.enableSecureBoot = null;
        this.enableVtpm = null;
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
