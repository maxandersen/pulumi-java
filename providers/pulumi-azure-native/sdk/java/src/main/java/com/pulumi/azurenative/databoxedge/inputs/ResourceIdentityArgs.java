// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.enums.MsiIdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Msi identity details of the resource
 * 
 */
public final class ResourceIdentityArgs extends ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * Identity type
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,MsiIdentityType>> type;

    /**
     * @return Identity type
     * 
     */
    public Optional<Output<Either<String,MsiIdentityType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private ResourceIdentityArgs() {}

    private ResourceIdentityArgs(ResourceIdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdentityArgs $;

        public Builder() {
            $ = new ResourceIdentityArgs();
        }

        public Builder(ResourceIdentityArgs defaults) {
            $ = new ResourceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Identity type
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,MsiIdentityType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Identity type
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,MsiIdentityType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Identity type
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Identity type
         * 
         * @return builder
         * 
         */
        public Builder type(MsiIdentityType type) {
            return type(Either.ofRight(type));
        }

        public ResourceIdentityArgs build() {
            return $;
        }
    }

}
