// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.azurenative.app.enums.BindingType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom Domain of a Container App
 * 
 */
public final class CustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainArgs Empty = new CustomDomainArgs();

    /**
     * Custom Domain binding type.
     * 
     */
    @Import(name="bindingType")
    private @Nullable Output<Either<String,BindingType>> bindingType;

    /**
     * @return Custom Domain binding type.
     * 
     */
    public Optional<Output<Either<String,BindingType>>> bindingType() {
        return Optional.ofNullable(this.bindingType);
    }

    /**
     * Resource Id of the Certificate to be bound to this hostname. Must exist in the Managed Environment.
     * 
     */
    @Import(name="certificateId", required=true)
    private Output<String> certificateId;

    /**
     * @return Resource Id of the Certificate to be bound to this hostname. Must exist in the Managed Environment.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }

    /**
     * Hostname.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Hostname.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private CustomDomainArgs() {}

    private CustomDomainArgs(CustomDomainArgs $) {
        this.bindingType = $.bindingType;
        this.certificateId = $.certificateId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainArgs $;

        public Builder() {
            $ = new CustomDomainArgs();
        }

        public Builder(CustomDomainArgs defaults) {
            $ = new CustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bindingType Custom Domain binding type.
         * 
         * @return builder
         * 
         */
        public Builder bindingType(@Nullable Output<Either<String,BindingType>> bindingType) {
            $.bindingType = bindingType;
            return this;
        }

        /**
         * @param bindingType Custom Domain binding type.
         * 
         * @return builder
         * 
         */
        public Builder bindingType(Either<String,BindingType> bindingType) {
            return bindingType(Output.of(bindingType));
        }

        /**
         * @param bindingType Custom Domain binding type.
         * 
         * @return builder
         * 
         */
        public Builder bindingType(String bindingType) {
            return bindingType(Either.ofLeft(bindingType));
        }

        /**
         * @param bindingType Custom Domain binding type.
         * 
         * @return builder
         * 
         */
        public Builder bindingType(BindingType bindingType) {
            return bindingType(Either.ofRight(bindingType));
        }

        /**
         * @param certificateId Resource Id of the Certificate to be bound to this hostname. Must exist in the Managed Environment.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId Resource Id of the Certificate to be bound to this hostname. Must exist in the Managed Environment.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param name Hostname.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Hostname.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CustomDomainArgs build() {
            $.certificateId = Objects.requireNonNull($.certificateId, "expected parameter 'certificateId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
