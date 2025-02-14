// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set of Shielded VM options.
 * 
 */
public final class ShieldedVmConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShieldedVmConfigArgs Empty = new ShieldedVmConfigArgs();

    /**
     * Defines whether the instance has integrity monitoring enabled.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
    private @Nullable Output<Boolean> enableIntegrityMonitoring;

    /**
     * @return Defines whether the instance has integrity monitoring enabled.
     * 
     */
    public Optional<Output<Boolean>> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }

    /**
     * Defines whether the instance has Secure Boot enabled.
     * 
     */
    @Import(name="enableSecureBoot")
    private @Nullable Output<Boolean> enableSecureBoot;

    /**
     * @return Defines whether the instance has Secure Boot enabled.
     * 
     */
    public Optional<Output<Boolean>> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    /**
     * Defines whether the instance has the vTPM enabled.
     * 
     */
    @Import(name="enableVtpm")
    private @Nullable Output<Boolean> enableVtpm;

    /**
     * @return Defines whether the instance has the vTPM enabled.
     * 
     */
    public Optional<Output<Boolean>> enableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    private ShieldedVmConfigArgs() {}

    private ShieldedVmConfigArgs(ShieldedVmConfigArgs $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
        this.enableVtpm = $.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedVmConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedVmConfigArgs $;

        public Builder() {
            $ = new ShieldedVmConfigArgs();
        }

        public Builder(ShieldedVmConfigArgs defaults) {
            $ = new ShieldedVmConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableIntegrityMonitoring Defines whether the instance has integrity monitoring enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            $.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        /**
         * @param enableIntegrityMonitoring Defines whether the instance has integrity monitoring enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            return enableIntegrityMonitoring(Output.of(enableIntegrityMonitoring));
        }

        /**
         * @param enableSecureBoot Defines whether the instance has Secure Boot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            $.enableSecureBoot = enableSecureBoot;
            return this;
        }

        /**
         * @param enableSecureBoot Defines whether the instance has Secure Boot enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            return enableSecureBoot(Output.of(enableSecureBoot));
        }

        /**
         * @param enableVtpm Defines whether the instance has the vTPM enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableVtpm(@Nullable Output<Boolean> enableVtpm) {
            $.enableVtpm = enableVtpm;
            return this;
        }

        /**
         * @param enableVtpm Defines whether the instance has the vTPM enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableVtpm(Boolean enableVtpm) {
            return enableVtpm(Output.of(enableVtpm));
        }

        public ShieldedVmConfigArgs build() {
            return $;
        }
    }

}
