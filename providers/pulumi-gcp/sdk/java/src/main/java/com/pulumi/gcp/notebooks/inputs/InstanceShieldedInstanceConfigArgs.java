// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceShieldedInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceShieldedInstanceConfigArgs Empty = new InstanceShieldedInstanceConfigArgs();

    /**
     * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the
     * boot integrity of the instance. The attestation is performed against the integrity policy baseline.
     * This baseline is initially derived from the implicitly trusted boot image when the instance is created.
     * Enabled by default.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
    private @Nullable Output<Boolean> enableIntegrityMonitoring;

    public Optional<Output<Boolean>> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }

    /**
     * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs
     * authentic software by verifying the digital signature of all boot components, and halting the boot process
     * if signature verification fails.
     * Disabled by default.
     * 
     */
    @Import(name="enableSecureBoot")
    private @Nullable Output<Boolean> enableSecureBoot;

    public Optional<Output<Boolean>> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    /**
     * Defines whether the instance has the vTPM enabled.
     * Enabled by default.
     * 
     */
    @Import(name="enableVtpm")
    private @Nullable Output<Boolean> enableVtpm;

    public Optional<Output<Boolean>> enableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    private InstanceShieldedInstanceConfigArgs() {}

    private InstanceShieldedInstanceConfigArgs(InstanceShieldedInstanceConfigArgs $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
        this.enableVtpm = $.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceShieldedInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceShieldedInstanceConfigArgs $;

        public Builder() {
            $ = new InstanceShieldedInstanceConfigArgs();
        }

        public Builder(InstanceShieldedInstanceConfigArgs defaults) {
            $ = new InstanceShieldedInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            $.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            return enableIntegrityMonitoring(Output.of(enableIntegrityMonitoring));
        }

        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            $.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            return enableSecureBoot(Output.of(enableSecureBoot));
        }

        public Builder enableVtpm(@Nullable Output<Boolean> enableVtpm) {
            $.enableVtpm = enableVtpm;
            return this;
        }

        public Builder enableVtpm(Boolean enableVtpm) {
            return enableVtpm(Output.of(enableVtpm));
        }

        public InstanceShieldedInstanceConfigArgs build() {
            return $;
        }
    }

}
