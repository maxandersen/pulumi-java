// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageShieldedInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageShieldedInstanceConfigArgs Empty = new InstanceFromMachineImageShieldedInstanceConfigArgs();

    @Import(name="enableIntegrityMonitoring")
    private @Nullable Output<Boolean> enableIntegrityMonitoring;

    public Optional<Output<Boolean>> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }

    @Import(name="enableSecureBoot")
    private @Nullable Output<Boolean> enableSecureBoot;

    public Optional<Output<Boolean>> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    @Import(name="enableVtpm")
    private @Nullable Output<Boolean> enableVtpm;

    public Optional<Output<Boolean>> enableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    private InstanceFromMachineImageShieldedInstanceConfigArgs() {}

    private InstanceFromMachineImageShieldedInstanceConfigArgs(InstanceFromMachineImageShieldedInstanceConfigArgs $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
        this.enableVtpm = $.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageShieldedInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageShieldedInstanceConfigArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageShieldedInstanceConfigArgs();
        }

        public Builder(InstanceFromMachineImageShieldedInstanceConfigArgs defaults) {
            $ = new InstanceFromMachineImageShieldedInstanceConfigArgs(Objects.requireNonNull(defaults));
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

        public InstanceFromMachineImageShieldedInstanceConfigArgs build() {
            return $;
        }
    }

}
