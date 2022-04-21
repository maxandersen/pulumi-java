// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.Architecture;
import com.pulumi.azurenative.containerregistry.enums.OS;
import com.pulumi.azurenative.containerregistry.enums.Variant;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The platform properties against which the run has to happen.
 * 
 */
public final class PlatformPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlatformPropertiesArgs Empty = new PlatformPropertiesArgs();

    /**
     * The OS architecture.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<Either<String,Architecture>> architecture;

    public Optional<Output<Either<String,Architecture>>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * The operating system type required for the run.
     * 
     */
    @Import(name="os", required=true)
    private Output<Either<String,OS>> os;

    public Output<Either<String,OS>> os() {
        return this.os;
    }

    /**
     * Variant of the CPU.
     * 
     */
    @Import(name="variant")
    private @Nullable Output<Either<String,Variant>> variant;

    public Optional<Output<Either<String,Variant>>> variant() {
        return Optional.ofNullable(this.variant);
    }

    private PlatformPropertiesArgs() {}

    private PlatformPropertiesArgs(PlatformPropertiesArgs $) {
        this.architecture = $.architecture;
        this.os = $.os;
        this.variant = $.variant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlatformPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlatformPropertiesArgs $;

        public Builder() {
            $ = new PlatformPropertiesArgs();
        }

        public Builder(PlatformPropertiesArgs defaults) {
            $ = new PlatformPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder architecture(@Nullable Output<Either<String,Architecture>> architecture) {
            $.architecture = architecture;
            return this;
        }

        public Builder architecture(Either<String,Architecture> architecture) {
            return architecture(Output.of(architecture));
        }

        public Builder os(Output<Either<String,OS>> os) {
            $.os = os;
            return this;
        }

        public Builder os(Either<String,OS> os) {
            return os(Output.of(os));
        }

        public Builder variant(@Nullable Output<Either<String,Variant>> variant) {
            $.variant = variant;
            return this;
        }

        public Builder variant(Either<String,Variant> variant) {
            return variant(Output.of(variant));
        }

        public PlatformPropertiesArgs build() {
            $.os = Objects.requireNonNull($.os, "expected parameter 'os' to be non-null");
            return $;
        }
    }

}
