// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceShieldedInstanceConfig {
    /**
     * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the
     * boot integrity of the instance. The attestation is performed against the integrity policy baseline.
     * This baseline is initially derived from the implicitly trusted boot image when the instance is created.
     * Enabled by default.
     * 
     */
    private final @Nullable Boolean enableIntegrityMonitoring;
    /**
     * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs
     * authentic software by verifying the digital signature of all boot components, and halting the boot process
     * if signature verification fails.
     * Disabled by default.
     * 
     */
    private final @Nullable Boolean enableSecureBoot;
    /**
     * Defines whether the instance has the vTPM enabled.
     * Enabled by default.
     * 
     */
    private final @Nullable Boolean enableVtpm;

    @CustomType.Constructor
    private InstanceShieldedInstanceConfig(
        @CustomType.Parameter("enableIntegrityMonitoring") @Nullable Boolean enableIntegrityMonitoring,
        @CustomType.Parameter("enableSecureBoot") @Nullable Boolean enableSecureBoot,
        @CustomType.Parameter("enableVtpm") @Nullable Boolean enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    /**
     * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the
     * boot integrity of the instance. The attestation is performed against the integrity policy baseline.
     * This baseline is initially derived from the implicitly trusted boot image when the instance is created.
     * Enabled by default.
     * 
    */
    public Optional<Boolean> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    /**
     * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs
     * authentic software by verifying the digital signature of all boot components, and halting the boot process
     * if signature verification fails.
     * Disabled by default.
     * 
    */
    public Optional<Boolean> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }
    /**
     * Defines whether the instance has the vTPM enabled.
     * Enabled by default.
     * 
    */
    public Optional<Boolean> enableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;
        private @Nullable Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }
        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        public Builder enableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }        public InstanceShieldedInstanceConfig build() {
            return new InstanceShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
